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

import java.util.Map;

import io.netty.buffer.Unpooled;

import blt.moneys.beta.world.inventory.WanderingSellerGUIMenu;
import blt.moneys.beta.MoneysMod;

public class WanderingSellerRightClickedOnEntityProcedure {
	public static void execute(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				MoneysMod.LOGGER.warn("Failed to load dependency entity for procedure WanderingSellerRightClickedOnEntity!");
			return;
		}
		if (dependencies.get("sourceentity") == null) {
			if (!dependencies.containsKey("sourceentity"))
				MoneysMod.LOGGER.warn("Failed to load dependency sourceentity for procedure WanderingSellerRightClickedOnEntity!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				MoneysMod.LOGGER.warn("Failed to load dependency x for procedure WanderingSellerRightClickedOnEntity!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				MoneysMod.LOGGER.warn("Failed to load dependency y for procedure WanderingSellerRightClickedOnEntity!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				MoneysMod.LOGGER.warn("Failed to load dependency z for procedure WanderingSellerRightClickedOnEntity!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				MoneysMod.LOGGER.warn("Failed to load dependency world for procedure WanderingSellerRightClickedOnEntity!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		Entity sourceentity = (Entity) dependencies.get("sourceentity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		LevelAccessor world = (LevelAccessor) dependencies.get("world");
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
