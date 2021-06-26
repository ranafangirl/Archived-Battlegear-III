package com.rainbowdestiny.battlegear.common.items;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;

public class WarAxeItem extends SwordItem {
    
	public WarAxeItem(IItemTier tier, int attackDamageIn, float attackSpeedIn, Properties builder, String description, int damage) {
		super(tier, attackDamageIn, attackSpeedIn, builder);

	}

	
	public boolean onEntitySwing(ItemStack stack, LivingEntity entity) {
		if(entity instanceof PlayerEntity)
		


		return super.onEntitySwing(stack, entity);
		return canRepair;
	}
   

}
