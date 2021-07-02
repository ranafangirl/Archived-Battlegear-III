package com.rainbowdestiny.battlegear.common.items;

import com.rainbowdestiny.battlegear.main.util.IArrowCatcher;
import com.rainbowdestiny.battlegear.main.util.IArrowDisplay;
import com.rainbowdestiny.battlegear.main.util.IDyable;
import com.rainbowdestiny.battlegear.main.util.IEnchantable;
import com.rainbowdestiny.battlegear.main.util.ISheathed;
import com.rainbowdestiny.battlegear.main.util.IShield;
import com.rainbowdestiny.battlegear.main.util.ShieldType;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.ThrowableEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BGShieldItem extends Item implements IShield, IDyable, IEnchantable, ISheathed, IArrowCatcher, IArrowDisplay{

    public ShieldType enumShield;

    public BGShieldItem(ShieldType enumShield) {
        super(null);

        this.enumShield = enumShield;

        this.setUnlocalizedName("battlegear:shield.");
        this.setRegistryName("battlegear:shield."+enumShield.getName());
        this.setMaxDamage(enumShield.getMaxDamage());
        this.setMaxStackSize(1);
        this.setHasSubtypes(false);
        GameRegistry.register(this);
    }

    private void setUnlocalizedName(String string) {
		
	}

	private void setMaxStackSize(int i) {
    	
	}

	private void setHasSubtypes(boolean b) {	
		
	}

	String description;

    public BGShieldItem(ItemGroup tab) {
        super(new Item.Properties().tab(tab));
	}

	@Override
	public void setArrowCount(ItemStack stack, int count) {
		
	}

	@Override
	public int getArrowCount(ItemStack stack) {
		return 0;
	}

	@Override
	public boolean catchArrow(ItemStack shield, PlayerEntity player, ThrowableEntity projectile) {
		return false;
	}

	@Override
	public boolean sheatheOnBack(ItemStack item) {
		return false;
	}

	@Override
	public boolean isEnchantable(Enchantment baseEnchantment, ItemStack stack) {
		return false;
	}

	@Override
	public boolean hasColor(ItemStack par1ItemStack) {
		return false;
	}

	@Override
	public int getColor(ItemStack par1ItemStack) {
		return 0;
	}

	@Override
	public void setColor(ItemStack dyable, int rgb) {
		
	}

	@Override
	public void removeColor(ItemStack par1ItemStack) {
		
	}

	@Override
	public int getDefaultColor(ItemStack par1ItemStack) {
		return 0;
	}

	@Override
	public float getDecayRate(ItemStack shield) {
		return 0;
	}

	@Override
	public float getRecoveryRate(ItemStack shield) {
		return 0;
	}

	@Override
	public boolean canBlock(ItemStack shield, DamageSource source) {
		return false;
	}

	@Override
	public float getDamageDecayRate(ItemStack shield, float amount) {
		return 0;
	}

	@Override
	public float getBlockAngle(ItemStack shield) {
		return 0;
	}

	@Override
	public int getBashTimer(ItemStack shield) {
		return 0;
	}

	@Override
	public void blockAnimation(PlayerEntity player, float amount) {
		
	}

	@Override
	public float getDamageReduction(ItemStack shield, DamageSource source) {
		return 0;
	}
    
    
}

