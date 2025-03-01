
package net.mcreator.ancientruins.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.ancientruins.init.AncientRuinsModTabs;

public class FareloreItemItem extends Item {
	public FareloreItemItem() {
		super(new Item.Properties().tab(AncientRuinsModTabs.TAB_DRIEVNIIE_RUINY).stacksTo(64).rarity(Rarity.COMMON));
	}
}
