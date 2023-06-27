package com.oono.oonomod.block;

import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;

public class BlockoonoBlock extends Block {
    public BlockoonoBlock() {
        super(Properties.of(Material.METAL)
                .strength(7.0F, 12000F)
                .sound(SoundType.DEEPSLATE)
                .lightLevel(value -> 15).requiresCorrectToolForDrops());

        this.setRegistryName("oono_block");
    }
}
