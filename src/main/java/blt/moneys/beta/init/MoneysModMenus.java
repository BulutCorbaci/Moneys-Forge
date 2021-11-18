
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package blt.moneys.beta.init;

import net.minecraftforge.fmllegacy.network.IContainerFactory;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.inventory.AbstractContainerMenu;

import java.util.List;
import java.util.ArrayList;

import blt.moneys.beta.world.inventory.WanderingSellerGUIMenu;
import blt.moneys.beta.world.inventory.ReturnerGUIMenu;
import blt.moneys.beta.world.inventory.ReburnerBetaGUIMenu;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MoneysModMenus {
	private static final List<MenuType<?>> REGISTRY = new ArrayList<>();
	public static final MenuType<ReburnerBetaGUIMenu> REBURNER_BETA_GUI = register("reburner_beta_gui",
			(id, inv, extraData) -> new ReburnerBetaGUIMenu(id, inv, extraData));
	public static final MenuType<WanderingSellerGUIMenu> WANDERING_SELLER_GUI = register("wandering_seller_gui",
			(id, inv, extraData) -> new WanderingSellerGUIMenu(id, inv, extraData));
	public static final MenuType<ReturnerGUIMenu> RETURNER_GUI = register("returner_gui",
			(id, inv, extraData) -> new ReturnerGUIMenu(id, inv, extraData));

	private static <T extends AbstractContainerMenu> MenuType<T> register(String registryname, IContainerFactory<T> containerFactory) {
		MenuType<T> menuType = new MenuType<T>(containerFactory);
		menuType.setRegistryName(registryname);
		REGISTRY.add(menuType);
		return menuType;
	}

	@SubscribeEvent
	public static void registerContainers(RegistryEvent.Register<MenuType<?>> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new MenuType[0]));
	}
}
