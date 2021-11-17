
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package blt.moneys.beta.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.SpawnEggItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import java.util.List;
import java.util.ArrayList;

import blt.moneys.beta.item.OilItem;
import blt.moneys.beta.item.OilHardItem;
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

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MoneysModItems {
	private static final List<Item> REGISTRY = new ArrayList<>();
	public static final Item REBURNER = register(MoneysModBlocks.REBURNER, MoneysModTabs.TAB_MONEYS_TAB);
	public static final Item MINECOIN_1 = register(new Minecoin1Item());
	public static final Item MINECOIN_5 = register(new Minecoin5Item());
	public static final Item MINECOIN_10 = register(new Minecoin10Item());
	public static final Item MINECOIN_20 = register(new Minecoin20Item());
	public static final Item MINECOIN_50 = register(new Minecoin50Item());
	public static final Item MINECOIN_100 = register(new Minecoin100Item());
	public static final Item MINECOIN_200 = register(new Minecoin200Item());
	public static final Item MINECOIN_500 = register(new Minecoin500Item());
	public static final Item MINECOIN_1000 = register(new Minecoin1000Item());
	public static final Item MINECOIN_2000 = register(new Minecoin2000Item());
	public static final Item MINECOIN_5000 = register(new Minecoin5000Item());
	public static final Item MINECOIN_RIP = register(new MinecoinRipItem());
	public static final Item OIL_ORE = register(MoneysModBlocks.OIL_ORE, MoneysModTabs.TAB_MONEYS_TAB);
	public static final Item OIL = register(new OilItem());
	public static final Item OIL_HARD = register(new OilHardItem());
	public static final Item BLACK_OIL = register(new BlackOilItem());
	public static final Item MONEY_WOOD = register(MoneysModBlocks.MONEY_WOOD, MoneysModTabs.TAB_MONEYS_TAB);
	public static final Item MONEY_LOG = register(MoneysModBlocks.MONEY_LOG, MoneysModTabs.TAB_MONEYS_TAB);
	public static final Item MONEY_PLANKS = register(MoneysModBlocks.MONEY_PLANKS, MoneysModTabs.TAB_MONEYS_TAB);
	public static final Item MONEY_LEAVES = register(MoneysModBlocks.MONEY_LEAVES, MoneysModTabs.TAB_MONEYS_TAB);
	public static final Item MONEY_STAIRS = register(MoneysModBlocks.MONEY_STAIRS, MoneysModTabs.TAB_MONEYS_TAB);
	public static final Item MONEY_SLAB = register(MoneysModBlocks.MONEY_SLAB, MoneysModTabs.TAB_MONEYS_TAB);
	public static final Item MONEY_FENCE = register(MoneysModBlocks.MONEY_FENCE, MoneysModTabs.TAB_MONEYS_TAB);
	public static final Item MONEY_FENCE_GATE = register(MoneysModBlocks.MONEY_FENCE_GATE, MoneysModTabs.TAB_MONEYS_TAB);
	public static final Item MONEY_PRESSURE_PLATE = register(MoneysModBlocks.MONEY_PRESSURE_PLATE, MoneysModTabs.TAB_MONEYS_TAB);
	public static final Item MONEY_BUTTON = register(MoneysModBlocks.MONEY_BUTTON, MoneysModTabs.TAB_MONEYS_TAB);
	public static final Item HARDENED_OIL_ARMOR_HELMET = register(new HardenedOilArmorItem.Helmet());
	public static final Item HARDENED_OIL_ARMOR_CHESTPLATE = register(new HardenedOilArmorItem.Chestplate());
	public static final Item HARDENED_OIL_ARMOR_LEGGINGS = register(new HardenedOilArmorItem.Leggings());
	public static final Item HARDENED_OIL_ARMOR_BOOTS = register(new HardenedOilArmorItem.Boots());
	public static final Item WANDERING_SELLER = register(
			new SpawnEggItem(MoneysModEntities.WANDERING_SELLER, -65536, -26368, new Item.Properties().tab(MoneysModTabs.TAB_MONEYS_TAB))
					.setRegistryName("wandering_seller_spawn_egg"));

	private static Item register(Item item) {
		REGISTRY.add(item);
		return item;
	}

	private static Item register(Block block, CreativeModeTab tab) {
		return register(new BlockItem(block, new Item.Properties().tab(tab)).setRegistryName(block.getRegistryName()));
	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Item[0]));
	}
}
