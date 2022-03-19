package blt.moneys.beta.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;

import javax.annotation.Nullable;

import java.util.function.Supplier;
import java.util.Map;

import blt.moneys.beta.init.MoneysModItems;
import blt.moneys.beta.init.MoneysModBlocks;

@Mod.EventBusSubscriber
public class RemoveMoneyAndAddItemsProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player);
		}
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if (entity.getPersistentData().getDouble("playerTradePage") == 1) {
			if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get()instanceof Map _slt
					? ((Slot) _slt.get(0)).getItem()
					: ItemStack.EMPTY).getItem() == MoneysModItems.MINECOIN_10.get()) {
				if (entity.getPersistentData().getDouble("playerTradeItem1") == 1) {
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get()instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(MoneysModBlocks.REBURNER.get());
						_setstack.setCount((int) entity.getPersistentData().getDouble("playerTradeCount1"));
						((Slot) _slots.get(1)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
				} else if (entity.getPersistentData().getDouble("playerTradeItem1") == 2) {
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get()instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(MoneysModItems.OIL.get());
						_setstack.setCount((int) entity.getPersistentData().getDouble("playerTradeCount1"));
						((Slot) _slots.get(1)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
				} else if (entity.getPersistentData().getDouble("playerTradeItem1") == 3) {
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get()instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(MoneysModItems.HARDENED_OIL_ARMOR_BOOTS.get());
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
					: ItemStack.EMPTY).getItem() == MoneysModItems.MINECOIN_20.get()) {
				if (entity.getPersistentData().getDouble("playerTradeItem2") == 1) {
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get()instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(MoneysModItems.MINECOIN_RIP.get());
						_setstack.setCount((int) entity.getPersistentData().getDouble("playerTradeCount2"));
						((Slot) _slots.get(1)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
				} else if (entity.getPersistentData().getDouble("playerTradeItem2") == 2) {
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get()instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(MoneysModItems.OIL_HARD.get());
						_setstack.setCount((int) entity.getPersistentData().getDouble("playerTradeCount2"));
						((Slot) _slots.get(1)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
				} else if (entity.getPersistentData().getDouble("playerTradeItem2") == 3) {
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get()instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(MoneysModItems.HARDENED_OIL_ARMOR_HELMET.get());
						_setstack.setCount((int) entity.getPersistentData().getDouble("playerTradeCount2"));
						((Slot) _slots.get(1)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
				} else if (entity.getPersistentData().getDouble("playerTradeItem2") == 4) {
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get()instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(Blocks.SLIME_BLOCK);
						_setstack.setCount((int) entity.getPersistentData().getDouble("playerTradeCount2"));
						((Slot) _slots.get(1)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
				} else if (entity.getPersistentData().getDouble("playerTradeItem2") == 5) {
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get()instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(MoneysModBlocks.REBURNER.get());
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
					: ItemStack.EMPTY).getItem() == MoneysModItems.MINECOIN_50.get()) {
				if (entity.getPersistentData().getDouble("playerTradeItem3") == 1) {
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get()instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(MoneysModBlocks.MONEY_LOG.get());
						_setstack.setCount((int) entity.getPersistentData().getDouble("playerTradeCount3"));
						((Slot) _slots.get(1)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
				} else if (entity.getPersistentData().getDouble("playerTradeItem3") == 2) {
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get()instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(MoneysModItems.BLACK_OIL.get());
						_setstack.setCount((int) entity.getPersistentData().getDouble("playerTradeCount3"));
						((Slot) _slots.get(1)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
				} else if (entity.getPersistentData().getDouble("playerTradeItem3") == 3) {
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get()instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(MoneysModItems.HARDENED_OIL_ARMOR_CHESTPLATE.get());
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
