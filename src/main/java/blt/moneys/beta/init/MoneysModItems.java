
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package blt.moneys.beta.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import blt.moneys.beta.item.OilySwordItem;
import blt.moneys.beta.item.OilyShovelItem;
import blt.moneys.beta.item.OilyPickaxeItem;
import blt.moneys.beta.item.OilyHoeItem;
import blt.moneys.beta.item.OilyAxeItem;
import blt.moneys.beta.item.OilItem;
import blt.moneys.beta.item.OilHardItem;
import blt.moneys.beta.item.MoneySwordItem;
import blt.moneys.beta.item.MoneyShovelItem;
import blt.moneys.beta.item.MoneyPickaxeItem;
import blt.moneys.beta.item.MoneyHoeItem;
import blt.moneys.beta.item.MoneyAxeItem;
import blt.moneys.beta.item.MinecoinRipItem;
import blt.moneys.beta.item.Minecoin5Item;
import blt.moneys.beta.item.Minecoin50Item;
import blt.moneys.beta.item.Minecoin500Item;
import blt.moneys.beta.item.Minecoin5000Item;
import blt.moneys.beta.item.Minecoin20Item;
import blt.moneys.beta.item.Minecoin200Item;
import blt.moneys.beta.item.Minecoin2000Item;
import blt.moneys.beta.item.Minecoin1Item;
import blt.moneys.beta.item.Minecoin10Item;
import blt.moneys.beta.item.Minecoin100Item;
import blt.moneys.beta.item.Minecoin1000Item;
import blt.moneys.beta.item.HardenedOilArmorItem;
import blt.moneys.beta.item.BlackOilItem;
import blt.moneys.beta.MoneysMod;

public class MoneysModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, MoneysMod.MODID);
	public static final RegistryObject<Item> REBURNER = block(MoneysModBlocks.REBURNER, MoneysModTabs.TAB_MONEYS_TAB);
	public static final RegistryObject<Item> MINECOIN_1 = REGISTRY.register("minecoin_1", () -> new Minecoin1Item());
	public static final RegistryObject<Item> MINECOIN_5 = REGISTRY.register("minecoin_5", () -> new Minecoin5Item());
	public static final RegistryObject<Item> MINECOIN_10 = REGISTRY.register("minecoin_10", () -> new Minecoin10Item());
	public static final RegistryObject<Item> MINECOIN_20 = REGISTRY.register("minecoin_20", () -> new Minecoin20Item());
	public static final RegistryObject<Item> MINECOIN_50 = REGISTRY.register("minecoin_50", () -> new Minecoin50Item());
	public static final RegistryObject<Item> MINECOIN_100 = REGISTRY.register("minecoin_100", () -> new Minecoin100Item());
	public static final RegistryObject<Item> MINECOIN_200 = REGISTRY.register("minecoin_200", () -> new Minecoin200Item());
	public static final RegistryObject<Item> MINECOIN_500 = REGISTRY.register("minecoin_500", () -> new Minecoin500Item());
	public static final RegistryObject<Item> MINECOIN_1000 = REGISTRY.register("minecoin_1000", () -> new Minecoin1000Item());
	public static final RegistryObject<Item> MINECOIN_2000 = REGISTRY.register("minecoin_2000", () -> new Minecoin2000Item());
	public static final RegistryObject<Item> MINECOIN_5000 = REGISTRY.register("minecoin_5000", () -> new Minecoin5000Item());
	public static final RegistryObject<Item> MINECOIN_RIP = REGISTRY.register("minecoin_rip", () -> new MinecoinRipItem());
	public static final RegistryObject<Item> OIL_ORE = block(MoneysModBlocks.OIL_ORE, MoneysModTabs.TAB_MONEYS_TAB);
	public static final RegistryObject<Item> OIL = REGISTRY.register("oil", () -> new OilItem());
	public static final RegistryObject<Item> OIL_HARD = REGISTRY.register("oil_hard", () -> new OilHardItem());
	public static final RegistryObject<Item> BLACK_OIL = REGISTRY.register("black_oil", () -> new BlackOilItem());
	public static final RegistryObject<Item> MONEY_WOOD = block(MoneysModBlocks.MONEY_WOOD, MoneysModTabs.TAB_MONEYS_TAB);
	public static final RegistryObject<Item> MONEY_LOG = block(MoneysModBlocks.MONEY_LOG, MoneysModTabs.TAB_MONEYS_TAB);
	public static final RegistryObject<Item> MONEY_PLANKS = block(MoneysModBlocks.MONEY_PLANKS, MoneysModTabs.TAB_MONEYS_TAB);
	public static final RegistryObject<Item> MONEY_LEAVES = block(MoneysModBlocks.MONEY_LEAVES, MoneysModTabs.TAB_MONEYS_TAB);
	public static final RegistryObject<Item> MONEY_STAIRS = block(MoneysModBlocks.MONEY_STAIRS, MoneysModTabs.TAB_MONEYS_TAB);
	public static final RegistryObject<Item> MONEY_SLAB = block(MoneysModBlocks.MONEY_SLAB, MoneysModTabs.TAB_MONEYS_TAB);
	public static final RegistryObject<Item> MONEY_FENCE = block(MoneysModBlocks.MONEY_FENCE, MoneysModTabs.TAB_MONEYS_TAB);
	public static final RegistryObject<Item> MONEY_FENCE_GATE = block(MoneysModBlocks.MONEY_FENCE_GATE, MoneysModTabs.TAB_MONEYS_TAB);
	public static final RegistryObject<Item> MONEY_PRESSURE_PLATE = block(MoneysModBlocks.MONEY_PRESSURE_PLATE, MoneysModTabs.TAB_MONEYS_TAB);
	public static final RegistryObject<Item> MONEY_BUTTON = block(MoneysModBlocks.MONEY_BUTTON, MoneysModTabs.TAB_MONEYS_TAB);
	public static final RegistryObject<Item> HARDENED_OIL_ARMOR_HELMET = REGISTRY.register("hardened_oil_armor_helmet",
			() -> new HardenedOilArmorItem.Helmet());
	public static final RegistryObject<Item> HARDENED_OIL_ARMOR_CHESTPLATE = REGISTRY.register("hardened_oil_armor_chestplate",
			() -> new HardenedOilArmorItem.Chestplate());
	public static final RegistryObject<Item> HARDENED_OIL_ARMOR_LEGGINGS = REGISTRY.register("hardened_oil_armor_leggings",
			() -> new HardenedOilArmorItem.Leggings());
	public static final RegistryObject<Item> HARDENED_OIL_ARMOR_BOOTS = REGISTRY.register("hardened_oil_armor_boots",
			() -> new HardenedOilArmorItem.Boots());
	public static final RegistryObject<Item> WANDERING_SELLER = REGISTRY.register("wandering_seller_spawn_egg",
			() -> new ForgeSpawnEggItem(MoneysModEntities.WANDERING_SELLER, -65536, -26368, new Item.Properties().tab(MoneysModTabs.TAB_MONEYS_TAB)));
	public static final RegistryObject<Item> RETURNER = block(MoneysModBlocks.RETURNER, MoneysModTabs.TAB_MONEYS_TAB);
	public static final RegistryObject<Item> OILY_PICKAXE = REGISTRY.register("oily_pickaxe", () -> new OilyPickaxeItem());
	public static final RegistryObject<Item> OILY_AXE = REGISTRY.register("oily_axe", () -> new OilyAxeItem());
	public static final RegistryObject<Item> OILY_SWORD = REGISTRY.register("oily_sword", () -> new OilySwordItem());
	public static final RegistryObject<Item> OILY_SHOVEL = REGISTRY.register("oily_shovel", () -> new OilyShovelItem());
	public static final RegistryObject<Item> OILY_HOE = REGISTRY.register("oily_hoe", () -> new OilyHoeItem());
	public static final RegistryObject<Item> MONEY_PICKAXE = REGISTRY.register("money_pickaxe", () -> new MoneyPickaxeItem());
	public static final RegistryObject<Item> MONEY_AXE = REGISTRY.register("money_axe", () -> new MoneyAxeItem());
	public static final RegistryObject<Item> MONEY_SWORD = REGISTRY.register("money_sword", () -> new MoneySwordItem());
	public static final RegistryObject<Item> MONEY_SHOVEL = REGISTRY.register("money_shovel", () -> new MoneyShovelItem());
	public static final RegistryObject<Item> MONEY_HOE = REGISTRY.register("money_hoe", () -> new MoneyHoeItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
