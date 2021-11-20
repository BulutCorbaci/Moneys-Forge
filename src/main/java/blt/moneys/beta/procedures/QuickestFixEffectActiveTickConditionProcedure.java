package blt.moneys.beta.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

public class QuickestFixEffectActiveTickConditionProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity)
			_entity.setHealth((float) ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) + 1));
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) >= 21) {
			if (entity instanceof LivingEntity _entity)
				_entity.setHealth(20);
		}
	}
}
