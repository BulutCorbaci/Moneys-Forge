package blt.moneys.beta.procedures;

import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;

import javax.annotation.Nullable;

import java.util.concurrent.atomic.AtomicReference;

import blt.moneys.beta.network.MoneysModVariables;
import blt.moneys.beta.init.MoneysModItems;

@Mod.EventBusSubscriber
public class UpdateTotalMoneyCountProcedure {
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
		double loopinventory = 0;
		{
			double _setval = 0;
			entity.getCapability(MoneysModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.totalmoneyonplayer = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		for (int index0 = 0; index0 < (int) (36); index0++) {
			if (MoneysModItems.MINECOIN_1 == (new Object() {
				public ItemStack getItemStack(int sltid, Entity entity) {
					AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
					entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						_retval.set(capability.getStackInSlot(sltid).copy());
					});
					return _retval.get();
				}
			}.getItemStack((int) loopinventory, entity)).getItem()) {
				{
					double _setval = (entity.getCapability(MoneysModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new MoneysModVariables.PlayerVariables())).totalmoneyonplayer + ((new Object() {
								public ItemStack getItemStack(int sltid, Entity entity) {
									AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
									entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
										_retval.set(capability.getStackInSlot(sltid).copy());
									});
									return _retval.get();
								}
							}.getItemStack((int) loopinventory, entity))).getCount();
					entity.getCapability(MoneysModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.totalmoneyonplayer = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if (MoneysModItems.MINECOIN_5 == (new Object() {
				public ItemStack getItemStack(int sltid, Entity entity) {
					AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
					entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						_retval.set(capability.getStackInSlot(sltid).copy());
					});
					return _retval.get();
				}
			}.getItemStack((int) loopinventory, entity)).getItem()) {
				{
					double _setval = (entity.getCapability(MoneysModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new MoneysModVariables.PlayerVariables())).totalmoneyonplayer + ((new Object() {
								public ItemStack getItemStack(int sltid, Entity entity) {
									AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
									entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
										_retval.set(capability.getStackInSlot(sltid).copy());
									});
									return _retval.get();
								}
							}.getItemStack((int) loopinventory, entity))).getCount() * 5;
					entity.getCapability(MoneysModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.totalmoneyonplayer = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if (MoneysModItems.MINECOIN_10 == (new Object() {
				public ItemStack getItemStack(int sltid, Entity entity) {
					AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
					entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						_retval.set(capability.getStackInSlot(sltid).copy());
					});
					return _retval.get();
				}
			}.getItemStack((int) loopinventory, entity)).getItem()) {
				{
					double _setval = (entity.getCapability(MoneysModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new MoneysModVariables.PlayerVariables())).totalmoneyonplayer + ((new Object() {
								public ItemStack getItemStack(int sltid, Entity entity) {
									AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
									entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
										_retval.set(capability.getStackInSlot(sltid).copy());
									});
									return _retval.get();
								}
							}.getItemStack((int) loopinventory, entity))).getCount() * 10;
					entity.getCapability(MoneysModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.totalmoneyonplayer = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if (MoneysModItems.MINECOIN_20 == (new Object() {
				public ItemStack getItemStack(int sltid, Entity entity) {
					AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
					entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						_retval.set(capability.getStackInSlot(sltid).copy());
					});
					return _retval.get();
				}
			}.getItemStack((int) loopinventory, entity)).getItem()) {
				{
					double _setval = (entity.getCapability(MoneysModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new MoneysModVariables.PlayerVariables())).totalmoneyonplayer + ((new Object() {
								public ItemStack getItemStack(int sltid, Entity entity) {
									AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
									entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
										_retval.set(capability.getStackInSlot(sltid).copy());
									});
									return _retval.get();
								}
							}.getItemStack((int) loopinventory, entity))).getCount() * 20;
					entity.getCapability(MoneysModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.totalmoneyonplayer = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if (MoneysModItems.MINECOIN_50 == (new Object() {
				public ItemStack getItemStack(int sltid, Entity entity) {
					AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
					entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						_retval.set(capability.getStackInSlot(sltid).copy());
					});
					return _retval.get();
				}
			}.getItemStack((int) loopinventory, entity)).getItem()) {
				{
					double _setval = (entity.getCapability(MoneysModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new MoneysModVariables.PlayerVariables())).totalmoneyonplayer + ((new Object() {
								public ItemStack getItemStack(int sltid, Entity entity) {
									AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
									entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
										_retval.set(capability.getStackInSlot(sltid).copy());
									});
									return _retval.get();
								}
							}.getItemStack((int) loopinventory, entity))).getCount() * 50;
					entity.getCapability(MoneysModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.totalmoneyonplayer = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if (MoneysModItems.MINECOIN_100 == (new Object() {
				public ItemStack getItemStack(int sltid, Entity entity) {
					AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
					entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						_retval.set(capability.getStackInSlot(sltid).copy());
					});
					return _retval.get();
				}
			}.getItemStack((int) loopinventory, entity)).getItem()) {
				{
					double _setval = (entity.getCapability(MoneysModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new MoneysModVariables.PlayerVariables())).totalmoneyonplayer + ((new Object() {
								public ItemStack getItemStack(int sltid, Entity entity) {
									AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
									entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
										_retval.set(capability.getStackInSlot(sltid).copy());
									});
									return _retval.get();
								}
							}.getItemStack((int) loopinventory, entity))).getCount() * 100;
					entity.getCapability(MoneysModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.totalmoneyonplayer = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if (MoneysModItems.MINECOIN_200 == (new Object() {
				public ItemStack getItemStack(int sltid, Entity entity) {
					AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
					entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						_retval.set(capability.getStackInSlot(sltid).copy());
					});
					return _retval.get();
				}
			}.getItemStack((int) loopinventory, entity)).getItem()) {
				{
					double _setval = (entity.getCapability(MoneysModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new MoneysModVariables.PlayerVariables())).totalmoneyonplayer + ((new Object() {
								public ItemStack getItemStack(int sltid, Entity entity) {
									AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
									entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
										_retval.set(capability.getStackInSlot(sltid).copy());
									});
									return _retval.get();
								}
							}.getItemStack((int) loopinventory, entity))).getCount() * 200;
					entity.getCapability(MoneysModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.totalmoneyonplayer = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if (MoneysModItems.MINECOIN_500 == (new Object() {
				public ItemStack getItemStack(int sltid, Entity entity) {
					AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
					entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						_retval.set(capability.getStackInSlot(sltid).copy());
					});
					return _retval.get();
				}
			}.getItemStack((int) loopinventory, entity)).getItem()) {
				{
					double _setval = (entity.getCapability(MoneysModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new MoneysModVariables.PlayerVariables())).totalmoneyonplayer + ((new Object() {
								public ItemStack getItemStack(int sltid, Entity entity) {
									AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
									entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
										_retval.set(capability.getStackInSlot(sltid).copy());
									});
									return _retval.get();
								}
							}.getItemStack((int) loopinventory, entity))).getCount() * 500;
					entity.getCapability(MoneysModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.totalmoneyonplayer = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if (MoneysModItems.MINECOIN_1000 == (new Object() {
				public ItemStack getItemStack(int sltid, Entity entity) {
					AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
					entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						_retval.set(capability.getStackInSlot(sltid).copy());
					});
					return _retval.get();
				}
			}.getItemStack((int) loopinventory, entity)).getItem()) {
				{
					double _setval = (entity.getCapability(MoneysModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new MoneysModVariables.PlayerVariables())).totalmoneyonplayer + ((new Object() {
								public ItemStack getItemStack(int sltid, Entity entity) {
									AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
									entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
										_retval.set(capability.getStackInSlot(sltid).copy());
									});
									return _retval.get();
								}
							}.getItemStack((int) loopinventory, entity))).getCount() * 1000;
					entity.getCapability(MoneysModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.totalmoneyonplayer = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if (MoneysModItems.MINECOIN_2000 == (new Object() {
				public ItemStack getItemStack(int sltid, Entity entity) {
					AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
					entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						_retval.set(capability.getStackInSlot(sltid).copy());
					});
					return _retval.get();
				}
			}.getItemStack((int) loopinventory, entity)).getItem()) {
				{
					double _setval = (entity.getCapability(MoneysModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new MoneysModVariables.PlayerVariables())).totalmoneyonplayer + ((new Object() {
								public ItemStack getItemStack(int sltid, Entity entity) {
									AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
									entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
										_retval.set(capability.getStackInSlot(sltid).copy());
									});
									return _retval.get();
								}
							}.getItemStack((int) loopinventory, entity))).getCount() * 2000;
					entity.getCapability(MoneysModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.totalmoneyonplayer = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if (MoneysModItems.MINECOIN_5000 == (new Object() {
				public ItemStack getItemStack(int sltid, Entity entity) {
					AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
					entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						_retval.set(capability.getStackInSlot(sltid).copy());
					});
					return _retval.get();
				}
			}.getItemStack((int) loopinventory, entity)).getItem()) {
				{
					double _setval = (entity.getCapability(MoneysModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new MoneysModVariables.PlayerVariables())).totalmoneyonplayer + ((new Object() {
								public ItemStack getItemStack(int sltid, Entity entity) {
									AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
									entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
										_retval.set(capability.getStackInSlot(sltid).copy());
									});
									return _retval.get();
								}
							}.getItemStack((int) loopinventory, entity))).getCount() * 5000;
					entity.getCapability(MoneysModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.totalmoneyonplayer = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			loopinventory = loopinventory + 1;
		}
	}
}
