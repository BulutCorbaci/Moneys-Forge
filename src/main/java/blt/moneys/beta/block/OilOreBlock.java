
package blt.moneys.beta.block;

import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.ItemStack;
import net.minecraft.core.BlockPos;

import java.util.List;
import java.util.Collections;

import blt.moneys.beta.init.MoneysModItems;

public class OilOreBlock extends Block {
	public OilOreBlock() {
		super(Block.Properties.of(Material.STONE).sound(SoundType.GRAVEL).strength(1f, 10f).lightLevel(s -> 0));
		setRegistryName("oil_ore");
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}

	@Override
	public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(MoneysModItems.OIL, (int) (3)));
	}
}
