
package net.mcreator.ancientruins.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.ancientruins.init.AncientRuinsModTabs;

public class LiteriumOreItem extends Item {
	public LiteriumOreItem() {
		super(new Item.Properties().tab(AncientRuinsModTabs.TAB_DRIEVNIIE_RUINY).stacksTo(64).rarity(Rarity.COMMON));
	}
}
