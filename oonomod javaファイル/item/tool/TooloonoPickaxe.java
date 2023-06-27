package com.oono.oonomod.item.tool;

import com.oono.oonomod.item.tool.oonomodTiers;
import com.oono.oonomod.main.oonomod;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class TooloonoPickaxe extends PickaxeItem {
    public TooloonoPickaxe() {
        super(oonomodTiers.OONO,1,-2.8F,new Properties().tab(oonomod.OONOMOD_TAB).fireResistant());
        this.setRegistryName("oono_pickaxe");
    }

    @Override
    public void inventoryTick(ItemStack stack, Level world, Entity entity, int itemslot, boolean isSelected) {
        if (entity.tickCount % 200 == 0){
            stack.setDamageValue(stack.getDamageValue()-5);
        }
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level world, Player player, InteractionHand hand) {
        ItemStack stack = player.getItemInHand(hand);
        if(player.isSteppingCarefully()){
            player.startUsingItem(hand);
            modeChange(stack);
            player.displayClientMessage(new TextComponent("mode:" + modeName(stack)),true) ;

            return InteractionResultHolder.consume(stack);
        }
        return InteractionResultHolder.pass(stack);
    }

    public void modeChange(ItemStack stack){
        if (stack.getTag() == null){
            stack.setTag(new CompoundTag());
        }
        stack.getTag().putInt("mode",modeInt(stack) < 1 ? modeInt(stack) + 1 : 0);
    }

    public int modeInt(ItemStack stack){
        if (stack.getTag() == null){
            return 0;
        }
        return stack.getTag().getInt("mode");
    }

    @Override
    public float getDestroySpeed(ItemStack stack, BlockState state) {
        return switch (modeInt(stack)){
            case 0 -> BlockTags.MINEABLE_WITH_PICKAXE.contains(state.getBlock())? oonomodTiers.OONO.getSpeed() : 1.0F;
            case 1 -> BlockTags.MINEABLE_WITH_PICKAXE.contains(state.getBlock())? oonomodTiers.OONO.getSpeed()*3 : 1.0F;
            default -> 0;
        };
    }

    public String modeName(ItemStack stack){
        return switch (modeInt(stack)){
            case 0 -> "normal";
            case 1 -> "tactical";
            default -> "unknown";
        };
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level world, List<Component> list, TooltipFlag tooltip) {
        list.add(new TextComponent("mode:" + modeName(stack)));
    }
}
