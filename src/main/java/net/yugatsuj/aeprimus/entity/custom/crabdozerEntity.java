package net.yugatsuj.aeprimus.entity.custom;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializer;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.*;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.ai.goal.target.OwnerHurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.target.OwnerHurtTargetGoal;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.scores.Team;
import net.minecraftforge.registries.ForgeRegistries;
import net.yugatsuj.aeprimus.AePrimus;
import net.yugatsuj.aeprimus.entity.ModEntities;
import net.yugatsuj.aeprimus.entity.ai.CrabdozerAttackGoal;
import net.yugatsuj.aeprimus.item.ModItems;
import org.w3c.dom.Attr;
import javax.annotation.Nullable;

// Hey if you are reading this that means the mod is official released and no i have yet to know how to code properly
// All of this code is a mix of dog/horse propierties with camel animation recommended by Kaupenjoe

public class crabdozerEntity extends TamableAnimal {
    private static final EntityDataAccessor<Boolean> SITTING =
            SynchedEntityData.defineId(crabdozerEntity.class, EntityDataSerializers.BOOLEAN);

    private static final EntityDataAccessor<Boolean> ATTACKING =
            SynchedEntityData.defineId(crabdozerEntity.class, EntityDataSerializers.BOOLEAN);

    public crabdozerEntity(EntityType<? extends TamableAnimal> entityType, Level plevel) {

        super(entityType, plevel);

        this.setMaxUpStep(1.0F);

    }

// animation states and timeout
    public final AnimationState idleAnimationState = new AnimationState();
    private int idleAnimationTimeout = 0;
    public final AnimationState attackAnimationState = new AnimationState();
    public int attackAnimationTimeout = 0;

    public final AnimationState sitAnimationState = new AnimationState();
    public final AnimationState getUpAnimationState = new AnimationState();

    private boolean wasSitting = false;

    @Override
    public void tick() {
        super.tick();
        if(this.level().isClientSide()) {
            setupAnimationStates();
        }
    }

    private void setupAnimationStates() {
        boolean isCurrentlySitting = this.isOrderedToSit();
        if (isCurrentlySitting) {
            this.idleAnimationState.stop();
            this.getUpAnimationState.stop();
            this.sitAnimationState.startIfStopped(this.tickCount);
            this.wasSitting = true;
        } else {
            this.sitAnimationState.stop();
            if (this.wasSitting) {
                this.getUpAnimationState.start(this.tickCount);
                this.wasSitting = false;
            }
            if (this.idleAnimationTimeout <= 0) {
                this.idleAnimationTimeout = this.random.nextInt(40) + 80;
                this.idleAnimationState.start(this.tickCount);
            } else {
                --this.idleAnimationTimeout;
            }
        }
        if (this.isAttacking() && attackAnimationTimeout <= 0) {
            this.attackAnimationTimeout = 20;
            this.attackAnimationState.start(this.tickCount);
        } else {
            --this.attackAnimationTimeout;
        }
        if (!this.isAttacking()) {
            this.attackAnimationState.stop();
        }
    }

    // walk animation bs
    @Override
    protected void updateWalkAnimation(float pPartialTick) {
        float f;
        if(this.getPose() == Pose.STANDING) {
            f = Math.min(pPartialTick * 6F, 1f);
        } else {
            f = 0f;
        }
        this.walkAnimation.update(f, 0.2f);
    }

    public void setAttacking(boolean attacking) {
        this.entityData.set(ATTACKING, attacking);
    }

    public boolean isAttacking() {

        return this.entityData.get(ATTACKING);

    }
    @Override
    protected void defineSynchedData() {
        super.defineSynchedData();
        this.entityData.define(ATTACKING, false);
        this.entityData.define(SITTING, false);
    }

    // Goals that he will follow
    @Override
    protected void registerGoals() {
        this.goalSelector.addGoal(0, new FloatGoal(this));
        this.goalSelector.addGoal(1, new CrabdozerAttackGoal(this, 1.0D, true));
        this.goalSelector.addGoal(2, new SitWhenOrderedToGoal(this));
        this.goalSelector.addGoal(3, new FollowOwnerGoal(this, 1.1D, 10.0F, 2.0F, false));
        this.goalSelector.addGoal(4, new TemptGoal(this, 1.2D, Ingredient.of(ModItems.PYRONITEPEBBLES.get()), false));
        this.goalSelector.addGoal(5, new WaterAvoidingRandomStrollGoal(this, 1.1D));
        this.goalSelector.addGoal(6, new LookAtPlayerGoal(this, Player.class, 10f));
        this.goalSelector.addGoal(7, new RandomLookAroundGoal(this));

        this.targetSelector.addGoal(1, new OwnerHurtByTargetGoal(this));
        this.targetSelector.addGoal(2, new OwnerHurtTargetGoal(this));
        this.targetSelector.addGoal(3, new HurtByTargetGoal(this));
        this.targetSelector.addGoal(4, new NearestAttackableTargetGoal<>(this, pyronite_v1Entity.class,true,
                (target) -> !this.isTame()));
        this.targetSelector.addGoal(5, new NearestAttackableTargetGoal<>(this, Player.class,true,
                (target) -> !this.isTame()));
        this.targetSelector.addGoal(6, new NearestAttackableTargetGoal<>(this, Monster.class, true,
                (target) -> this.isTame()));
    }
// Attrubutes for his hp movement other bs
    public static AttributeSupplier.Builder createAttributes() {
        return Animal.createLivingAttributes()
                .add(Attributes.MAX_HEALTH, 150D)
                .add(Attributes.FOLLOW_RANGE, 20D)
                .add(Attributes.MOVEMENT_SPEED, 0.4D)
                .add(Attributes.ARMOR_TOUGHNESS, 1f)
                .add(Attributes.ARMOR, 50f)
                .add(Attributes.ATTACK_KNOCKBACK, 1f)
                .add(Attributes.ATTACK_DAMAGE, 12f)
                .add(Attributes.KNOCKBACK_RESISTANCE, 1.0D);
    }

    @Nullable
    @Override
    public AgeableMob getBreedOffspring(ServerLevel plevel, AgeableMob ageableMob) {
        return ModEntities.CRABDOZER.get().create(plevel);
    }
// the position of the player when he is riding that monsta
    @Override
    protected void positionRider(Entity pPassenger, Entity.MoveFunction pCallback) {
        super.positionRider(pPassenger, pCallback);
        if (pPassenger instanceof LivingEntity) {
            double xOffset = 0.1D;
            double yOffset = 4.8D;
            double zOffset = -1.5D;
            float f = this.yBodyRot * ((float)Math.PI / 180F);
            double cos = Math.cos(f);
            double sin = Math.sin(f);
            double finalX = (sin * zOffset) + (cos * xOffset);
            double finalZ = (-cos * zOffset) + (sin * xOffset);
            pCallback.accept(pPassenger,
                    this.getX() + finalX,
                    this.getY() + yOffset + pPassenger.getMyRidingOffset(),
                    this.getZ() + finalZ
            );
        }
    }
    @Nullable
    @Override
    public LivingEntity getControllingPassenger() {
        return this.getFirstPassenger() instanceof LivingEntity entity ? entity : null;
    }
    @Override
    public void travel(Vec3 pos) {
        if (this.isAlive()) {
            if (this.isVehicle() && this.getControllingPassenger() instanceof Player player) {
                this.setYRot(player.getYRot());
                this.yRotO = this.getYRot();
                this.setXRot(player.getXRot() * 0.5F);
                this.setRot(this.getYRot(), this.getXRot());
                this.yBodyRot = this.getYRot();
                this.yHeadRot = this.yBodyRot;
                float f = player.xxa * 0.5F;
                float f1 = player.zza;
                if (f1 <= 0.0F) {
                    f1 *= 0.25F;
                }
                this.setSpeed((float)this.getAttributeValue(Attributes.MOVEMENT_SPEED));
                super.travel(new Vec3(f, pos.y, f1));
            } else {
                super.travel(pos);
            }
        }
    }

  // unique interactions that he has
    @Override
    public InteractionResult mobInteract(Player player, InteractionHand hand) {
        ItemStack itemstack = player.getItemInHand(hand);
        if (this.isTame()) {
            if (!this.level().isClientSide) {
                // setting max health if tamed or not
                this.getAttribute(Attributes.MAX_HEALTH).setBaseValue(80.0F);
            }
            //sitting function
            if (player.isShiftKeyDown() && itemstack.isEmpty()) {
                boolean sitting = !this.isOrderedToSit();
                this.setOrderedToSit(sitting);
                this.navigation.stop();
                this.setTarget(null);
                return InteractionResult.SUCCESS;
            }
            if (itemstack.is(ModItems.PYRONITEPEBBLES.get()) && this.getHealth() < this.getMaxHealth()) {
                if (!this.level().isClientSide) {
                    // Healing and particles bs
                    this.heal(10.0F);
                    this.playSound(SoundEvents.GENERIC_EAT, 1.0F, 1.0F);
                    this.level().broadcastEntityEvent(this, (byte)7);
                    if (!player.getAbilities().instabuild) {
                        itemstack.shrink(1);
                    }
                }
                return InteractionResult.sidedSuccess(this.level().isClientSide);
            }
            if (!this.isOrderedToSit() && !itemstack.is(ModItems.PYRONITEPEBBLES.get())) {
                if (!this.level().isClientSide) {
                    player.startRiding(this);
                }
                return InteractionResult.sidedSuccess(this.level().isClientSide);
            }
            // what he eats
        } else if (itemstack.is(ModItems.PYRONITEPEBBLES.get())) {
            if (!this.level().isClientSide) {
                if (this.random.nextInt(20) == 0) {
                    this.tame(player);
                    this.getAttribute(Attributes.MAX_HEALTH).setBaseValue(100.0F);
                    this.setHealth(100.0F);
                    this.level().broadcastEntityEvent(this, (byte)7);
                } else {
                    this.level().broadcastEntityEvent(this, (byte)6);
                    this.setTarget(player);
                }
                if (!player.getAbilities().instabuild) {
                    itemstack.shrink(1);
                }
            }
            return InteractionResult.sidedSuccess(this.level().isClientSide);
        }
        return super.mobInteract(player, hand);
    }
    // Double times dmg to a specific entities that should technically work on paper
    @Override
    public boolean doHurtTarget(Entity target) {
        boolean isPyronite = target instanceof pyronite_v1Entity;
        boolean isAlienEvoPyronite = target instanceof Player && target.getTags().contains("Pyronite");

        if (isPyronite || isAlienEvoPyronite) {
            float baseDamage = (float) this.getAttributeValue(Attributes.ATTACK_DAMAGE);
            return target.hurt(this.level().damageSources().mobAttack(this), baseDamage * 3);
        }
        return super.doHurtTarget(target);
    }

    // Sounds that i took from minecraft mobs
    @Nullable
    @Override
    protected SoundEvent getAmbientSound() {
        return SoundEvents.CAMEL_AMBIENT;
    }
    @Nullable
    @Override

    protected SoundEvent getHurtSound(DamageSource damageSource) {
        return SoundEvents.POLAR_BEAR_HURT;
    }

    @Nullable
    @Override
    protected SoundEvent getDeathSound() {
        return SoundEvents.POLAR_BEAR_DEATH;
    }
    @Override
    public void readAdditionalSaveData(CompoundTag tag) {
        super.readAdditionalSaveData(tag);
        setSitting(tag.getBoolean("isSitting"));
    }

    @Override
    public void addAdditionalSaveData(CompoundTag tag) {
        super.addAdditionalSaveData(tag);
        tag.putBoolean("isSitting", this.isSitting());
    }

    public void setSitting(boolean sitting) {
        this.entityData.set(SITTING, sitting);
        this.setOrderedToSit(sitting);
    }

    public boolean isSitting() {
        return this.entityData.get(SITTING);
    }

    @Override
    public boolean fireImmune() {
        return true;
    }

    @Override
    public Team getTeam() {
        return super.getTeam();
    }

    public boolean canBeLeashed(Player player) {
        return true;
    }

    @Override
    public boolean isInvulnerableTo(DamageSource damageSource) {
        // Returns true if the damage is fall damage, making it immune
        return damageSource.is(DamageTypes.FALL) || super.isInvulnerableTo(damageSource);
    }
}
