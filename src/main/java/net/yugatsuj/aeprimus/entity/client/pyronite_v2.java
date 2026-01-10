package net.yugatsuj.aeprimus.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.npc.VillagerData;
import net.yugatsuj.aeprimus.entity.animations.PyroniteV1AnimationDefinitions;
import net.yugatsuj.aeprimus.entity.animations.PyroniteV2AnimationDefinitions;
import net.yugatsuj.aeprimus.entity.custom.pyronite_v1Entity;

public class pyronite_v2<T extends Entity> extends HierarchicalModel<T> {
        // This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
        public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "pyronite_v2"), "main");
        private final ModelPart pyronite_v2;
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
        private final ModelPart flame0;
        private final ModelPart flame1;
        private final ModelPart flame2;
        private final ModelPart flame3;
        private final ModelPart flame4;
        private final ModelPart flame5;
        private final ModelPart flame6;
        private final ModelPart flame7;
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

        public pyronite_v2(ModelPart root) {
            this.pyronite_v2 = root.getChild("pyronite_v2");
            this.WholeBody = this.pyronite_v2.getChild("WholeBody");
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
            this.WholeHead = this.pyronite_v2.getChild("WholeHead");
            this.head = this.WholeHead.getChild("head");
            this.mask = this.head.getChild("mask");
            this.jaw = this.mask.getChild("jaw");
            this.flames = this.WholeHead.getChild("flames");
            this.flame0 = this.flames.getChild("flame0");
            this.flame1 = this.flames.getChild("flame1");
            this.flame2 = this.flames.getChild("flame2");
            this.flame3 = this.flames.getChild("flame3");
            this.flame4 = this.flames.getChild("flame4");
            this.flame5 = this.flames.getChild("flame5");
            this.flame6 = this.flames.getChild("flame6");
            this.flame7 = this.flames.getChild("flame7");
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
        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshdefinition = new MeshDefinition();
            PartDefinition partdefinition = meshdefinition.getRoot();

            PartDefinition pyronite_v2 = partdefinition.addOrReplaceChild("pyronite_v2", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

            PartDefinition WholeBody = pyronite_v2.addOrReplaceChild("WholeBody", CubeListBuilder.create(), PartPose.offset(0.0F, -27.0F, 0.225F));

            PartDefinition body = WholeBody.addOrReplaceChild("body", CubeListBuilder.create().texOffs(76, 21).addBox(-2.04F, 10.7F, -0.9775F, 4.0F, 2.0F, 4.0F, new CubeDeformation(-0.1F))
                    .texOffs(38, 105).addBox(-3.59F, 5.9F, -2.4025F, 7.0F, 5.0F, 7.0F, new CubeDeformation(-0.2F)), PartPose.offset(0.0F, 2.0F, 0.0F));

            PartDefinition armorBodyHat = body.addOrReplaceChild("armorBodyHat", CubeListBuilder.create().texOffs(74, 0).addBox(-2.0325F, 10.8525F, -0.935F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.075F))
                    .texOffs(-2, 23).addBox(-3.61F, 5.88F, -2.4325F, 7.0F, 5.0F, 7.0F, new CubeDeformation(-0.1F)), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition chest2 = armorBodyHat.addOrReplaceChild("chest2", CubeListBuilder.create().texOffs(1, 89).addBox(-4.11F, -2.278F, -4.2989F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(0.0F, 2.2456F, 1.1231F, 0.0436F, 0.0F, 0.0F));

            PartDefinition neck2 = armorBodyHat.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.135F, 0.364F, 0.8682F, 0.3927F, 0.0F, 0.0F));

            PartDefinition neck2_r1 = neck2.addOrReplaceChild("neck2_r1", CubeListBuilder.create().texOffs(52, 0).addBox(-3.1F, -0.9875F, -2.8F, 6.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.135F, -0.8829F, 0.4613F, -0.3054F, 0.0F, 0.0F));

            PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create().texOffs(38, 90).addBox(-4.115F, -2.0082F, -3.6648F, 8.0F, 8.0F, 7.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 1.9956F, 1.1231F, 0.0436F, 0.0F, 0.0F));

            PartDefinition neck = body.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.135F, 0.07F, 0.99F, 0.3927F, 0.0F, 0.0F));

            PartDefinition neck_r1 = neck.addOrReplaceChild("neck_r1", CubeListBuilder.create().texOffs(60, 7).addBox(-4.5792F, -0.0885F, -1.7461F, 6.0F, 2.0F, 5.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.3742F, -1.7472F, -0.4708F, -0.3054F, 0.0F, 0.0F));

            PartDefinition LeftLeg = WholeBody.addOrReplaceChild("LeftLeg", CubeListBuilder.create(), PartPose.offset(1.535F, 12.15F, 1.125F));

            PartDefinition leftleg_r = LeftLeg.addOrReplaceChild("leftleg_r", CubeListBuilder.create(), PartPose.offsetAndRotation(0.09F, -3.825F, -0.225F, 0.0436F, 0.0F, 0.0F));

            PartDefinition leftleg_upper = leftleg_r.addOrReplaceChild("leftleg_upper", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition leftleg_upper_r1 = leftleg_upper.addOrReplaceChild("leftleg_upper_r1", CubeListBuilder.create().texOffs(30, 73).addBox(3.1036F, -13.8188F, -2.0966F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
                    .texOffs(72, 68).addBox(3.0736F, -13.9888F, -2.1265F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.3F)), PartPose.offsetAndRotation(-2.4096F, 18.8445F, -1.166F, -0.096F, -0.0873F, -0.0873F));

            PartDefinition leftleg_lower = leftleg_upper.addOrReplaceChild("leftleg_lower", CubeListBuilder.create().texOffs(0, 75).addBox(-1.4511F, 0.3001F, 0.2945F, 3.0F, 4.0F, 3.0F, new CubeDeformation(-0.1F))
                    .texOffs(76, 27).addBox(-1.4711F, 0.77F, 0.2745F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.1F))
                    .texOffs(30, 55).addBox(-0.9111F, 3.1851F, 0.8345F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3255F, 8.9075F, -2.486F, -0.0037F, -0.0858F, -0.0759F));

            PartDefinition armorLeftLeg_r1 = leftleg_lower.addOrReplaceChild("armorLeftLeg_r1", CubeListBuilder.create().texOffs(52, 7).addBox(1.9775F, 20.275F, 1.4175F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8873F, -12.5335F, 2.3338F, -0.0349F, 0.0F, 0.0716F));

            PartDefinition armorLeftLeg_r2 = leftleg_lower.addOrReplaceChild("armorLeftLeg_r2", CubeListBuilder.create().texOffs(72, 54).addBox(1.2601F, -1.8163F, -4.0825F, 3.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.7489F, 9.485F, 2.0625F, -0.0349F, 0.0F, 0.0716F));

            PartDefinition RightLeg = WholeBody.addOrReplaceChild("RightLeg", CubeListBuilder.create(), PartPose.offset(-1.535F, 12.15F, 1.125F));

            PartDefinition rightleg_r = RightLeg.addOrReplaceChild("rightleg_r", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.09F, -3.825F, -0.225F, 0.0436F, 0.0F, 0.0F));

            PartDefinition rightleg_upper = rightleg_r.addOrReplaceChild("rightleg_upper", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition rightleg_upper_r1 = rightleg_upper.addOrReplaceChild("rightleg_upper_r1", CubeListBuilder.create().texOffs(12, 74).addBox(-6.1036F, -13.8188F, -2.0966F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
                    .texOffs(42, 73).addBox(-6.0736F, -13.9888F, -2.1265F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.3F)), PartPose.offsetAndRotation(2.4096F, 18.8445F, -1.166F, -0.096F, 0.0873F, 0.0873F));

            PartDefinition rightleg_lower = rightleg_upper.addOrReplaceChild("rightleg_lower", CubeListBuilder.create().texOffs(76, 34).addBox(-1.5831F, 0.232F, -0.354F, 3.0F, 4.0F, 3.0F, new CubeDeformation(-0.1F))
                    .texOffs(76, 41).addBox(-1.5631F, 0.702F, -0.374F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.1F))
                    .texOffs(30, 62).addBox(-1.1231F, 3.117F, 0.186F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.3255F, 8.9075F, -1.764F, -0.0037F, 0.0858F, 0.0759F));

            PartDefinition armorRightLeg_r1 = rightleg_lower.addOrReplaceChild("armorRightLeg_r1", CubeListBuilder.create().texOffs(12, 63).addBox(-2.9775F, 20.275F, 1.4175F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8531F, -12.6015F, 1.6853F, -0.0349F, 0.0F, -0.0716F));

            PartDefinition armorRightLeg_r2 = rightleg_lower.addOrReplaceChild("armorRightLeg_r2", CubeListBuilder.create().texOffs(72, 61).addBox(-4.2601F, -1.8163F, -4.0825F, 3.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.7147F, 9.417F, 1.414F, -0.0349F, 0.0F, -0.0716F));

            PartDefinition LeftArm = WholeBody.addOrReplaceChild("LeftArm", CubeListBuilder.create(), PartPose.offsetAndRotation(4.05F, 4.025F, 1.35F, 0.0F, 0.0F, -0.0436F));

            PartDefinition leftarm_r = LeftArm.addOrReplaceChild("leftarm_r", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.225F, -0.9F, -0.225F, 0.0437F, -0.0436F, -0.0019F));

            PartDefinition leftarm_upper = leftarm_r.addOrReplaceChild("leftarm_upper", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.225F, 0.0F, 0.225F, 0.0873F, 0.0F, -0.1745F));

            PartDefinition leftarm_upper_r1 = leftarm_upper.addOrReplaceChild("leftarm_upper_r1", CubeListBuilder.create().texOffs(0, 63).addBox(3.815F, 2.71F, -1.415F, 3.0F, 9.0F, 3.0F, new CubeDeformation(-0.1F))
                    .texOffs(60, 54).addBox(3.835F, 2.69F, -1.435F, 3.0F, 9.0F, 3.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(-3.825F, -3.6F, -0.675F, 0.0F, 0.0F, -0.0436F));

            PartDefinition leftarm_lower = leftarm_upper.addOrReplaceChild("leftarm_lower", CubeListBuilder.create().texOffs(24, 33).addBox(-1.3155F, -0.4003F, -3.2312F, 5.0F, 6.0F, 5.0F, new CubeDeformation(-0.15F))
                    .texOffs(0, 35).addBox(-1.3455F, -0.3703F, -3.2012F, 5.0F, 6.0F, 5.0F, new CubeDeformation(-0.45F)), PartPose.offsetAndRotation(0.7555F, 7.5712F, -0.0424F, -0.2618F, 0.0F, 0.0436F));

            PartDefinition leftarm_hand = leftarm_lower.addOrReplaceChild("leftarm_hand", CubeListBuilder.create(), PartPose.offsetAndRotation(0.136F, 5.7915F, -0.3551F, 0.3016F, -0.0435F, 0.0873F));

            PartDefinition leftarm_hand_r1 = leftarm_hand.addOrReplaceChild("leftarm_hand_r1", CubeListBuilder.create().texOffs(12, 68).addBox(-3.0135F, -1.3663F, -2.7758F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9F, 0.0F, -0.225F, -0.2345F, 0.1183F, 0.2501F));

            PartDefinition leftarm_hand_r2 = leftarm_hand.addOrReplaceChild("leftarm_hand_r2", CubeListBuilder.create().texOffs(40, 44).addBox(-1.7327F, -1.5047F, -2.7968F, 5.0F, 5.0F, 5.0F, new CubeDeformation(-0.401F))
                    .texOffs(0, 56).addBox(-1.6927F, -1.2146F, -2.7868F, 5.0F, 2.0F, 5.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0889F, -0.102F, 0.0218F, -0.2511F, 0.0762F, 0.0799F));

            PartDefinition RightArm = WholeBody.addOrReplaceChild("RightArm", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.05F, 4.025F, 1.35F, 0.0F, 0.0F, 0.0436F));

            PartDefinition rightarm_r = RightArm.addOrReplaceChild("rightarm_r", CubeListBuilder.create(), PartPose.offsetAndRotation(0.225F, -0.9F, -0.225F, 0.0437F, 0.0436F, 0.0019F));

            PartDefinition rightarm_upper = rightarm_r.addOrReplaceChild("rightarm_upper", CubeListBuilder.create(), PartPose.offsetAndRotation(0.225F, 0.0F, 0.225F, 0.0873F, 0.0F, 0.1745F));

            PartDefinition rightarm_upper_r1 = rightarm_upper.addOrReplaceChild("rightarm_upper_r1", CubeListBuilder.create().texOffs(60, 66).addBox(-2.4802F, -0.6121F, -1.8312F, 3.0F, 9.0F, 3.0F, new CubeDeformation(-0.1F))
                    .texOffs(64, 31).addBox(-2.5002F, -0.6321F, -1.8512F, 3.0F, 9.0F, 3.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(-0.6506F, -0.4701F, -0.2588F, 0.0F, 0.0F, 0.0436F));

            PartDefinition rightarm_lower = rightarm_upper.addOrReplaceChild("rightarm_lower", CubeListBuilder.create().texOffs(20, 44).addBox(-3.6845F, -0.4003F, -3.2312F, 5.0F, 6.0F, 5.0F, new CubeDeformation(-0.15F))
                    .texOffs(44, 33).addBox(-3.6545F, -0.3703F, -3.2012F, 5.0F, 6.0F, 5.0F, new CubeDeformation(-0.45F)), PartPose.offsetAndRotation(-0.7555F, 7.5712F, -0.0424F, -0.2618F, 0.0F, -0.0436F));

            PartDefinition rightarm_hand = rightarm_lower.addOrReplaceChild("rightarm_hand", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.136F, 5.7915F, -0.3551F, 0.3016F, 0.0435F, -0.0873F));

            PartDefinition rightarm_hand_r1 = rightarm_hand.addOrReplaceChild("rightarm_hand_r1", CubeListBuilder.create().texOffs(76, 48).addBox(-3.5272F, 11.3543F, 0.4414F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.241F, -13.8328F, 0.1387F, -0.2345F, -0.1183F, -0.2501F));

            PartDefinition rightarm_hand_r2 = rightarm_hand.addOrReplaceChild("rightarm_hand_r2", CubeListBuilder.create().texOffs(0, 46).addBox(-4.6971F, 11.7295F, 0.5895F, 5.0F, 5.0F, 5.0F, new CubeDeformation(-0.401F))
                    .texOffs(60, 14).addBox(-4.7371F, 12.0197F, 0.5995F, 5.0F, 2.0F, 5.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.241F, -13.8328F, 0.1387F, -0.2511F, -0.0762F, -0.0799F));

            PartDefinition WholeHead = pyronite_v2.addOrReplaceChild("WholeHead", CubeListBuilder.create(), PartPose.offset(0.0F, -27.25F, 0.675F));

            PartDefinition head = WholeHead.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1281F, -3.3236F, 0.0873F, 0.0F, 0.0F));

            PartDefinition head_r1 = head.addOrReplaceChild("head_r1", CubeListBuilder.create().texOffs(60, 44).addBox(-1.9212F, -2.9668F, -1.9212F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F))
                    .texOffs(60, 21).addBox(-1.8999F, -3.5149F, -1.8999F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.2F)), PartPose.offsetAndRotation(0.0F, -2.2531F, 3.0146F, 0.0F, -0.7854F, 0.0F));

            PartDefinition mask = head.addOrReplaceChild("mask", CubeListBuilder.create(), PartPose.offset(0.0F, -0.7044F, 1.217F));

            PartDefinition mask_r1 = mask.addOrReplaceChild("mask_r1", CubeListBuilder.create().texOffs(97, 50).mirror().addBox(-3.565F, -2.9007F, -1.2875F, 5.0F, 5.0F, 0.0F, new CubeDeformation(-0.6F)).mirror(false)
                    .texOffs(93, 35).mirror().addBox(-3.1399F, -3.1507F, -1.0375F, 4.0F, 5.0F, 0.0F, new CubeDeformation(-0.6F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.3837F, -0.8031F, 0.0F, 0.5236F, 0.0F));

            PartDefinition mask_r2 = mask.addOrReplaceChild("mask_r2", CubeListBuilder.create().texOffs(97, 50).addBox(-1.4326F, -2.8985F, -1.2909F, 5.0F, 5.0F, 0.0F, new CubeDeformation(-0.8F))
                    .texOffs(95, 40).addBox(-0.8576F, -3.1485F, -1.0409F, 4.0F, 5.0F, 0.0F, new CubeDeformation(-0.6F)), PartPose.offsetAndRotation(0.0F, -1.3837F, -0.8031F, 0.0F, -0.5236F, 0.0F));

            PartDefinition jaw = mask.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offset(0.0F, 2.6447F, -1.0407F));

            PartDefinition jaw_r1 = jaw.addOrReplaceChild("jaw_r1", CubeListBuilder.create().texOffs(2, 1).addBox(0.0016F, -4.7066F, 0.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.1699F, -0.2317F, 0.0F, -0.5236F, 0.0F));

            PartDefinition jaw_r2 = jaw.addOrReplaceChild("jaw_r2", CubeListBuilder.create().texOffs(6, 1).addBox(-1.0F, -4.7066F, 0.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.1699F, -0.2317F, 0.0F, 0.5236F, 0.0F));

            PartDefinition flames = WholeHead.addOrReplaceChild("flames", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -3.4109F, -1.5881F, 0.1309F, 0.0F, 0.0F));

            PartDefinition flame0 = flames.addOrReplaceChild("flame0", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition flames_r1 = flame0.addOrReplaceChild("flames_r1", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -7.5649F, -2.3964F, 0.0F, 13.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6087F, 1.1308F, -0.0436F, 0.0F, 0.0F));

            PartDefinition flame1 = flames.addOrReplaceChild("flame1", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition flames1_r1 = flame1.addOrReplaceChild("flames1_r1", CubeListBuilder.create().texOffs(79, 89).addBox(0.0F, -7.5649F, -2.3964F, 0.0F, 13.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6087F, 1.1308F, -0.0436F, 0.0F, 0.0F));

            PartDefinition flame2 = flames.addOrReplaceChild("flame2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition flames2_r1 = flame2.addOrReplaceChild("flames2_r1", CubeListBuilder.create().texOffs(79, 103).addBox(0.0F, -7.5649F, -2.3964F, 0.0F, 13.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6087F, 1.1308F, -0.0436F, 0.0F, 0.0F));

            PartDefinition flame3 = flames.addOrReplaceChild("flame3", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition flames3_r1 = flame3.addOrReplaceChild("flames3_r1", CubeListBuilder.create().texOffs(104, 103).addBox(0.0F, -7.5649F, -2.3964F, 0.0F, 13.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6087F, 1.1308F, -0.0436F, 0.0F, 0.0F));

            PartDefinition flame4 = flames.addOrReplaceChild("flame4", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition flames4_r1 = flame4.addOrReplaceChild("flames4_r1", CubeListBuilder.create().texOffs(104, 47).addBox(0.0F, -7.5649F, -2.3964F, 0.0F, 13.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6087F, 1.1308F, -0.0436F, 0.0F, 0.0F));

            PartDefinition flame5 = flames.addOrReplaceChild("flame5", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition flames5_r1 = flame5.addOrReplaceChild("flames5_r1", CubeListBuilder.create().texOffs(104, 61).addBox(0.0F, -7.5649F, -2.3964F, 0.0F, 13.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6087F, 1.1308F, -0.0436F, 0.0F, 0.0F));

            PartDefinition flame6 = flames.addOrReplaceChild("flame6", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition flames6_r1 = flame6.addOrReplaceChild("flames6_r1", CubeListBuilder.create().texOffs(104, 75).addBox(0.0F, -7.5649F, -2.3964F, 0.0F, 13.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6087F, 1.1308F, -0.0436F, 0.0F, 0.0F));

            PartDefinition flame7 = flames.addOrReplaceChild("flame7", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition flames7_r1 = flame7.addOrReplaceChild("flames7_r1", CubeListBuilder.create().texOffs(104, 89).addBox(0.0F, -7.5649F, -2.3964F, 0.0F, 13.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6087F, 1.1308F, -0.0436F, 0.0F, 0.0F));

            PartDefinition fireleft = flames.addOrReplaceChild("fireleft", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4589F, 2.2991F, -0.1309F, 0.0F, 0.0F));

            PartDefinition fireleft0 = fireleft.addOrReplaceChild("fireleft0", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition fireleft_r1 = fireleft0.addOrReplaceChild("fireleft_r1", CubeListBuilder.create().texOffs(40, 54).addBox(0.0F, -8.5649F, -5.0F, 0.0F, 14.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0553F, 0.0116F, -3.0738F, -0.8715F, 3.0897F));

            PartDefinition fireleft_r2 = fireleft0.addOrReplaceChild("fireleft_r2", CubeListBuilder.create().texOffs(50, 12).addBox(0.0F, -8.5649F, -5.0F, 0.0F, 14.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0553F, 0.0116F, -0.0716F, -0.9151F, 0.0568F));

            PartDefinition fireleft1 = fireleft.addOrReplaceChild("fireleft1", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition fireleft_r3 = fireleft1.addOrReplaceChild("fireleft_r3", CubeListBuilder.create().texOffs(135, -4).addBox(0.0F, -8.5649F, -5.0F, 0.0F, 14.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0553F, 0.0116F, -3.0738F, -0.8715F, 3.0897F));

            PartDefinition fireleft_r4 = fireleft1.addOrReplaceChild("fireleft_r4", CubeListBuilder.create().texOffs(146, -4).addBox(0.0F, -8.5649F, -5.0F, 0.0F, 14.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0553F, 0.0116F, -0.0716F, -0.9151F, 0.0568F));

            PartDefinition fireleft2 = fireleft.addOrReplaceChild("fireleft2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition fireleft_r5 = fireleft2.addOrReplaceChild("fireleft_r5", CubeListBuilder.create().texOffs(146, 13).addBox(0.0F, -8.5649F, -5.0F, 0.0F, 14.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0553F, 0.0116F, -3.0738F, -0.8715F, 3.0897F));

            PartDefinition fireleft_r6 = fireleft2.addOrReplaceChild("fireleft_r6", CubeListBuilder.create().texOffs(135, 13).addBox(0.0F, -8.5649F, -5.0F, 0.0F, 14.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0553F, 0.0116F, -0.0716F, -0.9151F, 0.0568F));

            PartDefinition fireleft3 = fireleft.addOrReplaceChild("fireleft3", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition fireleft_r7 = fireleft3.addOrReplaceChild("fireleft_r7", CubeListBuilder.create().texOffs(145, 28).addBox(0.0F, -8.5649F, -5.0F, 0.0F, 14.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0553F, 0.0116F, -3.0738F, -0.8715F, 3.0897F));

            PartDefinition fireleft_r8 = fireleft3.addOrReplaceChild("fireleft_r8", CubeListBuilder.create().texOffs(135, 28).addBox(0.0F, -8.5649F, -5.0F, 0.0F, 14.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0553F, 0.0116F, -0.0716F, -0.9151F, 0.0568F));

            PartDefinition fireleft4 = fireleft.addOrReplaceChild("fireleft4", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition fireleft_r9 = fireleft4.addOrReplaceChild("fireleft_r9", CubeListBuilder.create().texOffs(135, 44).addBox(0.0F, -8.5649F, -5.0F, 0.0F, 14.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0553F, 0.0116F, -3.0738F, -0.8715F, 3.0897F));

            PartDefinition fireleft_r10 = fireleft4.addOrReplaceChild("fireleft_r10", CubeListBuilder.create().texOffs(146, 44).addBox(0.0F, -8.5649F, -5.0F, 0.0F, 14.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0553F, 0.0116F, -0.0716F, -0.9151F, 0.0568F));

            PartDefinition fireleft5 = fireleft.addOrReplaceChild("fireleft5", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition fireleft_r11 = fireleft5.addOrReplaceChild("fireleft_r11", CubeListBuilder.create().texOffs(135, 60).addBox(0.0F, -8.5649F, -5.0F, 0.0F, 14.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0553F, 0.0116F, -3.0738F, -0.8715F, 3.0897F));

            PartDefinition fireleft_r12 = fireleft5.addOrReplaceChild("fireleft_r12", CubeListBuilder.create().texOffs(146, 60).addBox(0.0F, -8.5649F, -5.0F, 0.0F, 14.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0553F, 0.0116F, -0.0716F, -0.9151F, 0.0568F));

            PartDefinition fireleft6 = fireleft.addOrReplaceChild("fireleft6", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition fireleft_r13 = fireleft6.addOrReplaceChild("fireleft_r13", CubeListBuilder.create().texOffs(135, 76).addBox(0.0F, -8.5649F, -5.0F, 0.0F, 14.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0553F, 0.0116F, -3.0738F, -0.8715F, 3.0897F));

            PartDefinition fireleft_r14 = fireleft6.addOrReplaceChild("fireleft_r14", CubeListBuilder.create().texOffs(146, 76).addBox(0.0F, -8.5649F, -5.0F, 0.0F, 14.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0553F, 0.0116F, -0.0716F, -0.9151F, 0.0568F));

            PartDefinition fireleft7 = fireleft.addOrReplaceChild("fireleft7", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition fireleft_r15 = fireleft7.addOrReplaceChild("fireleft_r15", CubeListBuilder.create().texOffs(134, 92).addBox(0.0F, -8.5649F, -5.0F, 0.0F, 14.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0553F, 0.0116F, -3.0738F, -0.8715F, 3.0897F));

            PartDefinition fireleft_r16 = fireleft7.addOrReplaceChild("fireleft_r16", CubeListBuilder.create().texOffs(145, 92).addBox(0.0F, -8.5649F, -5.0F, 0.0F, 14.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0553F, 0.0116F, -0.0716F, -0.9151F, 0.0568F));

            PartDefinition fireright = flames.addOrReplaceChild("fireright", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4589F, 2.2991F, -0.1309F, 0.0F, 0.0F));

            PartDefinition fireright0 = fireright.addOrReplaceChild("fireright0", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition fireright_r1 = fireright0.addOrReplaceChild("fireright_r1", CubeListBuilder.create().texOffs(20, 55).addBox(0.0F, -8.5649F, -5.0F, 0.0F, 14.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0553F, 0.0116F, -3.0738F, 0.8715F, -3.0897F));

            PartDefinition fireright_r2 = fireright0.addOrReplaceChild("fireright_r2", CubeListBuilder.create().texOffs(50, 54).addBox(0.0F, -8.5649F, -5.0F, 0.0F, 14.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0553F, 0.0116F, -0.0716F, 0.9151F, -0.0568F));

            PartDefinition fireright1 = fireright.addOrReplaceChild("fireright1", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition fireright_r3 = fireright1.addOrReplaceChild("fireright_r3", CubeListBuilder.create().texOffs(160, -1).mirror().addBox(0.0F, -8.5649F, -5.0F, 0.0F, 14.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.0553F, 0.0116F, -3.0738F, 0.8715F, -3.0897F));

            PartDefinition fireright_r4 = fireright1.addOrReplaceChild("fireright_r4", CubeListBuilder.create().texOffs(171, -1).mirror().addBox(0.0F, -8.5649F, -5.0F, 0.0F, 14.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.0553F, 0.0116F, -0.0716F, 0.9151F, -0.0568F));

            PartDefinition fireright2 = fireright.addOrReplaceChild("fireright2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition fireright_r5 = fireright2.addOrReplaceChild("fireright_r5", CubeListBuilder.create().texOffs(171, 16).mirror().addBox(0.0F, -8.5649F, -5.0F, 0.0F, 14.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.0553F, 0.0116F, -3.0738F, 0.8715F, -3.0897F));

            PartDefinition fireright_r6 = fireright2.addOrReplaceChild("fireright_r6", CubeListBuilder.create().texOffs(160, 16).mirror().addBox(0.0F, -8.5649F, -5.0F, 0.0F, 14.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.0553F, 0.0116F, -0.0716F, 0.9151F, -0.0568F));

            PartDefinition fireright3 = fireright.addOrReplaceChild("fireright3", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition fireright_r7 = fireright3.addOrReplaceChild("fireright_r7", CubeListBuilder.create().texOffs(170, 31).mirror().addBox(0.0F, -8.5649F, -5.0F, 0.0F, 14.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.0553F, 0.0116F, -3.0738F, 0.8715F, -3.0897F));

            PartDefinition fireright_r8 = fireright3.addOrReplaceChild("fireright_r8", CubeListBuilder.create().texOffs(160, 31).mirror().addBox(0.0F, -8.5649F, -5.0F, 0.0F, 14.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.0553F, 0.0116F, -0.0716F, 0.9151F, -0.0568F));

            PartDefinition fireright4 = fireright.addOrReplaceChild("fireright4", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition fireright_r9 = fireright4.addOrReplaceChild("fireright_r9", CubeListBuilder.create().texOffs(160, 47).mirror().addBox(0.0F, -8.5649F, -5.0F, 0.0F, 14.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.0553F, 0.0116F, -3.0738F, 0.8715F, -3.0897F));

            PartDefinition fireright_r10 = fireright4.addOrReplaceChild("fireright_r10", CubeListBuilder.create().texOffs(171, 47).mirror().addBox(0.0F, -8.5649F, -5.0F, 0.0F, 14.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.0553F, 0.0116F, -0.0716F, 0.9151F, -0.0568F));

            PartDefinition fireright5 = fireright.addOrReplaceChild("fireright5", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition fireright_r11 = fireright5.addOrReplaceChild("fireright_r11", CubeListBuilder.create().texOffs(160, 63).mirror().addBox(0.0F, -8.5649F, -5.0F, 0.0F, 14.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.0553F, 0.0116F, -3.0738F, 0.8715F, -3.0897F));

            PartDefinition fireright_r12 = fireright5.addOrReplaceChild("fireright_r12", CubeListBuilder.create().texOffs(171, 63).mirror().addBox(0.0F, -8.5649F, -5.0F, 0.0F, 14.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.0553F, 0.0116F, -0.0716F, 0.9151F, -0.0568F));

            PartDefinition fireright6 = fireright.addOrReplaceChild("fireright6", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition fireright_r13 = fireright6.addOrReplaceChild("fireright_r13", CubeListBuilder.create().texOffs(160, 79).mirror().addBox(0.0F, -8.5649F, -5.0F, 0.0F, 14.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.0553F, 0.0116F, -3.0738F, 0.8715F, -3.0897F));

            PartDefinition fireright_r14 = fireright6.addOrReplaceChild("fireright_r14", CubeListBuilder.create().texOffs(171, 79).mirror().addBox(0.0F, -8.5649F, -5.0F, 0.0F, 14.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.0553F, 0.0116F, -0.0716F, 0.9151F, -0.0568F));

            PartDefinition fireright7 = fireright.addOrReplaceChild("fireright7", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition fireright_r15 = fireright7.addOrReplaceChild("fireright_r15", CubeListBuilder.create().texOffs(159, 95).mirror().addBox(0.0F, -8.5649F, -5.0F, 0.0F, 14.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.0553F, 0.0116F, -3.0738F, 0.8715F, -3.0897F));

            PartDefinition fireright_r16 = fireright7.addOrReplaceChild("fireright_r16", CubeListBuilder.create().texOffs(170, 95).mirror().addBox(0.0F, -8.5649F, -5.0F, 0.0F, 14.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.0553F, 0.0116F, -0.0716F, 0.9151F, -0.0568F));

            return LayerDefinition.create(meshdefinition, 256, 256);
        }

    @Override
    public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.root().getAllParts().forEach(ModelPart::resetPose);
        this.WholeHead.yRot = netHeadYaw * ((float)Math.PI / 180F);
        this.WholeHead.xRot = headPitch * ((float)Math.PI / 180F);

        this.animateWalk(PyroniteV2AnimationDefinitions.PYRONITE_WALK, limbSwing, limbSwingAmount, 2f, 1.25f);
        this.animate(((pyronite_v1Entity) entity).idleAnimationState, PyroniteV2AnimationDefinitions.PYRONITE_IDLE, ageInTicks, 1f);

        if(entity instanceof pyronite_v1Entity villager) {
            if(villager.offerAnimationState.isStarted()) {
                float progress = ageInTicks * 0.1F;
                this.leftarm_upper.xRot = -0.75F + Mth.cos(progress) * 0.05F;
                this.leftarm_upper.yRot = 0.2F;
                this.rightarm_upper.xRot = -0.75F + Mth.cos(progress) * 0.05F;
                this.rightarm_upper.yRot = -0.2F;
            }
        }
    }

        @Override
        public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
            pyronite_v2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        }

        @Override
        public ModelPart root() {
            return pyronite_v2;
        }
    }