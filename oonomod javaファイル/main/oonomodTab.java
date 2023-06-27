package com.oono.oonomod.main;

import com.oono.oonomod.item.ItemoonoIngot;
import com.oono.oonomod.regi.oonomodItems;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

public class oonomodTab extends CreativeModeTab {

    public oonomodTab() {
        super("oonomod_tab");
    }

    @Override
    public ItemStack makeIcon() {

        return new ItemStack(oonomodItems.OONO_INGOT);
    }
}
