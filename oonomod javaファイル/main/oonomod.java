package com.oono.oonomod.main;

import com.oono.oonomod.block.ore.oonoOreSettings;
import net.minecraft.world.entity.vehicle.Minecart;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.fml.common.Mod;

@Mod("oonomod")
public class oonomod {
    public static final String MOD_ID = "oonomod";

    public static final CreativeModeTab OONOMOD_TAB = new oonomodTab();

    public oonomod(){
        MinecraftForge.EVENT_BUS.addListener(EventPriority.HIGHEST, oonoOreSettings::oreGen);
    }
}
