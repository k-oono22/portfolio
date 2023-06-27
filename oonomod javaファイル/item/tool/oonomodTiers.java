package com.oono.oonomod.item.tool;

import com.oono.oonomod.main.oonomod;
import com.oono.oonomod.regi.oonomodItems;
import com.oono.oonomod.regi.oonomodTag;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class oonomodTiers {

    public static final ForgeTier OONO = new ForgeTier(5,6000,15F,6F,100, oonomodTag.Blocks.NEEDS_OONO_TOOL,()-> Ingredient.of(oonomodItems.OONO_INGOT));

    static {
        TierSortingRegistry.registerTier(OONO,new ResourceLocation(oonomod.MOD_ID,"oono"), List.of(TierSortingRegistry.getName(Tiers.NETHERITE)),List.of());
    }
}
