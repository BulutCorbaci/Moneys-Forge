
package blt.moneys.beta.potion;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import blt.moneys.beta.procedures.QuickestFixEffectEffectStartedappliedProcedure;

public class QuickestFixEffectMobEffect extends MobEffect {
	public QuickestFixEffectMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -52480);
		setRegistryName("quickest_fix_effect");
	}

	@Override
	public String getDescriptionId() {
		return "effect.moneys.quickest_fix_effect";
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		Level world = entity.level;
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		QuickestFixEffectEffectStartedappliedProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
