package net.yugatsuj.aeprimus.mixins;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.BufferBuilder;
import com.mojang.blaze3d.vertex.DefaultVertexFormat;
import com.mojang.blaze3d.vertex.Tesselator;
import com.mojang.blaze3d.vertex.VertexFormat;
import com.mojang.math.Axis;

import earth.terrarium.adastra.client.screens.PlanetsScreen;

import net.minecraft.Util;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.yugatsuj.aeprimus.screens.utils.DimensionRenderingUtils;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import net.yugatsuj.aeprimus.common.constants.PlanetConstants;

import javax.annotation.Nullable;
import java.awt.*;
// Planets screen mixin that is inspired by a post on ad astra github
@Mixin(PlanetsScreen.class)
public class PlanetsScreenMixin extends Screen {

    @Shadow
    private @Nullable ResourceLocation selectedSolarSystem;

    protected PlanetsScreenMixin(Component p_96550_) {
        super(p_96550_);
    }

    @Inject(method = "renderBackground", at = @At("TAIL"))
    private void onRenderBackground(GuiGraphics graphics, CallbackInfo ci) {
        if (!PlanetConstants.PYROS_SYSTEM.equals(this.selectedSolarSystem)) return;

        Tesselator tessellator = Tesselator.getInstance();
        BufferBuilder bufferBuilder = tessellator.getBuilder();
        RenderSystem.setShader(GameRenderer::getPositionColorShader);
        bufferBuilder.begin(VertexFormat.Mode.DEBUG_LINES, DefaultVertexFormat.POSITION_COLOR);
        PlanetsScreen.drawCircle(bufferBuilder, this.width / 2f, this.height / 2f, 32, 75, 0xffFF6600);
        tessellator.end();

        graphics.blit(DimensionRenderingUtils.PYROS, this.width / 2 - 8, this.height / 2 - 8, 0, 0, 16, 16, 16, 16);
        float rotation = Util.getMillis() / 100f;
        graphics.pose().pushPose();
        graphics.pose().translate(width / 2f, height / 2f, 0);
        graphics.pose().mulPose(Axis.ZP.rotationDegrees(rotation));
        graphics.pose().translate(24, 0, 0);
        graphics.blit(DimensionRenderingUtils.CRABDOZER_BALL, 0, 0, 0, 0, 12, 12, 12, 12);
        graphics.pose().popPose();
    }
}