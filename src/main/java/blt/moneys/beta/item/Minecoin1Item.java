
package blt.moneys.beta.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import blt.moneys.beta.init.MoneysModTabs;

public class Minecoin1Item extends Item {
	public Minecoin1Item() {
		super(new Item.Properties().tab(MoneysModTabs.TAB_MONEYS_TAB).stacksTo(64).rarity(Rarity.COMMON));
		setRegistryName("minecoin_1");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
