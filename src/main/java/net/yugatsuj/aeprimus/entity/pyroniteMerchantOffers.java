package net.yugatsuj.aeprimus.entity;

import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import net.minecraft.Util;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.util.Mth;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.entity.npc.VillagerTrades.ItemListing;
import net.minecraft.world.item.*;
import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.item.alchemy.PotionBrewing;
import net.minecraft.world.item.alchemy.PotionUtils;
import net.minecraft.world.item.alchemy.Potions;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.enchantment.EnchantmentInstance;
import net.minecraft.world.item.trading.MerchantOffer;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.yugatsuj.aeprimus.block.ModBlocks;
import net.yugatsuj.aeprimus.item.ModItems;
import org.jetbrains.annotations.Nullable;
import java.util.List;
import java.util.Map;
// Pyronite trading stuff yes taken from ad astra
public class pyroniteMerchantOffers {

    public static final Map<VillagerProfession, Int2ObjectMap<ItemListing[]>> PROFESSION_TO_LEVELED_TRADE = Util.make(Maps.newHashMap(), map -> {
        // Cartographer trades bs(wanted to add globe didnt know how)
        map.put(VillagerProfession.CARTOGRAPHER,
                copyToFastUtilMap(Map.of(1, new ItemListing[]{new BuyForOneEmeraldFactory(Items.PAPER, 24, 16, 2), new SellItemFactory(Items.MAP, 7, 1, 1)}, 2, new ItemListing[]{new BuyForOneEmeraldFactory(Items.GLASS_PANE, 11, 16, 10)}, 3, new ItemListing[]{new BuyForOneEmeraldFactory(Items.COMPASS, 1, 12, 20)}, 4,
                        new ItemListing[]{new SellItemFactory(Items.ITEM_FRAME, 7, 1, 15), new SellItemFactory(Items.GLOBE_BANNER_PATTERN, 8, 1, 15)}, 5,
                        new ItemListing[]{new SellItemFactory(Items.GLOBE_BANNER_PATTERN, 6, 1, 45)})));
        // Cleric trades (my second favourite on design)
        map.put(VillagerProfession.CLERIC, copyToFastUtilMap(Map.of(1, new ItemListing[]{new BuyForOneEmeraldFactory(Items.ROTTEN_FLESH, 32, 16, 2), new SellItemFactory(Items.IRON_INGOT, 1, 2, 12, 1)}, 2, new ItemListing[]{new BuyForOneEmeraldFactory(Items.GOLD_INGOT, 3, 12, 10), new SellItemFactory(Items.POTION, 1, 1, 12, 5)}, 3, new ItemListing[]{new BuyForOneEmeraldFactory(Items.LAVA_BUCKET, 2, 12, 20), new SellItemFactory(ModItems.PYROSIANWAX.get(), 4, 1, 12, 10)}, 4, new ItemListing[]{new BuyForOneEmeraldFactory(Items.SCUTE, 4, 12, 30), new BuyForOneEmeraldFactory(Items.GLASS_BOTTLE, 9, 12, 30), new SellItemFactory(Items.ENDER_PEARL, 5, 1, 15)}, 5, new ItemListing[]{new BuyForOneEmeraldFactory(Items.NETHER_WART, 22, 12, 30), new SellItemFactory(ModItems.PYROSIANWAX.get(), 3, 1, 12, 30)})));
        ItemStack potion = new ItemStack(Items.POTION);
        PotionUtils.setPotion(potion, Potions.FIRE_RESISTANCE);
        // Armorer trades(not very unique but he is cool)
        map.put(VillagerProfession.ARMORER, copyToFastUtilMap(Map.of(1, new ItemListing[]{new BuyForOneEmeraldFactory(ModItems.PYROSIANASH.get(), 12, 16, 2), new SellItemFactory(new ItemStack(Items.IRON_LEGGINGS), 14, 1, 12, 4, 0.2f), new SellItemFactory(new ItemStack(Items.IRON_BOOTS), 8, 1, 12, 4, 0.2f), new SellItemFactory(new ItemStack(Items.IRON_HELMET), 10, 1, 12, 4, 0.2f), new SellItemFactory(new ItemStack(Items.IRON_CHESTPLATE), 36, 1, 12, 8, 0.2f)}, 2, new ItemListing[]{new BuyForOneEmeraldFactory(ModItems.PYROSIANASH.get(), 4, 8, 10), new SellItemFactory(new ItemStack(ModItems.PYROSIANWAX.get()), 36, 1, 12, 5, 0.2f), new SellItemFactory(new ItemStack(Items.CHAINMAIL_LEGGINGS), 8, 1, 12, 4, 0.2f), new SellItemFactory(new ItemStack(Items.CHAINMAIL_BOOTS), 14, 1, 12, 4, 0.2f)}, 3,
                new ItemListing[]{new BuyForOneEmeraldFactory(Items.LAVA_BUCKET, 1, 12, 20), new BuyForOneEmeraldFactory(Items.DIAMOND, 1, 12, 20), new SellItemFactory(new ItemStack(Items.CHAINMAIL_HELMET), 10, 1, 12, 4, 0.2f), new SellItemFactory(new ItemStack(Items.CHAINMAIL_CHESTPLATE), 36, 1, 12, 8, 0.2f), new SellItemFactory(new ItemStack(Items.SHIELD), 5, 1, 12, 10, 0.2f)}, 4, new ItemListing[]{new SellEnchantedToolFactory(Items.IRON_LEGGINGS, 28, 3, 15, 0.2f), new SellEnchantedToolFactory(Items.IRON_BOOTS, 16, 3, 15, 0.2f)}, 5, new ItemListing[]{new SellEnchantedToolFactory(Items.IRON_HELMET, 16, 3, 30, 0.2f), new SellEnchantedToolFactory(Items.IRON_CHESTPLATE, 48, 3, 30, 0.2f)})));
        // Weaponsmith trades(nothing cool abt him)
        map.put(VillagerProfession.WEAPONSMITH,
                copyToFastUtilMap(Map.of(1, new ItemListing[]{new BuyForOneEmeraldFactory(Items.IRON_INGOT, 12, 16, 2), new SellItemFactory(new ItemStack(Items.IRON_AXE), 3, 1, 12, 1, 0.2f), new SellEnchantedToolFactory(Items.IRON_SWORD, 2, 3, 1)}, 2, new ItemListing[]{new BuyForOneEmeraldFactory(ModItems.PYROSIANASH.get(), 16, 12, 10), new SellItemFactory(new ItemStack(ModItems.PYROSIANWAX.get()), 4, 1, 12, 5, 0.2f)}, 3, new ItemListing[]{new BuyForOneEmeraldFactory(Items.FLINT, 24, 12, 20)}, 4, new ItemListing[]{new BuyForOneEmeraldFactory(Items.DIAMOND, 1, 12, 30), new SellEnchantedToolFactory(Items.IRON_AXE, 12, 3, 15, 0.2f)}, 5, new ItemListing[]{new SellEnchantedToolFactory(Items.IRON_SWORD, 8, 3, 30, 0.2f)})));
        // ToolSmith trades(My fav one design and trade wise)
        map.put(VillagerProfession.TOOLSMITH, copyToFastUtilMap(Map.of(1, new ItemListing[]{new BuyForOneEmeraldFactory(ModItems.PYROSIANASH.get(), 12, 16, 2), new SellItemFactory(new ItemStack(Items.SOUL_TORCH), 3, 16, 8, 1, 0.2f), new SellItemFactory(new ItemStack(Items.IRON_PICKAXE), 1, 1, 12, 1, 0.2f), new SellItemFactory(new ItemStack(Items.STONE_AXE), 1, 1, 12, 1, 0.2f), new SellItemFactory(new ItemStack(Items.STONE_SHOVEL), 1, 1, 12, 1, 0.2f), new SellItemFactory(new ItemStack(Items.STONE_HOE), 1, 1, 12, 1, 0.2f)}, 2, new ItemListing[]{new BuyForOneEmeraldFactory(ModItems.PYROSIANASH.get(), 4, 12, 10), new SellItemFactory(new ItemStack(Items.BELL), 36, 1, 12, 5, 0.2f)}, 3,                new ItemListing[]{new BuyForOneEmeraldFactory(Items.FLINT, 30, 12, 20), new SellEnchantedToolFactory(Items.IRON_AXE, 1, 3, 10, 0.2f), new SellEnchantedToolFactory(Items.IRON_SHOVEL, 2, 3, 10, 0.2f), new SellEnchantedToolFactory(Items.IRON_PICKAXE, 3, 3, 10, 0.2f), new SellItemFactory(new ItemStack(Items.IRON_HOE), 4, 1, 3, 10, 0.2f)}, 4, new ItemListing[]{new BuyForOneEmeraldFactory(Items.DIAMOND, 1, 12, 30), new SellEnchantedToolFactory(Items.DIAMOND_AXE, 12, 3, 15, 0.2f), new SellEnchantedToolFactory(Items.GOLDEN_SHOVEL, 5, 3, 15, 0.2f)}, 5, new ItemListing[]{new SellEnchantedToolFactory(Items.DIAMOND_PICKAXE, 13, 3, 30, 0.2f)})));
        // Still didnt tryy him out but should work
        map.put(VillagerProfession.MASON,
                copyToFastUtilMap(Map.of(1, new ItemListing[]{new BuyForOneEmeraldFactory(ModBlocks.PYROSIAN_STONE.get(), 10, 16, 2), new BuyForOneEmeraldFactory(ModBlocks.PYROSIAN_DEEPSLATE_BRICKS.get(), 32, 32, 1), new SellItemFactory(ModBlocks.PYROSIAN_STONE_BRICKS.get(), 1, 10, 16, 1)}, 2, new ItemListing[]{new BuyForOneEmeraldFactory(ModBlocks.PYROSIAN_DEEPSLATE.get(), 20, 16, 10), new SellItemFactory(ModBlocks.CHISLED_PYROSIAN_STONE_BRICKS.get(), 1, 4, 16, 5)}, 3, new ItemListing[]{new BuyForOneEmeraldFactory(ModBlocks.CHISLED_PYROSIAN_DEEPSLATE_BRICKS.get(), 16, 16, 20), new BuyForOneEmeraldFactory(ModBlocks.PYROSIAN_STONE.get(), 16, 16, 20), new SellItemFactory(Blocks.DRIPSTONE_BLOCK, 1, 4, 16, 10), new SellItemFactory(ModBlocks.CHISLED_PYROSIAN_STONE_BRICKS.get(), 1, 4, 16, 10)}, 4,
                        new ItemListing[]{new BuyForOneEmeraldFactory(Items.QUARTZ, 12, 12, 30), new SellItemFactory(Blocks.ORANGE_TERRACOTTA, 1, 1, 12, 15), new SellItemFactory(Blocks.WHITE_TERRACOTTA, 1, 1, 12, 15), new SellItemFactory(Blocks.BLUE_TERRACOTTA, 1, 1, 12, 15), new SellItemFactory(Blocks.RED_TERRACOTTA, 1, 1, 12, 15), new SellItemFactory(Blocks.YELLOW_TERRACOTTA, 1, 1, 12, 15), new SellItemFactory(Blocks.ORANGE_GLAZED_TERRACOTTA, 1, 1, 12, 15), new SellItemFactory(Blocks.WHITE_GLAZED_TERRACOTTA, 1, 1, 12, 15), new SellItemFactory(Blocks.BLUE_GLAZED_TERRACOTTA, 1, 1, 12, 15), new SellItemFactory(Blocks.RED_GLAZED_TERRACOTTA, 1, 1, 12, 15), new SellItemFactory(Blocks.YELLOW_GLAZED_TERRACOTTA, 1, 1, 12, 15)},
                        5, new ItemListing[]{new SellItemFactory(Blocks.QUARTZ_PILLAR, 1, 1, 12, 30), new SellItemFactory(Blocks.QUARTZ_BLOCK, 1, 1, 12, 30)})));
    });
    // All of the code below i saw how Ad astra does its villagers so its just copied by it but changed emeralds to frigyd shards
    private static Int2ObjectMap<ItemListing[]> copyToFastUtilMap(Map<Integer, ItemListing[]> map) {
        return new Int2ObjectOpenHashMap<>(map);
    }

    static class BuyForOneEmeraldFactory implements ItemListing {

        private final Item buy;
        private final int price;
        private final int maxUses;
        private final int experience;
        private final float multiplier;

        public BuyForOneEmeraldFactory(ItemLike item, int price, int maxUses, int experience) {
            this.buy = item.asItem();
            this.price = price;
            this.maxUses = maxUses;
            this.experience = experience;
            this.multiplier = 0.05f;
        }

        @Override
        public MerchantOffer getOffer(Entity entity, RandomSource random) {
            ItemStack itemStack = new ItemStack(this.buy, this.price);
            return new MerchantOffer(itemStack, new ItemStack(ModItems.FRIGYDSHARD.get()), this.maxUses, this.experience, this.multiplier);
        }
    }

    static class SellItemFactory implements ItemListing {

        private final ItemStack sell;
        private final int price;
        private final int count;
        private final int maxUses;
        private final int experience;
        private final float multiplier;

        public SellItemFactory(Block block, int price, int count, int maxUses, int experience) {
            this(new ItemStack(block), price, count, maxUses, experience);
        }

        public SellItemFactory(Item item, int price, int count, int experience) {
            this(new ItemStack(item), price, count, 12, experience);
        }

        public SellItemFactory(Item item, int price, int count, int maxUses, int experience) {
            this(new ItemStack(item), price, count, maxUses, experience);
        }

        public SellItemFactory(ItemStack stack, int price, int count, int maxUses, int experience) {
            this(stack, price, count, maxUses, experience, 0.05f);
        }

        public SellItemFactory(ItemStack stack, int price, int count, int maxUses, int experience, float multiplier) {
            this.sell = stack;
            this.price = price;
            this.count = count;
            this.maxUses = maxUses;
            this.experience = experience;
            this.multiplier = multiplier;
        }

        @Override
        public MerchantOffer getOffer(Entity entity, RandomSource random) {
            ItemStack stack = new ItemStack(this.sell.getItem(), this.count);
            stack.setTag((this.sell.getTag()));
            return new MerchantOffer(new ItemStack(ModItems.FRIGYDSHARD.get(), this.price), stack, this.maxUses, this.experience, this.multiplier);
        }
    }

    static class SellEnchantedToolFactory implements ItemListing {

        private final ItemStack tool;
        private final int basePrice;
        private final int maxUses;
        private final int experience;
        private final float multiplier;

        public SellEnchantedToolFactory(Item item, int basePrice, int maxUses, int experience) {
            this(item, basePrice, maxUses, experience, 0.05f);
        }

        public SellEnchantedToolFactory(Item item, int basePrice, int maxUses, int experience, float multiplier) {
            this.tool = new ItemStack(item);
            this.basePrice = basePrice;
            this.maxUses = maxUses;
            this.experience = experience;
            this.multiplier = multiplier;
        }

        @Override
        public MerchantOffer getOffer(Entity entity, RandomSource random) {
            int i = 5 + random.nextInt(15);
            ItemStack itemStack = EnchantmentHelper.enchantItem(random, new ItemStack(this.tool.getItem()), i, false);
            int j = Math.min(this.basePrice + i, 64);
            ItemStack itemStack2 = new ItemStack(ModItems.FRIGYDSHARD.get(), j);
            return new MerchantOffer(itemStack2, itemStack, this.maxUses, this.experience, this.multiplier);
        }
    }
}