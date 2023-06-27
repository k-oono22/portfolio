package com.oono.oonomod.item.tool;

import com.oono.oonomod.main.oonomod;
import net.minecraft.world.item.Item;

public class Itemrawoono extends Item {
    public Itemrawoono() {
        super(new Properties().tab(oonomod.OONOMOD_TAB).fireResistant());
        this.setRegistryName("raw_oono");
    }
}
