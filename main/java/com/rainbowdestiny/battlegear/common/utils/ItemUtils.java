package com.rainbowdestiny.battlegear.common.utils;


import java.util.List;

import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;

public class ItemUtils {
    public static List<StringTextComponent> addText(List<StringTextComponent> tooltip, String text, TextFormatting colour)
    {
        tooltip.add(new StringTextComponent(colour + text));
        return tooltip;
    }
	
}
