package com.oono.oonomod.regi;

import com.oono.oonomod.item.ItemoonoIngot;
import com.oono.oonomod.item.tool.*;
import com.oono.oonomod.main.oonomod;
import net.minecraft.world.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

@ObjectHolder(oonomod.MOD_ID)
public class oonomodItems {

    public static final ItemoonoIngot OONO_INGOT = new ItemoonoIngot();
    public static final TooloonoPickaxe OONO_PICKAXE = new TooloonoPickaxe();
    public static final Tooloonosword OONO_SWORD = new Tooloonosword();
    public static final Tooloonoaxe OONO_AXE = new Tooloonoaxe();
    public static final Tooloonohoe OONO_HOE = new Tooloonohoe();
    public static final Tooloonoshovel OONO_SHOVEL = new Tooloonoshovel();
    public static final Itemrawoono RAW_OONO = new Itemrawoono();

    @Mod.EventBusSubscriber(modid = oonomod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class Register{

        @SubscribeEvent
        public static void registerItems(final RegistryEvent.Register<Item> event){

            final Item[] items = {
                    OONO_INGOT,
                    OONO_PICKAXE,
                    OONO_SWORD,
                    OONO_AXE,
                    OONO_HOE,
                    OONO_SHOVEL,
                    RAW_OONO
            };
            event.getRegistry().registerAll(items);
        }
    }
}
