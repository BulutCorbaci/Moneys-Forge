
package blt.moneys.beta.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.Minecraft;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

import blt.moneys.beta.world.inventory.ReburnerBetaGUIMenu;

public class ReburnerBetaGUIScreen extends AbstractContainerScreen<ReburnerBetaGUIMenu> {
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public ReburnerBetaGUIScreen(ReburnerBetaGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("moneys:textures/reburner_beta_gui.png");

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

		RenderSystem.setShaderTexture(0, new ResourceLocation("moneys:textures/black_dye_je1_be116.png"));
		this.blit(ms, this.leftPos + 15, this.topPos + 25, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("moneys:textures/coal_je4_be316.png"));
		this.blit(ms, this.leftPos + 15, this.topPos + 52, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("moneys:textures/minecoin_rip16.png"));
		this.blit(ms, this.leftPos + 42, this.topPos + 25, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("moneys:textures/minecoin_rip16.png"));
		this.blit(ms, this.leftPos + 42, this.topPos + 52, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("moneys:textures/minecoin_rip16.png"));
		this.blit(ms, this.leftPos + 69, this.topPos + 25, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("moneys:textures/minecoin_rip16.png"));
		this.blit(ms, this.leftPos + 69, this.topPos + 52, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("moneys:textures/arrow.png"));
		this.blit(ms, this.leftPos + 15, this.topPos + 43, 0, 0, 16, 8, 16, 8);

		RenderSystem.setShaderTexture(0, new ResourceLocation("moneys:textures/arrow.png"));
		this.blit(ms, this.leftPos + 42, this.topPos + 43, 0, 0, 16, 8, 16, 8);

		RenderSystem.setShaderTexture(0, new ResourceLocation("moneys:textures/arrow.png"));
		this.blit(ms, this.leftPos + 69, this.topPos + 43, 0, 0, 16, 8, 16, 8);

		RenderSystem.setShaderTexture(0, new ResourceLocation("moneys:textures/arrow_side.png"));
		this.blit(ms, this.leftPos + 33, this.topPos + 52, 0, 0, 8, 16, 8, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("moneys:textures/arrow_side.png"));
		this.blit(ms, this.leftPos + 60, this.topPos + 52, 0, 0, 8, 16, 8, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("moneys:textures/arrowlong.png"));
		this.blit(ms, this.leftPos + 87, this.topPos + 43, 0, 0, 64, 24, 64, 24);

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
		drawString(poseStack, this.font, "Fuel", 15, 16, -12829636);
		drawString(poseStack, this.font, "Minecoins", 42, 16, -12829636);
		drawString(poseStack, this.font, "Output", 132, 16, -12829636);
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
	}
}
