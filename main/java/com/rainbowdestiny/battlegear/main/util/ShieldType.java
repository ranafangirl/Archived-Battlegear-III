package com.rainbowdestiny.battlegear.main.util;

import net.minecraft.block.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.CompoundNBT;
import net.minecraftforge.common.util.Constants;

public class ShieldType {

    public static final ShieldType LEATHER = new ShieldType("leather", 1F/1.5F/20F, 1F/20F, 40, 12, 0xFF9b482b).setRepair(new ItemStack(Items.LEATHER), IDSensible.INSTANCE); //1.5 second block
    public static final ShieldType WOOD = new ShieldType("wood", 1F/1F/20F, 1F/20F, 40, 15, 0xFFbc9862).setRepair(new ItemStack(Blocks.OAK_WOOD), IDSensible.INSTANCE); // 1 second block
    public static final ShieldType IRON = new ShieldType("iron", 1F/3F/20F, 1F/20F, 120,  9, 0xFFacacac).setRepair(new ItemStack(Items.IRON_INGOT), IDSensible.INSTANCE); //3 second block
    public static final ShieldType GOLD = new ShieldType("gold", 1F/2F/20F, 1F/20F, 56, 25, 0xFFa8a400).setRepair(new ItemStack(Items.GOLD_INGOT), IDSensible.INSTANCE); //2 second block
    public static final ShieldType DIAMOND = new ShieldType("diamond", 1F/5F/20F, 1F/20F, 263, 10, 0xFF23bfbf).setRepair(new ItemStack(Items.DIAMOND), IDSensible.INSTANCE); //5 second block

    private final float decayRate;
    private final float damageDecay;
    private final String name;
    private final int enchantability;
    private final int maxDamage;
    private final int defaultRGB;
    private ItemStack repairingMaterial;
    private ISensible<ItemStack> comparator;

    public ShieldType(String name, float decayRate, float damageDecay, int maxDamage, int enchantability, int defaultColour){
        this.name = name;
        this.decayRate = decayRate;
        this.damageDecay = damageDecay;
        this.enchantability = enchantability;
        this.maxDamage = maxDamage;
        defaultRGB = defaultColour;
    }

    private ShieldType(String name, CompoundNBT compound){
        this.name = name;
        this.decayRate = compound.getFloat("DecayRate");
        this.damageDecay = compound.getFloat("DamageDecay");
        this.maxDamage = compound.getInt("MaxDamage");
        this.enchantability = compound.getInt("Enchantability");
        this.defaultRGB = compound.getInt("RGB");
    }

    public float getDecayRate(){
        return decayRate;
    }

    public float getDamageDecay(){
        return damageDecay;
    }

    public String getName(){
        return name;
    }

    public int getEnchantability(){
        return enchantability;
    }

    public int getMaxDamage(){
        return maxDamage;
    }

    public int getDefaultRGB(){
        return defaultRGB;
    }

    public ShieldType setRepair(ItemStack repairingMaterial, ISensible<ItemStack> comparator){
        this.repairingMaterial = repairingMaterial;
        this.comparator = comparator;
        return this;
    }

    public boolean canBeRepairedWith(ItemStack stack){
        if(comparator!=null)
            return repairingMaterial != null && !comparator.differenciate(stack, repairingMaterial);
        else
            return ItemStack.isSame(stack, repairingMaterial);
    }

    public ShieldType setRepair(CompoundNBT compound){
        if(compound.get("Repair", Constants.NBT.TAG_COMPOUND)){
            setRepair(new ItemStack(compound.getCompound("Repair")), IDSensible.INSTANCE);
        }
        return this;
    }

    /**
     * Make a new instance based on the compressed data.
     * Note: Only a valid name is required
     *
     * @param compound data to read from
     * @return the new type, or null if name is not readable
     */
    public static ShieldType fromNBT(CompoundNBT compound){
        String name = compound.getString("Name");
        if(name.isEmpty())
            return null;
        else
            return new ShieldType(name, compound).setRepair(compound);
    }

    public static class IDSensible implements ISensible<ItemStack>{
        public static final ISensible<ItemStack> INSTANCE = new IDSensible();
        private IDSensible(){}
        @Override
        public boolean differenciate(ItemStack holder1, ItemStack holder2){
            return holder1.getItem() != holder2.getItem();
        }
    }
}
