package net.yugatsuj.aeprimus;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.BufferBuilder;
import com.mojang.blaze3d.vertex.DefaultVertexFormat;
import com.mojang.blaze3d.vertex.Tesselator;
import com.mojang.blaze3d.vertex.VertexFormat;
import com.mojang.logging.LogUtils;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.yugatsuj.aeprimus.block.ModBlocks;
import net.yugatsuj.aeprimus.client.events.AePrimusClientEvents;
import net.yugatsuj.aeprimus.common.constants.PlanetConstants;
import net.yugatsuj.aeprimus.entity.ModEntities;
import net.yugatsuj.aeprimus.entity.client.*;
import net.yugatsuj.aeprimus.item.ModCreativeModTabs;
import net.yugatsuj.aeprimus.item.ModItems;
import org.slf4j.Logger;

@Mod(AePrimus.MOD_ID)
public class AePrimus {
    public static final String MOD_ID = "ae_primus";
    private static final Logger LOGGER = LogUtils.getLogger();

    public AePrimus() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        ModCreativeModTabs.register(modEventBus);
        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);
        ModEntities.register(modEventBus);
        modEventBus.addListener(this::commonSetup);
        MinecraftForge.EVENT_BUS.register(this);
        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.INGREDIENTS) {
            event.accept(ModItems.PYROSIANASH);
        }
    }

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        

        @SubscribeEvent
        public static void registerRenderers(EntityRenderersEvent.RegisterRenderers event) {
            event.registerEntityRenderer(ModEntities.PYRONITE.get(), pyronite_v1Renderer::new);
            event.registerEntityRenderer(ModEntities.CRABDOZER.get(), crabdozerRenderer::new);
        }

        @SubscribeEvent
        public static void registerLayer(EntityRenderersEvent.RegisterLayerDefinitions event) {
            event.registerLayerDefinition(ModModelLayers.CRABDOZER_LAYER, crabdozer::createBodyLayer);
            event.registerLayerDefinition(ModModelLayers.PYRONITEV1_LAYER, pyronite_v1::createBodyLayer);
            event.registerLayerDefinition(ModModelLayers.PYRONITEV1_BABY_LAYER, pyronite_v1_baby::createBodyLayer);
            event.registerLayerDefinition(ModModelLayers.PYRONITEV2_LAYER, pyronite_v2::createBodyLayer);
            event.registerLayerDefinition(ModModelLayers.PYRONITEV2_BABY_LAYER, pyronite_v2_baby::createBodyLayer);
            event.registerLayerDefinition(ModModelLayers.PYRONITEV3_LAYER, pyronite_v3::createBodyLayer);
            event.registerLayerDefinition(ModModelLayers.PYRONITEV3_BABY_LAYER, pyronite_v3_baby::createBodyLayer);
        }
    }
}