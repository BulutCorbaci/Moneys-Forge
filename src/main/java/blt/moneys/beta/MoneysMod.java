/*
 *    MCreator note:
 *
 *    If you lock base mod element files, you can edit this file and it won't get overwritten.
 *    If you change your modid or package, you need to apply these changes to this file MANUALLY.
 *
 *    Settings in @Mod annotation WON'T be changed in case of the base mod element
 *    files lock too, so you need to set them manually here in such case.
 *
 *    If you do not lock base mod element files in Workspace settings, this file
 *    will be REGENERATED on each build.
 *
 */
package blt.moneys.beta;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import net.minecraftforge.network.simple.SimpleChannel;
import net.minecraftforge.network.NetworkRegistry;
import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.IEventBus;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.FriendlyByteBuf;

import java.util.function.Supplier;
import java.util.function.Function;
import java.util.function.BiConsumer;

import blt.moneys.beta.init.MoneysModTabs;
import blt.moneys.beta.init.MoneysModPotions;
import blt.moneys.beta.init.MoneysModMobEffects;
import blt.moneys.beta.init.MoneysModItems;
import blt.moneys.beta.init.MoneysModFeatures;
import blt.moneys.beta.init.MoneysModEntities;
import blt.moneys.beta.init.MoneysModBlocks;
import blt.moneys.beta.init.MoneysModBlockEntities;
import blt.moneys.beta.init.MoneysModBiomes;

@Mod("moneys")
public class MoneysMod {
	public static final Logger LOGGER = LogManager.getLogger(MoneysMod.class);
	public static final String MODID = "moneys";
	private static final String PROTOCOL_VERSION = "1";
	public static final SimpleChannel PACKET_HANDLER = NetworkRegistry.newSimpleChannel(new ResourceLocation(MODID, MODID), () -> PROTOCOL_VERSION,
			PROTOCOL_VERSION::equals, PROTOCOL_VERSION::equals);
	private static int messageID = 0;

	public MoneysMod() {
		MoneysModTabs.load();
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		MoneysModBlocks.REGISTRY.register(bus);
		MoneysModItems.REGISTRY.register(bus);
		MoneysModEntities.REGISTRY.register(bus);
		MoneysModBlockEntities.REGISTRY.register(bus);
		MoneysModFeatures.REGISTRY.register(bus);

		MoneysModMobEffects.REGISTRY.register(bus);
		MoneysModPotions.REGISTRY.register(bus);
		MoneysModBiomes.REGISTRY.register(bus);
	}

	public static <T> void addNetworkMessage(Class<T> messageType, BiConsumer<T, FriendlyByteBuf> encoder, Function<FriendlyByteBuf, T> decoder,
			BiConsumer<T, Supplier<NetworkEvent.Context>> messageConsumer) {
		PACKET_HANDLER.registerMessage(messageID, messageType, encoder, decoder, messageConsumer);
		messageID++;
	}
}
