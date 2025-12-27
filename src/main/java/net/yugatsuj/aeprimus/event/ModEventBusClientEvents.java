package net.yugatsuj.aeprimus.event;


import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.yugatsuj.aeprimus.AePrimus;
import net.yugatsuj.aeprimus.entity.client.ModModelLayers;
import net.yugatsuj.aeprimus.entity.client.crabdozer;

@Mod.EventBusSubscriber(modid = AePrimus.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModEventBusClientEvents {
    @SubscribeEvent
    public static void registerLayer(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(ModModelLayers.CRABDOZER_LAYER, crabdozer::createBodyLayer);
    }
}
