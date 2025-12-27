package net.yugatsuj.aeprimus.entity;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.yugatsuj.aeprimus.AePrimus;
import net.yugatsuj.aeprimus.entity.custom.crabdozerEntity;

import javax.swing.*;

public class ModEntities {

    public static final  DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, AePrimus.MOD_ID);

    public static final RegistryObject<EntityType<crabdozerEntity>> CRABDOZER =
            ENTITY_TYPES.register("crabdozer", () -> EntityType.Builder.of(crabdozerEntity::new, MobCategory.CREATURE)
                    .sized(4f, 4f).build("crabdozer"));


    public static void register(IEventBus eventBus){
        ENTITY_TYPES.register(eventBus);
    }

}
