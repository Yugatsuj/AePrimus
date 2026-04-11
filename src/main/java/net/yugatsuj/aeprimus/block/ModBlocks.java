package net.yugatsuj.aeprimus.block;

import com.teamresourceful.resourcefullib.common.registry.RegistryEntry;
import com.teamresourceful.resourcefullib.common.registry.ResourcefulRegistries;
import com.teamresourceful.resourcefullib.common.registry.ResourcefulRegistry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.yugatsuj.aeprimus.AePrimus;
import net.yugatsuj.aeprimus.item.ModItems;

import earth.terrarium.adastra.common.blocks.*;
import earth.terrarium.adastra.common.blocks.machines.*;
import net.minecraft.world.level.block.*;
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
    public static final RegistryObject<SlabBlock> PYROSIAN_STONE_SLAB = registerBlock("pyrosian_stone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_SLAB).sound(SoundType.STONE)));
    public static final RegistryObject<StairBlock> PYROSIAN_STONE_STAIRS = registerBlock("pyrosian_stone_stairs",
            () -> new StairBlock(() -> PYROSIAN_STONE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.STONE_STAIRS).sound(SoundType.STONE)));


    public static final RegistryObject<Block> PYROSIAN_COBBLESTONE = registerBlock("pyrosian_cobblestone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE).sound(SoundType.STONE)));
    public static final RegistryObject<SlabBlock> PYROSIAN_COBBLESTONE_SLAB = registerBlock("pyrosian_cobblestone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE_SLAB).sound(SoundType.STONE)));
    public static final RegistryObject<StairBlock> PYROSIAN_COBBLESTONE_STAIRS = registerBlock("pyrosian_cobblestone_stairs",
            () -> new StairBlock(() -> PYROSIAN_COBBLESTONE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.COBBLESTONE_STAIRS).sound(SoundType.STONE)));
    public static final RegistryObject<WallBlock> PYROSIAN_COBBLESTONE_WALL = registerBlock("pyrosian_cobblestone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE_WALL).sound(SoundType.STONE)));

    public static final RegistryObject<Block> PYROSIAN_DEEPSLATE = registerBlock("pyrosian_deepslate",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<SlabBlock> PYROSIAN_DEEPSLATE_SLAB = registerBlock("pyrosian_deepslate_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_BRICK_SLAB).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<StairBlock> PYROSIAN_DEEPSLATE_STAIRS = registerBlock("pyrosian_deepslate_stairs",
            () -> new StairBlock(() -> PYROSIAN_DEEPSLATE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_BRICK_STAIRS).sound(SoundType.DEEPSLATE)));

    public static final RegistryObject<Block> VULPINITE_DEEPSLATE = registerBlock("vulpinite_deepslate",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE).sound(SoundType.DEEPSLATE)));

    public static final RegistryObject<Block> PYROSIAN_DEEPSLATE_COBBLESTONE = registerBlock("pyrosian_deepslate_cobblestone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.COBBLED_DEEPSLATE).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<SlabBlock> PYROSIAN_DEEPSLATE_COBBLESTONE_SLAB = registerBlock("pyrosian_deepslate_cobblestone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.COBBLED_DEEPSLATE_SLAB).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<StairBlock> PYROSIAN_DEEPSLATE_COBBLESTONE_STAIRS = registerBlock("pyrosian_deepslate_cobblestone_stairs",
            () -> new StairBlock(() -> PYROSIAN_DEEPSLATE_COBBLESTONE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.COBBLED_DEEPSLATE_STAIRS).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<WallBlock> PYROSIAN_DEEPSLATE_COBBLESTONE_WALL = registerBlock("pyrosian_deepslate_cobblestone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.COBBLED_DEEPSLATE_WALL).sound(SoundType.DEEPSLATE)));

    public static final RegistryObject<Block> VULPINITE_DEEPSLATE_COBBLESTONE = registerBlock("vulpinite_deepslate_cobblestone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.COBBLED_DEEPSLATE).sound(SoundType.DEEPSLATE)));

    public static final RegistryObject<Block> PYROSIAN_DEEPSLATE_IRON_ORE = registerBlock("pyrosian_deepslate_iron_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_IRON_ORE).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> PYROSIAN_DEEPSLATE_GOLD_ORE = registerBlock("pyrosian_deepslate_gold_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_GOLD_ORE).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> PYROSIAN_DEEPSLATE_FRIGYD_ORE = registerBlock("pyrosian_deepslate_frigyd_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_DIAMOND_ORE).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> PYROSIAN_DEEPSLATE_DIAMOND_ORE = registerBlock("pyrosian_deepslate_diamond_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_DIAMOND_ORE).sound(SoundType.DEEPSLATE)));

    public static final RegistryObject<Block> PYROSIAN_STONE_IRON_ORE = registerBlock("pyrosian_stone_iron_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PYROSIAN_STONE_GOLD_ORE = registerBlock("pyrosian_stone_gold_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GOLD_ORE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PYROSIAN_STONE_DIAMOND_ORE = registerBlock("pyrosian_stone_diamond_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE).sound(SoundType.STONE)));

    public static final RegistryObject<Block> PYROSIAN_STONE_BRICKS = registerBlock("pyrosian_stone_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS).sound(SoundType.STONE)));
    public static final RegistryObject<SlabBlock> PYROSIAN_STONE_BRICKS_SLAB = registerBlock("pyrosian_stone_bricks_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_SLAB).sound(SoundType.STONE)));
    public static final RegistryObject<StairBlock> PYROSIAN_STONE_BRICKS_STAIRS = registerBlock("pyrosian_stone_bricks_stairs",
            () -> new StairBlock(() -> PYROSIAN_STONE_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_STAIRS).sound(SoundType.STONE)));
    public static final RegistryObject<WallBlock> PYROSIAN_STONE_BRICKS_WALL = registerBlock("pyrosian_stone_bricks_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CHISLED_PYROSIAN_STONE_BRICKS = registerBlock("chisled_pyrosian_stone_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.CHISELED_STONE_BRICKS).sound(SoundType.STONE)));

    public static final RegistryObject<Block> PYROSIAN_DEEPSLATE_BRICKS = registerBlock("pyrosian_deepslate_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_BRICKS).sound(SoundType.DEEPSLATE_BRICKS)));
    public static final RegistryObject<SlabBlock> PYROSIAN_DEEPSLATE_BRICKS_SLAB = registerBlock("pyrosian_deepslate_bricks_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_BRICK_SLAB).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<StairBlock> PYROSIAN_DEEPSLATE_BRICKS_STAIRS = registerBlock("pyrosian_deepslate_bricks_stairs",
            () -> new StairBlock(() -> PYROSIAN_DEEPSLATE_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_BRICK_STAIRS).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<WallBlock> PYROSIAN_DEEPSLATE_BRICKS_WALL = registerBlock("pyrosian_deepslate_bricks_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_BRICK_WALL).sound(SoundType.DEEPSLATE)));
    public static final RegistryObject<Block> CHISLED_PYROSIAN_DEEPSLATE_BRICKS = registerBlock("chisled_pyrosian_deepslate_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.CHISELED_DEEPSLATE).sound(SoundType.DEEPSLATE_BRICKS)));

    public static final RegistryObject<Block> VULPINITE_STONE = registerBlock("vulpinite_stone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE)));

    public static final RegistryObject<Block> VULPINITE_COBBLESTONE = registerBlock("vulpinite_cobblestone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE).sound(SoundType.STONE)));


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