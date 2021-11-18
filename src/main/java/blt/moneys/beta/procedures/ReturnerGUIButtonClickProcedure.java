package blt.moneys.beta.procedures;

import net.minecraftforge.items.IItemHandlerModifiable;
import net.minecraftforge.items.CapabilityItemHandler;

import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.core.BlockPos;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicInteger;

import blt.moneys.beta.init.MoneysModItems;

public class ReturnerGUIButtonClickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double slot1itemcount = 0;
		double slot2itemcount = 0;
		double slot3itemcount = 0;
		double slot4itemcount = 0;
		double slot5itemcount = 0;
		double slot6itemcount = 0;
		double slot7itemcount = 0;
		double slot8itemcount = 0;
		double slot9itemcount = 0;
		double inputslot0count = 0;
		if ((new Object() {
			public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int sltid) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null) {
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						_retval.set(capability.getStackInSlot(sltid).copy());
					});
				}
				return _retval.get();
			}
		}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 0)).getItem() == MoneysModItems.MINECOIN_1 && new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null) {
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						_retval.set(capability.getStackInSlot(sltid).getCount());
					});
				}
				return _retval.get();
			}
		}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 1) < 64 && new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null) {
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						_retval.set(capability.getStackInSlot(sltid).getCount());
					});
				}
				return _retval.get();
			}
		}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 2) < 64 && new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null) {
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						_retval.set(capability.getStackInSlot(sltid).getCount());
					});
				}
				return _retval.get();
			}
		}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 3) < 64 && new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null) {
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						_retval.set(capability.getStackInSlot(sltid).getCount());
					});
				}
				return _retval.get();
			}
		}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 4) < 64 && new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null) {
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						_retval.set(capability.getStackInSlot(sltid).getCount());
					});
				}
				return _retval.get();
			}
		}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 5) < 64 && new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null) {
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						_retval.set(capability.getStackInSlot(sltid).getCount());
					});
				}
				return _retval.get();
			}
		}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 6) < 64 && new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null) {
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						_retval.set(capability.getStackInSlot(sltid).getCount());
					});
				}
				return _retval.get();
			}
		}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 7) < 64 && new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null) {
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						_retval.set(capability.getStackInSlot(sltid).getCount());
					});
				}
				return _retval.get();
			}
		}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 8) < 64 && new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null) {
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						_retval.set(capability.getStackInSlot(sltid).getCount());
					});
				}
				return _retval.get();
			}
		}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 9) < 64 && (new Object() {
			public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int sltid) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null) {
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						_retval.set(capability.getStackInSlot(sltid).copy());
					});
				}
				return _retval.get();
			}
		}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 0)).getItem() == MoneysModItems.MINECOIN_1) {
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) y, (int) z));
				if (_ent != null) {
					final int _sltid = 0;
					final int _amount = 1;
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable) {
							ItemStack _stk = capability.getStackInSlot(_sltid).copy();
							_stk.shrink(_amount);
							((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _stk);
						}
					});
				}
			}
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) y, (int) z));
				if (_ent != null) {
					final int _sltid = 9;
					final ItemStack _setstack = new ItemStack(Items.PAPER);
					_setstack.setCount((int) (new Object() {
						public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
							AtomicInteger _retval = new AtomicInteger(0);
							BlockEntity _ent = world.getBlockEntity(pos);
							if (_ent != null) {
								_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									_retval.set(capability.getStackInSlot(sltid).getCount());
								});
							}
							return _retval.get();
						}
					}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 9) + 1));
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable) {
							((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
						}
					});
				}
			}
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) y, (int) z));
				if (_ent != null) {
					final int _sltid = 8;
					final ItemStack _setstack = new ItemStack(Items.BLACK_DYE);
					_setstack.setCount((int) (new Object() {
						public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
							AtomicInteger _retval = new AtomicInteger(0);
							BlockEntity _ent = world.getBlockEntity(pos);
							if (_ent != null) {
								_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									_retval.set(capability.getStackInSlot(sltid).getCount());
								});
							}
							return _retval.get();
						}
					}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 8) + 1));
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable) {
							((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
						}
					});
				}
			}
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) y, (int) z));
				if (_ent != null) {
					final int _sltid = 7;
					final ItemStack _setstack = new ItemStack(Items.YELLOW_DYE);
					_setstack.setCount((int) (new Object() {
						public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
							AtomicInteger _retval = new AtomicInteger(0);
							BlockEntity _ent = world.getBlockEntity(pos);
							if (_ent != null) {
								_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									_retval.set(capability.getStackInSlot(sltid).getCount());
								});
							}
							return _retval.get();
						}
					}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 7) + 1));
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable) {
							((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
						}
					});
				}
			}
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) y, (int) z));
				if (_ent != null) {
					final int _sltid = 6;
					final ItemStack _setstack = new ItemStack(Blocks.AIR);
					_setstack.setCount((int) (new Object() {
						public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
							AtomicInteger _retval = new AtomicInteger(0);
							BlockEntity _ent = world.getBlockEntity(pos);
							if (_ent != null) {
								_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									_retval.set(capability.getStackInSlot(sltid).getCount());
								});
							}
							return _retval.get();
						}
					}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 6) + 1));
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable) {
							((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
						}
					});
				}
			}
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) y, (int) z));
				if (_ent != null) {
					final int _sltid = 5;
					final ItemStack _setstack = new ItemStack(Blocks.AIR);
					_setstack.setCount((int) (new Object() {
						public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
							AtomicInteger _retval = new AtomicInteger(0);
							BlockEntity _ent = world.getBlockEntity(pos);
							if (_ent != null) {
								_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									_retval.set(capability.getStackInSlot(sltid).getCount());
								});
							}
							return _retval.get();
						}
					}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 5) + 1));
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable) {
							((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
						}
					});
				}
			}
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) y, (int) z));
				if (_ent != null) {
					final int _sltid = 4;
					final ItemStack _setstack = new ItemStack(Blocks.AIR);
					_setstack.setCount((int) (new Object() {
						public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
							AtomicInteger _retval = new AtomicInteger(0);
							BlockEntity _ent = world.getBlockEntity(pos);
							if (_ent != null) {
								_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									_retval.set(capability.getStackInSlot(sltid).getCount());
								});
							}
							return _retval.get();
						}
					}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 4) + 1));
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable) {
							((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
						}
					});
				}
			}
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) y, (int) z));
				if (_ent != null) {
					final int _sltid = 3;
					final ItemStack _setstack = new ItemStack(Blocks.AIR);
					_setstack.setCount((int) (new Object() {
						public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
							AtomicInteger _retval = new AtomicInteger(0);
							BlockEntity _ent = world.getBlockEntity(pos);
							if (_ent != null) {
								_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									_retval.set(capability.getStackInSlot(sltid).getCount());
								});
							}
							return _retval.get();
						}
					}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 3) + 1));
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable) {
							((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
						}
					});
				}
			}
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) y, (int) z));
				if (_ent != null) {
					final int _sltid = 2;
					final ItemStack _setstack = new ItemStack(Blocks.AIR);
					_setstack.setCount((int) (new Object() {
						public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
							AtomicInteger _retval = new AtomicInteger(0);
							BlockEntity _ent = world.getBlockEntity(pos);
							if (_ent != null) {
								_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									_retval.set(capability.getStackInSlot(sltid).getCount());
								});
							}
							return _retval.get();
						}
					}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 2) + 1));
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable) {
							((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
						}
					});
				}
			}
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) y, (int) z));
				if (_ent != null) {
					final int _sltid = 1;
					final ItemStack _setstack = new ItemStack(Blocks.AIR);
					_setstack.setCount((int) (new Object() {
						public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
							AtomicInteger _retval = new AtomicInteger(0);
							BlockEntity _ent = world.getBlockEntity(pos);
							if (_ent != null) {
								_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									_retval.set(capability.getStackInSlot(sltid).getCount());
								});
							}
							return _retval.get();
						}
					}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 1) + 1));
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable) {
							((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
						}
					});
				}
			}
		}
		if ((new Object() {
			public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int sltid) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null) {
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						_retval.set(capability.getStackInSlot(sltid).copy());
					});
				}
				return _retval.get();
			}
		}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 0)).getItem() == MoneysModItems.MINECOIN_5 && new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null) {
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						_retval.set(capability.getStackInSlot(sltid).getCount());
					});
				}
				return _retval.get();
			}
		}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 1) < 64 && new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null) {
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						_retval.set(capability.getStackInSlot(sltid).getCount());
					});
				}
				return _retval.get();
			}
		}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 2) < 64 && new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null) {
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						_retval.set(capability.getStackInSlot(sltid).getCount());
					});
				}
				return _retval.get();
			}
		}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 3) < 64 && new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null) {
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						_retval.set(capability.getStackInSlot(sltid).getCount());
					});
				}
				return _retval.get();
			}
		}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 4) < 64 && new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null) {
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						_retval.set(capability.getStackInSlot(sltid).getCount());
					});
				}
				return _retval.get();
			}
		}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 5) < 64 && new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null) {
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						_retval.set(capability.getStackInSlot(sltid).getCount());
					});
				}
				return _retval.get();
			}
		}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 6) < 64 && new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null) {
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						_retval.set(capability.getStackInSlot(sltid).getCount());
					});
				}
				return _retval.get();
			}
		}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 7) < 64 && new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null) {
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						_retval.set(capability.getStackInSlot(sltid).getCount());
					});
				}
				return _retval.get();
			}
		}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 8) < 64 && new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null) {
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						_retval.set(capability.getStackInSlot(sltid).getCount());
					});
				}
				return _retval.get();
			}
		}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 9) < 64 && (new Object() {
			public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int sltid) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null) {
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						_retval.set(capability.getStackInSlot(sltid).copy());
					});
				}
				return _retval.get();
			}
		}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 0)).getItem() == MoneysModItems.MINECOIN_5) {
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) y, (int) z));
				if (_ent != null) {
					final int _sltid = 0;
					final int _amount = 1;
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable) {
							ItemStack _stk = capability.getStackInSlot(_sltid).copy();
							_stk.shrink(_amount);
							((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _stk);
						}
					});
				}
			}
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) y, (int) z));
				if (_ent != null) {
					final int _sltid = 9;
					final ItemStack _setstack = new ItemStack(MoneysModItems.MINECOIN_1);
					_setstack.setCount((int) (new Object() {
						public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
							AtomicInteger _retval = new AtomicInteger(0);
							BlockEntity _ent = world.getBlockEntity(pos);
							if (_ent != null) {
								_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									_retval.set(capability.getStackInSlot(sltid).getCount());
								});
							}
							return _retval.get();
						}
					}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 9) + 1));
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable) {
							((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
						}
					});
				}
			}
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) y, (int) z));
				if (_ent != null) {
					final int _sltid = 8;
					final ItemStack _setstack = new ItemStack(MoneysModItems.MINECOIN_1);
					_setstack.setCount((int) (new Object() {
						public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
							AtomicInteger _retval = new AtomicInteger(0);
							BlockEntity _ent = world.getBlockEntity(pos);
							if (_ent != null) {
								_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									_retval.set(capability.getStackInSlot(sltid).getCount());
								});
							}
							return _retval.get();
						}
					}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 8) + 1));
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable) {
							((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
						}
					});
				}
			}
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) y, (int) z));
				if (_ent != null) {
					final int _sltid = 7;
					final ItemStack _setstack = new ItemStack(MoneysModItems.MINECOIN_1);
					_setstack.setCount((int) (new Object() {
						public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
							AtomicInteger _retval = new AtomicInteger(0);
							BlockEntity _ent = world.getBlockEntity(pos);
							if (_ent != null) {
								_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									_retval.set(capability.getStackInSlot(sltid).getCount());
								});
							}
							return _retval.get();
						}
					}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 7) + 1));
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable) {
							((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
						}
					});
				}
			}
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) y, (int) z));
				if (_ent != null) {
					final int _sltid = 6;
					final ItemStack _setstack = new ItemStack(MoneysModItems.MINECOIN_1);
					_setstack.setCount((int) (new Object() {
						public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
							AtomicInteger _retval = new AtomicInteger(0);
							BlockEntity _ent = world.getBlockEntity(pos);
							if (_ent != null) {
								_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									_retval.set(capability.getStackInSlot(sltid).getCount());
								});
							}
							return _retval.get();
						}
					}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 6) + 1));
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable) {
							((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
						}
					});
				}
			}
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) y, (int) z));
				if (_ent != null) {
					final int _sltid = 5;
					final ItemStack _setstack = new ItemStack(MoneysModItems.MINECOIN_1);
					_setstack.setCount((int) (new Object() {
						public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
							AtomicInteger _retval = new AtomicInteger(0);
							BlockEntity _ent = world.getBlockEntity(pos);
							if (_ent != null) {
								_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									_retval.set(capability.getStackInSlot(sltid).getCount());
								});
							}
							return _retval.get();
						}
					}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 5) + 1));
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable) {
							((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
						}
					});
				}
			}
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) y, (int) z));
				if (_ent != null) {
					final int _sltid = 4;
					final ItemStack _setstack = new ItemStack(Blocks.AIR);
					_setstack.setCount((int) (new Object() {
						public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
							AtomicInteger _retval = new AtomicInteger(0);
							BlockEntity _ent = world.getBlockEntity(pos);
							if (_ent != null) {
								_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									_retval.set(capability.getStackInSlot(sltid).getCount());
								});
							}
							return _retval.get();
						}
					}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 4) + 1));
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable) {
							((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
						}
					});
				}
			}
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) y, (int) z));
				if (_ent != null) {
					final int _sltid = 3;
					final ItemStack _setstack = new ItemStack(Blocks.AIR);
					_setstack.setCount((int) (new Object() {
						public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
							AtomicInteger _retval = new AtomicInteger(0);
							BlockEntity _ent = world.getBlockEntity(pos);
							if (_ent != null) {
								_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									_retval.set(capability.getStackInSlot(sltid).getCount());
								});
							}
							return _retval.get();
						}
					}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 3) + 1));
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable) {
							((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
						}
					});
				}
			}
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) y, (int) z));
				if (_ent != null) {
					final int _sltid = 2;
					final ItemStack _setstack = new ItemStack(Blocks.AIR);
					_setstack.setCount((int) (new Object() {
						public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
							AtomicInteger _retval = new AtomicInteger(0);
							BlockEntity _ent = world.getBlockEntity(pos);
							if (_ent != null) {
								_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									_retval.set(capability.getStackInSlot(sltid).getCount());
								});
							}
							return _retval.get();
						}
					}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 2) + 1));
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable) {
							((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
						}
					});
				}
			}
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) y, (int) z));
				if (_ent != null) {
					final int _sltid = 1;
					final ItemStack _setstack = new ItemStack(Blocks.AIR);
					_setstack.setCount((int) (new Object() {
						public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
							AtomicInteger _retval = new AtomicInteger(0);
							BlockEntity _ent = world.getBlockEntity(pos);
							if (_ent != null) {
								_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									_retval.set(capability.getStackInSlot(sltid).getCount());
								});
							}
							return _retval.get();
						}
					}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 1) + 1));
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable) {
							((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
						}
					});
				}
			}
		}
		if ((new Object() {
			public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int sltid) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null) {
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						_retval.set(capability.getStackInSlot(sltid).copy());
					});
				}
				return _retval.get();
			}
		}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 0)).getItem() == MoneysModItems.MINECOIN_10 && new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null) {
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						_retval.set(capability.getStackInSlot(sltid).getCount());
					});
				}
				return _retval.get();
			}
		}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 1) < 64 && new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null) {
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						_retval.set(capability.getStackInSlot(sltid).getCount());
					});
				}
				return _retval.get();
			}
		}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 2) < 64 && new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null) {
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						_retval.set(capability.getStackInSlot(sltid).getCount());
					});
				}
				return _retval.get();
			}
		}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 3) < 64 && new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null) {
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						_retval.set(capability.getStackInSlot(sltid).getCount());
					});
				}
				return _retval.get();
			}
		}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 4) < 64 && new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null) {
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						_retval.set(capability.getStackInSlot(sltid).getCount());
					});
				}
				return _retval.get();
			}
		}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 5) < 64 && new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null) {
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						_retval.set(capability.getStackInSlot(sltid).getCount());
					});
				}
				return _retval.get();
			}
		}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 6) < 64 && new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null) {
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						_retval.set(capability.getStackInSlot(sltid).getCount());
					});
				}
				return _retval.get();
			}
		}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 7) < 64 && new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null) {
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						_retval.set(capability.getStackInSlot(sltid).getCount());
					});
				}
				return _retval.get();
			}
		}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 8) < 64 && new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null) {
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						_retval.set(capability.getStackInSlot(sltid).getCount());
					});
				}
				return _retval.get();
			}
		}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 9) < 64 && (new Object() {
			public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int sltid) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null) {
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						_retval.set(capability.getStackInSlot(sltid).copy());
					});
				}
				return _retval.get();
			}
		}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 0)).getItem() == MoneysModItems.MINECOIN_10) {
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) y, (int) z));
				if (_ent != null) {
					final int _sltid = 0;
					final int _amount = 1;
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable) {
							ItemStack _stk = capability.getStackInSlot(_sltid).copy();
							_stk.shrink(_amount);
							((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _stk);
						}
					});
				}
			}
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) y, (int) z));
				if (_ent != null) {
					final int _sltid = 9;
					final ItemStack _setstack = new ItemStack(MoneysModItems.MINECOIN_5);
					_setstack.setCount((int) (new Object() {
						public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
							AtomicInteger _retval = new AtomicInteger(0);
							BlockEntity _ent = world.getBlockEntity(pos);
							if (_ent != null) {
								_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									_retval.set(capability.getStackInSlot(sltid).getCount());
								});
							}
							return _retval.get();
						}
					}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 9) + 1));
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable) {
							((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
						}
					});
				}
			}
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) y, (int) z));
				if (_ent != null) {
					final int _sltid = 8;
					final ItemStack _setstack = new ItemStack(MoneysModItems.MINECOIN_5);
					_setstack.setCount((int) (new Object() {
						public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
							AtomicInteger _retval = new AtomicInteger(0);
							BlockEntity _ent = world.getBlockEntity(pos);
							if (_ent != null) {
								_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									_retval.set(capability.getStackInSlot(sltid).getCount());
								});
							}
							return _retval.get();
						}
					}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 8) + 1));
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable) {
							((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
						}
					});
				}
			}
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) y, (int) z));
				if (_ent != null) {
					final int _sltid = 7;
					final ItemStack _setstack = new ItemStack(Blocks.AIR);
					_setstack.setCount((int) (new Object() {
						public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
							AtomicInteger _retval = new AtomicInteger(0);
							BlockEntity _ent = world.getBlockEntity(pos);
							if (_ent != null) {
								_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									_retval.set(capability.getStackInSlot(sltid).getCount());
								});
							}
							return _retval.get();
						}
					}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 7) + 1));
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable) {
							((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
						}
					});
				}
			}
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) y, (int) z));
				if (_ent != null) {
					final int _sltid = 6;
					final ItemStack _setstack = new ItemStack(Blocks.AIR);
					_setstack.setCount((int) (new Object() {
						public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
							AtomicInteger _retval = new AtomicInteger(0);
							BlockEntity _ent = world.getBlockEntity(pos);
							if (_ent != null) {
								_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									_retval.set(capability.getStackInSlot(sltid).getCount());
								});
							}
							return _retval.get();
						}
					}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 6) + 1));
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable) {
							((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
						}
					});
				}
			}
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) y, (int) z));
				if (_ent != null) {
					final int _sltid = 5;
					final ItemStack _setstack = new ItemStack(Blocks.AIR);
					_setstack.setCount((int) (new Object() {
						public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
							AtomicInteger _retval = new AtomicInteger(0);
							BlockEntity _ent = world.getBlockEntity(pos);
							if (_ent != null) {
								_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									_retval.set(capability.getStackInSlot(sltid).getCount());
								});
							}
							return _retval.get();
						}
					}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 5) + 1));
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable) {
							((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
						}
					});
				}
			}
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) y, (int) z));
				if (_ent != null) {
					final int _sltid = 4;
					final ItemStack _setstack = new ItemStack(Blocks.AIR);
					_setstack.setCount((int) (new Object() {
						public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
							AtomicInteger _retval = new AtomicInteger(0);
							BlockEntity _ent = world.getBlockEntity(pos);
							if (_ent != null) {
								_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									_retval.set(capability.getStackInSlot(sltid).getCount());
								});
							}
							return _retval.get();
						}
					}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 4) + 1));
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable) {
							((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
						}
					});
				}
			}
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) y, (int) z));
				if (_ent != null) {
					final int _sltid = 3;
					final ItemStack _setstack = new ItemStack(Blocks.AIR);
					_setstack.setCount((int) (new Object() {
						public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
							AtomicInteger _retval = new AtomicInteger(0);
							BlockEntity _ent = world.getBlockEntity(pos);
							if (_ent != null) {
								_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									_retval.set(capability.getStackInSlot(sltid).getCount());
								});
							}
							return _retval.get();
						}
					}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 3) + 1));
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable) {
							((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
						}
					});
				}
			}
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) y, (int) z));
				if (_ent != null) {
					final int _sltid = 2;
					final ItemStack _setstack = new ItemStack(Blocks.AIR);
					_setstack.setCount((int) (new Object() {
						public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
							AtomicInteger _retval = new AtomicInteger(0);
							BlockEntity _ent = world.getBlockEntity(pos);
							if (_ent != null) {
								_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									_retval.set(capability.getStackInSlot(sltid).getCount());
								});
							}
							return _retval.get();
						}
					}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 2) + 1));
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable) {
							((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
						}
					});
				}
			}
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) y, (int) z));
				if (_ent != null) {
					final int _sltid = 1;
					final ItemStack _setstack = new ItemStack(Blocks.AIR);
					_setstack.setCount((int) (new Object() {
						public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
							AtomicInteger _retval = new AtomicInteger(0);
							BlockEntity _ent = world.getBlockEntity(pos);
							if (_ent != null) {
								_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									_retval.set(capability.getStackInSlot(sltid).getCount());
								});
							}
							return _retval.get();
						}
					}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 1) + 1));
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable) {
							((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
						}
					});
				}
			}
		}
		if ((new Object() {
			public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int sltid) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null) {
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						_retval.set(capability.getStackInSlot(sltid).copy());
					});
				}
				return _retval.get();
			}
		}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 0)).getItem() == MoneysModItems.MINECOIN_20 && new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null) {
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						_retval.set(capability.getStackInSlot(sltid).getCount());
					});
				}
				return _retval.get();
			}
		}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 1) < 64 && new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null) {
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						_retval.set(capability.getStackInSlot(sltid).getCount());
					});
				}
				return _retval.get();
			}
		}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 2) < 64 && new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null) {
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						_retval.set(capability.getStackInSlot(sltid).getCount());
					});
				}
				return _retval.get();
			}
		}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 3) < 64 && new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null) {
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						_retval.set(capability.getStackInSlot(sltid).getCount());
					});
				}
				return _retval.get();
			}
		}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 4) < 64 && new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null) {
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						_retval.set(capability.getStackInSlot(sltid).getCount());
					});
				}
				return _retval.get();
			}
		}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 5) < 64 && new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null) {
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						_retval.set(capability.getStackInSlot(sltid).getCount());
					});
				}
				return _retval.get();
			}
		}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 6) < 64 && new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null) {
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						_retval.set(capability.getStackInSlot(sltid).getCount());
					});
				}
				return _retval.get();
			}
		}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 7) < 64 && new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null) {
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						_retval.set(capability.getStackInSlot(sltid).getCount());
					});
				}
				return _retval.get();
			}
		}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 8) < 64 && new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null) {
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						_retval.set(capability.getStackInSlot(sltid).getCount());
					});
				}
				return _retval.get();
			}
		}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 9) < 64 && (new Object() {
			public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int sltid) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null) {
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						_retval.set(capability.getStackInSlot(sltid).copy());
					});
				}
				return _retval.get();
			}
		}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 0)).getItem() == MoneysModItems.MINECOIN_20) {
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) y, (int) z));
				if (_ent != null) {
					final int _sltid = 0;
					final int _amount = 1;
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable) {
							ItemStack _stk = capability.getStackInSlot(_sltid).copy();
							_stk.shrink(_amount);
							((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _stk);
						}
					});
				}
			}
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) y, (int) z));
				if (_ent != null) {
					final int _sltid = 9;
					final ItemStack _setstack = new ItemStack(MoneysModItems.MINECOIN_10);
					_setstack.setCount((int) (new Object() {
						public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
							AtomicInteger _retval = new AtomicInteger(0);
							BlockEntity _ent = world.getBlockEntity(pos);
							if (_ent != null) {
								_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									_retval.set(capability.getStackInSlot(sltid).getCount());
								});
							}
							return _retval.get();
						}
					}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 9) + 1));
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable) {
							((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
						}
					});
				}
			}
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) y, (int) z));
				if (_ent != null) {
					final int _sltid = 8;
					final ItemStack _setstack = new ItemStack(MoneysModItems.MINECOIN_10);
					_setstack.setCount((int) (new Object() {
						public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
							AtomicInteger _retval = new AtomicInteger(0);
							BlockEntity _ent = world.getBlockEntity(pos);
							if (_ent != null) {
								_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									_retval.set(capability.getStackInSlot(sltid).getCount());
								});
							}
							return _retval.get();
						}
					}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 8) + 1));
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable) {
							((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
						}
					});
				}
			}
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) y, (int) z));
				if (_ent != null) {
					final int _sltid = 7;
					final ItemStack _setstack = new ItemStack(Blocks.AIR);
					_setstack.setCount((int) (new Object() {
						public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
							AtomicInteger _retval = new AtomicInteger(0);
							BlockEntity _ent = world.getBlockEntity(pos);
							if (_ent != null) {
								_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									_retval.set(capability.getStackInSlot(sltid).getCount());
								});
							}
							return _retval.get();
						}
					}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 7) + 1));
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable) {
							((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
						}
					});
				}
			}
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) y, (int) z));
				if (_ent != null) {
					final int _sltid = 6;
					final ItemStack _setstack = new ItemStack(Blocks.AIR);
					_setstack.setCount((int) (new Object() {
						public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
							AtomicInteger _retval = new AtomicInteger(0);
							BlockEntity _ent = world.getBlockEntity(pos);
							if (_ent != null) {
								_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									_retval.set(capability.getStackInSlot(sltid).getCount());
								});
							}
							return _retval.get();
						}
					}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 6) + 1));
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable) {
							((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
						}
					});
				}
			}
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) y, (int) z));
				if (_ent != null) {
					final int _sltid = 5;
					final ItemStack _setstack = new ItemStack(Blocks.AIR);
					_setstack.setCount((int) (new Object() {
						public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
							AtomicInteger _retval = new AtomicInteger(0);
							BlockEntity _ent = world.getBlockEntity(pos);
							if (_ent != null) {
								_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									_retval.set(capability.getStackInSlot(sltid).getCount());
								});
							}
							return _retval.get();
						}
					}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 5) + 1));
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable) {
							((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
						}
					});
				}
			}
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) y, (int) z));
				if (_ent != null) {
					final int _sltid = 4;
					final ItemStack _setstack = new ItemStack(Blocks.AIR);
					_setstack.setCount((int) (new Object() {
						public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
							AtomicInteger _retval = new AtomicInteger(0);
							BlockEntity _ent = world.getBlockEntity(pos);
							if (_ent != null) {
								_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									_retval.set(capability.getStackInSlot(sltid).getCount());
								});
							}
							return _retval.get();
						}
					}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 4) + 1));
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable) {
							((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
						}
					});
				}
			}
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) y, (int) z));
				if (_ent != null) {
					final int _sltid = 3;
					final ItemStack _setstack = new ItemStack(Blocks.AIR);
					_setstack.setCount((int) (new Object() {
						public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
							AtomicInteger _retval = new AtomicInteger(0);
							BlockEntity _ent = world.getBlockEntity(pos);
							if (_ent != null) {
								_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									_retval.set(capability.getStackInSlot(sltid).getCount());
								});
							}
							return _retval.get();
						}
					}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 3) + 1));
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable) {
							((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
						}
					});
				}
			}
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) y, (int) z));
				if (_ent != null) {
					final int _sltid = 2;
					final ItemStack _setstack = new ItemStack(Blocks.AIR);
					_setstack.setCount((int) (new Object() {
						public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
							AtomicInteger _retval = new AtomicInteger(0);
							BlockEntity _ent = world.getBlockEntity(pos);
							if (_ent != null) {
								_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									_retval.set(capability.getStackInSlot(sltid).getCount());
								});
							}
							return _retval.get();
						}
					}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 2) + 1));
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable) {
							((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
						}
					});
				}
			}
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) y, (int) z));
				if (_ent != null) {
					final int _sltid = 1;
					final ItemStack _setstack = new ItemStack(Blocks.AIR);
					_setstack.setCount((int) (new Object() {
						public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
							AtomicInteger _retval = new AtomicInteger(0);
							BlockEntity _ent = world.getBlockEntity(pos);
							if (_ent != null) {
								_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									_retval.set(capability.getStackInSlot(sltid).getCount());
								});
							}
							return _retval.get();
						}
					}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 1) + 1));
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable) {
							((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
						}
					});
				}
			}
		}
		if ((new Object() {
			public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int sltid) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null) {
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						_retval.set(capability.getStackInSlot(sltid).copy());
					});
				}
				return _retval.get();
			}
		}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 0)).getItem() == MoneysModItems.MINECOIN_50 && new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null) {
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						_retval.set(capability.getStackInSlot(sltid).getCount());
					});
				}
				return _retval.get();
			}
		}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 1) < 64 && new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null) {
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						_retval.set(capability.getStackInSlot(sltid).getCount());
					});
				}
				return _retval.get();
			}
		}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 2) < 64 && new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null) {
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						_retval.set(capability.getStackInSlot(sltid).getCount());
					});
				}
				return _retval.get();
			}
		}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 3) < 64 && new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null) {
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						_retval.set(capability.getStackInSlot(sltid).getCount());
					});
				}
				return _retval.get();
			}
		}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 4) < 64 && new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null) {
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						_retval.set(capability.getStackInSlot(sltid).getCount());
					});
				}
				return _retval.get();
			}
		}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 5) < 64 && new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null) {
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						_retval.set(capability.getStackInSlot(sltid).getCount());
					});
				}
				return _retval.get();
			}
		}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 6) < 64 && new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null) {
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						_retval.set(capability.getStackInSlot(sltid).getCount());
					});
				}
				return _retval.get();
			}
		}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 7) < 64 && new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null) {
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						_retval.set(capability.getStackInSlot(sltid).getCount());
					});
				}
				return _retval.get();
			}
		}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 8) < 64 && new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null) {
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						_retval.set(capability.getStackInSlot(sltid).getCount());
					});
				}
				return _retval.get();
			}
		}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 9) < 64 && (new Object() {
			public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int sltid) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null) {
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						_retval.set(capability.getStackInSlot(sltid).copy());
					});
				}
				return _retval.get();
			}
		}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 0)).getItem() == MoneysModItems.MINECOIN_50) {
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) y, (int) z));
				if (_ent != null) {
					final int _sltid = 0;
					final int _amount = 1;
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable) {
							ItemStack _stk = capability.getStackInSlot(_sltid).copy();
							_stk.shrink(_amount);
							((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _stk);
						}
					});
				}
			}
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) y, (int) z));
				if (_ent != null) {
					final int _sltid = 9;
					final ItemStack _setstack = new ItemStack(MoneysModItems.MINECOIN_10);
					_setstack.setCount((int) (new Object() {
						public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
							AtomicInteger _retval = new AtomicInteger(0);
							BlockEntity _ent = world.getBlockEntity(pos);
							if (_ent != null) {
								_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									_retval.set(capability.getStackInSlot(sltid).getCount());
								});
							}
							return _retval.get();
						}
					}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 9) + 1));
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable) {
							((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
						}
					});
				}
			}
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) y, (int) z));
				if (_ent != null) {
					final int _sltid = 8;
					final ItemStack _setstack = new ItemStack(MoneysModItems.MINECOIN_20);
					_setstack.setCount((int) (new Object() {
						public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
							AtomicInteger _retval = new AtomicInteger(0);
							BlockEntity _ent = world.getBlockEntity(pos);
							if (_ent != null) {
								_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									_retval.set(capability.getStackInSlot(sltid).getCount());
								});
							}
							return _retval.get();
						}
					}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 8) + 1));
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable) {
							((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
						}
					});
				}
			}
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) y, (int) z));
				if (_ent != null) {
					final int _sltid = 7;
					final ItemStack _setstack = new ItemStack(MoneysModItems.MINECOIN_20);
					_setstack.setCount((int) (new Object() {
						public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
							AtomicInteger _retval = new AtomicInteger(0);
							BlockEntity _ent = world.getBlockEntity(pos);
							if (_ent != null) {
								_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									_retval.set(capability.getStackInSlot(sltid).getCount());
								});
							}
							return _retval.get();
						}
					}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 7) + 1));
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable) {
							((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
						}
					});
				}
			}
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) y, (int) z));
				if (_ent != null) {
					final int _sltid = 6;
					final ItemStack _setstack = new ItemStack(Blocks.AIR);
					_setstack.setCount((int) (new Object() {
						public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
							AtomicInteger _retval = new AtomicInteger(0);
							BlockEntity _ent = world.getBlockEntity(pos);
							if (_ent != null) {
								_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									_retval.set(capability.getStackInSlot(sltid).getCount());
								});
							}
							return _retval.get();
						}
					}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 6) + 1));
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable) {
							((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
						}
					});
				}
			}
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) y, (int) z));
				if (_ent != null) {
					final int _sltid = 5;
					final ItemStack _setstack = new ItemStack(Blocks.AIR);
					_setstack.setCount((int) (new Object() {
						public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
							AtomicInteger _retval = new AtomicInteger(0);
							BlockEntity _ent = world.getBlockEntity(pos);
							if (_ent != null) {
								_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									_retval.set(capability.getStackInSlot(sltid).getCount());
								});
							}
							return _retval.get();
						}
					}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 5) + 1));
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable) {
							((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
						}
					});
				}
			}
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) y, (int) z));
				if (_ent != null) {
					final int _sltid = 4;
					final ItemStack _setstack = new ItemStack(Blocks.AIR);
					_setstack.setCount((int) (new Object() {
						public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
							AtomicInteger _retval = new AtomicInteger(0);
							BlockEntity _ent = world.getBlockEntity(pos);
							if (_ent != null) {
								_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									_retval.set(capability.getStackInSlot(sltid).getCount());
								});
							}
							return _retval.get();
						}
					}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 4) + 1));
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable) {
							((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
						}
					});
				}
			}
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) y, (int) z));
				if (_ent != null) {
					final int _sltid = 3;
					final ItemStack _setstack = new ItemStack(Blocks.AIR);
					_setstack.setCount((int) (new Object() {
						public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
							AtomicInteger _retval = new AtomicInteger(0);
							BlockEntity _ent = world.getBlockEntity(pos);
							if (_ent != null) {
								_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									_retval.set(capability.getStackInSlot(sltid).getCount());
								});
							}
							return _retval.get();
						}
					}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 3) + 1));
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable) {
							((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
						}
					});
				}
			}
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) y, (int) z));
				if (_ent != null) {
					final int _sltid = 2;
					final ItemStack _setstack = new ItemStack(Blocks.AIR);
					_setstack.setCount((int) (new Object() {
						public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
							AtomicInteger _retval = new AtomicInteger(0);
							BlockEntity _ent = world.getBlockEntity(pos);
							if (_ent != null) {
								_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									_retval.set(capability.getStackInSlot(sltid).getCount());
								});
							}
							return _retval.get();
						}
					}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 2) + 1));
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable) {
							((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
						}
					});
				}
			}
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) y, (int) z));
				if (_ent != null) {
					final int _sltid = 1;
					final ItemStack _setstack = new ItemStack(Blocks.AIR);
					_setstack.setCount((int) (new Object() {
						public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
							AtomicInteger _retval = new AtomicInteger(0);
							BlockEntity _ent = world.getBlockEntity(pos);
							if (_ent != null) {
								_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									_retval.set(capability.getStackInSlot(sltid).getCount());
								});
							}
							return _retval.get();
						}
					}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 1) + 1));
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable) {
							((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
						}
					});
				}
			}
		}
		if ((new Object() {
			public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int sltid) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null) {
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						_retval.set(capability.getStackInSlot(sltid).copy());
					});
				}
				return _retval.get();
			}
		}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 0)).getItem() == MoneysModItems.MINECOIN_100 && new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null) {
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						_retval.set(capability.getStackInSlot(sltid).getCount());
					});
				}
				return _retval.get();
			}
		}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 1) < 64 && new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null) {
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						_retval.set(capability.getStackInSlot(sltid).getCount());
					});
				}
				return _retval.get();
			}
		}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 2) < 64 && new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null) {
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						_retval.set(capability.getStackInSlot(sltid).getCount());
					});
				}
				return _retval.get();
			}
		}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 3) < 64 && new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null) {
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						_retval.set(capability.getStackInSlot(sltid).getCount());
					});
				}
				return _retval.get();
			}
		}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 4) < 64 && new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null) {
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						_retval.set(capability.getStackInSlot(sltid).getCount());
					});
				}
				return _retval.get();
			}
		}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 5) < 64 && new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null) {
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						_retval.set(capability.getStackInSlot(sltid).getCount());
					});
				}
				return _retval.get();
			}
		}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 6) < 64 && new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null) {
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						_retval.set(capability.getStackInSlot(sltid).getCount());
					});
				}
				return _retval.get();
			}
		}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 7) < 64 && new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null) {
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						_retval.set(capability.getStackInSlot(sltid).getCount());
					});
				}
				return _retval.get();
			}
		}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 8) < 64 && new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null) {
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						_retval.set(capability.getStackInSlot(sltid).getCount());
					});
				}
				return _retval.get();
			}
		}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 9) < 64 && (new Object() {
			public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int sltid) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null) {
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						_retval.set(capability.getStackInSlot(sltid).copy());
					});
				}
				return _retval.get();
			}
		}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 0)).getItem() == MoneysModItems.MINECOIN_100) {
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) y, (int) z));
				if (_ent != null) {
					final int _sltid = 0;
					final int _amount = 1;
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable) {
							ItemStack _stk = capability.getStackInSlot(_sltid).copy();
							_stk.shrink(_amount);
							((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _stk);
						}
					});
				}
			}
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) y, (int) z));
				if (_ent != null) {
					final int _sltid = 9;
					final ItemStack _setstack = new ItemStack(MoneysModItems.MINECOIN_50);
					_setstack.setCount((int) (new Object() {
						public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
							AtomicInteger _retval = new AtomicInteger(0);
							BlockEntity _ent = world.getBlockEntity(pos);
							if (_ent != null) {
								_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									_retval.set(capability.getStackInSlot(sltid).getCount());
								});
							}
							return _retval.get();
						}
					}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 9) + 1));
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable) {
							((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
						}
					});
				}
			}
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) y, (int) z));
				if (_ent != null) {
					final int _sltid = 8;
					final ItemStack _setstack = new ItemStack(MoneysModItems.MINECOIN_50);
					_setstack.setCount((int) (new Object() {
						public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
							AtomicInteger _retval = new AtomicInteger(0);
							BlockEntity _ent = world.getBlockEntity(pos);
							if (_ent != null) {
								_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									_retval.set(capability.getStackInSlot(sltid).getCount());
								});
							}
							return _retval.get();
						}
					}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 8) + 1));
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable) {
							((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
						}
					});
				}
			}
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) y, (int) z));
				if (_ent != null) {
					final int _sltid = 7;
					final ItemStack _setstack = new ItemStack(Blocks.AIR);
					_setstack.setCount((int) (new Object() {
						public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
							AtomicInteger _retval = new AtomicInteger(0);
							BlockEntity _ent = world.getBlockEntity(pos);
							if (_ent != null) {
								_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									_retval.set(capability.getStackInSlot(sltid).getCount());
								});
							}
							return _retval.get();
						}
					}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 7) + 1));
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable) {
							((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
						}
					});
				}
			}
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) y, (int) z));
				if (_ent != null) {
					final int _sltid = 6;
					final ItemStack _setstack = new ItemStack(Blocks.AIR);
					_setstack.setCount((int) (new Object() {
						public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
							AtomicInteger _retval = new AtomicInteger(0);
							BlockEntity _ent = world.getBlockEntity(pos);
							if (_ent != null) {
								_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									_retval.set(capability.getStackInSlot(sltid).getCount());
								});
							}
							return _retval.get();
						}
					}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 6) + 1));
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable) {
							((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
						}
					});
				}
			}
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) y, (int) z));
				if (_ent != null) {
					final int _sltid = 5;
					final ItemStack _setstack = new ItemStack(Blocks.AIR);
					_setstack.setCount((int) (new Object() {
						public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
							AtomicInteger _retval = new AtomicInteger(0);
							BlockEntity _ent = world.getBlockEntity(pos);
							if (_ent != null) {
								_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									_retval.set(capability.getStackInSlot(sltid).getCount());
								});
							}
							return _retval.get();
						}
					}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 5) + 1));
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable) {
							((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
						}
					});
				}
			}
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) y, (int) z));
				if (_ent != null) {
					final int _sltid = 4;
					final ItemStack _setstack = new ItemStack(Blocks.AIR);
					_setstack.setCount((int) (new Object() {
						public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
							AtomicInteger _retval = new AtomicInteger(0);
							BlockEntity _ent = world.getBlockEntity(pos);
							if (_ent != null) {
								_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									_retval.set(capability.getStackInSlot(sltid).getCount());
								});
							}
							return _retval.get();
						}
					}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 4) + 1));
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable) {
							((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
						}
					});
				}
			}
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) y, (int) z));
				if (_ent != null) {
					final int _sltid = 3;
					final ItemStack _setstack = new ItemStack(Blocks.AIR);
					_setstack.setCount((int) (new Object() {
						public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
							AtomicInteger _retval = new AtomicInteger(0);
							BlockEntity _ent = world.getBlockEntity(pos);
							if (_ent != null) {
								_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									_retval.set(capability.getStackInSlot(sltid).getCount());
								});
							}
							return _retval.get();
						}
					}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 3) + 1));
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable) {
							((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
						}
					});
				}
			}
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) y, (int) z));
				if (_ent != null) {
					final int _sltid = 2;
					final ItemStack _setstack = new ItemStack(Blocks.AIR);
					_setstack.setCount((int) (new Object() {
						public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
							AtomicInteger _retval = new AtomicInteger(0);
							BlockEntity _ent = world.getBlockEntity(pos);
							if (_ent != null) {
								_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									_retval.set(capability.getStackInSlot(sltid).getCount());
								});
							}
							return _retval.get();
						}
					}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 2) + 1));
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable) {
							((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
						}
					});
				}
			}
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) y, (int) z));
				if (_ent != null) {
					final int _sltid = 1;
					final ItemStack _setstack = new ItemStack(Blocks.AIR);
					_setstack.setCount((int) (new Object() {
						public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
							AtomicInteger _retval = new AtomicInteger(0);
							BlockEntity _ent = world.getBlockEntity(pos);
							if (_ent != null) {
								_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									_retval.set(capability.getStackInSlot(sltid).getCount());
								});
							}
							return _retval.get();
						}
					}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 1) + 1));
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable) {
							((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
						}
					});
				}
			}
		}
		if ((new Object() {
			public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int sltid) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null) {
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						_retval.set(capability.getStackInSlot(sltid).copy());
					});
				}
				return _retval.get();
			}
		}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 0)).getItem() == MoneysModItems.MINECOIN_200 && new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null) {
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						_retval.set(capability.getStackInSlot(sltid).getCount());
					});
				}
				return _retval.get();
			}
		}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 1) < 64 && new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null) {
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						_retval.set(capability.getStackInSlot(sltid).getCount());
					});
				}
				return _retval.get();
			}
		}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 2) < 64 && new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null) {
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						_retval.set(capability.getStackInSlot(sltid).getCount());
					});
				}
				return _retval.get();
			}
		}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 3) < 64 && new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null) {
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						_retval.set(capability.getStackInSlot(sltid).getCount());
					});
				}
				return _retval.get();
			}
		}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 4) < 64 && new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null) {
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						_retval.set(capability.getStackInSlot(sltid).getCount());
					});
				}
				return _retval.get();
			}
		}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 5) < 64 && new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null) {
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						_retval.set(capability.getStackInSlot(sltid).getCount());
					});
				}
				return _retval.get();
			}
		}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 6) < 64 && new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null) {
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						_retval.set(capability.getStackInSlot(sltid).getCount());
					});
				}
				return _retval.get();
			}
		}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 7) < 64 && new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null) {
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						_retval.set(capability.getStackInSlot(sltid).getCount());
					});
				}
				return _retval.get();
			}
		}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 8) < 64 && new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null) {
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						_retval.set(capability.getStackInSlot(sltid).getCount());
					});
				}
				return _retval.get();
			}
		}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 9) < 64 && (new Object() {
			public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int sltid) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null) {
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						_retval.set(capability.getStackInSlot(sltid).copy());
					});
				}
				return _retval.get();
			}
		}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 0)).getItem() == MoneysModItems.MINECOIN_200) {
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) y, (int) z));
				if (_ent != null) {
					final int _sltid = 0;
					final int _amount = 1;
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable) {
							ItemStack _stk = capability.getStackInSlot(_sltid).copy();
							_stk.shrink(_amount);
							((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _stk);
						}
					});
				}
			}
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) y, (int) z));
				if (_ent != null) {
					final int _sltid = 9;
					final ItemStack _setstack = new ItemStack(MoneysModItems.MINECOIN_100);
					_setstack.setCount((int) (new Object() {
						public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
							AtomicInteger _retval = new AtomicInteger(0);
							BlockEntity _ent = world.getBlockEntity(pos);
							if (_ent != null) {
								_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									_retval.set(capability.getStackInSlot(sltid).getCount());
								});
							}
							return _retval.get();
						}
					}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 9) + 1));
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable) {
							((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
						}
					});
				}
			}
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) y, (int) z));
				if (_ent != null) {
					final int _sltid = 8;
					final ItemStack _setstack = new ItemStack(MoneysModItems.MINECOIN_100);
					_setstack.setCount((int) (new Object() {
						public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
							AtomicInteger _retval = new AtomicInteger(0);
							BlockEntity _ent = world.getBlockEntity(pos);
							if (_ent != null) {
								_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									_retval.set(capability.getStackInSlot(sltid).getCount());
								});
							}
							return _retval.get();
						}
					}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 8) + 1));
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable) {
							((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
						}
					});
				}
			}
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) y, (int) z));
				if (_ent != null) {
					final int _sltid = 7;
					final ItemStack _setstack = new ItemStack(Blocks.AIR);
					_setstack.setCount((int) (new Object() {
						public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
							AtomicInteger _retval = new AtomicInteger(0);
							BlockEntity _ent = world.getBlockEntity(pos);
							if (_ent != null) {
								_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									_retval.set(capability.getStackInSlot(sltid).getCount());
								});
							}
							return _retval.get();
						}
					}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 7) + 1));
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable) {
							((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
						}
					});
				}
			}
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) y, (int) z));
				if (_ent != null) {
					final int _sltid = 6;
					final ItemStack _setstack = new ItemStack(Blocks.AIR);
					_setstack.setCount((int) (new Object() {
						public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
							AtomicInteger _retval = new AtomicInteger(0);
							BlockEntity _ent = world.getBlockEntity(pos);
							if (_ent != null) {
								_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									_retval.set(capability.getStackInSlot(sltid).getCount());
								});
							}
							return _retval.get();
						}
					}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 6) + 1));
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable) {
							((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
						}
					});
				}
			}
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) y, (int) z));
				if (_ent != null) {
					final int _sltid = 5;
					final ItemStack _setstack = new ItemStack(Blocks.AIR);
					_setstack.setCount((int) (new Object() {
						public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
							AtomicInteger _retval = new AtomicInteger(0);
							BlockEntity _ent = world.getBlockEntity(pos);
							if (_ent != null) {
								_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									_retval.set(capability.getStackInSlot(sltid).getCount());
								});
							}
							return _retval.get();
						}
					}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 5) + 1));
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable) {
							((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
						}
					});
				}
			}
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) y, (int) z));
				if (_ent != null) {
					final int _sltid = 4;
					final ItemStack _setstack = new ItemStack(Blocks.AIR);
					_setstack.setCount((int) (new Object() {
						public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
							AtomicInteger _retval = new AtomicInteger(0);
							BlockEntity _ent = world.getBlockEntity(pos);
							if (_ent != null) {
								_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									_retval.set(capability.getStackInSlot(sltid).getCount());
								});
							}
							return _retval.get();
						}
					}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 4) + 1));
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable) {
							((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
						}
					});
				}
			}
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) y, (int) z));
				if (_ent != null) {
					final int _sltid = 3;
					final ItemStack _setstack = new ItemStack(Blocks.AIR);
					_setstack.setCount((int) (new Object() {
						public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
							AtomicInteger _retval = new AtomicInteger(0);
							BlockEntity _ent = world.getBlockEntity(pos);
							if (_ent != null) {
								_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									_retval.set(capability.getStackInSlot(sltid).getCount());
								});
							}
							return _retval.get();
						}
					}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 3) + 1));
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable) {
							((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
						}
					});
				}
			}
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) y, (int) z));
				if (_ent != null) {
					final int _sltid = 2;
					final ItemStack _setstack = new ItemStack(Blocks.AIR);
					_setstack.setCount((int) (new Object() {
						public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
							AtomicInteger _retval = new AtomicInteger(0);
							BlockEntity _ent = world.getBlockEntity(pos);
							if (_ent != null) {
								_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									_retval.set(capability.getStackInSlot(sltid).getCount());
								});
							}
							return _retval.get();
						}
					}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 2) + 1));
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable) {
							((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
						}
					});
				}
			}
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) y, (int) z));
				if (_ent != null) {
					final int _sltid = 1;
					final ItemStack _setstack = new ItemStack(Blocks.AIR);
					_setstack.setCount((int) (new Object() {
						public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
							AtomicInteger _retval = new AtomicInteger(0);
							BlockEntity _ent = world.getBlockEntity(pos);
							if (_ent != null) {
								_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									_retval.set(capability.getStackInSlot(sltid).getCount());
								});
							}
							return _retval.get();
						}
					}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 1) + 1));
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable) {
							((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
						}
					});
				}
			}
		}
		if ((new Object() {
			public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int sltid) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null) {
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						_retval.set(capability.getStackInSlot(sltid).copy());
					});
				}
				return _retval.get();
			}
		}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 0)).getItem() == MoneysModItems.MINECOIN_500 && new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null) {
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						_retval.set(capability.getStackInSlot(sltid).getCount());
					});
				}
				return _retval.get();
			}
		}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 1) < 64 && new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null) {
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						_retval.set(capability.getStackInSlot(sltid).getCount());
					});
				}
				return _retval.get();
			}
		}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 2) < 64 && new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null) {
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						_retval.set(capability.getStackInSlot(sltid).getCount());
					});
				}
				return _retval.get();
			}
		}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 3) < 64 && new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null) {
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						_retval.set(capability.getStackInSlot(sltid).getCount());
					});
				}
				return _retval.get();
			}
		}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 4) < 64 && new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null) {
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						_retval.set(capability.getStackInSlot(sltid).getCount());
					});
				}
				return _retval.get();
			}
		}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 5) < 64 && new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null) {
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						_retval.set(capability.getStackInSlot(sltid).getCount());
					});
				}
				return _retval.get();
			}
		}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 6) < 64 && new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null) {
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						_retval.set(capability.getStackInSlot(sltid).getCount());
					});
				}
				return _retval.get();
			}
		}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 7) < 64 && new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null) {
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						_retval.set(capability.getStackInSlot(sltid).getCount());
					});
				}
				return _retval.get();
			}
		}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 8) < 64 && new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null) {
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						_retval.set(capability.getStackInSlot(sltid).getCount());
					});
				}
				return _retval.get();
			}
		}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 9) < 64 && (new Object() {
			public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int sltid) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null) {
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						_retval.set(capability.getStackInSlot(sltid).copy());
					});
				}
				return _retval.get();
			}
		}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 0)).getItem() == MoneysModItems.MINECOIN_500) {
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) y, (int) z));
				if (_ent != null) {
					final int _sltid = 0;
					final int _amount = 1;
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable) {
							ItemStack _stk = capability.getStackInSlot(_sltid).copy();
							_stk.shrink(_amount);
							((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _stk);
						}
					});
				}
			}
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) y, (int) z));
				if (_ent != null) {
					final int _sltid = 9;
					final ItemStack _setstack = new ItemStack(MoneysModItems.MINECOIN_200);
					_setstack.setCount((int) (new Object() {
						public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
							AtomicInteger _retval = new AtomicInteger(0);
							BlockEntity _ent = world.getBlockEntity(pos);
							if (_ent != null) {
								_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									_retval.set(capability.getStackInSlot(sltid).getCount());
								});
							}
							return _retval.get();
						}
					}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 9) + 1));
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable) {
							((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
						}
					});
				}
			}
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) y, (int) z));
				if (_ent != null) {
					final int _sltid = 8;
					final ItemStack _setstack = new ItemStack(MoneysModItems.MINECOIN_200);
					_setstack.setCount((int) (new Object() {
						public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
							AtomicInteger _retval = new AtomicInteger(0);
							BlockEntity _ent = world.getBlockEntity(pos);
							if (_ent != null) {
								_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									_retval.set(capability.getStackInSlot(sltid).getCount());
								});
							}
							return _retval.get();
						}
					}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 8) + 1));
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable) {
							((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
						}
					});
				}
			}
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) y, (int) z));
				if (_ent != null) {
					final int _sltid = 7;
					final ItemStack _setstack = new ItemStack(MoneysModItems.MINECOIN_100);
					_setstack.setCount((int) (new Object() {
						public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
							AtomicInteger _retval = new AtomicInteger(0);
							BlockEntity _ent = world.getBlockEntity(pos);
							if (_ent != null) {
								_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									_retval.set(capability.getStackInSlot(sltid).getCount());
								});
							}
							return _retval.get();
						}
					}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 7) + 1));
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable) {
							((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
						}
					});
				}
			}
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) y, (int) z));
				if (_ent != null) {
					final int _sltid = 6;
					final ItemStack _setstack = new ItemStack(Blocks.AIR);
					_setstack.setCount((int) (new Object() {
						public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
							AtomicInteger _retval = new AtomicInteger(0);
							BlockEntity _ent = world.getBlockEntity(pos);
							if (_ent != null) {
								_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									_retval.set(capability.getStackInSlot(sltid).getCount());
								});
							}
							return _retval.get();
						}
					}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 6) + 1));
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable) {
							((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
						}
					});
				}
			}
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) y, (int) z));
				if (_ent != null) {
					final int _sltid = 5;
					final ItemStack _setstack = new ItemStack(Blocks.AIR);
					_setstack.setCount((int) (new Object() {
						public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
							AtomicInteger _retval = new AtomicInteger(0);
							BlockEntity _ent = world.getBlockEntity(pos);
							if (_ent != null) {
								_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									_retval.set(capability.getStackInSlot(sltid).getCount());
								});
							}
							return _retval.get();
						}
					}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 5) + 1));
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable) {
							((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
						}
					});
				}
			}
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) y, (int) z));
				if (_ent != null) {
					final int _sltid = 4;
					final ItemStack _setstack = new ItemStack(Blocks.AIR);
					_setstack.setCount((int) (new Object() {
						public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
							AtomicInteger _retval = new AtomicInteger(0);
							BlockEntity _ent = world.getBlockEntity(pos);
							if (_ent != null) {
								_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									_retval.set(capability.getStackInSlot(sltid).getCount());
								});
							}
							return _retval.get();
						}
					}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 4) + 1));
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable) {
							((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
						}
					});
				}
			}
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) y, (int) z));
				if (_ent != null) {
					final int _sltid = 3;
					final ItemStack _setstack = new ItemStack(Blocks.AIR);
					_setstack.setCount((int) (new Object() {
						public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
							AtomicInteger _retval = new AtomicInteger(0);
							BlockEntity _ent = world.getBlockEntity(pos);
							if (_ent != null) {
								_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									_retval.set(capability.getStackInSlot(sltid).getCount());
								});
							}
							return _retval.get();
						}
					}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 3) + 1));
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable) {
							((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
						}
					});
				}
			}
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) y, (int) z));
				if (_ent != null) {
					final int _sltid = 2;
					final ItemStack _setstack = new ItemStack(Blocks.AIR);
					_setstack.setCount((int) (new Object() {
						public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
							AtomicInteger _retval = new AtomicInteger(0);
							BlockEntity _ent = world.getBlockEntity(pos);
							if (_ent != null) {
								_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									_retval.set(capability.getStackInSlot(sltid).getCount());
								});
							}
							return _retval.get();
						}
					}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 2) + 1));
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable) {
							((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
						}
					});
				}
			}
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) y, (int) z));
				if (_ent != null) {
					final int _sltid = 1;
					final ItemStack _setstack = new ItemStack(Blocks.AIR);
					_setstack.setCount((int) (new Object() {
						public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
							AtomicInteger _retval = new AtomicInteger(0);
							BlockEntity _ent = world.getBlockEntity(pos);
							if (_ent != null) {
								_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									_retval.set(capability.getStackInSlot(sltid).getCount());
								});
							}
							return _retval.get();
						}
					}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 1) + 1));
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable) {
							((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
						}
					});
				}
			}
		}
		if ((new Object() {
			public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int sltid) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null) {
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						_retval.set(capability.getStackInSlot(sltid).copy());
					});
				}
				return _retval.get();
			}
		}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 0)).getItem() == MoneysModItems.MINECOIN_1000 && new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null) {
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						_retval.set(capability.getStackInSlot(sltid).getCount());
					});
				}
				return _retval.get();
			}
		}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 1) < 64 && new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null) {
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						_retval.set(capability.getStackInSlot(sltid).getCount());
					});
				}
				return _retval.get();
			}
		}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 2) < 64 && new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null) {
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						_retval.set(capability.getStackInSlot(sltid).getCount());
					});
				}
				return _retval.get();
			}
		}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 3) < 64 && new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null) {
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						_retval.set(capability.getStackInSlot(sltid).getCount());
					});
				}
				return _retval.get();
			}
		}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 4) < 64 && new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null) {
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						_retval.set(capability.getStackInSlot(sltid).getCount());
					});
				}
				return _retval.get();
			}
		}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 5) < 64 && new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null) {
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						_retval.set(capability.getStackInSlot(sltid).getCount());
					});
				}
				return _retval.get();
			}
		}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 6) < 64 && new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null) {
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						_retval.set(capability.getStackInSlot(sltid).getCount());
					});
				}
				return _retval.get();
			}
		}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 7) < 64 && new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null) {
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						_retval.set(capability.getStackInSlot(sltid).getCount());
					});
				}
				return _retval.get();
			}
		}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 8) < 64 && new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null) {
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						_retval.set(capability.getStackInSlot(sltid).getCount());
					});
				}
				return _retval.get();
			}
		}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 9) < 64 && (new Object() {
			public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int sltid) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null) {
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						_retval.set(capability.getStackInSlot(sltid).copy());
					});
				}
				return _retval.get();
			}
		}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 0)).getItem() == MoneysModItems.MINECOIN_1000) {
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) y, (int) z));
				if (_ent != null) {
					final int _sltid = 0;
					final int _amount = 1;
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable) {
							ItemStack _stk = capability.getStackInSlot(_sltid).copy();
							_stk.shrink(_amount);
							((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _stk);
						}
					});
				}
			}
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) y, (int) z));
				if (_ent != null) {
					final int _sltid = 9;
					final ItemStack _setstack = new ItemStack(MoneysModItems.MINECOIN_500);
					_setstack.setCount((int) (new Object() {
						public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
							AtomicInteger _retval = new AtomicInteger(0);
							BlockEntity _ent = world.getBlockEntity(pos);
							if (_ent != null) {
								_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									_retval.set(capability.getStackInSlot(sltid).getCount());
								});
							}
							return _retval.get();
						}
					}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 9) + 1));
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable) {
							((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
						}
					});
				}
			}
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) y, (int) z));
				if (_ent != null) {
					final int _sltid = 8;
					final ItemStack _setstack = new ItemStack(MoneysModItems.MINECOIN_500);
					_setstack.setCount((int) (new Object() {
						public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
							AtomicInteger _retval = new AtomicInteger(0);
							BlockEntity _ent = world.getBlockEntity(pos);
							if (_ent != null) {
								_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									_retval.set(capability.getStackInSlot(sltid).getCount());
								});
							}
							return _retval.get();
						}
					}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 8) + 1));
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable) {
							((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
						}
					});
				}
			}
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) y, (int) z));
				if (_ent != null) {
					final int _sltid = 7;
					final ItemStack _setstack = new ItemStack(Blocks.AIR);
					_setstack.setCount((int) (new Object() {
						public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
							AtomicInteger _retval = new AtomicInteger(0);
							BlockEntity _ent = world.getBlockEntity(pos);
							if (_ent != null) {
								_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									_retval.set(capability.getStackInSlot(sltid).getCount());
								});
							}
							return _retval.get();
						}
					}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 7) + 1));
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable) {
							((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
						}
					});
				}
			}
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) y, (int) z));
				if (_ent != null) {
					final int _sltid = 6;
					final ItemStack _setstack = new ItemStack(Blocks.AIR);
					_setstack.setCount((int) (new Object() {
						public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
							AtomicInteger _retval = new AtomicInteger(0);
							BlockEntity _ent = world.getBlockEntity(pos);
							if (_ent != null) {
								_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									_retval.set(capability.getStackInSlot(sltid).getCount());
								});
							}
							return _retval.get();
						}
					}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 6) + 1));
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable) {
							((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
						}
					});
				}
			}
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) y, (int) z));
				if (_ent != null) {
					final int _sltid = 5;
					final ItemStack _setstack = new ItemStack(Blocks.AIR);
					_setstack.setCount((int) (new Object() {
						public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
							AtomicInteger _retval = new AtomicInteger(0);
							BlockEntity _ent = world.getBlockEntity(pos);
							if (_ent != null) {
								_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									_retval.set(capability.getStackInSlot(sltid).getCount());
								});
							}
							return _retval.get();
						}
					}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 5) + 1));
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable) {
							((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
						}
					});
				}
			}
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) y, (int) z));
				if (_ent != null) {
					final int _sltid = 4;
					final ItemStack _setstack = new ItemStack(Blocks.AIR);
					_setstack.setCount((int) (new Object() {
						public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
							AtomicInteger _retval = new AtomicInteger(0);
							BlockEntity _ent = world.getBlockEntity(pos);
							if (_ent != null) {
								_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									_retval.set(capability.getStackInSlot(sltid).getCount());
								});
							}
							return _retval.get();
						}
					}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 4) + 1));
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable) {
							((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
						}
					});
				}
			}
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) y, (int) z));
				if (_ent != null) {
					final int _sltid = 3;
					final ItemStack _setstack = new ItemStack(Blocks.AIR);
					_setstack.setCount((int) (new Object() {
						public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
							AtomicInteger _retval = new AtomicInteger(0);
							BlockEntity _ent = world.getBlockEntity(pos);
							if (_ent != null) {
								_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									_retval.set(capability.getStackInSlot(sltid).getCount());
								});
							}
							return _retval.get();
						}
					}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 3) + 1));
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable) {
							((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
						}
					});
				}
			}
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) y, (int) z));
				if (_ent != null) {
					final int _sltid = 2;
					final ItemStack _setstack = new ItemStack(Blocks.AIR);
					_setstack.setCount((int) (new Object() {
						public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
							AtomicInteger _retval = new AtomicInteger(0);
							BlockEntity _ent = world.getBlockEntity(pos);
							if (_ent != null) {
								_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									_retval.set(capability.getStackInSlot(sltid).getCount());
								});
							}
							return _retval.get();
						}
					}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 2) + 1));
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable) {
							((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
						}
					});
				}
			}
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) y, (int) z));
				if (_ent != null) {
					final int _sltid = 1;
					final ItemStack _setstack = new ItemStack(Blocks.AIR);
					_setstack.setCount((int) (new Object() {
						public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
							AtomicInteger _retval = new AtomicInteger(0);
							BlockEntity _ent = world.getBlockEntity(pos);
							if (_ent != null) {
								_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									_retval.set(capability.getStackInSlot(sltid).getCount());
								});
							}
							return _retval.get();
						}
					}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 1) + 1));
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable) {
							((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
						}
					});
				}
			}
		}
		if ((new Object() {
			public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int sltid) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null) {
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						_retval.set(capability.getStackInSlot(sltid).copy());
					});
				}
				return _retval.get();
			}
		}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 0)).getItem() == MoneysModItems.MINECOIN_2000 && new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null) {
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						_retval.set(capability.getStackInSlot(sltid).getCount());
					});
				}
				return _retval.get();
			}
		}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 1) < 64 && new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null) {
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						_retval.set(capability.getStackInSlot(sltid).getCount());
					});
				}
				return _retval.get();
			}
		}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 2) < 64 && new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null) {
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						_retval.set(capability.getStackInSlot(sltid).getCount());
					});
				}
				return _retval.get();
			}
		}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 3) < 64 && new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null) {
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						_retval.set(capability.getStackInSlot(sltid).getCount());
					});
				}
				return _retval.get();
			}
		}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 4) < 64 && new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null) {
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						_retval.set(capability.getStackInSlot(sltid).getCount());
					});
				}
				return _retval.get();
			}
		}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 5) < 64 && new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null) {
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						_retval.set(capability.getStackInSlot(sltid).getCount());
					});
				}
				return _retval.get();
			}
		}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 6) < 64 && new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null) {
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						_retval.set(capability.getStackInSlot(sltid).getCount());
					});
				}
				return _retval.get();
			}
		}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 7) < 64 && new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null) {
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						_retval.set(capability.getStackInSlot(sltid).getCount());
					});
				}
				return _retval.get();
			}
		}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 8) < 64 && new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null) {
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						_retval.set(capability.getStackInSlot(sltid).getCount());
					});
				}
				return _retval.get();
			}
		}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 9) < 64 && (new Object() {
			public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int sltid) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null) {
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						_retval.set(capability.getStackInSlot(sltid).copy());
					});
				}
				return _retval.get();
			}
		}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 0)).getItem() == MoneysModItems.MINECOIN_2000) {
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) y, (int) z));
				if (_ent != null) {
					final int _sltid = 0;
					final int _amount = 1;
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable) {
							ItemStack _stk = capability.getStackInSlot(_sltid).copy();
							_stk.shrink(_amount);
							((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _stk);
						}
					});
				}
			}
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) y, (int) z));
				if (_ent != null) {
					final int _sltid = 9;
					final ItemStack _setstack = new ItemStack(MoneysModItems.MINECOIN_1000);
					_setstack.setCount((int) (new Object() {
						public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
							AtomicInteger _retval = new AtomicInteger(0);
							BlockEntity _ent = world.getBlockEntity(pos);
							if (_ent != null) {
								_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									_retval.set(capability.getStackInSlot(sltid).getCount());
								});
							}
							return _retval.get();
						}
					}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 9) + 1));
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable) {
							((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
						}
					});
				}
			}
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) y, (int) z));
				if (_ent != null) {
					final int _sltid = 8;
					final ItemStack _setstack = new ItemStack(MoneysModItems.MINECOIN_1000);
					_setstack.setCount((int) (new Object() {
						public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
							AtomicInteger _retval = new AtomicInteger(0);
							BlockEntity _ent = world.getBlockEntity(pos);
							if (_ent != null) {
								_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									_retval.set(capability.getStackInSlot(sltid).getCount());
								});
							}
							return _retval.get();
						}
					}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 8) + 1));
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable) {
							((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
						}
					});
				}
			}
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) y, (int) z));
				if (_ent != null) {
					final int _sltid = 7;
					final ItemStack _setstack = new ItemStack(Blocks.AIR);
					_setstack.setCount((int) (new Object() {
						public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
							AtomicInteger _retval = new AtomicInteger(0);
							BlockEntity _ent = world.getBlockEntity(pos);
							if (_ent != null) {
								_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									_retval.set(capability.getStackInSlot(sltid).getCount());
								});
							}
							return _retval.get();
						}
					}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 7) + 1));
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable) {
							((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
						}
					});
				}
			}
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) y, (int) z));
				if (_ent != null) {
					final int _sltid = 6;
					final ItemStack _setstack = new ItemStack(Blocks.AIR);
					_setstack.setCount((int) (new Object() {
						public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
							AtomicInteger _retval = new AtomicInteger(0);
							BlockEntity _ent = world.getBlockEntity(pos);
							if (_ent != null) {
								_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									_retval.set(capability.getStackInSlot(sltid).getCount());
								});
							}
							return _retval.get();
						}
					}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 6) + 1));
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable) {
							((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
						}
					});
				}
			}
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) y, (int) z));
				if (_ent != null) {
					final int _sltid = 5;
					final ItemStack _setstack = new ItemStack(Blocks.AIR);
					_setstack.setCount((int) (new Object() {
						public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
							AtomicInteger _retval = new AtomicInteger(0);
							BlockEntity _ent = world.getBlockEntity(pos);
							if (_ent != null) {
								_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									_retval.set(capability.getStackInSlot(sltid).getCount());
								});
							}
							return _retval.get();
						}
					}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 5) + 1));
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable) {
							((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
						}
					});
				}
			}
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) y, (int) z));
				if (_ent != null) {
					final int _sltid = 4;
					final ItemStack _setstack = new ItemStack(Blocks.AIR);
					_setstack.setCount((int) (new Object() {
						public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
							AtomicInteger _retval = new AtomicInteger(0);
							BlockEntity _ent = world.getBlockEntity(pos);
							if (_ent != null) {
								_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									_retval.set(capability.getStackInSlot(sltid).getCount());
								});
							}
							return _retval.get();
						}
					}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 4) + 1));
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable) {
							((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
						}
					});
				}
			}
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) y, (int) z));
				if (_ent != null) {
					final int _sltid = 3;
					final ItemStack _setstack = new ItemStack(Blocks.AIR);
					_setstack.setCount((int) (new Object() {
						public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
							AtomicInteger _retval = new AtomicInteger(0);
							BlockEntity _ent = world.getBlockEntity(pos);
							if (_ent != null) {
								_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									_retval.set(capability.getStackInSlot(sltid).getCount());
								});
							}
							return _retval.get();
						}
					}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 3) + 1));
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable) {
							((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
						}
					});
				}
			}
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) y, (int) z));
				if (_ent != null) {
					final int _sltid = 2;
					final ItemStack _setstack = new ItemStack(Blocks.AIR);
					_setstack.setCount((int) (new Object() {
						public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
							AtomicInteger _retval = new AtomicInteger(0);
							BlockEntity _ent = world.getBlockEntity(pos);
							if (_ent != null) {
								_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									_retval.set(capability.getStackInSlot(sltid).getCount());
								});
							}
							return _retval.get();
						}
					}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 2) + 1));
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable) {
							((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
						}
					});
				}
			}
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) y, (int) z));
				if (_ent != null) {
					final int _sltid = 1;
					final ItemStack _setstack = new ItemStack(Blocks.AIR);
					_setstack.setCount((int) (new Object() {
						public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
							AtomicInteger _retval = new AtomicInteger(0);
							BlockEntity _ent = world.getBlockEntity(pos);
							if (_ent != null) {
								_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									_retval.set(capability.getStackInSlot(sltid).getCount());
								});
							}
							return _retval.get();
						}
					}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 1) + 1));
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable) {
							((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
						}
					});
				}
			}
		}
		if ((new Object() {
			public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int sltid) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null) {
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						_retval.set(capability.getStackInSlot(sltid).copy());
					});
				}
				return _retval.get();
			}
		}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 0)).getItem() == MoneysModItems.MINECOIN_5000 && new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null) {
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						_retval.set(capability.getStackInSlot(sltid).getCount());
					});
				}
				return _retval.get();
			}
		}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 1) < 64 && new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null) {
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						_retval.set(capability.getStackInSlot(sltid).getCount());
					});
				}
				return _retval.get();
			}
		}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 2) < 64 && new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null) {
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						_retval.set(capability.getStackInSlot(sltid).getCount());
					});
				}
				return _retval.get();
			}
		}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 3) < 64 && new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null) {
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						_retval.set(capability.getStackInSlot(sltid).getCount());
					});
				}
				return _retval.get();
			}
		}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 4) < 64 && new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null) {
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						_retval.set(capability.getStackInSlot(sltid).getCount());
					});
				}
				return _retval.get();
			}
		}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 5) < 64 && new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null) {
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						_retval.set(capability.getStackInSlot(sltid).getCount());
					});
				}
				return _retval.get();
			}
		}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 6) < 64 && new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null) {
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						_retval.set(capability.getStackInSlot(sltid).getCount());
					});
				}
				return _retval.get();
			}
		}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 7) < 64 && new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null) {
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						_retval.set(capability.getStackInSlot(sltid).getCount());
					});
				}
				return _retval.get();
			}
		}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 8) < 64 && new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null) {
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						_retval.set(capability.getStackInSlot(sltid).getCount());
					});
				}
				return _retval.get();
			}
		}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 9) < 64 && (new Object() {
			public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int sltid) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null) {
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						_retval.set(capability.getStackInSlot(sltid).copy());
					});
				}
				return _retval.get();
			}
		}.getItemStack(world, new BlockPos((int) x, (int) y, (int) z), 0)).getItem() == MoneysModItems.MINECOIN_5000) {
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) y, (int) z));
				if (_ent != null) {
					final int _sltid = 0;
					final int _amount = 1;
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable) {
							ItemStack _stk = capability.getStackInSlot(_sltid).copy();
							_stk.shrink(_amount);
							((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _stk);
						}
					});
				}
			}
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) y, (int) z));
				if (_ent != null) {
					final int _sltid = 9;
					final ItemStack _setstack = new ItemStack(MoneysModItems.MINECOIN_1000);
					_setstack.setCount((int) (new Object() {
						public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
							AtomicInteger _retval = new AtomicInteger(0);
							BlockEntity _ent = world.getBlockEntity(pos);
							if (_ent != null) {
								_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									_retval.set(capability.getStackInSlot(sltid).getCount());
								});
							}
							return _retval.get();
						}
					}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 9) + 1));
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable) {
							((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
						}
					});
				}
			}
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) y, (int) z));
				if (_ent != null) {
					final int _sltid = 8;
					final ItemStack _setstack = new ItemStack(MoneysModItems.MINECOIN_2000);
					_setstack.setCount((int) (new Object() {
						public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
							AtomicInteger _retval = new AtomicInteger(0);
							BlockEntity _ent = world.getBlockEntity(pos);
							if (_ent != null) {
								_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									_retval.set(capability.getStackInSlot(sltid).getCount());
								});
							}
							return _retval.get();
						}
					}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 8) + 1));
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable) {
							((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
						}
					});
				}
			}
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) y, (int) z));
				if (_ent != null) {
					final int _sltid = 7;
					final ItemStack _setstack = new ItemStack(MoneysModItems.MINECOIN_2000);
					_setstack.setCount((int) (new Object() {
						public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
							AtomicInteger _retval = new AtomicInteger(0);
							BlockEntity _ent = world.getBlockEntity(pos);
							if (_ent != null) {
								_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									_retval.set(capability.getStackInSlot(sltid).getCount());
								});
							}
							return _retval.get();
						}
					}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 7) + 1));
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable) {
							((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
						}
					});
				}
			}
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) y, (int) z));
				if (_ent != null) {
					final int _sltid = 6;
					final ItemStack _setstack = new ItemStack(Blocks.AIR);
					_setstack.setCount((int) (new Object() {
						public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
							AtomicInteger _retval = new AtomicInteger(0);
							BlockEntity _ent = world.getBlockEntity(pos);
							if (_ent != null) {
								_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									_retval.set(capability.getStackInSlot(sltid).getCount());
								});
							}
							return _retval.get();
						}
					}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 6) + 1));
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable) {
							((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
						}
					});
				}
			}
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) y, (int) z));
				if (_ent != null) {
					final int _sltid = 5;
					final ItemStack _setstack = new ItemStack(Blocks.AIR);
					_setstack.setCount((int) (new Object() {
						public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
							AtomicInteger _retval = new AtomicInteger(0);
							BlockEntity _ent = world.getBlockEntity(pos);
							if (_ent != null) {
								_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									_retval.set(capability.getStackInSlot(sltid).getCount());
								});
							}
							return _retval.get();
						}
					}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 5) + 1));
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable) {
							((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
						}
					});
				}
			}
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) y, (int) z));
				if (_ent != null) {
					final int _sltid = 4;
					final ItemStack _setstack = new ItemStack(Blocks.AIR);
					_setstack.setCount((int) (new Object() {
						public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
							AtomicInteger _retval = new AtomicInteger(0);
							BlockEntity _ent = world.getBlockEntity(pos);
							if (_ent != null) {
								_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									_retval.set(capability.getStackInSlot(sltid).getCount());
								});
							}
							return _retval.get();
						}
					}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 4) + 1));
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable) {
							((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
						}
					});
				}
			}
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) y, (int) z));
				if (_ent != null) {
					final int _sltid = 3;
					final ItemStack _setstack = new ItemStack(Blocks.AIR);
					_setstack.setCount((int) (new Object() {
						public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
							AtomicInteger _retval = new AtomicInteger(0);
							BlockEntity _ent = world.getBlockEntity(pos);
							if (_ent != null) {
								_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									_retval.set(capability.getStackInSlot(sltid).getCount());
								});
							}
							return _retval.get();
						}
					}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 3) + 1));
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable) {
							((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
						}
					});
				}
			}
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) y, (int) z));
				if (_ent != null) {
					final int _sltid = 2;
					final ItemStack _setstack = new ItemStack(Blocks.AIR);
					_setstack.setCount((int) (new Object() {
						public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
							AtomicInteger _retval = new AtomicInteger(0);
							BlockEntity _ent = world.getBlockEntity(pos);
							if (_ent != null) {
								_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									_retval.set(capability.getStackInSlot(sltid).getCount());
								});
							}
							return _retval.get();
						}
					}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 2) + 1));
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable) {
							((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
						}
					});
				}
			}
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) y, (int) z));
				if (_ent != null) {
					final int _sltid = 1;
					final ItemStack _setstack = new ItemStack(Blocks.AIR);
					_setstack.setCount((int) (new Object() {
						public int getAmount(LevelAccessor world, BlockPos pos, int sltid) {
							AtomicInteger _retval = new AtomicInteger(0);
							BlockEntity _ent = world.getBlockEntity(pos);
							if (_ent != null) {
								_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									_retval.set(capability.getStackInSlot(sltid).getCount());
								});
							}
							return _retval.get();
						}
					}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), 1) + 1));
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable) {
							((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
						}
					});
				}
			}
		}
	}
}
