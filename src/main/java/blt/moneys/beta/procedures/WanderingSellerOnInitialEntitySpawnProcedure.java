package blt.moneys.beta.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

public class WanderingSellerOnInitialEntitySpawnProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (!world.isClientSide()) {
			entity.getPersistentData().putDouble("randomTrade1", Math.random());
			if (entity.getPersistentData().getDouble("randomTrade1") >= 0.96) {
				entity.getPersistentData().putDouble("itemTrade1", 1);
			} else if (entity.getPersistentData().getDouble("randomTrade1") >= 0.83) {
				entity.getPersistentData().putDouble("itemTrade1", 2);
			} else if (entity.getPersistentData().getDouble("randomTrade1") >= 0.71) {
				entity.getPersistentData().putDouble("itemTrade1", 3);
			} else if (entity.getPersistentData().getDouble("randomTrade1") >= 0.52) {
				entity.getPersistentData().putDouble("itemTrade1", 4);
			} else if (entity.getPersistentData().getDouble("randomTrade1") >= 0.26) {
				entity.getPersistentData().putDouble("itemTrade1", 5);
			} else if (entity.getPersistentData().getDouble("randomTrade1") >= 0) {
				entity.getPersistentData().putDouble("itemTrade1", 6);
			}
			entity.getPersistentData().putDouble("randomTrade2", Math.random());
			if (entity.getPersistentData().getDouble("randomTrade2") >= 0.96) {
				entity.getPersistentData().putDouble("itemTrade2", 1);
			} else if (entity.getPersistentData().getDouble("randomTrade2") >= 0.83) {
				entity.getPersistentData().putDouble("itemTrade2", 2);
			} else if (entity.getPersistentData().getDouble("randomTrade2") >= 0.71) {
				entity.getPersistentData().putDouble("itemTrade2", 3);
			} else if (entity.getPersistentData().getDouble("randomTrade2") >= 0.52) {
				entity.getPersistentData().putDouble("itemTrade2", 4);
			} else if (entity.getPersistentData().getDouble("randomTrade2") >= 0.26) {
				entity.getPersistentData().putDouble("itemTrade2", 5);
			} else if (entity.getPersistentData().getDouble("randomTrade2") >= 0) {
				entity.getPersistentData().putDouble("itemTrade2", 6);
			}
			entity.getPersistentData().putDouble("randomTrade3", Math.random());
			if (entity.getPersistentData().getDouble("randomTrade3") >= 0.96) {
				entity.getPersistentData().putDouble("itemTrade3", 1);
			} else if (entity.getPersistentData().getDouble("randomTrade3") >= 0.83) {
				entity.getPersistentData().putDouble("itemTrade3", 2);
			} else if (entity.getPersistentData().getDouble("randomTrade3") >= 0.71) {
				entity.getPersistentData().putDouble("itemTrade3", 3);
			} else if (entity.getPersistentData().getDouble("randomTrade3") >= 0.52) {
				entity.getPersistentData().putDouble("itemTrade3", 4);
			} else if (entity.getPersistentData().getDouble("randomTrade3") >= 0.26) {
				entity.getPersistentData().putDouble("itemTrade3", 5);
			} else if (entity.getPersistentData().getDouble("randomTrade3") >= 0) {
				entity.getPersistentData().putDouble("itemTrade3", 6);
			}
			entity.getPersistentData().putDouble("randomTradeCount1", Math.random());
			if (entity.getPersistentData().getDouble("randomTradeCount1") >= 0.96) {
				entity.getPersistentData().putDouble("itemTradeCount1", 1);
			} else if (entity.getPersistentData().getDouble("randomTradeCount1") >= 0.83) {
				entity.getPersistentData().putDouble("itemTradeCount1", 2);
			} else if (entity.getPersistentData().getDouble("randomTradeCount1") >= 0.71) {
				entity.getPersistentData().putDouble("itemTradeCount1", 3);
			} else if (entity.getPersistentData().getDouble("randomTrade3") >= 0.52) {
				entity.getPersistentData().putDouble("itemTradeCount1", 4);
			} else if (entity.getPersistentData().getDouble("randomTradeCount1") >= 0.26) {
				entity.getPersistentData().putDouble("itemTradeCount1", 5);
			} else if (entity.getPersistentData().getDouble("randomTradeCount1") >= 0) {
				entity.getPersistentData().putDouble("itemTradeCount1", 6);
			}
			entity.getPersistentData().putDouble("randomTradeCount2", Math.random());
			if (entity.getPersistentData().getDouble("randomTradeCount2") >= 0.96) {
				entity.getPersistentData().putDouble("itemTradeCount2", 1);
			} else if (entity.getPersistentData().getDouble("randomTradeCount2") >= 0.83) {
				entity.getPersistentData().putDouble("itemTradeCount2", 2);
			} else if (entity.getPersistentData().getDouble("randomTradeCount2") >= 0.71) {
				entity.getPersistentData().putDouble("itemTradeCount2", 3);
			} else if (entity.getPersistentData().getDouble("randomTradeCount2") >= 0.52) {
				entity.getPersistentData().putDouble("itemTradeCount2", 4);
			} else if (entity.getPersistentData().getDouble("randomTradeCount2") >= 0.26) {
				entity.getPersistentData().putDouble("itemTradeCount2", 5);
			} else if (entity.getPersistentData().getDouble("randomTradeCount2") >= 0) {
				entity.getPersistentData().putDouble("itemTradeCount2", 6);
			}
			entity.getPersistentData().putDouble("randomTradeCount3", Math.random());
			if (entity.getPersistentData().getDouble("randomTradeCount3") >= 0.96) {
				entity.getPersistentData().putDouble("itemTradeCount3", 1);
			} else if (entity.getPersistentData().getDouble("randomTradeCount3") >= 0.83) {
				entity.getPersistentData().putDouble("itemTradeCount3", 2);
			} else if (entity.getPersistentData().getDouble("randomTradeCount3") >= 0.71) {
				entity.getPersistentData().putDouble("itemTradeCount3", 3);
			} else if (entity.getPersistentData().getDouble("randomTradeCount3") >= 0.52) {
				entity.getPersistentData().putDouble("itemTradeCount3", 4);
			} else if (entity.getPersistentData().getDouble("randomTradeCount3") >= 0.26) {
				entity.getPersistentData().putDouble("itemTradeCount3", 5);
			} else if (entity.getPersistentData().getDouble("randomTradeCount3") >= 0) {
				entity.getPersistentData().putDouble("itemTradeCount3", 6);
			}
		}
	}
}
