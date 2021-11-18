
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package blt.moneys.beta.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import java.util.List;
import java.util.ArrayList;

import blt.moneys.beta.block.entity.ReturnerBlockEntity;
import blt.moneys.beta.block.entity.ReburnerBlockEntity;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MoneysModBlockEntities {
	private static final List<BlockEntityType<?>> REGISTRY = new ArrayList<>();
	public static final BlockEntityType<?> REBURNER = register("moneys:reburner", MoneysModBlocks.REBURNER, ReburnerBlockEntity::new);
	public static final BlockEntityType<?> RETURNER = register("moneys:returner", MoneysModBlocks.RETURNER, ReturnerBlockEntity::new);

	private static BlockEntityType<?> register(String registryname, Block block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		BlockEntityType<?> blockEntityType = BlockEntityType.Builder.of(supplier, block).build(null).setRegistryName(registryname);
		REGISTRY.add(blockEntityType);
		return blockEntityType;
	}

	@SubscribeEvent
	public static void registerTileEntity(RegistryEvent.Register<BlockEntityType<?>> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new BlockEntityType[0]));
	}
}
