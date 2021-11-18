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
					String _setval = (String) "Reburner";
					entity.getCapability(MoneysModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.tradeitemname = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = (double) (entity.getPersistentData().getDouble("playerTradeCount1"));
					entity.getCapability(MoneysModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.tradeitemcount = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if (entity.getPersistentData().getDouble("playerTradeItem1") == 2) {
				{
					String _setval = (String) "Oil";
					entity.getCapability(MoneysModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.tradeitemname = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = (double) (entity.getPersistentData().getDouble("playerTradeCount1"));
					entity.getCapability(MoneysModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.tradeitemcount = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if (entity.getPersistentData().getDouble("playerTradeItem1") == 3) {
				{
					String _setval = (String) "Hardened Oil Boots";
					entity.getCapability(MoneysModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.tradeitemname = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = (double) (entity.getPersistentData().getDouble("playerTradeCount1"));
					entity.getCapability(MoneysModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.tradeitemcount = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if (entity.getPersistentData().getDouble("playerTradeItem1") == 4) {
				{
					String _setval = (String) "Sandstone";
					entity.getCapability(MoneysModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.tradeitemname = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = (double) (entity.getPersistentData().getDouble("playerTradeCount1"));
					entity.getCapability(MoneysModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.tradeitemcount = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if (entity.getPersistentData().getDouble("playerTradeItem1") == 5) {
				{
					String _setval = (String) "Cobblestone";
					entity.getCapability(MoneysModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.tradeitemname = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = (double) (entity.getPersistentData().getDouble("playerTradeCount1"));
					entity.getCapability(MoneysModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.tradeitemcount = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if (entity.getPersistentData().getDouble("playerTradeItem1") == 6) {
				{
					String _setval = (String) "Dark Oak Log";
					entity.getCapability(MoneysModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.tradeitemname = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = (double) (entity.getPersistentData().getDouble("playerTradeCount1"));
					entity.getCapability(MoneysModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.tradeitemcount = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		} else if (entity.getPersistentData().getDouble("playerTradePage") == 2) {
			if (entity.getPersistentData().getDouble("playerTradeItem2") == 1) {
				{
					String _setval = (String) "Ripped Minecoin";
					entity.getCapability(MoneysModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.tradeitemname = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = (double) (entity.getPersistentData().getDouble("playerTradeCount2"));
					entity.getCapability(MoneysModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.tradeitemcount = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if (entity.getPersistentData().getDouble("playerTradeItem2") == 2) {
				{
					String _setval = (String) "Hardened Oil";
					entity.getCapability(MoneysModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.tradeitemname = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = (double) (entity.getPersistentData().getDouble("playerTradeCount2"));
					entity.getCapability(MoneysModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.tradeitemcount = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if (entity.getPersistentData().getDouble("playerTradeItem2") == 3) {
				{
					String _setval = (String) "Hardened Oil Helmet";
					entity.getCapability(MoneysModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.tradeitemname = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = (double) (entity.getPersistentData().getDouble("playerTradeCount2"));
					entity.getCapability(MoneysModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.tradeitemcount = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if (entity.getPersistentData().getDouble("playerTradeItem2") == 4) {
				{
					String _setval = (String) "Slime Block";
					entity.getCapability(MoneysModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.tradeitemname = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = (double) (entity.getPersistentData().getDouble("playerTradeCount2"));
					entity.getCapability(MoneysModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.tradeitemcount = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if (entity.getPersistentData().getDouble("playerTradeItem2") == 5) {
				{
					String _setval = (String) "Reburner";
					entity.getCapability(MoneysModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.tradeitemname = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = (double) (entity.getPersistentData().getDouble("playerTradeCount2"));
					entity.getCapability(MoneysModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.tradeitemcount = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if (entity.getPersistentData().getDouble("playerTradeItem2") == 6) {
				{
					String _setval = (String) "Torch";
					entity.getCapability(MoneysModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.tradeitemname = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = (double) (entity.getPersistentData().getDouble("playerTradeCount2"));
					entity.getCapability(MoneysModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.tradeitemcount = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		} else if (entity.getPersistentData().getDouble("playerTradePage") == 3) {
			if (entity.getPersistentData().getDouble("playerTradeItem3") == 1) {
				{
					String _setval = (String) "Money Log";
					entity.getCapability(MoneysModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.tradeitemname = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = (double) (entity.getPersistentData().getDouble("playerTradeCount3"));
					entity.getCapability(MoneysModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.tradeitemcount = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if (entity.getPersistentData().getDouble("playerTradeItem3") == 2) {
				{
					String _setval = (String) "Blackened Oil";
					entity.getCapability(MoneysModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.tradeitemname = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = (double) (entity.getPersistentData().getDouble("playerTradeCount3"));
					entity.getCapability(MoneysModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.tradeitemcount = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if (entity.getPersistentData().getDouble("playerTradeItem3") == 3) {
				{
					String _setval = (String) "Hardened Oil Chestplate";
					entity.getCapability(MoneysModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.tradeitemname = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = (double) (entity.getPersistentData().getDouble("playerTradeCount3"));
					entity.getCapability(MoneysModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.tradeitemcount = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if (entity.getPersistentData().getDouble("playerTradeItem3") == 4) {
				{
					String _setval = (String) "Jungle Log";
					entity.getCapability(MoneysModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.tradeitemname = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = (double) (entity.getPersistentData().getDouble("playerTradeCount3"));
					entity.getCapability(MoneysModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.tradeitemcount = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if (entity.getPersistentData().getDouble("playerTradeItem3") == 5) {
				{
					String _setval = (String) "Obsidian";
					entity.getCapability(MoneysModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.tradeitemname = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = (double) (entity.getPersistentData().getDouble("playerTradeCount3"));
					entity.getCapability(MoneysModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.tradeitemcount = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if (entity.getPersistentData().getDouble("playerTradeItem3") == 6) {
				{
					String _setval = (String) "Mycelium";
					entity.getCapability(MoneysModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.tradeitemname = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = (double) (entity.getPersistentData().getDouble("playerTradeCount3"));
					entity.getCapability(MoneysModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.tradeitemcount = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		}
	}
}
