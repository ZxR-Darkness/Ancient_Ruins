
package net.mcreator.ancientruins.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.Entity;

import net.mcreator.ancientruins.procedures.Effect_Soul_inventaryProcedure;
import net.mcreator.ancientruins.init.AncientRuinsModTabs;

public class AsoulfragmentItem extends Item {
	public AsoulfragmentItem() {
		super(new Item.Properties().tab(AncientRuinsModTabs.TAB_DRIEVNIIE_RUINY).stacksTo(64).rarity(Rarity.RARE));
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		Effect_Soul_inventaryProcedure.execute(entity);
	}
}
