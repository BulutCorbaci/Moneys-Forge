
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package blt.moneys.beta.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class MoneysModTabs {
	public static CreativeModeTab TAB_MONEYS_TAB;

	public static void load() {
		TAB_MONEYS_TAB = new CreativeModeTab("tabmoneys_tab") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(MoneysModItems.MINECOIN_200.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
