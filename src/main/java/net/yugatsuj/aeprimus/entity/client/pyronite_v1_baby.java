package net.yugatsuj.aeprimus.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;
import net.yugatsuj.aeprimus.entity.animations.PyroniteBabyV1AnimationDefinitions;
import net.yugatsuj.aeprimus.entity.custom.pyronite_v1Entity;

public class pyronite_v1_baby<T extends Entity> extends HierarchicalModel<T> {
        public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "pyronite_v1_baby"), "main");
        private final ModelPart pyronite_v1_baby;
        private final ModelPart WholeBody;
        private final ModelPart body;
        private final ModelPart armorBodyHat;
        private final ModelPart chest2;
        private final ModelPart neck2;
        private final ModelPart chest;
        private final ModelPart neck;
        private final ModelPart LeftLeg;
        private final ModelPart leftleg_r;
        private final ModelPart leftleg_upper;
        private final ModelPart leftleg_lower;
        private final ModelPart RightLeg;
        private final ModelPart rightleg_r;
        private final ModelPart rightleg_upper;
        private final ModelPart rightleg_lower;
        private final ModelPart LeftArm;
        private final ModelPart leftarm_r;
        private final ModelPart leftarm_upper;
        private final ModelPart leftarm_lower;
        private final ModelPart leftarm_hand;
        private final ModelPart RightArm;
        private final ModelPart rightarm_r;
        private final ModelPart rightarm_upper;
        private final ModelPart rightarm_lower;
        private final ModelPart rightarm_hand;
        private final ModelPart WholeHead;
        private final ModelPart head;
        private final ModelPart mask;
        private final ModelPart jaw;
        private final ModelPart flames;
        private final ModelPart fireleft;
        private final ModelPart fireleft0;
        private final ModelPart fireleft1;
        private final ModelPart fireleft2;
        private final ModelPart fireleft3;
        private final ModelPart fireleft4;
        private final ModelPart fireleft5;
        private final ModelPart fireleft6;
        private final ModelPart fireleft7;
        private final ModelPart fireright;
        private final ModelPart fireright0;
        private final ModelPart fireright1;
        private final ModelPart fireright2;
        private final ModelPart fireright3;
        private final ModelPart fireright4;
        private final ModelPart fireright5;
        private final ModelPart fireright6;
        private final ModelPart fireright7;
        private final ModelPart centerflame;
        private final ModelPart flame0;
        private final ModelPart flame1;
        private final ModelPart flame2;
        private final ModelPart flame3;
        private final ModelPart flame4;
        private final ModelPart flame5;
        private final ModelPart flame6;
        private final ModelPart flame7;

        public pyronite_v1_baby(ModelPart root) {
            this.pyronite_v1_baby = root.getChild("pyronite_v1_baby");
            this.WholeBody = this.pyronite_v1_baby.getChild("WholeBody");
            this.body = this.WholeBody.getChild("body");
            this.armorBodyHat = this.body.getChild("armorBodyHat");
            this.chest2 = this.armorBodyHat.getChild("chest2");
            this.neck2 = this.armorBodyHat.getChild("neck2");
            this.chest = this.body.getChild("chest");
            this.neck = this.body.getChild("neck");
            this.LeftLeg = this.WholeBody.getChild("LeftLeg");
            this.leftleg_r = this.LeftLeg.getChild("leftleg_r");
            this.leftleg_upper = this.leftleg_r.getChild("leftleg_upper");
            this.leftleg_lower = this.leftleg_upper.getChild("leftleg_lower");
            this.RightLeg = this.WholeBody.getChild("RightLeg");
            this.rightleg_r = this.RightLeg.getChild("rightleg_r");
            this.rightleg_upper = this.rightleg_r.getChild("rightleg_upper");
            this.rightleg_lower = this.rightleg_upper.getChild("rightleg_lower");
            this.LeftArm = this.WholeBody.getChild("LeftArm");
            this.leftarm_r = this.LeftArm.getChild("leftarm_r");
            this.leftarm_upper = this.leftarm_r.getChild("leftarm_upper");
            this.leftarm_lower = this.leftarm_upper.getChild("leftarm_lower");
            this.leftarm_hand = this.leftarm_lower.getChild("leftarm_hand");
            this.RightArm = this.WholeBody.getChild("RightArm");
            this.rightarm_r = this.RightArm.getChild("rightarm_r");
            this.rightarm_upper = this.rightarm_r.getChild("rightarm_upper");
            this.rightarm_lower = this.rightarm_upper.getChild("rightarm_lower");
            this.rightarm_hand = this.rightarm_lower.getChild("rightarm_hand");
            this.WholeHead = this.pyronite_v1_baby.getChild("WholeHead");
            this.head = this.WholeHead.getChild("head");
            this.mask = this.head.getChild("mask");
            this.jaw = this.mask.getChild("jaw");
            this.flames = this.WholeHead.getChild("flames");
            this.fireleft = this.flames.getChild("fireleft");
            this.fireleft0 = this.fireleft.getChild("fireleft0");
            this.fireleft1 = this.fireleft.getChild("fireleft1");
            this.fireleft2 = this.fireleft.getChild("fireleft2");
            this.fireleft3 = this.fireleft.getChild("fireleft3");
            this.fireleft4 = this.fireleft.getChild("fireleft4");
            this.fireleft5 = this.fireleft.getChild("fireleft5");
            this.fireleft6 = this.fireleft.getChild("fireleft6");
            this.fireleft7 = this.fireleft.getChild("fireleft7");
            this.fireright = this.flames.getChild("fireright");
            this.fireright0 = this.fireright.getChild("fireright0");
            this.fireright1 = this.fireright.getChild("fireright1");
            this.fireright2 = this.fireright.getChild("fireright2");
            this.fireright3 = this.fireright.getChild("fireright3");
            this.fireright4 = this.fireright.getChild("fireright4");
            this.fireright5 = this.fireright.getChild("fireright5");
            this.fireright6 = this.fireright.getChild("fireright6");
            this.fireright7 = this.fireright.getChild("fireright7");
            this.centerflame = this.flames.getChild("centerflame");
            this.flame0 = this.centerflame.getChild("flame0");
            this.flame1 = this.centerflame.getChild("flame1");
            this.flame2 = this.centerflame.getChild("flame2");
            this.flame3 = this.centerflame.getChild("flame3");
            this.flame4 = this.centerflame.getChild("flame4");
            this.flame5 = this.centerflame.getChild("flame5");
            this.flame6 = this.centerflame.getChild("flame6");
            this.flame7 = this.centerflame.getChild("flame7");
        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshdefinition = new MeshDefinition();
            PartDefinition partdefinition = meshdefinition.getRoot();

            PartDefinition pyronite_v1_baby = partdefinition.addOrReplaceChild("pyronite_v1_baby", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition WholeBody = pyronite_v1_baby.addOrReplaceChild("WholeBody", CubeListBuilder.create(), PartPose.offset(0.0F, -27.0F, 0.225F));

            PartDefinition body = WholeBody.addOrReplaceChild("body", CubeListBuilder.create().texOffs(76, 21).addBox(-2.04F, 14.7F, -0.9775F, 4.0F, 2.0F, 4.0F, new CubeDeformation(-0.3F))
                    .texOffs(24, 23).addBox(-3.59F, 10.9F, -1.4025F, 7.0F, 5.0F, 5.0F, new CubeDeformation(-0.5F)), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition armorBodyHat = body.addOrReplaceChild("armorBodyHat", CubeListBuilder.create().texOffs(74, 0).addBox(-2.0325F, 14.8525F, -0.935F, 4.0F, 2.0F, 4.0F, new CubeDeformation(-0.25F))
                    .texOffs(0, 25).addBox(-3.61F, 10.88F, -1.4325F, 7.0F, 5.0F, 5.0F, new CubeDeformation(-0.45F)), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition chest2 = armorBodyHat.addOrReplaceChild("chest2", CubeListBuilder.create().texOffs(24, 0).addBox(-4.11F, 3.7163F, -3.5606F, 8.0F, 6.0F, 6.0F, new CubeDeformation(-0.45F)), PartPose.offsetAndRotation(0.0F, 2.2456F, 1.1231F, 0.0436F, 0.0F, 0.0F));

            PartDefinition neck2 = armorBodyHat.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.135F, 0.364F, 0.8682F, 0.3927F, 0.0F, 0.0F));

            PartDefinition neck2_r1 = neck2.addOrReplaceChild("neck2_r1", CubeListBuilder.create().texOffs(52, 0).addBox(-3.1F, 5.9859F, -3.4101F, 6.0F, 2.0F, 5.0F, new CubeDeformation(-0.5F)), PartPose.offsetAndRotation(-0.135F, -0.8829F, 0.4613F, -0.3054F, 0.0F, 0.0F));

            PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create().texOffs(24, 12).addBox(-4.115F, 3.9861F, -2.9265F, 8.0F, 6.0F, 5.0F, new CubeDeformation(-0.5F)), PartPose.offsetAndRotation(0.0F, 1.9956F, 1.1231F, 0.0436F, 0.0F, 0.0F));

            PartDefinition neck = body.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.135F, 0.07F, 0.99F, 0.3927F, 0.0F, 0.0F));

            PartDefinition neck_r1 = neck.addOrReplaceChild("neck_r1", CubeListBuilder.create().texOffs(60, 7).addBox(-4.5792F, 6.8849F, -2.3562F, 6.0F, 2.0F, 5.0F, new CubeDeformation(-0.5F)), PartPose.offsetAndRotation(1.3742F, -1.7472F, -0.4708F, -0.3054F, 0.0F, 0.0F));

            PartDefinition LeftLeg = WholeBody.addOrReplaceChild("LeftLeg", CubeListBuilder.create(), PartPose.offset(0.785F, 12.15F, 1.125F));

            PartDefinition leftleg_r = LeftLeg.addOrReplaceChild("leftleg_r", CubeListBuilder.create(), PartPose.offsetAndRotation(0.09F, -3.825F, -0.225F, 0.0436F, 0.0F, 0.0F));

            PartDefinition leftleg_upper = leftleg_r.addOrReplaceChild("leftleg_upper", CubeListBuilder.create(), PartPose.offset(1.0F, 7.75F, -0.25F));

            PartDefinition leftleg_upper_r1 = leftleg_upper.addOrReplaceChild("leftleg_upper_r1", CubeListBuilder.create().texOffs(30, 73).addBox(2.8319F, -11.8365F, -1.9175F, 3.0F, 7.0F, 3.0F, new CubeDeformation(-0.55F))
                    .texOffs(72, 68).addBox(2.8019F, -11.8065F, -1.9475F, 3.0F, 7.0F, 3.0F, new CubeDeformation(-0.5F)), PartPose.offsetAndRotation(-3.4096F, 11.0945F, -0.916F, -0.096F, -0.0873F, -0.0873F));

            PartDefinition leftleg_lower = leftleg_upper.addOrReplaceChild("leftleg_lower", CubeListBuilder.create().texOffs(0, 75).addBox(-1.5887F, -0.711F, -0.7052F, 3.0F, 4.0F, 3.0F, new CubeDeformation(-0.55F))
                    .texOffs(76, 27).addBox(-1.5837F, -0.741F, -0.7252F, 3.0F, 4.0F, 3.0F, new CubeDeformation(-0.5F))
                    .texOffs(30, 55).addBox(-1.1487F, 0.674F, -0.2652F, 2.0F, 5.0F, 2.0F, new CubeDeformation(-0.5F)), PartPose.offsetAndRotation(0.5755F, 5.1575F, -1.236F, -0.0037F, -0.0858F, -0.0759F));

            PartDefinition armorLeftLeg_r1 = leftleg_lower.addOrReplaceChild("armorLeftLeg_r1", CubeListBuilder.create().texOffs(52, 7).addBox(1.7182F, 20.2746F, 0.436F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.5F)), PartPose.offsetAndRotation(-0.8873F, -16.5335F, 1.3338F, -0.0349F, 0.0F, 0.0716F));

            PartDefinition armorLeftLeg_r2 = leftleg_lower.addOrReplaceChild("armorLeftLeg_r2", CubeListBuilder.create().texOffs(72, 54).addBox(1.011F, -1.8182F, -4.0613F, 3.0F, 2.0F, 5.0F, new CubeDeformation(-0.5F)), PartPose.offsetAndRotation(-2.7489F, 5.4851F, 1.0625F, -0.0349F, 0.0F, 0.0716F));

            PartDefinition RightLeg = WholeBody.addOrReplaceChild("RightLeg", CubeListBuilder.create(), PartPose.offset(-0.785F, 12.15F, 1.125F));

            PartDefinition rightleg_r = RightLeg.addOrReplaceChild("rightleg_r", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.09F, -3.825F, -0.225F, 0.0436F, 0.0F, 0.0F));

            PartDefinition rightleg_upper = rightleg_r.addOrReplaceChild("rightleg_upper", CubeListBuilder.create(), PartPose.offset(-1.0F, 7.0F, 0.0F));

            PartDefinition rightleg_upper_r1 = rightleg_upper.addOrReplaceChild("rightleg_upper_r1", CubeListBuilder.create().texOffs(12, 74).addBox(-5.8319F, -11.7865F, -1.9175F, 3.0F, 7.0F, 3.0F, new CubeDeformation(-0.55F))
                    .texOffs(42, 73).addBox(-5.8019F, -11.7565F, -1.9475F, 3.0F, 7.0F, 3.0F, new CubeDeformation(-0.5F)), PartPose.offsetAndRotation(3.4096F, 11.8445F, -1.166F, -0.096F, 0.0873F, 0.0873F));

            PartDefinition rightleg_lower = rightleg_upper.addOrReplaceChild("rightleg_lower", CubeListBuilder.create().texOffs(76, 34).addBox(-1.5885F, -0.2679F, -0.7386F, 3.0F, 4.0F, 3.0F, new CubeDeformation(-0.55F))
                    .texOffs(76, 41).addBox(-1.5685F, -0.298F, -0.7586F, 3.0F, 4.0F, 3.0F, new CubeDeformation(-0.5F))
                    .texOffs(30, 62).addBox(-1.1285F, 1.117F, -0.1986F, 2.0F, 5.0F, 2.0F, new CubeDeformation(-0.5F)), PartPose.offsetAndRotation(-0.3255F, 5.4075F, -1.514F, -0.0037F, 0.0858F, 0.0759F));

            PartDefinition armorRightLeg_r1 = rightleg_lower.addOrReplaceChild("armorRightLeg_r1", CubeListBuilder.create().texOffs(12, 63).addBox(-2.7182F, 20.2746F, 0.436F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.5F)), PartPose.offsetAndRotation(0.61F, -16.0904F, 1.4005F, -0.0349F, 0.0F, -0.0716F));

            PartDefinition armorRightLeg_r2 = rightleg_lower.addOrReplaceChild("armorRightLeg_r2", CubeListBuilder.create().texOffs(72, 61).addBox(-4.011F, -1.8182F, -4.0613F, 3.0F, 2.0F, 5.0F, new CubeDeformation(-0.5F)), PartPose.offsetAndRotation(2.4717F, 5.9281F, 1.1292F, -0.0349F, 0.0F, -0.0716F));

            PartDefinition LeftArm = WholeBody.addOrReplaceChild("LeftArm", CubeListBuilder.create(), PartPose.offsetAndRotation(3.05F, 8.025F, 1.35F, 0.0F, 0.0F, -0.0436F));

            PartDefinition leftarm_r = LeftArm.addOrReplaceChild("leftarm_r", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.225F, -0.9F, -0.225F, 0.0437F, -0.0436F, -0.0019F));

            PartDefinition leftarm_upper = leftarm_r.addOrReplaceChild("leftarm_upper", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.225F, 0.0F, 0.225F, 0.0873F, 0.0F, -0.1745F));

            PartDefinition leftarm_upper_r1 = leftarm_upper.addOrReplaceChild("leftarm_upper_r1", CubeListBuilder.create().texOffs(0, 63).addBox(3.815F, 2.71F, -1.415F, 3.0F, 9.0F, 3.0F, new CubeDeformation(-0.5F))
                    .texOffs(60, 54).addBox(3.835F, 2.69F, -1.435F, 3.0F, 9.0F, 3.0F, new CubeDeformation(-0.45F)), PartPose.offsetAndRotation(-3.825F, -3.6F, -0.675F, 0.0F, 0.0F, -0.0436F));

            PartDefinition leftarm_lower = leftarm_upper.addOrReplaceChild("leftarm_lower", CubeListBuilder.create().texOffs(24, 33).addBox(-1.3155F, -0.1503F, -3.2312F, 5.0F, 6.0F, 5.0F, new CubeDeformation(-0.65F))
                    .texOffs(0, 35).addBox(-1.3455F, -0.1203F, -3.2012F, 5.0F, 6.0F, 5.0F, new CubeDeformation(-0.7F)), PartPose.offsetAndRotation(0.6065F, 5.3471F, 0.5559F, -0.2618F, 0.0F, 0.0436F));

            PartDefinition leftarm_hand = leftarm_lower.addOrReplaceChild("leftarm_hand", CubeListBuilder.create(), PartPose.offsetAndRotation(0.136F, 5.7915F, -0.3551F, 0.3016F, -0.0435F, 0.0873F));

            PartDefinition leftarm_hand_r1 = leftarm_hand.addOrReplaceChild("leftarm_hand_r1", CubeListBuilder.create().texOffs(12, 68).addBox(-3.0135F, -1.3663F, -2.7758F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.7F)), PartPose.offsetAndRotation(0.9F, 0.0F, -0.225F, -0.2345F, 0.1183F, 0.2501F));

            PartDefinition leftarm_hand_r2 = leftarm_hand.addOrReplaceChild("leftarm_hand_r2", CubeListBuilder.create().texOffs(40, 44).addBox(-1.7327F, -1.5047F, -2.7968F, 5.0F, 5.0F, 5.0F, new CubeDeformation(-0.7F)), PartPose.offsetAndRotation(0.1208F, -0.2846F, 0.0937F, -0.2511F, 0.0762F, 0.0799F));

            PartDefinition leftarm_hand_r3 = leftarm_hand.addOrReplaceChild("leftarm_hand_r3", CubeListBuilder.create().texOffs(0, 56).addBox(-1.6927F, -1.7145F, -2.7868F, 5.0F, 2.0F, 5.0F, new CubeDeformation(-0.65F)), PartPose.offsetAndRotation(0.0889F, -0.102F, 0.0218F, -0.2511F, 0.0762F, 0.0799F));

            PartDefinition RightArm = WholeBody.addOrReplaceChild("RightArm", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.05F, 8.025F, 1.35F, 0.0F, 0.0F, 0.0436F));

            PartDefinition rightarm_r = RightArm.addOrReplaceChild("rightarm_r", CubeListBuilder.create(), PartPose.offsetAndRotation(0.225F, -0.9F, -0.225F, 0.0437F, 0.0436F, 0.0019F));

            PartDefinition rightarm_upper = rightarm_r.addOrReplaceChild("rightarm_upper", CubeListBuilder.create(), PartPose.offsetAndRotation(0.225F, 0.0F, 0.225F, 0.0873F, 0.0F, 0.1745F));

            PartDefinition rightarm_upper_r1 = rightarm_upper.addOrReplaceChild("rightarm_upper_r1", CubeListBuilder.create().texOffs(60, 66).addBox(-2.4802F, -0.6121F, -1.8312F, 3.0F, 9.0F, 3.0F, new CubeDeformation(-0.5F))
                    .texOffs(64, 31).addBox(-2.5002F, -0.6321F, -1.8512F, 3.0F, 9.0F, 3.0F, new CubeDeformation(-0.45F)), PartPose.offsetAndRotation(-0.6506F, -0.4701F, -0.2588F, 0.0F, 0.0F, 0.0436F));

            PartDefinition rightarm_lower = rightarm_upper.addOrReplaceChild("rightarm_lower", CubeListBuilder.create().texOffs(20, 44).addBox(-3.9859F, -1.8518F, -3.4923F, 5.0F, 6.0F, 5.0F, new CubeDeformation(-0.65F))
                    .texOffs(44, 33).addBox(-3.9559F, -1.8218F, -3.4623F, 5.0F, 6.0F, 5.0F, new CubeDeformation(-0.7F)), PartPose.offsetAndRotation(-0.5117F, 7.5184F, -0.0264F, -0.2618F, 0.0F, -0.0436F));

            PartDefinition rightarm_hand = rightarm_lower.addOrReplaceChild("rightarm_hand", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.136F, 5.7915F, -0.3551F, 0.3016F, 0.0435F, -0.0873F));

            PartDefinition rightarm_hand_r1 = rightarm_hand.addOrReplaceChild("rightarm_hand_r1", CubeListBuilder.create().texOffs(76, 48).addBox(-3.1671F, 9.3944F, 0.271F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.7F)), PartPose.offsetAndRotation(0.241F, -13.8328F, 0.1387F, -0.2345F, -0.1183F, -0.2501F));

            PartDefinition rightarm_hand_r2 = rightarm_hand.addOrReplaceChild("rightarm_hand_r2", CubeListBuilder.create().texOffs(0, 46).addBox(-4.6828F, 9.7369F, 0.419F, 5.0F, 5.0F, 5.0F, new CubeDeformation(-0.7F))
                    .texOffs(60, 14).addBox(-4.7228F, 10.0271F, 0.429F, 5.0F, 2.0F, 5.0F, new CubeDeformation(-0.65F)), PartPose.offsetAndRotation(0.241F, -13.8328F, 0.1387F, -0.2511F, -0.0762F, -0.0799F));

            PartDefinition WholeHead = pyronite_v1_baby.addOrReplaceChild("WholeHead", CubeListBuilder.create(), PartPose.offset(-0.25F, -21.25F, 0.675F));

            PartDefinition head = WholeHead.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1281F, -3.3236F, 0.0873F, 0.0F, 0.0F));

            PartDefinition head_r1 = head.addOrReplaceChild("head_r1", CubeListBuilder.create().texOffs(60, 44).addBox(-1.9212F, -2.9668F, -1.9212F, 4.0F, 6.0F, 4.0F, new CubeDeformation(-0.5F))
                    .texOffs(60, 21).addBox(-1.8999F, -3.5149F, -1.8999F, 4.0F, 6.0F, 4.0F, new CubeDeformation(-0.5F)), PartPose.offsetAndRotation(0.0F, -2.2531F, 3.0146F, 0.0F, -0.7854F, 0.0F));

            PartDefinition mask = head.addOrReplaceChild("mask", CubeListBuilder.create(), PartPose.offset(0.0F, -0.7044F, 1.217F));

            PartDefinition mask_r1 = mask.addOrReplaceChild("mask_r1", CubeListBuilder.create().texOffs(97, 50).mirror().addBox(-3.565F, -2.9007F, -1.2875F, 5.0F, 5.0F, 0.0F, new CubeDeformation(-0.5F)).mirror(false)
                    .texOffs(93, 35).mirror().addBox(-3.1399F, -3.1507F, -1.0375F, 4.0F, 5.0F, 0.0F, new CubeDeformation(-0.5F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.3837F, -0.8031F, 0.0F, 0.5236F, 0.0F));

            PartDefinition mask_r2 = mask.addOrReplaceChild("mask_r2", CubeListBuilder.create().texOffs(97, 50).addBox(-1.4326F, -2.8985F, -1.2909F, 5.0F, 5.0F, 0.0F, new CubeDeformation(-0.5F))
                    .texOffs(95, 40).addBox(-0.8576F, -3.1485F, -1.0409F, 4.0F, 5.0F, 0.0F, new CubeDeformation(-0.5F)), PartPose.offsetAndRotation(0.0F, -1.3837F, -0.8031F, 0.0F, -0.5236F, 0.0F));

            PartDefinition jaw = mask.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offset(0.0F, 2.6447F, -1.0407F));

            PartDefinition jaw_r1 = jaw.addOrReplaceChild("jaw_r1", CubeListBuilder.create().texOffs(2, 1).addBox(0.0017F, -4.7066F, 0.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(-0.5F)), PartPose.offsetAndRotation(0.0F, 2.1699F, -0.2317F, 0.0F, -0.5236F, 0.0F));

            PartDefinition jaw_r2 = jaw.addOrReplaceChild("jaw_r2", CubeListBuilder.create().texOffs(6, 1).addBox(-1.0F, -4.7066F, 0.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(-0.5F)), PartPose.offsetAndRotation(0.0F, 2.1699F, -0.2317F, 0.0F, 0.5236F, 0.0F));

            PartDefinition flames = WholeHead.addOrReplaceChild("flames", CubeListBuilder.create(), PartPose.offsetAndRotation(0.25F, -3.1609F, -1.5881F, 0.1309F, 0.0F, 0.0F));

            PartDefinition fireleft = flames.addOrReplaceChild("fireleft", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4589F, 2.2991F, -0.1309F, 0.0F, 0.0F));

            PartDefinition fireleft0 = fireleft.addOrReplaceChild("fireleft0", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition fireleft_r1 = fireleft0.addOrReplaceChild("fireleft_r1", CubeListBuilder.create().texOffs(40, 54).addBox(-0.3306F, -8.5387F, -4.4615F, 0.0F, 14.0F, 5.0F, new CubeDeformation(-0.5F)), PartPose.offsetAndRotation(0.0F, -0.0553F, 0.0116F, -3.0738F, -0.8715F, 3.0897F));

            PartDefinition fireleft_r2 = fireleft0.addOrReplaceChild("fireleft_r2", CubeListBuilder.create().texOffs(50, 12).addBox(-0.5022F, -8.5649F, -4.3455F, 0.0F, 14.0F, 5.0F, new CubeDeformation(-0.5F)), PartPose.offsetAndRotation(0.0F, -0.0553F, 0.0116F, -0.0716F, -0.9151F, 0.0568F));

            PartDefinition fireleft1 = fireleft.addOrReplaceChild("fireleft1", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition fireleft_r3 = fireleft1.addOrReplaceChild("fireleft_r3", CubeListBuilder.create().texOffs(184, 9).addBox(-0.3306F, -8.5387F, -4.4615F, 0.0F, 14.0F, 5.0F, new CubeDeformation(-0.5F)), PartPose.offsetAndRotation(0.0F, -0.0553F, 0.0116F, -3.0738F, -0.8715F, 3.0897F));

            PartDefinition fireleft_r4 = fireleft1.addOrReplaceChild("fireleft_r4", CubeListBuilder.create().texOffs(195, 9).addBox(-0.5022F, -8.5649F, -4.3455F, 0.0F, 14.0F, 5.0F, new CubeDeformation(-0.5F)), PartPose.offsetAndRotation(0.0F, -0.0553F, 0.0116F, -0.0716F, -0.9151F, 0.0568F));

            PartDefinition fireleft2 = fireleft.addOrReplaceChild("fireleft2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition fireleft_r5 = fireleft2.addOrReplaceChild("fireleft_r5", CubeListBuilder.create().texOffs(195, 26).addBox(-0.3306F, -8.5387F, -4.4615F, 0.0F, 14.0F, 5.0F, new CubeDeformation(-0.5F)), PartPose.offsetAndRotation(0.0F, -0.0553F, 0.0116F, -3.0738F, -0.8715F, 3.0897F));

            PartDefinition fireleft_r6 = fireleft2.addOrReplaceChild("fireleft_r6", CubeListBuilder.create().texOffs(184, 26).addBox(-0.5022F, -8.5649F, -4.3455F, 0.0F, 14.0F, 5.0F, new CubeDeformation(-0.5F)), PartPose.offsetAndRotation(0.0F, -0.0553F, 0.0116F, -0.0716F, -0.9151F, 0.0568F));

            PartDefinition fireleft3 = fireleft.addOrReplaceChild("fireleft3", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition fireleft_r7 = fireleft3.addOrReplaceChild("fireleft_r7", CubeListBuilder.create().texOffs(194, 41).addBox(-0.3306F, -8.5387F, -4.4615F, 0.0F, 14.0F, 5.0F, new CubeDeformation(-0.5F)), PartPose.offsetAndRotation(0.0F, -0.0553F, 0.0116F, -3.0738F, -0.8715F, 3.0897F));

            PartDefinition fireleft_r8 = fireleft3.addOrReplaceChild("fireleft_r8", CubeListBuilder.create().texOffs(184, 41).addBox(-0.5022F, -8.5649F, -4.3455F, 0.0F, 14.0F, 5.0F, new CubeDeformation(-0.5F)), PartPose.offsetAndRotation(0.0F, -0.0553F, 0.0116F, -0.0716F, -0.9151F, 0.0568F));

            PartDefinition fireleft4 = fireleft.addOrReplaceChild("fireleft4", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition fireleft_r9 = fireleft4.addOrReplaceChild("fireleft_r9", CubeListBuilder.create().texOffs(184, 57).addBox(-0.3306F, -8.5387F, -4.4615F, 0.0F, 14.0F, 5.0F, new CubeDeformation(-0.5F)), PartPose.offsetAndRotation(0.0F, -0.0553F, 0.0116F, -3.0738F, -0.8715F, 3.0897F));

            PartDefinition fireleft_r10 = fireleft4.addOrReplaceChild("fireleft_r10", CubeListBuilder.create().texOffs(195, 57).addBox(-0.5022F, -8.5649F, -4.3455F, 0.0F, 14.0F, 5.0F, new CubeDeformation(-0.5F)), PartPose.offsetAndRotation(0.0F, -0.0553F, 0.0116F, -0.0716F, -0.9151F, 0.0568F));

            PartDefinition fireleft5 = fireleft.addOrReplaceChild("fireleft5", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition fireleft_r11 = fireleft5.addOrReplaceChild("fireleft_r11", CubeListBuilder.create().texOffs(184, 73).addBox(-0.3306F, -8.5387F, -4.4615F, 0.0F, 14.0F, 5.0F, new CubeDeformation(-0.5F)), PartPose.offsetAndRotation(0.0F, -0.0553F, 0.0116F, -3.0738F, -0.8715F, 3.0897F));

            PartDefinition fireleft_r12 = fireleft5.addOrReplaceChild("fireleft_r12", CubeListBuilder.create().texOffs(195, 73).addBox(-0.5022F, -8.5649F, -4.3455F, 0.0F, 14.0F, 5.0F, new CubeDeformation(-0.5F)), PartPose.offsetAndRotation(0.0F, -0.0553F, 0.0116F, -0.0716F, -0.9151F, 0.0568F));

            PartDefinition fireleft6 = fireleft.addOrReplaceChild("fireleft6", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition fireleft_r13 = fireleft6.addOrReplaceChild("fireleft_r13", CubeListBuilder.create().texOffs(184, 89).addBox(-0.3306F, -8.5387F, -4.4615F, 0.0F, 14.0F, 5.0F, new CubeDeformation(-0.5F)), PartPose.offsetAndRotation(0.0F, -0.0553F, 0.0116F, -3.0738F, -0.8715F, 3.0897F));

            PartDefinition fireleft_r14 = fireleft6.addOrReplaceChild("fireleft_r14", CubeListBuilder.create().texOffs(195, 89).addBox(-0.5022F, -8.5649F, -4.3455F, 0.0F, 14.0F, 5.0F, new CubeDeformation(-0.5F)), PartPose.offsetAndRotation(0.0F, -0.0553F, 0.0116F, -0.0716F, -0.9151F, 0.0568F));

            PartDefinition fireleft7 = fireleft.addOrReplaceChild("fireleft7", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition fireleft_r15 = fireleft7.addOrReplaceChild("fireleft_r15", CubeListBuilder.create().texOffs(183, 105).addBox(-0.3306F, -8.5387F, -4.4615F, 0.0F, 14.0F, 5.0F, new CubeDeformation(-0.5F)), PartPose.offsetAndRotation(0.0F, -0.0553F, 0.0116F, -3.0738F, -0.8715F, 3.0897F));

            PartDefinition fireleft_r16 = fireleft7.addOrReplaceChild("fireleft_r16", CubeListBuilder.create().texOffs(194, 105).addBox(-0.5022F, -8.5649F, -4.3455F, 0.0F, 14.0F, 5.0F, new CubeDeformation(-0.5F)), PartPose.offsetAndRotation(0.0F, -0.0553F, 0.0116F, -0.0716F, -0.9151F, 0.0568F));

            PartDefinition fireright = flames.addOrReplaceChild("fireright", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.25F, -0.4589F, 2.2991F, -0.1309F, 0.0F, 0.0F));

            PartDefinition fireright0 = fireright.addOrReplaceChild("fireright0", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition fireright_r1 = fireright0.addOrReplaceChild("fireright_r1", CubeListBuilder.create().texOffs(20, 55).addBox(-0.2257F, -8.5366F, -3.7208F, 0.0F, 14.0F, 5.0F, new CubeDeformation(-0.5F)), PartPose.offsetAndRotation(0.0F, -0.0553F, 0.0116F, -3.0738F, 0.8715F, -3.0897F));

            PartDefinition fireright_r2 = fireright0.addOrReplaceChild("fireright_r2", CubeListBuilder.create().texOffs(50, 54).addBox(1.111F, -8.5649F, -3.5521F, 0.0F, 14.0F, 5.0F, new CubeDeformation(-0.5F)), PartPose.offsetAndRotation(0.0F, -0.0553F, 0.0116F, -0.0716F, 0.9151F, -0.0568F));

            PartDefinition fireright1 = fireright.addOrReplaceChild("fireright1", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition fireright_r3 = fireright1.addOrReplaceChild("fireright_r3", CubeListBuilder.create().texOffs(209, 12).mirror().addBox(-0.2257F, -8.5366F, -3.7208F, 0.0F, 14.0F, 5.0F, new CubeDeformation(-0.5F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.0553F, 0.0116F, -3.0738F, 0.8715F, -3.0897F));

            PartDefinition fireright_r4 = fireright1.addOrReplaceChild("fireright_r4", CubeListBuilder.create().texOffs(220, 12).mirror().addBox(1.111F, -8.5649F, -3.5521F, 0.0F, 14.0F, 5.0F, new CubeDeformation(-0.5F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.0553F, 0.0116F, -0.0716F, 0.9151F, -0.0568F));

            PartDefinition fireright2 = fireright.addOrReplaceChild("fireright2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition fireright_r5 = fireright2.addOrReplaceChild("fireright_r5", CubeListBuilder.create().texOffs(220, 29).mirror().addBox(-0.2257F, -8.5366F, -3.7208F, 0.0F, 14.0F, 5.0F, new CubeDeformation(-0.5F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.0553F, 0.0116F, -3.0738F, 0.8715F, -3.0897F));

            PartDefinition fireright_r6 = fireright2.addOrReplaceChild("fireright_r6", CubeListBuilder.create().texOffs(209, 29).mirror().addBox(1.111F, -8.5649F, -3.5521F, 0.0F, 14.0F, 5.0F, new CubeDeformation(-0.5F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.0553F, 0.0116F, -0.0716F, 0.9151F, -0.0568F));

            PartDefinition fireright3 = fireright.addOrReplaceChild("fireright3", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition fireright_r7 = fireright3.addOrReplaceChild("fireright_r7", CubeListBuilder.create().texOffs(219, 44).mirror().addBox(-0.2256F, -8.5257F, -3.7208F, 0.0F, 14.0F, 5.0F, new CubeDeformation(-0.5F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.0553F, 0.0116F, -3.0738F, 0.8715F, -3.0897F));

            PartDefinition fireright_r8 = fireright3.addOrReplaceChild("fireright_r8", CubeListBuilder.create().texOffs(209, 44).mirror().addBox(0.5168F, -8.5867F, -3.5059F, 0.0F, 14.0F, 5.0F, new CubeDeformation(-0.5F)).mirror(false), PartPose.offsetAndRotation(0.325F, -0.0553F, -0.5884F, -0.0716F, 0.9151F, -0.0568F));

            PartDefinition fireright4 = fireright.addOrReplaceChild("fireright4", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition fireright_r9 = fireright4.addOrReplaceChild("fireright_r9", CubeListBuilder.create().texOffs(209, 60).mirror().addBox(-0.2257F, -8.5366F, -3.7208F, 0.0F, 14.0F, 5.0F, new CubeDeformation(-0.5F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.0553F, 0.0116F, -3.0738F, 0.8715F, -3.0897F));

            PartDefinition fireright_r10 = fireright4.addOrReplaceChild("fireright_r10", CubeListBuilder.create().texOffs(220, 60).mirror().addBox(1.111F, -8.5649F, -3.5521F, 0.0F, 14.0F, 5.0F, new CubeDeformation(-0.5F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.0553F, 0.0116F, -0.0716F, 0.9151F, -0.0568F));

            PartDefinition fireright5 = fireright.addOrReplaceChild("fireright5", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition fireright_r11 = fireright5.addOrReplaceChild("fireright_r11", CubeListBuilder.create().texOffs(209, 76).mirror().addBox(-0.2257F, -8.5366F, -3.7208F, 0.0F, 14.0F, 5.0F, new CubeDeformation(-0.5F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.0553F, 0.0116F, -3.0738F, 0.8715F, -3.0897F));

            PartDefinition fireright_r12 = fireright5.addOrReplaceChild("fireright_r12", CubeListBuilder.create().texOffs(220, 76).mirror().addBox(1.111F, -8.5649F, -3.5521F, 0.0F, 14.0F, 5.0F, new CubeDeformation(-0.5F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.0553F, 0.0116F, -0.0716F, 0.9151F, -0.0568F));

            PartDefinition fireright6 = fireright.addOrReplaceChild("fireright6", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition fireright_r13 = fireright6.addOrReplaceChild("fireright_r13", CubeListBuilder.create().texOffs(209, 92).mirror().addBox(-0.2257F, -8.5366F, -3.7208F, 0.0F, 14.0F, 5.0F, new CubeDeformation(-0.5F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.0553F, 0.0116F, -3.0738F, 0.8715F, -3.0897F));

            PartDefinition fireright_r14 = fireright6.addOrReplaceChild("fireright_r14", CubeListBuilder.create().texOffs(220, 92).mirror().addBox(1.111F, -8.5649F, -3.5521F, 0.0F, 14.0F, 5.0F, new CubeDeformation(-0.5F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.0553F, 0.0116F, -0.0716F, 0.9151F, -0.0568F));

            PartDefinition fireright7 = fireright.addOrReplaceChild("fireright7", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition fireright_r15 = fireright7.addOrReplaceChild("fireright_r15", CubeListBuilder.create().texOffs(208, 108).mirror().addBox(-0.2257F, -8.5366F, -3.7208F, 0.0F, 14.0F, 5.0F, new CubeDeformation(-0.5F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.0553F, 0.0116F, -3.0738F, 0.8715F, -3.0897F));

            PartDefinition fireright_r16 = fireright7.addOrReplaceChild("fireright_r16", CubeListBuilder.create().texOffs(219, 108).mirror().addBox(1.111F, -8.5649F, -3.5521F, 0.0F, 14.0F, 5.0F, new CubeDeformation(-0.5F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.0553F, 0.0116F, -0.0716F, 0.9151F, -0.0568F));

            PartDefinition centerflame = flames.addOrReplaceChild("centerflame", CubeListBuilder.create(), PartPose.offset(-0.95F, 0.0F, 0.0F));

            PartDefinition flame0 = centerflame.addOrReplaceChild("flame0", CubeListBuilder.create(), PartPose.offset(0.25F, 0.0F, 0.0F));

            PartDefinition flames_r1 = flame0.addOrReplaceChild("flames_r1", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -7.5649F, -2.3964F, 0.0F, 13.0F, 12.0F, new CubeDeformation(-0.5F)), PartPose.offsetAndRotation(0.0F, -0.6087F, 1.1308F, -0.0436F, 0.0F, 0.0F));

            PartDefinition flame1 = centerflame.addOrReplaceChild("flame1", CubeListBuilder.create(), PartPose.offset(0.25F, 0.0F, 0.0F));

            PartDefinition flames1_r1 = flame1.addOrReplaceChild("flames1_r1", CubeListBuilder.create().texOffs(128, 102).addBox(0.0F, -7.5649F, -2.3964F, 0.0F, 13.0F, 12.0F, new CubeDeformation(-0.5F)), PartPose.offsetAndRotation(0.0F, -0.6087F, 1.1308F, -0.0436F, 0.0F, 0.0F));

            PartDefinition flame2 = centerflame.addOrReplaceChild("flame2", CubeListBuilder.create(), PartPose.offset(0.25F, 0.0F, 0.0F));

            PartDefinition flames2_r1 = flame2.addOrReplaceChild("flames2_r1", CubeListBuilder.create().texOffs(128, 116).addBox(0.0F, -7.5649F, -2.3964F, 0.0F, 13.0F, 12.0F, new CubeDeformation(-0.5F)), PartPose.offsetAndRotation(0.0F, -0.6087F, 1.1308F, -0.0436F, 0.0F, 0.0F));

            PartDefinition flame3 = centerflame.addOrReplaceChild("flame3", CubeListBuilder.create(), PartPose.offset(0.25F, 0.0F, 0.0F));

            PartDefinition flames3_r1 = flame3.addOrReplaceChild("flames3_r1", CubeListBuilder.create().texOffs(153, 116).addBox(0.0F, -7.5649F, -2.3964F, 0.0F, 13.0F, 12.0F, new CubeDeformation(-0.5F)), PartPose.offsetAndRotation(0.0F, -0.6087F, 1.1308F, -0.0436F, 0.0F, 0.0F));

            PartDefinition flame4 = centerflame.addOrReplaceChild("flame4", CubeListBuilder.create(), PartPose.offset(0.25F, 0.0F, 0.0F));

            PartDefinition flames4_r1 = flame4.addOrReplaceChild("flames4_r1", CubeListBuilder.create().texOffs(153, 60).addBox(0.0F, -7.5649F, -2.3964F, 0.0F, 13.0F, 12.0F, new CubeDeformation(-0.5F)), PartPose.offsetAndRotation(0.0F, -0.6087F, 1.1308F, -0.0436F, 0.0F, 0.0F));

            PartDefinition flame5 = centerflame.addOrReplaceChild("flame5", CubeListBuilder.create(), PartPose.offset(0.25F, 0.0F, 0.0F));

            PartDefinition flames5_r1 = flame5.addOrReplaceChild("flames5_r1", CubeListBuilder.create().texOffs(153, 74).addBox(0.0F, -7.5649F, -2.3964F, 0.0F, 13.0F, 12.0F, new CubeDeformation(-0.5F)), PartPose.offsetAndRotation(0.0F, -0.6087F, 1.1308F, -0.0436F, 0.0F, 0.0F));

            PartDefinition flame6 = centerflame.addOrReplaceChild("flame6", CubeListBuilder.create(), PartPose.offset(0.25F, 0.0F, 0.0F));

            PartDefinition flames6_r1 = flame6.addOrReplaceChild("flames6_r1", CubeListBuilder.create().texOffs(153, 88).addBox(0.0F, -7.5649F, -2.3964F, 0.0F, 13.0F, 12.0F, new CubeDeformation(-0.5F)), PartPose.offsetAndRotation(0.0F, -0.6087F, 1.1308F, -0.0436F, 0.0F, 0.0F));

            PartDefinition flame7 = centerflame.addOrReplaceChild("flame7", CubeListBuilder.create(), PartPose.offset(0.25F, 0.0F, 0.0F));

            PartDefinition flames7_r1 = flame7.addOrReplaceChild("flames7_r1", CubeListBuilder.create().texOffs(153, 102).addBox(0.0F, -7.5649F, -2.3964F, 0.0F, 13.0F, 12.0F, new CubeDeformation(-0.5F)), PartPose.offsetAndRotation(0.0F, -0.6087F, 1.1308F, -0.0436F, 0.0F, 0.0F));

            return LayerDefinition.create(meshdefinition, 256, 256);
        }

    @Override
    public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.root().getAllParts().forEach(ModelPart::resetPose);
        this.WholeHead.yRot = netHeadYaw * ((float) Math.PI / 180F);
        this.WholeHead.xRot = headPitch * ((float) Math.PI / 180F);

        this.animateWalk(PyroniteBabyV1AnimationDefinitions.BABY_PYRONITE_WALK, limbSwing, limbSwingAmount, 2f, 1.25f);
        this.animate(((pyronite_v1Entity) entity).idleAnimationState, PyroniteBabyV1AnimationDefinitions.BABY_PYRONITE_IDLE, ageInTicks, 1f);
    }

        @Override
        public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
            pyronite_v1_baby.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        }
    public ModelPart root() {
        return pyronite_v1_baby;
    }
}
