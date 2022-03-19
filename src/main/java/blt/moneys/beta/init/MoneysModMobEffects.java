
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package blt.moneys.beta.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import blt.moneys.beta.potion.QuickestFixEffectMobEffect;
import blt.moneys.beta.MoneysMod;

public class MoneysModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, MoneysMod.MODID);
	public static final RegistryObject<MobEffect> QUICKEST_FIX_EFFECT = REGISTRY.register("quickest_fix_effect",
			() -> new QuickestFixEffectMobEffect());
}
