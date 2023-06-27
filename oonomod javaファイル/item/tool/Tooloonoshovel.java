package com.oono.oonomod.item.tool;

import com.oono.oonomod.main.oonomod;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.Tier;

public class Tooloonoshovel extends ShovelItem {
    public Tooloonoshovel() {
        super(oonomodTiers.OONO,1, -2.8F,new Properties().tab(oonomod.OONOMOD_TAB).fireResistant());
        this.setRegistryName("oono_shovel");
    }
}
