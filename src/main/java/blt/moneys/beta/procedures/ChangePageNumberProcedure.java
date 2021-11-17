package blt.moneys.beta.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.client.gui.components.EditBox;

import java.util.Map;
import java.util.HashMap;

import blt.moneys.beta.MoneysMod;

public class ChangePageNumberProcedure {
	public static void execute(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				MoneysMod.LOGGER.warn("Failed to load dependency entity for procedure ChangePageNumber!");
			return;
		}
		if (dependencies.get("guistate") == null) {
			if (!dependencies.containsKey("guistate"))
				MoneysMod.LOGGER.warn("Failed to load dependency guistate for procedure ChangePageNumber!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		HashMap guistate = (HashMap) dependencies.get("guistate");
		if (entity.getPersistentData().getDouble("playerTradePage") == 1) {
			if (guistate.get("text:%page%")instanceof EditBox _tf)
				_tf.setValue("1");
		} else if (entity.getPersistentData().getDouble("playerTradePage") == 2) {
			if (guistate.get("text:%page%")instanceof EditBox _tf)
				_tf.setValue("2");
		} else if (entity.getPersistentData().getDouble("playerTradePage") == 3) {
			if (guistate.get("text:%page%")instanceof EditBox _tf)
				_tf.setValue("3");
		}
	}
}
