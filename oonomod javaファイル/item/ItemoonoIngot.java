package com.oono.oonomod.item;

import com.oono.oonomod.main.oonomod;
import net.minecraft.world.item.Item;

public class ItemoonoIngot extends Item {

    public ItemoonoIngot() {
        super(new Properties().tab(oonomod.OONOMOD_TAB).fireResistant());
        this.setRegistryName("oono_ingot");
    }
}
