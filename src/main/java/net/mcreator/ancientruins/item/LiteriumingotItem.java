
package net.mcreator.ancientruins.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.ancientruins.init.AncientRuinsModTabs;

public class LiteriumingotItem extends Item {
	public LiteriumingotItem() {
		super(new Item.Properties().tab(AncientRuinsModTabs.TAB_DRIEVNIIE_RUINY).stacksTo(64).fireResistant().rarity(Rarity.COMMON));
	}
}
