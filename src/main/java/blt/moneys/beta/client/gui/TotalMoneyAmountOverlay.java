
package blt.moneys.beta.client.gui;

import org.checkerframework.checker.units.qual.h;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.client.Minecraft;

import blt.moneys.beta.network.MoneysModVariables;

@Mod.EventBusSubscriber({Dist.CLIENT})
public class TotalMoneyAmountOverlay {
	@SubscribeEvent(priority = EventPriority.NORMAL)
	public static void eventHandler(RenderGameOverlayEvent.Pre event) {
		if (event.getType() == RenderGameOverlayEvent.ElementType.ALL) {
			int w = event.getWindow().getGuiScaledWidth();
			int h = event.getWindow().getGuiScaledHeight();
			int posX = w / 2;
			int posY = h / 2;
			Level _world = null;
			double _x = 0;
			double _y = 0;
			double _z = 0;
			Player entity = Minecraft.getInstance().player;
			if (entity != null) {
				_world = entity.level;
				_x = entity.getX();
				_y = entity.getY();
				_z = entity.getZ();
			}
			Level world = _world;
			double x = _x;
			double y = _y;
			double z = _z;
			if (true) {
				Minecraft
						.getInstance().font
								.draw(event.getMatrixStack(),
										"" + (int) ((entity.getCapability(MoneysModVariables.PLAYER_VARIABLES_CAPABILITY, null)
												.orElse(new MoneysModVariables.PlayerVariables())).totalmoneyonplayer) + "",
										posX + 94, posY + 107, -6710887);
				Minecraft.getInstance().font.draw(event.getMatrixStack(), "Total Money Amount", posX + 94, posY + 98, -6710887);
			}
		}
	}
}
