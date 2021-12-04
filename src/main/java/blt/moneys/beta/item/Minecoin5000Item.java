
package blt.moneys.beta.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import blt.moneys.beta.init.MoneysModTabs;

public class Minecoin5000Item extends Item {
	public Minecoin5000Item() {
		super(new Item.Properties().tab(MoneysModTabs.TAB_MONEYS_TAB).stacksTo(64).rarity(Rarity.COMMON));
		setRegistryName("minecoin_5000");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
