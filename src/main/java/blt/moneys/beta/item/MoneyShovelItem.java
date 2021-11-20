
package blt.moneys.beta.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import blt.moneys.beta.init.MoneysModTabs;
import blt.moneys.beta.init.MoneysModBlocks;

public class MoneyShovelItem extends ShovelItem {
	public MoneyShovelItem() {
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
		}, 1, -3f, new Item.Properties().tab(MoneysModTabs.TAB_MONEYS_TAB));
		setRegistryName("money_shovel");
	}
}
