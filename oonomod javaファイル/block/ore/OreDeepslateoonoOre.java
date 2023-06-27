package com.oono.oonomod.block.ore;

import com.oono.oonomod.regi.oonomodBlocks;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.block.OreBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.MaterialColor;

public class OreDeepslateoonoOre extends OreBlock {
    public OreDeepslateoonoOre() {
        super(Properties.copy(oonomodBlocks.OONO_ORE)
                .color(MaterialColor.DEEPSLATE)
                .sound(SoundType.DEEPSLATE)
                .strength(4.5F,12000F)
                , UniformInt.of(5,9)
        );
        this.setRegistryName("deepslate_oono_ore");
    }
}
