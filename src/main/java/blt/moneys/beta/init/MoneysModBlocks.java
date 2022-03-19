
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package blt.moneys.beta.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

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
import blt.moneys.beta.MoneysMod;

public class MoneysModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, MoneysMod.MODID);
	public static final RegistryObject<Block> REBURNER = REGISTRY.register("reburner", () -> new ReburnerBlock());
	public static final RegistryObject<Block> OIL_ORE = REGISTRY.register("oil_ore", () -> new OilOreBlock());
	public static final RegistryObject<Block> MONEY_WOOD = REGISTRY.register("money_wood", () -> new MoneyWoodBlock());
	public static final RegistryObject<Block> MONEY_LOG = REGISTRY.register("money_log", () -> new MoneyLogBlock());
	public static final RegistryObject<Block> MONEY_PLANKS = REGISTRY.register("money_planks", () -> new MoneyPlanksBlock());
	public static final RegistryObject<Block> MONEY_LEAVES = REGISTRY.register("money_leaves", () -> new MoneyLeavesBlock());
	public static final RegistryObject<Block> MONEY_STAIRS = REGISTRY.register("money_stairs", () -> new MoneyStairsBlock());
	public static final RegistryObject<Block> MONEY_SLAB = REGISTRY.register("money_slab", () -> new MoneySlabBlock());
	public static final RegistryObject<Block> MONEY_FENCE = REGISTRY.register("money_fence", () -> new MoneyFenceBlock());
	public static final RegistryObject<Block> MONEY_FENCE_GATE = REGISTRY.register("money_fence_gate", () -> new MoneyFenceGateBlock());
	public static final RegistryObject<Block> MONEY_PRESSURE_PLATE = REGISTRY.register("money_pressure_plate", () -> new MoneyPressurePlateBlock());
	public static final RegistryObject<Block> MONEY_BUTTON = REGISTRY.register("money_button", () -> new MoneyButtonBlock());
	public static final RegistryObject<Block> RETURNER = REGISTRY.register("returner", () -> new ReturnerBlock());
}
