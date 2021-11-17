package blt.moneys.beta.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;

import java.util.function.Supplier;
import java.util.Map;
import java.util.HashMap;

import blt.moneys.beta.init.MoneysModItems;
import blt.moneys.beta.init.MoneysModBlocks;
import blt.moneys.beta.MoneysMod;

@Mod.EventBusSubscriber
public class RemoveMoneyAndAddItemsProcedure {
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
				MoneysMod.LOGGER.warn("Failed to load dependency entity for procedure RemoveMoneyAndAddItems!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity.getPersistentData().getDouble("playerTradePage") == 1) {
			if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get()instanceof Map _slt
					? ((Slot) _slt.get(0)).getItem()
					: ItemStack.EMPTY).getItem() == MoneysModItems.MINECOIN_10) {
				if (entity.getPersistentData().getDouble("playerTradeItem1") == 1) {
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get()instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(MoneysModBlocks.REBURNER);
						_setstack.setCount((int) entity.getPersistentData().getDouble("playerTradeCount1"));
						((Slot) _slots.get(1)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
				} else if (entity.getPersistentData().getDouble("playerTradeItem1") == 2) {
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get()instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(MoneysModItems.OIL);
						_setstack.setCount((int) entity.getPersistentData().getDouble("playerTradeCount1"));
						((Slot) _slots.get(1)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
				} else if (entity.getPersistentData().getDouble("playerTradeItem1") == 3) {
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get()instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(MoneysModItems.HARDENED_OIL_ARMOR_BOOTS);
						_setstack.setCount((int) entity.getPersistentData().getDouble("playerTradeCount1"));
						((Slot) _slots.get(1)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
				} else if (entity.getPersistentData().getDouble("playerTradeItem1") == 4) {
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get()instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(Blocks.SANDSTONE);
						_setstack.setCount((int) entity.getPersistentData().getDouble("playerTradeCount1"));
						((Slot) _slots.get(1)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
				} else if (entity.getPersistentData().getDouble("playerTradeItem1") == 5) {
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get()instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(Blocks.COBBLESTONE);
						_setstack.setCount((int) entity.getPersistentData().getDouble("playerTradeCount1"));
						((Slot) _slots.get(1)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
				} else if (entity.getPersistentData().getDouble("playerTradeItem1") == 6) {
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get()instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(Blocks.DARK_OAK_LOG);
						_setstack.setCount((int) entity.getPersistentData().getDouble("playerTradeCount1"));
						((Slot) _slots.get(1)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
				}
			} else {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get()instanceof Map _slots) {
					((Slot) _slots.get(1)).remove((int) entity.getPersistentData().getDouble("playerTradeCount1"));
					_player.containerMenu.broadcastChanges();
				}
			}
		} else if (entity.getPersistentData().getDouble("playerTradePage") == 2) {
			if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get()instanceof Map _slt
					? ((Slot) _slt.get(0)).getItem()
					: ItemStack.EMPTY).getItem() == MoneysModItems.MINECOIN_20) {
				if (entity.getPersistentData().getDouble("playerTradeItem2") == 1) {
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get()instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(MoneysModItems.MINECOIN_RIP);
						_setstack.setCount((int) entity.getPersistentData().getDouble("playerTradeCount2"));
						((Slot) _slots.get(1)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
				} else if (entity.getPersistentData().getDouble("playerTradeItem2") == 2) {
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get()instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(MoneysModItems.OIL_HARD);
						_setstack.setCount((int) entity.getPersistentData().getDouble("playerTradeCount2"));
						((Slot) _slots.get(1)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
				} else if (entity.getPersistentData().getDouble("playerTradeItem2") == 3) {
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get()instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(MoneysModItems.OIL_HARD);
						_setstack.setCount((int) entity.getPersistentData().getDouble("playerTradeCount2"));
						((Slot) _slots.get(1)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
				} else if (entity.getPersistentData().getDouble("playerTradeItem2") == 4) {
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get()instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(MoneysModItems.HARDENED_OIL_ARMOR_HELMET);
						_setstack.setCount((int) entity.getPersistentData().getDouble("playerTradeCount2"));
						((Slot) _slots.get(1)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
				} else if (entity.getPersistentData().getDouble("playerTradeItem2") == 5) {
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get()instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(MoneysModBlocks.REBURNER);
						_setstack.setCount((int) entity.getPersistentData().getDouble("playerTradeCount2"));
						((Slot) _slots.get(1)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
				} else if (entity.getPersistentData().getDouble("playerTradeItem2") == 6) {
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get()instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(Blocks.TORCH);
						_setstack.setCount((int) entity.getPersistentData().getDouble("playerTradeCount2"));
						((Slot) _slots.get(1)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
				}
			} else {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get()instanceof Map _slots) {
					((Slot) _slots.get(1)).remove((int) entity.getPersistentData().getDouble("playerTradeCount2"));
					_player.containerMenu.broadcastChanges();
				}
			}
		} else if (entity.getPersistentData().getDouble("playerTradePage") == 3) {
			if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get()instanceof Map _slt
					? ((Slot) _slt.get(0)).getItem()
					: ItemStack.EMPTY).getItem() == MoneysModItems.MINECOIN_50) {
				if (entity.getPersistentData().getDouble("playerTradeItem3") == 1) {
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get()instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(MoneysModBlocks.MONEY_LOG);
						_setstack.setCount((int) entity.getPersistentData().getDouble("playerTradeCount3"));
						((Slot) _slots.get(1)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
				} else if (entity.getPersistentData().getDouble("playerTradeItem3") == 2) {
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get()instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(MoneysModItems.BLACK_OIL);
						_setstack.setCount((int) entity.getPersistentData().getDouble("playerTradeCount3"));
						((Slot) _slots.get(1)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
				} else if (entity.getPersistentData().getDouble("playerTradeItem3") == 3) {
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get()instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(MoneysModItems.HARDENED_OIL_ARMOR_CHESTPLATE);
						_setstack.setCount((int) entity.getPersistentData().getDouble("playerTradeCount3"));
						((Slot) _slots.get(1)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
				} else if (entity.getPersistentData().getDouble("playerTradeItem3") == 4) {
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get()instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(Blocks.JUNGLE_LOG);
						_setstack.setCount((int) entity.getPersistentData().getDouble("playerTradeCount3"));
						((Slot) _slots.get(1)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
				} else if (entity.getPersistentData().getDouble("playerTradeItem3") == 5) {
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get()instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(Blocks.OBSIDIAN);
						_setstack.setCount((int) entity.getPersistentData().getDouble("playerTradeCount3"));
						((Slot) _slots.get(1)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
				} else if (entity.getPersistentData().getDouble("playerTradeItem3") == 6) {
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get()instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(Blocks.MYCELIUM);
						_setstack.setCount((int) entity.getPersistentData().getDouble("playerTradeCount3"));
						((Slot) _slots.get(1)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
				}
			} else {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get()instanceof Map _slots) {
					((Slot) _slots.get(1)).remove((int) entity.getPersistentData().getDouble("playerTradeCount3"));
					_player.containerMenu.broadcastChanges();
				}
			}
		}
	}
}
