package blt.moneys.beta.procedures;

import net.minecraftforge.fmllegacy.network.NetworkHooks;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.MenuProvider;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import io.netty.buffer.Unpooled;

import blt.moneys.beta.world.inventory.WanderingSellerGUIMenu;

public class WanderingSellerRightClickedOnEntityProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		sourceentity.getPersistentData().putDouble("playerTradeCount1", (entity.getPersistentData().getDouble("itemTradeCount1")));
		sourceentity.getPersistentData().putDouble("playerTradeCount2", (entity.getPersistentData().getDouble("itemTradeCount2")));
		sourceentity.getPersistentData().putDouble("playerTradeCount3", (entity.getPersistentData().getDouble("itemTradeCount3")));
		sourceentity.getPersistentData().putDouble("playerTradeItem1", (entity.getPersistentData().getDouble("itemTrade1")));
		sourceentity.getPersistentData().putDouble("playerTradeItem2", (entity.getPersistentData().getDouble("itemTrade2")));
		sourceentity.getPersistentData().putDouble("playerTradeItem3", (entity.getPersistentData().getDouble("itemTrade3")));
		sourceentity.getPersistentData().putDouble("playerTradePage", 1);
		{
			if (sourceentity instanceof ServerPlayer _ent) {
				BlockPos _bpos = new BlockPos((int) x, (int) y, (int) z);
				NetworkHooks.openGui((ServerPlayer) _ent, new MenuProvider() {
					@Override
					public Component getDisplayName() {
						return new TextComponent("WanderingSellerGUI");
					}

					@Override
					public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
						return new WanderingSellerGUIMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
					}
				}, _bpos);
			}
		}
	}
}
