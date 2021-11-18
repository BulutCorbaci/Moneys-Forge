
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package blt.moneys.beta.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.block.Block;

import java.util.List;
import java.util.ArrayList;

import blt.moneys.beta.block.ReturnerBlock;
import blt.moneys.beta.block.ReburnerBlock;
import blt.moneys.beta.block.OilOreBlock;
import blt.moneys.beta.block.MoneyWoodBlock;
import blt.moneys.beta.block.MoneyStairsBlock;
import blt.moneys.beta.block.MoneySlabBlock;
import blt.moneys.beta.block.MoneyPressurePlateBlock;
import blt.moneys.beta.block.MoneyPlanksBlock;
import blt.moneys.beta.block.MoneyLogBlock;
import blt.moneys.beta.block.MoneyLeavesBlock;
import blt.moneys.beta.block.MoneyFenceGateBlock;
import blt.moneys.beta.block.MoneyFenceBlock;
import blt.moneys.beta.block.MoneyButtonBlock;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MoneysModBlocks {
	private static final List<Block> REGISTRY = new ArrayList<>();
	public static final Block REBURNER = register(new ReburnerBlock());
	public static final Block OIL_ORE = register(new OilOreBlock());
	public static final Block MONEY_WOOD = register(new MoneyWoodBlock());
	public static final Block MONEY_LOG = register(new MoneyLogBlock());
	public static final Block MONEY_PLANKS = register(new MoneyPlanksBlock());
	public static final Block MONEY_LEAVES = register(new MoneyLeavesBlock());
	public static final Block MONEY_STAIRS = register(new MoneyStairsBlock());
	public static final Block MONEY_SLAB = register(new MoneySlabBlock());
	public static final Block MONEY_FENCE = register(new MoneyFenceBlock());
	public static final Block MONEY_FENCE_GATE = register(new MoneyFenceGateBlock());
	public static final Block MONEY_PRESSURE_PLATE = register(new MoneyPressurePlateBlock());
	public static final Block MONEY_BUTTON = register(new MoneyButtonBlock());
	public static final Block RETURNER = register(new ReturnerBlock());

	private static Block register(Block block) {
		REGISTRY.add(block);
		return block;
	}

	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Block[0]));
	}
}
