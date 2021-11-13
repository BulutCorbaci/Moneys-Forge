package blt.moneys.beta.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.Minecraft;

import java.util.Map;

import blt.moneys.beta.MoneysMod;

public class ExpSoundProcedure {
	public static void execute(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				MoneysMod.LOGGER.warn("Failed to load dependency x for procedure ExpSound!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				MoneysMod.LOGGER.warn("Failed to load dependency y for procedure ExpSound!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				MoneysMod.LOGGER.warn("Failed to load dependency z for procedure ExpSound!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				MoneysMod.LOGGER.warn("Failed to load dependency world for procedure ExpSound!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		LevelAccessor world = (LevelAccessor) dependencies.get("world");
		if (world instanceof Level _level)
			_level.playSound(_level.isClientSide() ? Minecraft.getInstance().player : null, x, y, z,
					ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.experience_orb.pickup")), SoundSource.PLAYERS, 1, 1);
	}
}
