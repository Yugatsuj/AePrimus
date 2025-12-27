package net.yugatsuj.aeprimus.block;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.yugatsuj.aeprimus.AePrimus;
import net.yugatsuj.aeprimus.item.ModItems;

import javax.annotation.Nullable;
import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, AePrimus.MOD_ID);

    public static final RegistryObject<Block> PYROSIAN_SOOT = registerBlock("pyrosian_soot",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SAND).sound(SoundType.SAND)));
    public static final RegistryObject<Block> PACKED_PYROSIAN_SOOT = registerBlock("packed_pyrosian_soot",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SAND).sound(SoundType.SAND)));
    public static final RegistryObject<Block> PYROSIAN_STONE = registerBlock("pyrosian_stone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PYROSIAN_DEEPSLATE = registerBlock("pyrosian_deepslate",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> PYROSIAN_DEEPSLATE_IRON_ORE = registerBlock("pyrosian_deepslate_iron_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_IRON_ORE).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> PYROSIAN_DEEPSLATE_GOLD_ORE = registerBlock("pyrosian_deepslate_gold_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_GOLD_ORE).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> PYROSIAN_STONE_IRON_ORE = registerBlock("pyrosian_stone_iron_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PYROSIAN_STONE_GOLD_ORE = registerBlock("pyrosian_stone_gold_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GOLD_ORE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PYROSIAN_STONE_BRICKS = registerBlock("pyrosian_stone_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CHISLED_PYROSIAN_STONE_BRICKS = registerBlock("chisled_pyrosian_stone_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.ANCIENT_DEBRIS).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PYROSIAN_DEEPSLATE_BRICKS = registerBlock("pyrosian_deepslate_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_BRICKS).sound(SoundType.DEEPSLATE_BRICKS)));
    public static final RegistryObject<Block> CHISLED_PYROSIAN_DEEPSLATE_BRICKS = registerBlock("chisled_pyrosian_deepslate_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_BRICKS).sound(SoundType.DEEPSLATE_BRICKS)));


    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block){
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
