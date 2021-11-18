
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package blt.moneys.beta.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import blt.moneys.beta.client.gui.WanderingSellerGUIScreen;
import blt.moneys.beta.client.gui.ReturnerGUIScreen;
import blt.moneys.beta.client.gui.ReburnerBetaGUIScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class MoneysModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(MoneysModMenus.REBURNER_BETA_GUI, ReburnerBetaGUIScreen::new);
			MenuScreens.register(MoneysModMenus.WANDERING_SELLER_GUI, WanderingSellerGUIScreen::new);
			MenuScreens.register(MoneysModMenus.RETURNER_GUI, ReturnerGUIScreen::new);
		});
	}
}
