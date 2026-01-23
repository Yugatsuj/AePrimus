package net.yugatsuj.aeprimus.event;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.tags.DamageTypeTags;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.event.entity.EntityJoinLevelEvent;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.yugatsuj.aeprimus.AePrimus;
import net.yugatsuj.aeprimus.item.ModItems;

import java.util.Random;

@Mod.EventBusSubscriber(modid = AePrimus.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class PyrosianWaxEvents {

    private static final Random RANDOM = new Random();

    @SubscribeEvent
    public static void onRightClick(PlayerInteractEvent.RightClickItem event) {
        Player player = event.getEntity();
        ItemStack mainHand = player.getMainHandItem();
        ItemStack offHand = player.getOffhandItem();

        if (event.getHand() != InteractionHand.MAIN_HAND) return;

        if (offHand.getItem() == ModItems.PYROSIANWAX.get() && isWaxableItem(mainHand)) {
            if (!isWaxed(mainHand)) {
                applyWax(mainHand);
                offHand.shrink(1);

                player.level().playSound(null, player.blockPosition(),
                        SoundEvents.HONEYCOMB_WAX_ON, SoundSource.PLAYERS, 1.0F, 1.0F);

                if (!player.level().isClientSide()) {
                    player.displayClientMessage(
                            Component.literal("Item waxed with Pyrosian Wax!").withStyle(ChatFormatting.GOLD),
                            true
                    );
                }
            }
        }
    }

    @SubscribeEvent
    public static void onEntitySpawn(EntityJoinLevelEvent event) {
        if (event.getEntity() instanceof ItemEntity itemEntity) {
            ItemStack stack = itemEntity.getItem();
            if (isWaxed(stack)) {
                itemEntity.setInvulnerable(true);
            }
        }
    }

    @SubscribeEvent
    public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
        if (event.phase != TickEvent.Phase.END) return;
        if (event.player.level().isClientSide()) return;

        Player player = event.player;

        if (player.isOnFire() || player.isInLava()) {
            for (EquipmentSlot slot : EquipmentSlot.values()) {
                if (slot.getType() != EquipmentSlot.Type.ARMOR) continue;

                ItemStack armor = player.getItemBySlot(slot);
                if (isWaxed(armor) && armor.isDamageableItem()) {
                    if (player.tickCount % 20 == 0) {
                        armor.hurtAndBreak(1, player, (p) -> p.broadcastBreakEvent(slot));
                    }
                }
            }
        }
    }

    private static boolean isWaxableItem(ItemStack stack) {
        Item item = stack.getItem();
        return item instanceof ArmorItem ||
                item instanceof SwordItem ||
                item instanceof PickaxeItem ||
                item instanceof AxeItem ||
                item instanceof ShovelItem ||
                item instanceof HoeItem;
    }

    private static boolean isWaxed(ItemStack stack) {
        return stack.getOrCreateTag().getBoolean("PyrosianWaxed");
    }

    private static void applyWax(ItemStack stack) {
        stack.getOrCreateTag().putBoolean("PyrosianWaxed", true);
    }

    @SubscribeEvent
    public static void preventFireDamage(LivingHurtEvent event) {
        if (!(event.getEntity() instanceof Player)) return;
        Player player = (Player) event.getEntity();
        if (!event.getSource().is(DamageTypeTags.IS_FIRE)) return;

        boolean allArmorWaxed = true;
        for (ItemStack armor : player.getArmorSlots()) {
            if (armor.isEmpty() || !isWaxed(armor)) {
                allArmorWaxed = false;
                break;
            }
        }

        if (allArmorWaxed) {
            event.setCanceled(true);
            player.clearFire();
        }
    }
}