package net.yugatsuj.aeprimus.entity;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.yugatsuj.aeprimus.AePrimus;
import net.yugatsuj.aeprimus.entity.custom.crabdozerEntity;
import net.yugatsuj.aeprimus.entity.custom.pyronite_v1Entity;

public class ModEntities {

    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, AePrimus.MOD_ID);

    public static final RegistryObject<EntityType<crabdozerEntity>> CRABDOZER =
            ENTITY_TYPES.register("crabdozer", () -> EntityType.Builder.of(crabdozerEntity::new, MobCategory.CREATURE)
                    .sized(5f, 6f).build("crabdozer"));

    public static final RegistryObject<EntityType<pyronite_v1Entity>> PYRONITE =
            ENTITY_TYPES.register("pyronite", () -> EntityType.Builder.of(pyronite_v1Entity::new, MobCategory.CREATURE)
                    .sized(0.6f, 2f).build("pyronite"));

    public static void register(IEventBus eventBus){
        ENTITY_TYPES.register(eventBus);
    }

}