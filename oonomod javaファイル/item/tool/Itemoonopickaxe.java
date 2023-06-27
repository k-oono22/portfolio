package com.oono.oonomod.item.tool;

import com.oono.oonomod.main.oonomod;
import net.minecraft.world.item.Item;

public class Itemoonopickaxe extends Item {

    public Itemoonopickaxe() {
        super(new Properties().tab(oonomod.OONOMOD_TAB).fireResistant());
        this.setRegistryName("oono_pickaxe");
    }
}
