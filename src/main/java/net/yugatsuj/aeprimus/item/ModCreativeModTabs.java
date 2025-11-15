package net.yugatsuj.aeprimus.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.yugatsuj.aeprimus.AePrimus;
import net.yugatsuj.aeprimus.block.ModBlocks;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, AePrimus.MOD_ID);

    public static final RegistryObject<CreativeModeTab> PRIMUS_TAB = CREATIVE_MODE_TABS.register("primus_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.PYROSIANASH.get()))
                    .title(Component.translatable("creativetab_ae_primus_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.PYROSIANASH.get());

                        output.accept(ModBlocks.PYROSIAN_SOOT.get());
                        output.accept(ModBlocks.PACKED_PYROSIAN_SOOT.get());
                        output.accept(ModBlocks.PYROSIAN_STONE.get());
                        output.accept(ModBlocks.PYROSIAN_STONE_IRON_ORE.get());
                        output.accept(ModBlocks.PYROSIAN_STONE_GOLD_ORE.get());
                        output.accept(ModBlocks.PYROSIAN_DEEPSLATE.get());
                        output.accept(ModBlocks.PYROSIAN_DEEPSLATE_IRON_ORE.get());
                        output.accept(ModBlocks.PYROSIAN_DEEPSLATE_GOLD_ORE.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
