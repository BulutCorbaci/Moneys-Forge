
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package blt.moneys.beta.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.block.Block;
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
import blt.moneys.beta.item.BlackOilItem;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MoneysModItems {
	private static final List<Item> REGISTRY = new ArrayList<>();
	public static final Item REBURNER = register(MoneysModBlocks.REBURNER, CreativeModeTab.TAB_BUILDING_BLOCKS);
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
	public static final Item OIL_ORE = register(MoneysModBlocks.OIL_ORE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item OIL = register(new OilItem());
	public static final Item OIL_HARD = register(new OilHardItem());
	public static final Item BLACK_OIL = register(new BlackOilItem());
	public static final Item MONEY_WOOD = register(MoneysModBlocks.MONEY_WOOD, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item MONEY_LOG = register(MoneysModBlocks.MONEY_LOG, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item MONEY_PLANKS = register(MoneysModBlocks.MONEY_PLANKS, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item MONEY_LEAVES = register(MoneysModBlocks.MONEY_LEAVES, CreativeModeTab.TAB_DECORATIONS);
	public static final Item MONEY_STAIRS = register(MoneysModBlocks.MONEY_STAIRS, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item MONEY_SLAB = register(MoneysModBlocks.MONEY_SLAB, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item MONEY_FENCE = register(MoneysModBlocks.MONEY_FENCE, CreativeModeTab.TAB_DECORATIONS);
	public static final Item MONEY_FENCE_GATE = register(MoneysModBlocks.MONEY_FENCE_GATE, CreativeModeTab.TAB_REDSTONE);
	public static final Item MONEY_PRESSURE_PLATE = register(MoneysModBlocks.MONEY_PRESSURE_PLATE, CreativeModeTab.TAB_REDSTONE);
	public static final Item MONEY_BUTTON = register(MoneysModBlocks.MONEY_BUTTON, CreativeModeTab.TAB_BUILDING_BLOCKS);

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
