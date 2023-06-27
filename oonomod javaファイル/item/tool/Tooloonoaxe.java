package com.oono.oonomod.item.tool;

import com.oono.oonomod.main.oonomod;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.Tier;

public class Tooloonoaxe extends AxeItem {
    public Tooloonoaxe() {
        super(oonomodTiers.OONO,3,-3.0F,new Properties().tab(oonomod.OONOMOD_TAB).fireResistant());
        this.setRegistryName("oono_axe");
    }
}
