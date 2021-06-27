package com.rainbowdestiny.battlegear.main.util;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.ThrowableEntity;
import net.minecraft.item.ItemStack;

public interface IArrowCatcher {

    boolean catchArrow(ItemStack shield, PlayerEntity player, ThrowableEntity projectile);
}
