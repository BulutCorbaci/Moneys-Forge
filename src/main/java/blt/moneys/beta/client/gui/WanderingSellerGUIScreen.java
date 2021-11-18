
package blt.moneys.beta.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.Minecraft;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

import blt.moneys.beta.world.inventory.WanderingSellerGUIMenu;
import blt.moneys.beta.network.WanderingSellerGUIButtonMessage;
import blt.moneys.beta.network.MoneysModVariables;
import blt.moneys.beta.MoneysMod;

public class WanderingSellerGUIScreen extends AbstractContainerScreen<WanderingSellerGUIMenu> {
	public final static HashMap<String, Object> guistate = new HashMap<>();
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public WanderingSellerGUIScreen(WanderingSellerGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("moneys:textures/wandering_seller_gui.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		RenderSystem.setShaderTexture(0, texture);
		this.blit(ms, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		RenderSystem.setShaderTexture(0, new ResourceLocation("moneys:textures/arrow_side.png"));
		this.blit(ms, this.leftPos + 60, this.topPos + 34, 0, 0, 8, 16, 8, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("moneys:textures/arrow_side.png"));
		this.blit(ms, this.leftPos + 78, this.topPos + 34, 0, 0, 8, 16, 8, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("moneys:textures/arrow_side.png"));
		this.blit(ms, this.leftPos + 96, this.topPos + 34, 0, 0, 8, 16, 8, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("moneys:textures/arrow_side.png"));
		this.blit(ms, this.leftPos + 69, this.topPos + 34, 0, 0, 8, 16, 8, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("moneys:textures/arrow_side.png"));
		this.blit(ms, this.leftPos + 87, this.topPos + 34, 0, 0, 8, 16, 8, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("moneys:textures/arrow_side.png"));
		this.blit(ms, this.leftPos + 105, this.topPos + 34, 0, 0, 8, 16, 8, 16);

		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
		drawString(poseStack, this.font, "Input", 15, 43, -6710887);
		drawString(poseStack, this.font, "Output", 132, 43, -6710887);
		drawString(poseStack, this.font, "", 6, 7, -12829636);
		drawString(poseStack, this.font, "" + (int) ((entity.getCapability(MoneysModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new MoneysModVariables.PlayerVariables())).PageNumberTrade) + "", 87, 52, -6710887);
		drawString(poseStack, this.font, "" + ((entity.getCapability(MoneysModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new MoneysModVariables.PlayerVariables())).pagenumberminecoin) + "", 6, 7, -6710887);
		drawString(poseStack, this.font, "For", 6, 16, -6710887);
		drawString(poseStack, this.font, "" + ((entity.getCapability(MoneysModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new MoneysModVariables.PlayerVariables())).tradeitemname) + "", 24, 25, -6710887);
		drawString(poseStack, this.font, "" + (int) ((entity.getCapability(MoneysModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new MoneysModVariables.PlayerVariables())).tradeitemcount) + "", 6, 25, -6710887);
	}

	@Override
	public void onClose() {
		super.onClose();
		Minecraft.getInstance().keyboardHandler.setSendRepeatsToGui(false);
	}

	@Override
	public void init() {
		super.init();
		this.minecraft.keyboardHandler.setSendRepeatsToGui(true);
		this.addRenderableWidget(new Button(this.leftPos + 24, this.topPos + 61, 56, 20, new TextComponent("< Back"), e -> {
			if (true) {
				MoneysMod.PACKET_HANDLER.sendToServer(new WanderingSellerGUIButtonMessage(0, x, y, z));
				WanderingSellerGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 96, this.topPos + 61, 56, 20, new TextComponent("Next >"), e -> {
			if (true) {
				MoneysMod.PACKET_HANDLER.sendToServer(new WanderingSellerGUIButtonMessage(1, x, y, z));
				WanderingSellerGUIButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}));
	}
}
