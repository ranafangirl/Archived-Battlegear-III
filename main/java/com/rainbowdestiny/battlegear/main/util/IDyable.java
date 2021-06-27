package com.rainbowdestiny.battlegear.main.util;

import net.minecraft.item.ItemStack;

//Temporary until Hereldry, just for porting simplicity.	

public interface IDyable {

    boolean hasColor(ItemStack par1ItemStack);
    int getColor(ItemStack par1ItemStack);
    void setColor(ItemStack dyable, int rgb);
    void removeColor(ItemStack par1ItemStack);
    int getDefaultColor(ItemStack par1ItemStack);

}
