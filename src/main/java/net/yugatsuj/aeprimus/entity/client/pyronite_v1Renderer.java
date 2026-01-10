package net.yugatsuj.aeprimus.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.layers.CrossedArmsItemLayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.yugatsuj.aeprimus.AePrimus;
import net.yugatsuj.aeprimus.entity.custom.pyronite_v1Entity;
import org.jetbrains.annotations.NotNull;
import static com.ibm.icu.impl.ValidIdentifiers.Datatype.variant;

// If you see this code and try to understand how it works. Good cuz i still dont

public class pyronite_v1Renderer extends MobRenderer<pyronite_v1Entity, EntityModel<pyronite_v1Entity>> {

    private final pyronite_v1<pyronite_v1Entity> v1AdultModel;
    private final pyronite_v1_baby<pyronite_v1Entity> v1BabyModel;

    private final pyronite_v2<pyronite_v1Entity> v2AdultModel;
    private final pyronite_v2_baby<pyronite_v1Entity> v2BabyModel;

    private final pyronite_v3<pyronite_v1Entity> v3AdultModel;
    private final pyronite_v3_baby<pyronite_v1Entity> v3BabyModel;

    public static final ResourceLocation TEXTURE = new ResourceLocation(AePrimus.MOD_ID, "textures/entity/pyronite/pyronite_v1.png");
    public static final ResourceLocation V1_BABY_TEXTURE = new ResourceLocation(AePrimus.MOD_ID, "textures/entity/pyronite/pyronite_v1_baby.png");
    public static final ResourceLocation NITWIT_TEXTURE = new ResourceLocation(AePrimus.MOD_ID, "textures/entity/pyronite/pyronite_nitwit.png");
    public static final ResourceLocation V1_BABY_NITWIT_TEXTURE = new ResourceLocation(AePrimus.MOD_ID, "textures/entity/pyronite/pyronite_baby_nitwit.png");
    public static final ResourceLocation CARTOGRAPHER_TEXTURE = new ResourceLocation(AePrimus.MOD_ID, "textures/entity/pyronite/pyronite_cartographer.png");
    public static final ResourceLocation CLERIC_TEXTURE = new ResourceLocation(AePrimus.MOD_ID, "textures/entity/pyronite/pyronite_cleric.png");
    public static final ResourceLocation ARMORER_TEXTURE = new ResourceLocation(AePrimus.MOD_ID, "textures/entity/pyronite/pyronite_armourer.png");
    public static final ResourceLocation WEAPONSMITH_TEXTURE = new ResourceLocation(AePrimus.MOD_ID, "textures/entity/pyronite/pyronite_weaponsmith.png");
    public static final ResourceLocation TOOLSMITH_TEXTURE = new ResourceLocation(AePrimus.MOD_ID, "textures/entity/pyronite/pyronite_toolsmith.png");
    public static final ResourceLocation MASON_TEXTURE = new ResourceLocation(AePrimus.MOD_ID, "textures/entity/pyronite/pyronite_mason.png");

    public static final ResourceLocation V2_TEXTURE = new ResourceLocation(AePrimus.MOD_ID, "textures/entity/pyronite/pyronite_v2.png");
    public static final ResourceLocation V2_NITWIT_TEXTURE = new ResourceLocation(AePrimus.MOD_ID, "textures/entity/pyronite/pyronite_v2_nitwit.png");
    public static final ResourceLocation V2_BABY_TEXTURE = new ResourceLocation(AePrimus.MOD_ID, "textures/entity/pyronite/pyronite_v2_baby.png");
    public static final ResourceLocation V2_NITWIT_BABY_TEXTURE = new ResourceLocation(AePrimus.MOD_ID, "textures/entity/pyronite/pyronite_v2_baby.png");
    public static final ResourceLocation V3_TEXTURE = new ResourceLocation(AePrimus.MOD_ID, "textures/entity/pyronite/pyronite_v3.png");
    public static final ResourceLocation V3_NITWIT_TEXTURE = new ResourceLocation(AePrimus.MOD_ID, "textures/entity/pyronite/pyronite_v3_nitwit.png");
    public static final ResourceLocation V3_BABY_TEXTURE = new ResourceLocation(AePrimus.MOD_ID, "textures/entity/pyronite/pyronite_v3_baby.png");
    public static final ResourceLocation V3_NITWIT_BABY_TEXTURE = new ResourceLocation(AePrimus.MOD_ID, "textures/entity/pyronite/pyronite_v3_baby_nitwit.png");

    public pyronite_v1Renderer(EntityRendererProvider.Context context) {
        super(context, new pyronite_v1<>(context.bakeLayer(ModModelLayers.PYRONITEV1_LAYER)), 0.5f);

        this.v1AdultModel = new pyronite_v1<>(context.bakeLayer(ModModelLayers.PYRONITEV1_LAYER));
        this.v1BabyModel = new pyronite_v1_baby<>(context.bakeLayer(ModModelLayers.PYRONITEV1_BABY_LAYER));

        this.v2AdultModel = new pyronite_v2<>(context.bakeLayer(ModModelLayers.PYRONITEV2_LAYER));
        this.v2BabyModel = new pyronite_v2_baby<>(context.bakeLayer(ModModelLayers.PYRONITEV2_BABY_LAYER));

        this.v3AdultModel = new pyronite_v3<>(context.bakeLayer(ModModelLayers.PYRONITEV3_LAYER));
        this.v3BabyModel = new pyronite_v3_baby<>(context.bakeLayer(ModModelLayers.PYRONITEV3_BABY_LAYER));

        this.addLayer(new CrossedArmsItemLayer<>(this, context.getItemInHandRenderer()));
    }

    // I still dont know how this works but it does

    @Override
    public void render(pyronite_v1Entity entity, float entityYaw, float partialTicks, PoseStack poseStack, MultiBufferSource buffer, int packedLight) {
        int variant = entity.getPyroniteVariant();
        boolean isBaby = entity.isBaby();
        VillagerProfession profession = entity.getVillagerData().getProfession();

        boolean hasProfession = !profession.equals(VillagerProfession.NONE) && !profession.equals(VillagerProfession.NITWIT);

        if (isBaby) {
            this.model = switch (variant) {
                case 1 -> v2BabyModel;
                case 2 -> v3BabyModel;
                default -> v1BabyModel;
            };
        } else {
            if (hasProfession) {
                this.model = v1AdultModel;
            } else {
                this.model = switch (variant) {
                    case 1 -> v2AdultModel;
                    case 2 -> v3AdultModel;
                    default -> v1AdultModel;
                };
            }
        }

        float scale = isBaby ? 0.5f : 0.9375f;
        poseStack.scale(scale, scale, scale);
        this.shadowRadius = isBaby ? 0.25f : 0.5f;

        super.render(entity, entityYaw, partialTicks, poseStack, buffer, packedLight);
    }
    @Override
    public @NotNull ResourceLocation getTextureLocation(pyronite_v1Entity entity) {
        VillagerProfession profession = entity.getVillagerData().getProfession();
        int variant = entity.getPyroniteVariant();

        if (entity.isBaby()) {
            if (profession.equals(VillagerProfession.NITWIT)) {
                return switch(variant) {
                    case 1 -> V2_NITWIT_BABY_TEXTURE;
                    case 2 -> V3_NITWIT_BABY_TEXTURE;
                    default -> V1_BABY_NITWIT_TEXTURE;
                };
            }
            return switch (variant) {
                case 1 -> V2_BABY_TEXTURE;
                case 2 -> V3_BABY_TEXTURE;
                default -> V1_BABY_TEXTURE;
            };
        }

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
        } else if (profession.equals(VillagerProfession.NITWIT))
            return switch (variant) {
            case 1 -> V2_NITWIT_TEXTURE;
            case 2 -> V3_NITWIT_TEXTURE;
            default -> NITWIT_TEXTURE;
        };

        return switch (variant) {
            case 1 -> V2_TEXTURE;
            case 2 -> V3_TEXTURE;
            default -> TEXTURE;
        };
    }
}