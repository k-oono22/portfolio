package com.oono.oonomod.item.tool;

import com.oono.oonomod.main.oonomod;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.Tier;

public class Tooloonohoe extends HoeItem {
    public Tooloonohoe() {
        super(oonomodTiers.OONO,0,-3.0F,new Properties().tab(oonomod.OONOMOD_TAB).fireResistant());
        this.setRegistryName("oono_hoe");
    }
}
