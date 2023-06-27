package com.oono.oonomod.block.ore;

import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.block.OreBlock;
import net.minecraft.world.level.material.Material;

public class OreoonoOre extends OreBlock {
    public OreoonoOre() {
        super(Properties.of(Material.STONE)
                        .strength(3.0F,12000F)
                        .requiresCorrectToolForDrops()
                        .lightLevel(value -> 15)
                , UniformInt.of(25,29)
        );
        this.setRegistryName("oono_ore");
    }
}
