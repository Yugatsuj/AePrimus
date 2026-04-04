package net.yugatsuj.aeprimus.common.compat;

import mezz.jei.api.IModPlugin;
import mezz.jei.api.registration.IGuiHandlerRegistration;
import mezz.jei.api.registration.IRecipeCatalystRegistration;
import mezz.jei.api.registration.IRecipeCategoryRegistration;
import mezz.jei.api.registration.IRecipeRegistration;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.NotNull;
// Jei Compatability stuff
public class AePrimusJeiPlugin implements IModPlugin {

    @Override
    public ResourceLocation getPluginUid() {
        return null;
    }
    @Override
    public void registerCategories(IRecipeCategoryRegistration registration) {

    }
    @Override
    public void registerRecipes(IRecipeRegistration registration) {

    }
    @Override
    public void registerRecipeCatalysts(IRecipeCatalystRegistration registration) {

    }
    @Override
    public void registerGuiHandlers(@NotNull IGuiHandlerRegistration registration) {

    }
}
