package com.oono.oonomod.regi;

import com.oono.oonomod.main.oonomod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.Tags;

public class oonomodTag {

    public static class Blocks {

        public static final Tags.IOptionalNamedTag NEEDS_OONO_TOOL = tag("needs_oono_tool");

        public static final Tags.IOptionalNamedTag<Block> tag(String name){
            return BlockTags.createOptional(new ResourceLocation(oonomod.MOD_ID, name));
        }
    }

    /*public static class Items {

        public static final Tags.IOptionalNamedTag<Item> tag(String name){
            return ItemTags.createOptional(new ResourceLocation(oonomod.MOD_ID, name));
        }
    }*/
}
