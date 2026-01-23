package net.yugatsuj.aeprimus.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.yugatsuj.aeprimus.AePrimus;
import net.yugatsuj.aeprimus.entity.ModEntities;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, AePrimus.MOD_ID);

    public static final RegistryObject<Item> PYROSIANASH = ITEMS.register("pyrosian_ash",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PYROSIANWAX = ITEMS.register("pyrosian_wax",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PYRONITEPEBBLES = ITEMS.register("pyronite_pebbles",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FRIGYDSHARD = ITEMS.register("frigyd_shard",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<ForgeSpawnEggItem> CRABDOZER_SPAWN_EGG = ITEMS.register("crabdozer_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntities.CRABDOZER, 0xFFFFFF, 0xFFFFFF , new Item.Properties()));
    public static final RegistryObject<ForgeSpawnEggItem> PYRONITE_SPAWN_EGG = ITEMS.register("pyronite_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntities.PYRONITE, 0xFFFFFF, 0xFFFFFF , new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
