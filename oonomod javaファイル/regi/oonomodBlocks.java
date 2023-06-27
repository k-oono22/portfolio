package com.oono.oonomod.regi;

import com.oono.oonomod.block.BlockoonoBlock;
import com.oono.oonomod.block.WalloonoWall;
import com.oono.oonomod.block.ore.OreDeepslateoonoOre;
import com.oono.oonomod.block.ore.OreoonoOre;
import com.oono.oonomod.main.oonomod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

@ObjectHolder(oonomod.MOD_ID)
public class oonomodBlocks {

    public static final BlockoonoBlock OONO_BLOCK = new BlockoonoBlock();
    public static final WalloonoWall OONO_WALL = new WalloonoWall();
    public static final OreoonoOre OONO_ORE = new OreoonoOre();
    public static final OreDeepslateoonoOre DEEPSLATE_OONO_ORE = new OreDeepslateoonoOre();

    @Mod.EventBusSubscriber(modid = oonomod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class Register{

        @SubscribeEvent
        public static void registerBlocks(final RegistryEvent.Register<Block> event){
            final Block[] blocks = {
                    new BlockoonoBlock(),
                    new WalloonoWall(),
                    new OreoonoOre(),
                    new OreDeepslateoonoOre()
            };
            event.getRegistry().registerAll(blocks);
        }

        @SubscribeEvent
        public static void registerBlockItems(final RegistryEvent.Register<Item> event){
            final BlockItem[] blockItems = {
                    new BlockItem(OONO_BLOCK, new Item.Properties().tab(oonomod.OONOMOD_TAB).fireResistant()),
                    new BlockItem(OONO_WALL, new Item.Properties().tab(oonomod.OONOMOD_TAB).fireResistant()),
                    new BlockItem(OONO_ORE, new Item.Properties().tab(oonomod.OONOMOD_TAB).fireResistant()),
                    new BlockItem(DEEPSLATE_OONO_ORE,new Item.Properties().tab(oonomod.OONOMOD_TAB).fireResistant())
            };
            for (BlockItem item : blockItems){
                final Block block = item.getBlock();
                final ResourceLocation registryName = block.getRegistryName();
                event.getRegistry().register(item.setRegistryName(registryName));
            }
        }
    }
}
