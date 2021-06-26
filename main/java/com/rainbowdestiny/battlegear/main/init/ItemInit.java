package com.rainbowdestiny.battlegear.main.init;

import com.rainbowdestiny.battlegear.Battlegear;
import com.rainbowdestiny.battlegear.common.items.NewShieldItem;
import com.rainbowdestiny.battlegear.common.items.WarAxeItem;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemTier;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {

	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Battlegear.MOD_ID);
	
	//War Axe
	public static final RegistryObject<Item> IRON_WAR_AXE = ITEMS.register("iron_war_axe", () -> new WarAxeItem(ItemTier.IRON, 5, 4, new Item.Properties().tab(ItemGroup.TAB_COMBAT), "A powerful weapon", 0));

	//Shields
	public static final RegistryObject<Item> IRON_SHIELD = ITEMS.register("iron_shield", () -> new NewShieldItem(ItemGroup.TAB_COMBAT))));
	
	//public static final RegistryObject<Item> DIAMOND_SHIELD = ITEMS.register("diamond_shield", () -> new NewShieldItem(ItemGroup.TAB_COMBAT))));

}
