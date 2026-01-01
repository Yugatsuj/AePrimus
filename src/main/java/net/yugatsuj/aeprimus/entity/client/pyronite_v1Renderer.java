package net.yugatsuj.aeprimus.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.layers.CrossedArmsItemLayer;
import net.minecraft.client.renderer.entity.layers.CustomHeadLayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.resources.Resource;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.yugatsuj.aeprimus.AePrimus;
import net.yugatsuj.aeprimus.entity.custom.pyronite_v1Entity;
import org.jetbrains.annotations.NotNull;

public class pyronite_v1Renderer extends MobRenderer<pyronite_v1Entity, pyronite_v1<pyronite_v1Entity>> {

    public static final ResourceLocation TEXTURE = new ResourceLocation(AePrimus.MOD_ID, "textures/entity/pyronite/pyronite_v1.png");
    public static final ResourceLocation NITWIT_TEXTURE = new ResourceLocation(AePrimus.MOD_ID, "textures/entity/pyronite/pyronite_nitwit.png");
    public static final ResourceLocation CARTOGRAPHER_TEXTURE = new ResourceLocation(AePrimus.MOD_ID, "textures/entity/pyronite/pyronite_cartographer.png");
    public static final ResourceLocation CLERIC_TEXTURE = new ResourceLocation(AePrimus.MOD_ID, "textures/entity/pyronite/pyronite_cleric.png");
    public static final ResourceLocation ARMORER_TEXTURE = new ResourceLocation(AePrimus.MOD_ID, "textures/entity/pyronite/pyronite_armourer.png");
    public static final ResourceLocation WEAPONSMITH_TEXTURE = new ResourceLocation(AePrimus.MOD_ID, "textures/entity/pyronite/pyronite_weaponsmith.png");
    public static final ResourceLocation TOOLSMITH_TEXTURE = new ResourceLocation(AePrimus.MOD_ID, "textures/entity/pyronite/pyronite_toolsmith.png");
    public static final ResourceLocation MASON_TEXTURE = new ResourceLocation(AePrimus.MOD_ID, "textures/entity/pyronite/pyronite_mason.png");

    public pyronite_v1Renderer(EntityRendererProvider.Context context) {
        super(context, new pyronite_v1<>(context.bakeLayer(ModModelLayers.PYRONITEV1_LAYER)), 0.5f);
        this.addLayer(new CrossedArmsItemLayer<>(this, context.getItemInHandRenderer()));
    }

    @Override
    public @NotNull ResourceLocation getTextureLocation(pyronite_v1Entity entity) {
        VillagerProfession profession = entity.getVillagerData().getProfession();
        if (profession.equals(VillagerProfession.ARMORER)) {
            return ARMORER_TEXTURE;
        } else if (profession.equals(VillagerProfession.CARTOGRAPHER)) {
            return CARTOGRAPHER_TEXTURE;
        } else if (profession.equals(VillagerProfession.CLERIC)) {
            return CLERIC_TEXTURE;
        } else if (profession.equals(VillagerProfession.MASON)) {
            return MASON_TEXTURE;
        } else if (profession.equals(VillagerProfession.TOOLSMITH)) {
            return TOOLSMITH_TEXTURE;
        } else if (profession.equals(VillagerProfession.WEAPONSMITH)) {
            return WEAPONSMITH_TEXTURE;
        } else if(profession.equals(VillagerProfession.NITWIT)) {
            return NITWIT_TEXTURE;
        } else {
            return TEXTURE;
        }
    }

    @Override
    public void render(pyronite_v1Entity entity, float entityYaw, float partialTicks, PoseStack poseStack, MultiBufferSource buffer, int packedLight) {
        float g = 0.9375f;
        if (entity.isBaby()) {
            g *= 0.5f;
            this.shadowRadius = 0.25f;
        } else {
            this.shadowRadius = 0.5f;
        }
        poseStack.scale(g, g, g);

        super.render(entity, entityYaw, partialTicks, poseStack, buffer, packedLight);
    }
}