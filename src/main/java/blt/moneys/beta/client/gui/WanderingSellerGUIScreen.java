
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
		int k = (this.width - this.imageWidth) / 2;
		int l = (this.height - this.imageHeight) / 2;
		this.blit(ms, k, l, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		RenderSystem.setShaderTexture(0, new ResourceLocation("moneys:textures/arrow_side.png"));
		this.blit(ms, 186, 62, 0, 0, 8, 16, 8, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("moneys:textures/arrow_side.png"));
		this.blit(ms, 204, 62, 0, 0, 8, 16, 8, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("moneys:textures/arrow_side.png"));
		this.blit(ms, 222, 62, 0, 0, 8, 16, 8, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("moneys:textures/arrow_side.png"));
		this.blit(ms, 195, 62, 0, 0, 8, 16, 8, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("moneys:textures/arrow_side.png"));
		this.blit(ms, 213, 62, 0, 0, 8, 16, 8, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("moneys:textures/arrow_side.png"));
		this.blit(ms, 231, 62, 0, 0, 8, 16, 8, 16);

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
		drawString(poseStack, this.font, "Input", 141 - this.leftPos, 62 - this.topPos, -12829636);
		drawString(poseStack, this.font, "Output", 258 - this.leftPos, 62 - this.topPos, -12829636);
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
		this.addRenderableWidget(new Button(150, 98, 56, 20, new TextComponent("< Back"), e -> {
		}));
		this.addRenderableWidget(new Button(222, 98, 56, 20, new TextComponent("Next >"), e -> {
		}));
	}
}
