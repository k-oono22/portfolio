package com.oono.oonomod.item.tool;

import com.oono.oonomod.entity.NonFireLB;
import com.oono.oonomod.main.oonomod;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.LightningBolt;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;

import java.util.Timer;
import java.util.TimerTask;

public class Tooloonosword extends SwordItem {
    public Tooloonosword() {
        super(oonomodTiers.OONO, 3, 0F, new Properties().tab(oonomod.OONOMOD_TAB).fireResistant());
        this.setRegistryName("oono_sword");
    }

    @Override
    public boolean hurtEnemy(ItemStack stack, LivingEntity enemy, LivingEntity attacker) {
        Vec3 vec3 = attacker.getLookAngle();
        enemy.setDeltaMovement(vec3.x * 1.5, 1.5, vec3.z * 1.5);

        Player player = (Player)attacker;
        UseOnContext context = new UseOnContext(player, player.getUsedItemHand(), null);
        Level world = context.getLevel();

        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                BlockPos pos = enemy.blockPosition();
                LightningBolt nonFire = new NonFireLB(world);
                nonFire.moveTo(Vec3.atBottomCenterOf(pos));
                nonFire.setCause(player instanceof ServerPlayer ? (ServerPlayer) player : null);
                world.addFreshEntity(nonFire);
            }
        }, 2500);

        return super.hurtEnemy(stack, enemy, attacker);
    }
}
