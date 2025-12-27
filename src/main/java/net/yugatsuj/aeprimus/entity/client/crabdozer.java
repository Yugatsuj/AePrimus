package net.yugatsuj.aeprimus.entity.client;// Made with Blockbench 5.0.5
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import net.yugatsuj.aeprimus.entity.animations.ModAnimationDefinitions;
import net.yugatsuj.aeprimus.entity.custom.crabdozerEntity;

public class crabdozer<T extends Entity> extends HierarchicalModel<T> {
    // This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "crabdozer"), "main");
    private final ModelPart crabdozer;
    private final ModelPart RightLegs;
    private final ModelPart BackRightLeg;
    private final ModelPart FrontRightLeg;
    private final ModelPart JointRight;
    private final ModelPart MiddleRightLeg;
    private final ModelPart LeftLegs;
    private final ModelPart FrontLeftLeg;
    private final ModelPart JointLeft;
    private final ModelPart MiddleLeftLeg;
    private final ModelPart BackLeftLeg;
    private final ModelPart Body;
    private final ModelPart Head;
    private final ModelPart jaw;
    private final ModelPart eyes;

    public crabdozer(ModelPart root) {
        this.crabdozer = root.getChild("crabdozer");
        this.RightLegs = this.crabdozer.getChild("RightLegs");
        this.BackRightLeg = this.RightLegs.getChild("BackRightLeg");
        this.FrontRightLeg = this.RightLegs.getChild("FrontRightLeg");
        this.JointRight = this.FrontRightLeg.getChild("JointRight");
        this.MiddleRightLeg = this.RightLegs.getChild("MiddleRightLeg");
        this.LeftLegs = this.crabdozer.getChild("LeftLegs");
        this.FrontLeftLeg = this.LeftLegs.getChild("FrontLeftLeg");
        this.JointLeft = this.FrontLeftLeg.getChild("JointLeft");
        this.MiddleLeftLeg = this.LeftLegs.getChild("MiddleLeftLeg");
        this.BackLeftLeg = this.LeftLegs.getChild("BackLeftLeg");
        this.Body = this.crabdozer.getChild("Body");
        this.Head = this.Body.getChild("Head");
        this.jaw = this.Head.getChild("jaw");
        this.eyes = this.Head.getChild("eyes");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition crabdozer = partdefinition.addOrReplaceChild("crabdozer", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

        PartDefinition RightLegs = crabdozer.addOrReplaceChild("RightLegs", CubeListBuilder.create(), PartPose.offset(-22.86F, -40.915F, 19.0F));

        PartDefinition BackRightLeg = RightLegs.addOrReplaceChild("BackRightLeg", CubeListBuilder.create().texOffs(417, 121).addBox(1.9469F, -11.7127F, -8.5F, 16.0F, 16.0F, 15.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, 0.925F, 60.0F));

        PartDefinition cube_r1 = BackRightLeg.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(456, 420).addBox(-24.0F, -6.0F, -1.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(456, 428).addBox(-24.0F, -6.0F, 1.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(456, 436).addBox(-22.0F, -6.0F, 1.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(464, 152).addBox(-22.0F, -6.0F, -1.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(456, 112).addBox(-15.0F, -6.0F, 1.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(456, 352).addBox(-15.0F, -6.0F, -1.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(264, 480).addBox(-13.0F, -6.0F, -1.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(480, 264).addBox(-13.0F, -6.0F, 1.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(432, 152).addBox(-6.0F, -6.0F, 5.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(440, 112).addBox(-4.0F, -6.0F, 5.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(328, 440).addBox(-4.0F, -6.0F, 7.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(448, 152).addBox(-6.0F, -6.0F, 7.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(424, 112).addBox(-4.0F, -6.0F, -7.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(416, 152).addBox(-4.0F, -6.0F, -5.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(408, 256).addBox(-6.0F, -6.0F, -5.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(344, 392).addBox(-6.0F, -6.0F, -7.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(144, 188).addBox(-26.0F, -4.0F, -10.0F, 48.0F, 8.0F, 24.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-33.2572F, 14.6628F, -2.0F, 0.0F, 0.0F, -1.3963F));

        PartDefinition cube_r2 = BackRightLeg.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(184, 440).mirror().addBox(-4.0F, -19.0F, -9.0F, 8.0F, 20.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-29.0F, 8.0F, 0.0F, 0.0F, 1.5708F, -0.3927F));

        PartDefinition cube_r3 = BackRightLeg.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(224, 80).addBox(-11.0F, -12.0F, -6.7F, 20.0F, 16.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-21.2572F, 14.6628F, -2.0F, 0.0F, 0.0F, -0.1309F));

        PartDefinition cube_r4 = BackRightLeg.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(344, 264).addBox(-16.0F, -12.0F, -7.0F, 28.0F, 16.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 5.0F, -2.0F, 0.0F, 0.0F, -0.6109F));

        PartDefinition FrontRightLeg = RightLegs.addOrReplaceChild("FrontRightLeg", CubeListBuilder.create().texOffs(368, 360).addBox(-42.048F, 7.5637F, -9.0F, 20.0F, 20.0F, 20.0F, new CubeDeformation(0.0F))
                .texOffs(217, 221).addBox(2.5232F, -14.0567F, -9.3F, 44.0F, 20.0F, 19.0F, new CubeDeformation(0.0F)), PartPose.offset(-12.0F, -4.0F, -41.0F));

        PartDefinition cube_r5 = FrontRightLeg.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(216, 220).addBox(-36.0F, -14.0F, -8.8F, 44.0F, 20.0F, 20.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, 2.0F, -1.0F, 0.0F, 0.0F, -0.6109F));

        PartDefinition JointRight = FrontRightLeg.addOrReplaceChild("JointRight", CubeListBuilder.create().texOffs(0, 260).mirror().addBox(-6.048F, -37.4184F, -41.7183F, 28.0F, 64.0F, 16.0F, new CubeDeformation(0.0F)).mirror(false)
                .texOffs(416, 0).mirror().addBox(-6.048F, 18.5816F, -25.7183F, 28.0F, 8.0F, 12.0F, new CubeDeformation(0.0F)).mirror(false)
                .texOffs(424, 76).mirror().addBox(-6.048F, 10.5816F, -13.7183F, 28.0F, 16.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-40.0F, 18.0F, -8.0F));

        PartDefinition cube_r6 = JointRight.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(80, 456).addBox(-5.0F, -20.0F, -8.0F, 8.0F, 20.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(9.0F, 10.0F, -33.0F, 0.7418F, 0.0F, 0.0F));

        PartDefinition cube_r7 = JointRight.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(328, 448).addBox(-6.9F, -24.0F, -10.0F, 12.0F, 24.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(9.0F, -18.0F, -33.0F, 0.7418F, 0.0F, 0.0F));

        PartDefinition cube_r8 = JointRight.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(216, 220).addBox(-36.0F, -14.0F, -8.5F, 44.0F, 20.0F, 20.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.352F, -16.0F, -27.048F, -1.5708F, 0.9599F, -1.5708F));

        PartDefinition MiddleRightLeg = RightLegs.addOrReplaceChild("MiddleRightLeg", CubeListBuilder.create().texOffs(153, 409).addBox(-1.3297F, -9.4184F, -7.5F, 20.0F, 16.0F, 15.0F, new CubeDeformation(0.0F)), PartPose.offset(-4.0F, 0.1F, 7.0F));

        PartDefinition cube_r9 = MiddleRightLeg.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(480, 216).addBox(-22.0F, -18.0F, -53.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(480, 224).addBox(-22.0F, -18.0F, -51.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(232, 480).addBox(-24.0F, -18.0F, -51.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(480, 232).addBox(-24.0F, -18.0F, -53.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(480, 192).addBox(-24.0F, -18.0F, -41.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(480, 200).addBox(-24.0F, -18.0F, -43.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(480, 208).addBox(-22.0F, -18.0F, -43.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(216, 480).addBox(-22.0F, -18.0F, -41.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-17.272F, -6.8888F, 45.0F, 0.0F, 0.0F, -1.3963F));

        PartDefinition cube_r10 = MiddleRightLeg.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(144, 480).addBox(-22.0F, -18.0F, -53.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(480, 144).addBox(-22.0F, -18.0F, -51.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(480, 152).addBox(-24.0F, -18.0F, -53.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(160, 480).addBox(-24.0F, -18.0F, -51.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-19.5294F, 5.9137F, 50.0F, 0.0F, 0.0F, -1.3963F));

        PartDefinition cube_r11 = MiddleRightLeg.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(192, 300).addBox(-26.0F, -4.0F, -9.0F, 44.0F, 8.0F, 20.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-33.2572F, 14.6628F, -1.0F, 0.0F, 0.0F, -1.3963F));

        PartDefinition cube_r12 = MiddleRightLeg.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(408, 224).addBox(-11.0F, -12.0F, -6.9F, 20.0F, 16.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-21.2572F, 14.6628F, -1.0F, 0.0F, 0.0F, -0.1309F));

        PartDefinition cube_r13 = MiddleRightLeg.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(72, 392).addBox(-16.0F, -12.0F, -7.0F, 24.0F, 16.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 5.0F, -1.0F, 0.0F, 0.0F, -0.6109F));

        PartDefinition LeftLegs = crabdozer.addOrReplaceChild("LeftLegs", CubeListBuilder.create(), PartPose.offset(25.14F, -40.915F, 19.0F));

        PartDefinition FrontLeftLeg = LeftLegs.addOrReplaceChild("FrontLeftLeg", CubeListBuilder.create().texOffs(217, 221).mirror().addBox(-47.6431F, -14.0567F, -9.3F, 44.0F, 20.0F, 19.0F, new CubeDeformation(0.0F)).mirror(false)
                .texOffs(368, 360).mirror().addBox(20.928F, 7.5637F, -9.7F, 20.0F, 20.0F, 20.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(12.0F, -4.0F, -41.0F));

        PartDefinition cube_r14 = FrontLeftLeg.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(216, 220).mirror().addBox(-8.0F, -14.0F, -8.8F, 44.0F, 20.0F, 20.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.12F, 2.0F, -1.0F, 0.0F, 0.0F, 0.6109F));

        PartDefinition JointLeft = FrontLeftLeg.addOrReplaceChild("JointLeft", CubeListBuilder.create().texOffs(0, 260).addBox(-23.072F, -37.4184F, -41.7183F, 28.0F, 64.0F, 16.0F, new CubeDeformation(0.0F))
                .texOffs(416, 0).addBox(-23.072F, 18.5816F, -25.7183F, 28.0F, 8.0F, 12.0F, new CubeDeformation(0.0F))
                .texOffs(424, 76).mirror().addBox(-23.072F, 10.5816F, -13.7183F, 28.0F, 16.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(40.0F, 18.0F, -8.0F));

        PartDefinition cube_r15 = JointLeft.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(80, 456).addBox(-3.0F, -20.0F, -8.0F, 8.0F, 20.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-10.12F, 10.0F, -33.0F, 0.7418F, 0.0F, 0.0F));

        PartDefinition cube_r16 = JointLeft.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(328, 448).addBox(-5.1F, -24.0F, -10.0F, 12.0F, 24.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-10.12F, -18.0F, -33.0F, 0.7418F, 0.0F, 0.0F));

        PartDefinition cube_r17 = JointLeft.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(216, 220).mirror().addBox(-8.0F, -14.0F, -8.5F, 44.0F, 20.0F, 20.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-7.472F, -16.0F, -27.048F, -1.5708F, -0.9599F, 1.5708F));

        PartDefinition MiddleLeftLeg = LeftLegs.addOrReplaceChild("MiddleLeftLeg", CubeListBuilder.create().texOffs(409, 193).addBox(-21.7903F, -9.3184F, -7.5F, 20.0F, 16.0F, 15.0F, new CubeDeformation(0.0F)), PartPose.offset(6.0F, 0.0F, 7.0F));

        PartDefinition cube_r18 = MiddleLeftLeg.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(480, 288).addBox(18.0F, -18.0F, -53.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(480, 280).addBox(18.0F, -18.0F, -51.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(480, 256).addBox(20.0F, -18.0F, -51.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(480, 248).addBox(20.0F, -18.0F, -53.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(248, 480).addBox(20.0F, -18.0F, -41.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(480, 240).addBox(20.0F, -18.0F, -43.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(280, 480).addBox(18.0F, -18.0F, -43.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(480, 272).addBox(18.0F, -18.0F, -41.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(14.152F, -6.7888F, 45.0F, 0.0F, 0.0F, 1.3963F));

        PartDefinition cube_r19 = MiddleLeftLeg.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(480, 184).addBox(18.0F, -18.0F, -53.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(480, 176).addBox(18.0F, -18.0F, -51.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(480, 168).addBox(20.0F, -18.0F, -53.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(480, 160).addBox(20.0F, -18.0F, -51.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(16.4094F, 6.0137F, 50.0F, 0.0F, 0.0F, 1.3963F));

        PartDefinition cube_r20 = MiddleLeftLeg.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(192, 300).mirror().addBox(-18.0F, -4.0F, -9.0F, 44.0F, 8.0F, 20.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(30.1372F, 14.7628F, -1.0F, 0.0F, 0.0F, 1.3963F));

        PartDefinition cube_r21 = MiddleLeftLeg.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(408, 224).mirror().addBox(-9.0F, -12.0F, -6.9F, 20.0F, 16.0F, 16.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(18.1372F, 14.7628F, -1.0F, 0.0F, 0.0F, 0.1309F));

        PartDefinition cube_r22 = MiddleLeftLeg.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(72, 392).mirror().addBox(-8.0F, -12.0F, -7.0F, 24.0F, 16.0F, 16.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.12F, 5.1F, -1.0F, 0.0F, 0.0F, 0.6109F));

        PartDefinition BackLeftLeg = LeftLegs.addOrReplaceChild("BackLeftLeg", CubeListBuilder.create().texOffs(73, 425).addBox(-19.0669F, -11.7127F, -8.5F, 16.0F, 16.0F, 15.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, 0.0F, 60.0F));

        PartDefinition cube_r23 = BackLeftLeg.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(0, 476).addBox(20.0F, -6.0F, -1.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(472, 468).addBox(20.0F, -6.0F, 1.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(472, 460).addBox(18.0F, -6.0F, 1.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(472, 452).addBox(18.0F, -6.0F, -1.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(472, 444).addBox(11.0F, -6.0F, 1.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(472, 436).addBox(11.0F, -6.0F, -1.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(472, 428).addBox(9.0F, -6.0F, -1.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(472, 420).addBox(9.0F, -6.0F, 1.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(472, 412).addBox(2.0F, -6.0F, 5.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(472, 404).addBox(0.0F, -6.0F, 5.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(472, 396).addBox(0.0F, -6.0F, 7.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(472, 352).addBox(2.0F, -6.0F, 7.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(472, 112).addBox(0.0F, -6.0F, -7.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(200, 468).addBox(0.0F, -6.0F, -5.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(184, 468).addBox(2.0F, -6.0F, -5.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(112, 468).addBox(2.0F, -6.0F, -7.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(144, 188).mirror().addBox(-22.0F, -4.0F, -10.0F, 48.0F, 8.0F, 24.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(32.1372F, 14.6628F, -2.0F, 0.0F, 0.0F, 1.3963F));

        PartDefinition cube_r24 = BackLeftLeg.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(184, 440).addBox(-4.0F, -19.0F, -9.0F, 8.0F, 20.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(27.88F, 8.0F, 0.0F, 0.0F, -1.5708F, 0.3927F));

        PartDefinition cube_r25 = BackLeftLeg.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(224, 80).mirror().addBox(-9.0F, -12.0F, -6.7F, 20.0F, 16.0F, 16.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(20.1372F, 14.6628F, -2.0F, 0.0F, 0.0F, 0.1309F));

        PartDefinition cube_r26 = BackLeftLeg.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(344, 264).mirror().addBox(-12.0F, -12.0F, -7.0F, 28.0F, 16.0F, 16.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.12F, 5.0F, -2.0F, 0.0F, 0.0F, 0.6109F));

        PartDefinition Body = crabdozer.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(152, 112).addBox(-18.0F, -17.0F, 40.0F, 36.0F, 40.0F, 36.0F, new CubeDeformation(0.0F))
                .texOffs(0, 112).addBox(-24.0F, -26.0F, -8.0F, 48.0F, 48.0F, 28.0F, new CubeDeformation(0.0F))
                .texOffs(0, 0).addBox(-28.0F, -32.0F, -64.0F, 56.0F, 56.0F, 56.0F, new CubeDeformation(0.0F))
                .texOffs(88, 300).addBox(-16.0F, -12.0F, 20.0F, 32.0F, 32.0F, 20.0F, new CubeDeformation(0.0F))
                .texOffs(296, 328).addBox(28.0F, -15.0F, -57.0F, 4.0F, 32.0F, 32.0F, new CubeDeformation(0.0F))
                .texOffs(296, 328).mirror().addBox(-33.12F, -15.0F, -57.0F, 4.0F, 32.0F, 32.0F, new CubeDeformation(0.0F)).mirror(false)
                .texOffs(352, 0).addBox(32.0F, -13.0F, -55.0F, 4.0F, 28.0F, 28.0F, new CubeDeformation(0.0F))
                .texOffs(352, 0).mirror().addBox(-36.0F, -13.0F, -55.0F, 4.0F, 28.0F, 28.0F, new CubeDeformation(0.0F)).mirror(false)
                .texOffs(232, 376).addBox(24.0F, -7.0F, -5.0F, 4.0F, 24.0F, 24.0F, new CubeDeformation(0.0F))
                .texOffs(232, 376).mirror().addBox(-28.0F, -7.0F, -5.0F, 4.0F, 24.0F, 24.0F, new CubeDeformation(0.0F)).mirror(false)
                .texOffs(432, 256).addBox(26.0F, -5.0F, -3.0F, 4.0F, 20.0F, 20.0F, new CubeDeformation(0.0F))
                .texOffs(432, 256).mirror().addBox(-30.0F, -5.0F, -3.0F, 4.0F, 20.0F, 20.0F, new CubeDeformation(0.0F)).mirror(false)
                .texOffs(344, 400).mirror().addBox(16.0F, -7.0F, 47.0F, 4.0F, 24.0F, 24.0F, new CubeDeformation(0.0F)).mirror(false)
                .texOffs(344, 400).addBox(-20.0F, -7.0F, 47.0F, 4.0F, 24.0F, 24.0F, new CubeDeformation(0.0F))
                .texOffs(280, 440).addBox(18.0F, -5.0F, 49.0F, 4.0F, 20.0F, 20.0F, new CubeDeformation(0.0F))
                .texOffs(280, 440).mirror().addBox(-22.0F, -5.0F, 49.0F, 4.0F, 20.0F, 20.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(1.14F, -46.615F, 19.0F));

        PartDefinition cube_r27 = Body.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(424, 476).addBox(24.0F, -6.0F, 19.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(440, 476).addBox(27.0F, -6.0F, 19.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(456, 476).addBox(27.0F, -6.0F, 22.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(472, 476).addBox(24.0F, -6.0F, 22.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(480, 120).addBox(24.0F, -6.0F, 43.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(128, 480).addBox(27.0F, -6.0F, 43.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(480, 128).addBox(24.0F, -6.0F, 46.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(480, 136).addBox(27.0F, -6.0F, 46.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-14.12F, 17.0F, 24.0F, 0.0F, 0.0F, -1.5708F));

        PartDefinition cube_r28 = Body.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(200, 476).addBox(-31.0F, -6.0F, 19.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(376, 476).addBox(-31.0F, -6.0F, 22.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(392, 476).addBox(-28.0F, -6.0F, 22.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(408, 476).addBox(-28.0F, -6.0F, 19.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(16, 476).addBox(-28.0F, -6.0F, 46.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(32, 476).addBox(-28.0F, -6.0F, 43.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(112, 476).addBox(-31.0F, -6.0F, 43.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(184, 476).addBox(-31.0F, -6.0F, 46.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(14.0F, 17.0F, 24.0F, 0.0F, 0.0F, 1.5708F));

        PartDefinition cube_r29 = Body.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(184, 440).addBox(-4.0F, -20.0F, 0.0F, 8.0F, 20.0F, 8.0F, new CubeDeformation(0.0F))
                .texOffs(184, 440).addBox(28.0F, -20.0F, 0.0F, 8.0F, 20.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-16.0F, -32.0F, -56.0F, -0.48F, 0.0F, 0.0F));

        PartDefinition cube_r30 = Body.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(448, 296).mirror().addBox(-16.0F, -4.0F, 0.0F, 16.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-26.0F, -20.0F, -48.0F, 0.0F, 0.48F, 0.5236F));

        PartDefinition cube_r31 = Body.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(448, 296).addBox(0.0F, -4.0F, 0.0F, 16.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(26.0F, -20.0F, -48.0F, 0.0F, -0.48F, -0.5236F));

        PartDefinition cube_r32 = Body.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(216, 456).addBox(-4.0F, -16.0F, 0.0F, 8.0F, 16.0F, 8.0F, new CubeDeformation(0.0F))
                .texOffs(216, 456).addBox(-20.0F, -16.0F, 0.0F, 8.0F, 16.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.0F, -24.0F, 0.0F, -0.7418F, 0.0F, 0.0F));

        PartDefinition cube_r33 = Body.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(216, 456).addBox(-4.0F, -16.0F, 0.0F, 8.0F, 16.0F, 8.0F, new CubeDeformation(0.0F))
                .texOffs(216, 456).addBox(28.0F, -16.0F, 0.0F, 8.0F, 16.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-16.0F, -32.0F, -28.0F, -0.7418F, 0.0F, 0.0F));

        PartDefinition Head = Body.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(192, 328).addBox(-12.0F, -12.0F, -12.0F, 24.0F, 20.0F, 28.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -8.0F, -64.0F));

        PartDefinition cube_r34 = Head.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(136, 424).addBox(-4.0F, -11.1118F, -3.3158F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(136, 424).addBox(-20.0F, -11.1118F, -3.3158F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(10.0F, -11.5224F, -20.3463F, -0.3927F, 0.0F, 0.0F));

        PartDefinition cube_r35 = Head.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(88, 260).addBox(-4.0F, -27.1118F, -7.3158F, 8.0F, 28.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -9.5224F, -28.3463F, 0.9163F, 0.0F, 0.0F));

        PartDefinition cube_r36 = Head.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(424, 100).addBox(-14.0F, 8.0F, 0.0F, 28.0F, 8.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(296, 160).addBox(-14.0F, -12.0F, -24.0F, 28.0F, 20.0F, 28.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.0F, -12.0F, 0.3927F, 0.0F, 0.0F));

        PartDefinition jaw = Head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offset(0.0F, 1.0F, -6.0F));

        PartDefinition cube_r37 = jaw.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(432, 44).addBox(-16.0F, -16.0F, -23.0F, 0.0F, 4.0F, 28.0F, new CubeDeformation(0.0F))
                .texOffs(224, 424).addBox(16.0F, -16.0F, -23.0F, 0.0F, 4.0F, 28.0F, new CubeDeformation(0.0F))
                .texOffs(344, 296).addBox(-16.004F, -16.0F, -23.0F, 32.0F, 4.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(296, 120).addBox(-16.0F, -12.0F, -23.0F, 32.0F, 12.0F, 28.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 13.4776F, 1.6537F, 0.48F, 0.0F, 0.0F));

        PartDefinition eyes = Head.addOrReplaceChild("eyes", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -24.0F));

        PartDefinition cube_r38 = eyes.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(120, 268).addBox(-14.2F, -9.0F, -3.0F, 0.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(120, 260).addBox(14.38F, -9.0F, -3.0F, 0.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(416, 44).addBox(-14.12F, -7.2F, -6.0F, 0.0F, 4.0F, 8.0F, new CubeDeformation(0.0F))
                .texOffs(112, 456).addBox(-14.12F, -10.2F, -6.0F, 0.0F, 4.0F, 8.0F, new CubeDeformation(0.0F))
                .texOffs(456, 396).addBox(-14.12F, -10.2F, -4.0F, 0.0F, 4.0F, 8.0F, new CubeDeformation(0.0F))
                .texOffs(456, 408).addBox(-14.12F, -7.2F, -4.0F, 0.0F, 4.0F, 8.0F, new CubeDeformation(0.0F))
                .texOffs(320, 208).addBox(14.3F, -10.2F, -4.0F, 0.0F, 4.0F, 8.0F, new CubeDeformation(0.0F))
                .texOffs(72, 340).addBox(14.3F, -7.2F, -4.0F, 0.0F, 4.0F, 8.0F, new CubeDeformation(0.0F))
                .texOffs(304, 208).addBox(14.3F, -10.2F, -6.0F, 0.0F, 4.0F, 8.0F, new CubeDeformation(0.0F))
                .texOffs(288, 208).addBox(14.3F, -7.2F, -6.0F, 0.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 1.0F, 6.0F, 0.7854F, 0.0F, 0.0F));

        return LayerDefinition.create(meshdefinition, 512, 512);
    }


    @Override
    public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.root().getAllParts().forEach(ModelPart::resetPose);
        this.applyHeadRotation(netHeadYaw, headPitch, ageInTicks);

        this.animateWalk(ModAnimationDefinitions.CRABDOZER_WALK, limbSwing, limbSwingAmount,2f,2.5f);
        this.animate(((crabdozerEntity) entity).idleAnimationState, ModAnimationDefinitions.CRABDOZER_IDLE, ageInTicks, 1f);
        this.animate(((crabdozerEntity) entity).attackAnimationState, ModAnimationDefinitions.CRABDOZER_ATTACK, ageInTicks, 1f);
        this.animate(((crabdozerEntity) entity).sitAnimationState, ModAnimationDefinitions.CRABDOZER_SIT, ageInTicks, 1.0F);
        this.animate(((crabdozerEntity) entity).getUpAnimationState, ModAnimationDefinitions.CRABDOZER_GET_UP, ageInTicks, 1.0F);
    }


    private void applyHeadRotation(float pNetHeadYaw, float pHeadPitch, float pAgeInTicks) {
        pNetHeadYaw = Mth.clamp(pNetHeadYaw, -30.0F, 30.0F);
        pHeadPitch = Mth.clamp(pHeadPitch, -25.0F, 45.0F);

        this.Head.yRot = pNetHeadYaw * ((float)Math.PI / 180F);
        this.Head.xRot = pHeadPitch * ((float)Math.PI / 180F);
    }


    @Override
    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        crabdozer.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }
    @Override
    public ModelPart root() {
        return crabdozer;
    }
}

