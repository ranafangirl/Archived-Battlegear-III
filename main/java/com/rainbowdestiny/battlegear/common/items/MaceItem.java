package com.rainbowdestiny.battlegear.common.items;

import com.google.common.collect.Multimap;

import net.minecraft.entity.ai.attributes.Attribute;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.common.registry.GameRegistry;


public class MaceItem extends SwordItem {

    private float stunChance;
	private int baseDamage;

	public MaceItem(ToolType material, String name, float stunChance) {
		super(SwordItem,name);
		//set the base damage to that of lower than usual (balance)
		this.baseDamage -= 1;
        this.stunChance = stunChance;
        this.setMaxDamage(material.() * 2);
        GameRegistry.register(this);
	}

    public Multimap<Attribute, AttributeModifier> getAttributeModifiers(EquipmentSlotType slot, ItemStack stack) {
        Multimap<Attribute, AttributeModifier> map = super.getAttributeModifiers(slot, stack);
        AttributeModifier daze;
        if(slot.getType() == EquipmentSlotType.Group.HAND)
            map.put(daze.getName(), new AttributeModifier(dazeUUID, "Daze Modifier", this.stunChance, 0));
        return map;
    }
}
