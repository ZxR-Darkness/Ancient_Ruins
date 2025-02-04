
package net.mcreator.ancientruins.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.ancientruins.init.AncientRuinsModTabs;

public class MorgenItem extends RecordItem {
	public MorgenItem() {
		super(0, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ancient_ruins:gags")), new Item.Properties().tab(AncientRuinsModTabs.TAB_DRIEVNIIE_RUINY).stacksTo(1).rarity(Rarity.RARE), 620);
	}
}
