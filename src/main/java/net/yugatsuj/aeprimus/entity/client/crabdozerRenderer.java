package net.yugatsuj.aeprimus.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import net.yugatsuj.aeprimus.AePrimus;
import net.yugatsuj.aeprimus.entity.custom.crabdozerEntity;

public class crabdozerRenderer extends MobRenderer<crabdozerEntity, crabdozer<crabdozerEntity>> {
    public crabdozerRenderer(EntityRendererProvider.Context context) {
        super(context, new crabdozer<>(context.bakeLayer(ModModelLayers.CRABDOZER_LAYER)), 2f);
    }

    @Override
    public ResourceLocation getTextureLocation(crabdozerEntity entity) {
        if (entity.isTame()) {
            return new ResourceLocation(AePrimus.MOD_ID, "textures/entity/crabdozer_tamed.png");
        }
        return new ResourceLocation(AePrimus.MOD_ID, "textures/entity/crabdozer.png");
    }

    @Override
    public void render(crabdozerEntity p_entity, float entityYaw, float partialTicks, PoseStack poseStack, MultiBufferSource buffer, int packedLight) {
        super.render(p_entity, entityYaw, partialTicks, poseStack, buffer, packedLight);
    }
}
