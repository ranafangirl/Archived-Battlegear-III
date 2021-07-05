package com.rainbowdestiny.battlegear.common.items;

import net.minecraft.entity.LivingEntity;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;

public class DaggerItem extends SwordItem {

	private float baseDamage;

	public DaggerItem(IItemTier p_i48460_1_, int p_i48460_2_, float p_i48460_3_, Properties p_i48460_4_) {
		super(p_i48460_1_, p_i48460_2_, p_i48460_3_, p_i48460_4_);
		this.baseDamage = (float) p_i48460_2_;
	}

	@Override
	public boolean hurtEnemy(ItemStack item, LivingEntity hitEntity, LivingEntity attacker) {
		hitEntity.setHealth(hitEntity.getHealth() - (this.baseDamage / 2));
		return super.hurtEnemy(item, hitEntity, attacker);
	}

}
