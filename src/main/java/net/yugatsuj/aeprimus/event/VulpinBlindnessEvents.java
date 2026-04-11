package net.yugatsuj.aeprimus.event;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
//Give blindness effect when on vulpin
@Mod.EventBusSubscriber
public class VulpinBlindnessEvents {

    @SubscribeEvent
    public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
        if (event.phase != TickEvent.Phase.END) return;
        
        if (event.player.level().isClientSide()) return;

        Player player = event.player;

        ResourceKey<Level> vulpin = ResourceKey.create(
                Registries.DIMENSION,
                new ResourceLocation("ae_primus", "vulpin")
        );

        if (player.level().dimension().equals(vulpin)) {

            if (player.getTags().contains("Vulpimancer")) {
                //remove blindness every tick while transformed
                player.removeEffect(MobEffects.BLINDNESS);
                return;
            }

            player.addEffect(new MobEffectInstance(
                    MobEffects.BLINDNESS,
                    100,
                    0,
                    false,
                    false
            ));
        }
    }
}