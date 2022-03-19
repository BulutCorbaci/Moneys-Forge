
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package blt.moneys.beta.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import blt.moneys.beta.block.entity.ReturnerBlockEntity;
import blt.moneys.beta.block.entity.ReburnerBlockEntity;
import blt.moneys.beta.MoneysMod;

public class MoneysModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, MoneysMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> REBURNER = register("reburner", MoneysModBlocks.REBURNER, ReburnerBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> RETURNER = register("returner", MoneysModBlocks.RETURNER, ReturnerBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block,
			BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
