package com.rainbowdestiny.battlegear.main.init;

import com.rainbowdestiny.battlegear.Battlegear;
import com.rainbowdestiny.battlegear.common.items.WarAxeItem;

import net.minecraft.item.Item;
import net.minecraft.item.ItemTier;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {

	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Battlegear.MOD_ID);
	
	//Misc
	public static final RegistryObject<Item> HERELDRY = ITEMS.register("hereldry", () -> new Item (new Item.Properties().tab(Battlegear.BATTLEGEAR_GROUP)));
	
	//Clubs & Maces
	
	//public static final RegistryObject<Item> IRON_MACE = ITEMS.register("iron_mace", () -> new MaceItem(ItemTier.IRON, 5, 4, new Item.Properties().tab(Battlegear.BATTLEGEAR_GROUP), "Test 1", 0));
	
	//War Axe
	public static final RegistryObject<Item> WOOD_WAR_AXE = ITEMS.register("wood_war_axe", () -> new WarAxeItem(ItemTier.WOOD, 3, 4, new Item.Properties().tab(Battlegear.BATTLEGEAR_GROUP), "A powerful weapon", 0));
	public static final RegistryObject<Item> STONE_WAR_AXE = ITEMS.register("stone_war_axe", () -> new WarAxeItem(ItemTier.STONE, 4, 4, new Item.Properties().tab(Battlegear.BATTLEGEAR_GROUP), "A powerful weapon", 0));
	public static final RegistryObject<Item> GOLD_WAR_AXE = ITEMS.register("gold_war_axe", () -> new WarAxeItem(ItemTier.GOLD, 3, 4, new Item.Properties().tab(Battlegear.BATTLEGEAR_GROUP), "A powerful weapon", 0));
	public static final RegistryObject<Item> IRON_WAR_AXE = ITEMS.register("iron_war_axe", () -> new WarAxeItem(ItemTier.IRON, 5, 4, new Item.Properties().tab(Battlegear.BATTLEGEAR_GROUP), "A powerful weapon", 0));
	public static final RegistryObject<Item> DIAMOND_WAR_AXE = ITEMS.register("diamond_war_axe", () -> new WarAxeItem(ItemTier.DIAMOND, 6, 4, new Item.Properties().tab(Battlegear.BATTLEGEAR_GROUP), "A powerful weapon", 0));
	public static final RegistryObject<Item> NETHERITE_WAR_AXE = ITEMS.register("netherite_war_axe", () -> new WarAxeItem(ItemTier.NETHERITE, 7, 4, new Item.Properties().tab(Battlegear.BATTLEGEAR_GROUP), "A powerful weapon", 0));

	//Shields
	//public static final RegistryObject<Item> IRON_SHIELD = ITEMS.register("iron_shield", () -> new NewShieldItem(ItemGroup.TAB_COMBAT))));
	//public static final RegistryObject<Item> DIAMOND_SHIELD = ITEMS.register("diamond_shield", () -> new NewShieldItem(ItemGroup.TAB_COMBAT))));

}
