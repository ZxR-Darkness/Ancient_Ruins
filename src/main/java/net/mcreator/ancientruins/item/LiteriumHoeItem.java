
package net.mcreator.ancientruins.item;

import net.minecraft.world.entity.ai.attributes.Attributes;

public class LiteriumHoeItem extends HoeItem {
	public LiteriumHoeItem() {
		super(new Tier() {
			public int getUses() {
				return 660;
			}

			public float getSpeed() {
				return 9f;
			}

			public float getAttackDamageBonus() {
				return 2f;
			}

			public int getLevel() {
				return 4;
			}

			public int getEnchantmentValue() {
				return 28;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(AncientRuinsModItems.LITERIUMINGOT.get()));
			}
		}, 0, -3f, new Item.Properties().tab(AncientRuinsModTabs.TAB_DRIEVNIIE_RUINY));
	}
}
