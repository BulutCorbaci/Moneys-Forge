
package blt.moneys.beta.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import blt.moneys.beta.init.MoneysModTabs;
import blt.moneys.beta.init.MoneysModItems;

public abstract class HardenedOilArmorItem extends ArmorItem {
	public HardenedOilArmorItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 18;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{2, 7, 6, 2}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 11;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.armor.equip_iron"));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(MoneysModItems.OIL_HARD));
			}

			@Override
			public String getName() {
				return "hardened_oil_armor";
			}

			@Override
			public float getToughness() {
				return 0f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0f;
			}
		}, slot, properties);
	}

	public static class Helmet extends HardenedOilArmorItem {
		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(MoneysModTabs.TAB_MONEYS_TAB));
			setRegistryName("hardened_oil_armor_helmet");
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "moneys:textures/models/armor/oil__layer_1.png";
		}
	}

	public static class Chestplate extends HardenedOilArmorItem {
		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(MoneysModTabs.TAB_MONEYS_TAB));
			setRegistryName("hardened_oil_armor_chestplate");
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "moneys:textures/models/armor/oil__layer_1.png";
		}
	}

	public static class Leggings extends HardenedOilArmorItem {
		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(MoneysModTabs.TAB_MONEYS_TAB));
			setRegistryName("hardened_oil_armor_leggings");
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "moneys:textures/models/armor/oil__layer_2.png";
		}
	}

	public static class Boots extends HardenedOilArmorItem {
		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(MoneysModTabs.TAB_MONEYS_TAB));
			setRegistryName("hardened_oil_armor_boots");
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "moneys:textures/models/armor/oil__layer_1.png";
		}
	}
}
