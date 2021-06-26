package com.rainbowdestiny.battlegear.main.init;

import com.rainbowdestiny.battlegear.Battlegear;
import com.rainbowdestiny.battlegear.common.items.NewShieldItem;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {

	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Battlegear.MOD_ID);
	
	public static final RegistryObject<Item> IRON_SHIELD = ITEMS.register("iron_shield", () -> new NewShieldItem(ItemGroup.TAB_COMBAT))));

	//public static final RegistryObject<Item> IRON_WARAXE = ITEMS.register("iron_waraxe", () -> new WaraxeItem(null, 0, 0, new Item.Properties().tab(ItemGroup.TAB_COMBAT), null));
}
