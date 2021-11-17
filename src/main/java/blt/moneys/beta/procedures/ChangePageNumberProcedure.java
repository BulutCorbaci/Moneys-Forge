package blt.moneys.beta.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.entity.Entity;

import java.util.Map;
import java.util.HashMap;

import blt.moneys.beta.network.MoneysModVariables;
import blt.moneys.beta.MoneysMod;

@Mod.EventBusSubscriber
public class ChangePageNumberProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			Entity entity = event.player;
			Map<String, Object> dependencies = new HashMap<>();
			dependencies.put("x", entity.getX());
			dependencies.put("y", entity.getY());
			dependencies.put("z", entity.getZ());
			dependencies.put("world", entity.level);
			dependencies.put("entity", entity);
			dependencies.put("event", event);
			execute(dependencies);
		}
	}

	public static void execute(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				MoneysMod.LOGGER.warn("Failed to load dependency entity for procedure ChangePageNumber!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity.getPersistentData().getDouble("playerTradePage") == 1) {
			{
				String _setval = (String) "10 Minecoins";
				entity.getCapability(MoneysModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.pagenumberminecoin = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = (double) 1;
				entity.getCapability(MoneysModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.PageNumberTrade = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (entity.getPersistentData().getDouble("playerTradePage") == 2) {
			{
				String _setval = (String) "20 Minecoins";
				entity.getCapability(MoneysModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.pagenumberminecoin = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = (double) 2;
				entity.getCapability(MoneysModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.PageNumberTrade = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (entity.getPersistentData().getDouble("playerTradePage") == 3) {
			{
				String _setval = (String) "50 Minecoins";
				entity.getCapability(MoneysModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.pagenumberminecoin = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = (double) 3;
				entity.getCapability(MoneysModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.PageNumberTrade = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
