package com.rainbowdestiny.battlegear.main.util;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;

public interface IShield {

    float getDecayRate(ItemStack shield);
    float getRecoveryRate(ItemStack shield);
    boolean canBlock(ItemStack shield, DamageSource source);
    float getDamageDecayRate(ItemStack shield, float amount);
    float getBlockAngle(ItemStack shield);
    int getBashTimer(ItemStack shield);
    void blockAnimation(PlayerEntity player, float amount);
    float getDamageReduction(ItemStack shield, DamageSource source);
}

