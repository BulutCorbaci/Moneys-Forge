package blt.moneys.beta.procedures;

import net.minecraft.world.entity.Entity;

import java.util.Map;

import blt.moneys.beta.MoneysMod;

public class ChangePageBackProcedure {
	public static void execute(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				MoneysMod.LOGGER.warn("Failed to load dependency entity for procedure ChangePageBack!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity.getPersistentData().getDouble("playerTradePage") == 2) {
			entity.getPersistentData().putDouble("playerTradePage", 1);
		} else if (entity.getPersistentData().getDouble("playerTradePage") == 3) {
			entity.getPersistentData().putDouble("playerTradePage", 2);
		}
	}
}
