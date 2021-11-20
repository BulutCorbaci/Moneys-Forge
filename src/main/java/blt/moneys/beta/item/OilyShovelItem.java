
package blt.moneys.beta.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import blt.moneys.beta.init.MoneysModTabs;
import blt.moneys.beta.init.MoneysModItems;

public class OilyShovelItem extends ShovelItem {
	public OilyShovelItem() {
		super(new Tier() {
			public int getUses() {
				return 216;
			}

			public float getSpeed() {
				return 6f;
			}

			public float getAttackDamageBonus() {
				return 0f;
			}

			public int getLevel() {
				return 2;
			}

			public int getEnchantmentValue() {
				return 13;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(MoneysModItems.OIL_HARD));
			}
		}, 1, -3f, new Item.Properties().tab(MoneysModTabs.TAB_MONEYS_TAB));
		setRegistryName("oily_shovel");
	}
}
