
package blt.moneys.beta.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;

import blt.moneys.beta.init.MoneysModTabs;
import blt.moneys.beta.init.MoneysModBlocks;

public class MoneyHoeItem extends HoeItem {
	public MoneyHoeItem() {
		super(new Tier() {
			public int getUses() {
				return 95;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return -1f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 7;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(MoneysModBlocks.MONEY_PLANKS));
			}
		}, 0, -3f, new Item.Properties().tab(MoneysModTabs.TAB_MONEYS_TAB));
		setRegistryName("money_hoe");
	}
}
