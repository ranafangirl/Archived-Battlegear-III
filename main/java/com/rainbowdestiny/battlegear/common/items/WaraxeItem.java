package com.rainbowdestiny.battlegear.common.items;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.AxeItem;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemStack;

public class WaraxeItem extends AxeItem {

	public WaraxeItem(IItemTier tier, int attackDamageIn, float attackSpeedIn, Properties builder, String description) {
		super(tier, attackDamageIn, attackSpeedIn, builder);

	}

	@Override
	public boolean onEntitySwing(ItemStack stack, LivingEntity entity) {
		if(entity instanceof PlayerEntity)

		return super.onEntitySwing(stack, entity);
		return canRepair;
	}

}
