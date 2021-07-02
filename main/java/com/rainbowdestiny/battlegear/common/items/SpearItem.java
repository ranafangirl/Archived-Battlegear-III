package com.rainbowdestiny.battlegear.common.items;

import java.util.UUID;

import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;

import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.IItemTier;
import net.minecraft.item.SwordItem;
import net.minecraftforge.event.entity.living.LivingEvent.LivingUpdateEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraft.entity.ai.attributes.Attribute;
import net.minecraft.item.ItemStack;
import net.minecraft.util.LazyValue;
import net.minecraftforge.common.ForgeMod;

@EventBusSubscriber
public class SpearItem extends SwordItem {

	public static final AttributeModifier RangeAttributeModifier = new AttributeModifier(
			UUID.randomUUID(), "Range modifier", 5,
			AttributeModifier.Operation.ADDITION);

	static LazyValue<Multimap<Attribute, AttributeModifier>> rangeModifier = new LazyValue<>(
			() -> ImmutableMultimap.of(ForgeMod.REACH_DISTANCE.get(), RangeAttributeModifier));

	public SpearItem(IItemTier tier, int attackDamage, float attackSpeed, Properties properties) {
		super(tier, attackDamage, attackSpeed, properties);
	}

	@SubscribeEvent
	public static void holdingSpear(LivingUpdateEvent event) {
		if (!(event.getEntity() instanceof PlayerEntity))
			return;

		PlayerEntity player = (PlayerEntity) event.getEntityLiving();
		boolean isHolding = false;

		for (ItemStack item : event.getEntity().getHandSlots()) {
			if (item.getItem() instanceof SpearItem) {
				player.getAttributes().addTransientAttributeModifiers(rangeModifier.get());
				isHolding = true;
			}
		}
		if (!isHolding) {
			player.getAttributes().removeAttributeModifiers(rangeModifier.get());
		}
	}

}
