package net.yugatsuj.aeprimus.event;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.yugatsuj.aeprimus.AePrimus;
import net.yugatsuj.aeprimus.entity.ModEntities;
import net.yugatsuj.aeprimus.entity.custom.crabdozerEntity;

@Mod.EventBusSubscriber(modid = AePrimus.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {
    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event){
        event.put(ModEntities.CRABDOZER.get(), crabdozerEntity.createAttributes().build());
    }
}
