package blt.moneys.beta.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.entity.Entity;

import javax.annotation.Nullable;

import blt.moneys.beta.network.MoneysModVariables;

@Mod.EventBusSubscriber
public class ChangeItemNameOnWanderingSellerGUIProcedure {
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
			if (entity.getPersistentData().getDouble("playerTradeItem1") == 1) {
				{
					String _setval = "Reburner";
					entity.getCapability(MoneysModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.tradeitemname = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = entity.getPersistentData().getDouble("playerTradeCount1");
					entity.getCapability(MoneysModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.tradeitemcount = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if (entity.getPersistentData().getDouble("playerTradeItem1") == 2) {
				{
					String _setval = "Oil";
					entity.getCapability(MoneysModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.tradeitemname = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = entity.getPersistentData().getDouble("playerTradeCount1");
					entity.getCapability(MoneysModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.tradeitemcount = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if (entity.getPersistentData().getDouble("playerTradeItem1") == 3) {
				{
					String _setval = "Hardened Oil Boots";
					entity.getCapability(MoneysModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.tradeitemname = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = entity.getPersistentData().getDouble("playerTradeCount1");
					entity.getCapability(MoneysModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.tradeitemcount = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if (entity.getPersistentData().getDouble("playerTradeItem1") == 4) {
				{
					String _setval = "Sandstone";
					entity.getCapability(MoneysModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.tradeitemname = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = entity.getPersistentData().getDouble("playerTradeCount1");
					entity.getCapability(MoneysModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.tradeitemcount = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if (entity.getPersistentData().getDouble("playerTradeItem1") == 5) {
				{
					String _setval = "Cobblestone";
					entity.getCapability(MoneysModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.tradeitemname = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = entity.getPersistentData().getDouble("playerTradeCount1");
					entity.getCapability(MoneysModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.tradeitemcount = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if (entity.getPersistentData().getDouble("playerTradeItem1") == 6) {
				{
					String _setval = "Dark Oak Log";
					entity.getCapability(MoneysModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.tradeitemname = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = entity.getPersistentData().getDouble("playerTradeCount1");
					entity.getCapability(MoneysModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.tradeitemcount = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		} else if (entity.getPersistentData().getDouble("playerTradePage") == 2) {
			if (entity.getPersistentData().getDouble("playerTradeItem2") == 1) {
				{
					String _setval = "Ripped Minecoin";
					entity.getCapability(MoneysModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.tradeitemname = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = entity.getPersistentData().getDouble("playerTradeCount2");
					entity.getCapability(MoneysModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.tradeitemcount = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if (entity.getPersistentData().getDouble("playerTradeItem2") == 2) {
				{
					String _setval = "Hardened Oil";
					entity.getCapability(MoneysModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.tradeitemname = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = entity.getPersistentData().getDouble("playerTradeCount2");
					entity.getCapability(MoneysModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.tradeitemcount = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if (entity.getPersistentData().getDouble("playerTradeItem2") == 3) {
				{
					String _setval = "Hardened Oil Helmet";
					entity.getCapability(MoneysModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.tradeitemname = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = entity.getPersistentData().getDouble("playerTradeCount2");
					entity.getCapability(MoneysModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.tradeitemcount = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if (entity.getPersistentData().getDouble("playerTradeItem2") == 4) {
				{
					String _setval = "Slime Block";
					entity.getCapability(MoneysModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.tradeitemname = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = entity.getPersistentData().getDouble("playerTradeCount2");
					entity.getCapability(MoneysModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.tradeitemcount = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if (entity.getPersistentData().getDouble("playerTradeItem2") == 5) {
				{
					String _setval = "Reburner";
					entity.getCapability(MoneysModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.tradeitemname = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = entity.getPersistentData().getDouble("playerTradeCount2");
					entity.getCapability(MoneysModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.tradeitemcount = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if (entity.getPersistentData().getDouble("playerTradeItem2") == 6) {
				{
					String _setval = "Torch";
					entity.getCapability(MoneysModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.tradeitemname = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = entity.getPersistentData().getDouble("playerTradeCount2");
					entity.getCapability(MoneysModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.tradeitemcount = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		} else if (entity.getPersistentData().getDouble("playerTradePage") == 3) {
			if (entity.getPersistentData().getDouble("playerTradeItem3") == 1) {
				{
					String _setval = "Money Log";
					entity.getCapability(MoneysModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.tradeitemname = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = entity.getPersistentData().getDouble("playerTradeCount3");
					entity.getCapability(MoneysModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.tradeitemcount = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if (entity.getPersistentData().getDouble("playerTradeItem3") == 2) {
				{
					String _setval = "Blackened Oil";
					entity.getCapability(MoneysModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.tradeitemname = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = entity.getPersistentData().getDouble("playerTradeCount3");
					entity.getCapability(MoneysModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.tradeitemcount = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if (entity.getPersistentData().getDouble("playerTradeItem3") == 3) {
				{
					String _setval = "Hardened Oil Chestplate";
					entity.getCapability(MoneysModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.tradeitemname = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = entity.getPersistentData().getDouble("playerTradeCount3");
					entity.getCapability(MoneysModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.tradeitemcount = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if (entity.getPersistentData().getDouble("playerTradeItem3") == 4) {
				{
					String _setval = "Jungle Log";
					entity.getCapability(MoneysModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.tradeitemname = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = entity.getPersistentData().getDouble("playerTradeCount3");
					entity.getCapability(MoneysModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.tradeitemcount = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if (entity.getPersistentData().getDouble("playerTradeItem3") == 5) {
				{
					String _setval = "Obsidian";
					entity.getCapability(MoneysModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.tradeitemname = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = entity.getPersistentData().getDouble("playerTradeCount3");
					entity.getCapability(MoneysModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.tradeitemcount = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if (entity.getPersistentData().getDouble("playerTradeItem3") == 6) {
				{
					String _setval = "Mycelium";
					entity.getCapability(MoneysModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.tradeitemname = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = entity.getPersistentData().getDouble("playerTradeCount3");
					entity.getCapability(MoneysModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.tradeitemcount = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		}
	}
}
