package com.rainbowdestiny.battlegear.main.init;

import com.rainbowdestiny.battlegear.Battlegear;

import net.minecraft.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {

	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Battlegear.MOD_ID);
	
	
	//public static final RegistryObject<Item> IRON_WARAXE = ITEMS.register("iron_waraxe", () -> new WaraxeItem(null, 0, 0, new Item.Properties().tab(ItemGroup.TAB_COMBAT), null));
}
