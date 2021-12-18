package blt.moneys.beta.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.entity.Entity;

import javax.annotation.Nullable;

import blt.moneys.beta.network.MoneysModVariables;

@Mod.EventBusSubscriber
public class ChangePageNumberProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			Entity entity = event.player;
			execute(event, entity);
		}
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if (entity.getPersistentData().getDouble("playerTradePage") == 1) {
			{
				String _setval = "10 Minecoins";
				entity.getCapability(MoneysModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.pagenumberminecoin = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 1;
				entity.getCapability(MoneysModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.PageNumberTrade = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (entity.getPersistentData().getDouble("playerTradePage") == 2) {
			{
				String _setval = "20 Minecoins";
				entity.getCapability(MoneysModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.pagenumberminecoin = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 2;
				entity.getCapability(MoneysModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.PageNumberTrade = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (entity.getPersistentData().getDouble("playerTradePage") == 3) {
			{
				String _setval = "50 Minecoins";
				entity.getCapability(MoneysModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.pagenumberminecoin = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 3;
				entity.getCapability(MoneysModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.PageNumberTrade = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
