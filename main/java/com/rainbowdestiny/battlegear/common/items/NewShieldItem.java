package com.rainbowdestiny.battlegear.common.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ShieldItem;

public class NewShieldItem extends ShieldItem {
    String description;

    public NewShieldItem(ItemGroup tab) {
        super(new Item.Properties().tab(tab));
	}
}

