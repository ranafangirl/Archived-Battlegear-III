package com.rainbowdestiny.battlegear.main.util;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.ItemStack;

public interface IEnchantable {

    boolean isEnchantable(Enchantment baseEnchantment, ItemStack stack);
}
