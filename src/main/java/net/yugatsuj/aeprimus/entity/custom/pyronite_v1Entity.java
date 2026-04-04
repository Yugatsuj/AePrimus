package net.yugatsuj.aeprimus.entity.custom;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.AvoidEntityGoal;
import net.minecraft.world.entity.ai.gossip.GossipType;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.npc.Villager;
import net.minecraft.world.entity.npc.VillagerData;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.trading.MerchantOffer;
import net.minecraft.world.item.trading.MerchantOffers;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ServerLevelAccessor;
import net.yugatsuj.aeprimus.entity.ModEntities;
import net.yugatsuj.aeprimus.entity.pyroniteMerchantOffers;
import net.yugatsuj.aeprimus.item.ModItems;
import org.jetbrains.annotations.Nullable;
// Honestly Probably my most hated work since its the hardest entity ive ever done so dont be surprised if you find swearing in comments
// Most of this code is taken from Ad Astra custom villager and how they did that but i added the variant thing
public class pyronite_v1Entity extends Villager {
    private static final EntityDataAccessor<Integer> VARIANT = SynchedEntityData.defineId(pyronite_v1Entity.class, EntityDataSerializers.INT);

    public final AnimationState idleAnimationState = new AnimationState();
    private int idleAnimationTimeout = 0;
    public final AnimationState offerAnimationState = new AnimationState();

    public pyronite_v1Entity(EntityType<? extends Villager> entityType, Level level) {
        super(entityType, level);
    }

    // All the shit below is the variation code
    @Override
    protected void defineSynchedData() {
        super.defineSynchedData();
        this.entityData.define(VARIANT, 0);
    }

    public int getPyroniteVariant() {
        return this.entityData.get(VARIANT);
    }

    public void setPyroniteVariant(int variant) {
        this.entityData.set(VARIANT, variant);
    }

    @Override
    public void addAdditionalSaveData(CompoundTag tag) {
        super.addAdditionalSaveData(tag);
        tag.putInt("Variant", this.getPyroniteVariant());
    }

    @Override
    public void readAdditionalSaveData(CompoundTag tag) {
        super.readAdditionalSaveData(tag);
        this.setPyroniteVariant(tag.getInt("Variant"));
    }
    // Randomize what is the variation
    @Override
    public SpawnGroupData finalizeSpawn(ServerLevelAccessor level, DifficultyInstance difficulty,
                                        MobSpawnType reason, @Nullable SpawnGroupData spawnData,
                                        @Nullable CompoundTag dataTag) {
        spawnData = super.finalizeSpawn(level, difficulty, reason, spawnData, dataTag);
        this.setPyroniteVariant(this.random.nextInt(3));

        // 10% chance for nitwit
        if (this.random.nextFloat() < 0.1f) {
            this.setVillagerData(this.getVillagerData().setProfession(VillagerProfession.NITWIT));
        }

        return spawnData;
    }

    @Override
    public void tick() {
        super.tick();
        if(this.level().isClientSide()) {
            setupAnimationStates();
        }
    }

// Animation shit that i hate
    private void setupAnimationStates() {
        if (this.idleAnimationTimeout <= 0) {
            this.idleAnimationTimeout = this.random.nextInt(40) + 80;
            this.idleAnimationState.start(this.tickCount);
        } else {
            --this.idleAnimationTimeout;
        }

        boolean isShowingOffer = !this.getMainHandItem().isEmpty();

        if (isShowingOffer) {
            offerAnimationState.startIfStopped(this.tickCount);
        } else {
            offerAnimationState.stop();
        }
    }
    // Their attributes
    public static AttributeSupplier.Builder createAttributes() {
        return Animal.createLivingAttributes()
                .add(Attributes.MAX_HEALTH, 40D)
                .add(Attributes.FOLLOW_RANGE, 12D)
                .add(Attributes.MOVEMENT_SPEED, 0.4D)
                .add(Attributes.ARMOR_TOUGHNESS, 0.5f)
                .add(Attributes.ATTACK_KNOCKBACK, 0.5f)
                .add(Attributes.ATTACK_DAMAGE, 8f);
    }

     // Brush mechanic shit

    @Override
    public InteractionResult mobInteract(Player player, InteractionHand hand) {
        ItemStack itemStack = player.getItemInHand(hand);

        if (itemStack.getItem() == Items.BRUSH && !this.level().isClientSide) {
            VillagerProfession profession = this.getVillagerData().getProfession();
            // Only pyronites with jobs will drop flakes
            if (profession.equals(VillagerProfession.NONE) || profession.equals(VillagerProfession.NITWIT)) {
                return InteractionResult.PASS;
            }

            itemStack.hurtAndBreak(5, player, (p) -> p.broadcastBreakEvent(hand));

            this.spawnAtLocation(ModItems.PYRONITEPEBBLES.get());

            this.getGossips().add(player.getUUID(), GossipType.MINOR_NEGATIVE, 25);
            // Fucking particles
            ((ServerLevel) this.level()).sendParticles(
                    ParticleTypes.ANGRY_VILLAGER,
                    this.getX(),
                    this.getY() + this.getBbHeight() + 0.5,
                    this.getZ(),
                    5,
                    0.5, 0.5, 0.5,
                    0.0
            );
            // Brushing sound
            this.level().playSound(null, this.blockPosition(), SoundEvents.BRUSH_GENERIC, SoundSource.PLAYERS, 1.0F, 1.0F);

            return InteractionResult.SUCCESS;
        }

        return super.mobInteract(player, hand);
    }
    //Their primary goals
    @Override
    protected void registerGoals() {
        super.registerGoals();
        this.goalSelector.addGoal(1, new AvoidEntityGoal<>(this, crabdozerEntity.class, 15.0f, 0.5f, 0.5f));
    }

    //Pyronite breeding and the variation bs
    @Override
    public Villager getBreedOffspring(ServerLevel serverWorld, AgeableMob passiveEntity) {
        pyronite_v1Entity entity = new pyronite_v1Entity((EntityType<? extends Villager>) ModEntities.PYRONITE.get(), serverWorld);
        entity.finalizeSpawn(serverWorld, serverWorld.getCurrentDifficultyAt(entity.blockPosition()), MobSpawnType.BREEDING, null, null);

        if (passiveEntity instanceof pyronite_v1Entity otherParent) {
            entity.setPyroniteVariant(this.random.nextBoolean() ? this.getPyroniteVariant() : otherParent.getPyroniteVariant());
        }

        return entity;
    }

    @Override
    protected void updateTrades() {
        VillagerData villagerData = this.getVillagerData();
        Int2ObjectMap<VillagerTrades.ItemListing[]> int2ObjectMap = pyroniteMerchantOffers.PROFESSION_TO_LEVELED_TRADE.get(villagerData.getProfession());
        if (int2ObjectMap == null || int2ObjectMap.isEmpty()) {
            return;
        }
        VillagerTrades.ItemListing[] factorys = int2ObjectMap.get(villagerData.getLevel());
        if (factorys == null) {
            return;
        }
        MerchantOffers tradeOfferList = this.getOffers();
        this.addOffersFromItemListings(tradeOfferList, factorys, 2);
    }

    // Sounds bullshit that dont fit the mob but i didint found any better ones

    @Nullable
    @Override
    protected SoundEvent getAmbientSound() {
        return SoundEvents.BLAZE_AMBIENT;
    }
    @Nullable
    @Override

    protected SoundEvent getHurtSound(DamageSource damageSource) {
        return SoundEvents.BLAZE_HURT;
    }

    @Nullable
    @Override
    protected SoundEvent getDeathSound() {
        return SoundEvents.BLAZE_DEATH;
    }

    @Override
    protected SoundEvent getTradeUpdatedSound(boolean isYesSound) {
        return SoundEvents.BLAZE_AMBIENT;
    }

    @Override
    public boolean fireImmune() {
        return true;
    }

}