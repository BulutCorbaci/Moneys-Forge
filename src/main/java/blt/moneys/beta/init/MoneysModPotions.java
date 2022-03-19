
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package blt.moneys.beta.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.effect.MobEffectInstance;

import blt.moneys.beta.MoneysMod;

public class MoneysModPotions {
	public static final DeferredRegister<Potion> REGISTRY = DeferredRegister.create(ForgeRegistries.POTIONS, MoneysMod.MODID);
	public static final RegistryObject<Potion> QUICKEST_FIX_ITEM = REGISTRY.register("quickest_fix_item",
			() -> new Potion(new MobEffectInstance(MoneysModMobEffects.QUICKEST_FIX_EFFECT.get(), 40, 0, false, true)));
}
