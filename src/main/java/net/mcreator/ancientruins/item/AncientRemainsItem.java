
package net.mcreator.ancientruins.item;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.ancientruins.init.AncientRuinsModTabs;

public class AncientRemainsItem extends Item {
	public AncientRemainsItem() {
		super(new Item.Properties().tab(AncientRuinsModTabs.TAB_DRIEVNIIE_RUINY).stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public boolean hasCraftingRemainingItem() {
		return true;
	}

	@Override
	public ItemStack getCraftingRemainingItem(ItemStack itemstack) {
		return new ItemStack(this);
	}

	@Override
	public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
		return 16F;
	}
}
