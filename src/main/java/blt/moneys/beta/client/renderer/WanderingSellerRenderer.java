package blt.moneys.beta.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.VillagerModel;

import blt.moneys.beta.entity.WanderingSellerEntity;

public class WanderingSellerRenderer extends MobRenderer<WanderingSellerEntity, VillagerModel<WanderingSellerEntity>> {
	public WanderingSellerRenderer(EntityRendererProvider.Context context) {
		super(context, new VillagerModel(context.bakeLayer(ModelLayers.VILLAGER)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(WanderingSellerEntity entity) {
		return new ResourceLocation("moneys:textures/wandering_seller.png");
	}
}
