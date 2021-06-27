package com.rainbowdestiny.battlegear.main.util;

import net.minecraft.item.ItemStack;

public interface IArrowDisplay {
    void setArrowCount(ItemStack stack, int count);
    int getArrowCount(ItemStack stack);
}
