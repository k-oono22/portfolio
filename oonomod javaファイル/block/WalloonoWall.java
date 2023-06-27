package com.oono.oonomod.block;

import net.minecraft.world.level.block.WallBlock;

public class WalloonoWall extends WallBlock {
    public WalloonoWall() {
        super(Properties.copy(new BlockoonoBlock()));
        this.setRegistryName("oono_wall");
    }
}
