
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

import blt.moneys.beta.block.ReburnerBlock;
import blt.moneys.beta.block.OilOreBlock;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MoneysModBlocks {
	private static final List<Block> REGISTRY = new ArrayList<>();
	public static final Block REBURNER = register(new ReburnerBlock());
	public static final Block OIL_ORE = register(new OilOreBlock());

	private static Block register(Block block) {
		REGISTRY.add(block);
		return block;
	}

	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Block[0]));
	}
}
