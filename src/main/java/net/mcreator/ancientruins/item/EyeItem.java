
package net.mcreator.ancientruins.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;

import net.mcreator.ancientruins.procedures.EyePriShchielchkiePKMProcedure;
import net.mcreator.ancientruins.init.AncientRuinsModTabs;

public class EyeItem extends Item {
	public EyeItem() {
		super(new Item.Properties().tab(AncientRuinsModTabs.TAB_DRIEVNIIE_RUINY).stacksTo(64).fireResistant().rarity(Rarity.EPIC).food((new FoodProperties.Builder()).nutrition(1).saturationMod(0f).alwaysEat()

				.build()));
	}

	@Override
	public boolean hasCraftingRemainingItem() {
		return true;
	}

	@Override
	public ItemStack getCraftingRemainingItem(ItemStack itemstack) {
		return new ItemStack(Items.GUNPOWDER);
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		ItemStack itemstack = ar.getObject();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		EyePriShchielchkiePKMProcedure.execute(entity);
		return ar;
	}
}
