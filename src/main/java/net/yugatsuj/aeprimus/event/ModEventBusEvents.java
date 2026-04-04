package net.yugatsuj.aeprimus.event;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.yugatsuj.aeprimus.AePrimus;
import net.yugatsuj.aeprimus.entity.ModEntities;
import net.yugatsuj.aeprimus.entity.custom.crabdozerEntity;
import net.yugatsuj.aeprimus.entity.custom.pyronite_v1Entity;
// Kaupenjoe tutorial stuff
@Mod.EventBusSubscriber(modid = AePrimus.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {
    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event){
        event.put(ModEntities.CRABDOZER.get(), crabdozerEntity.createAttributes().build());
        event.put(ModEntities.PYRONITE.get(), pyronite_v1Entity.createAttributes().build());
    }

}
