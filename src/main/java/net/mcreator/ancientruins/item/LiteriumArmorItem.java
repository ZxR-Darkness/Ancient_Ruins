
package net.mcreator.ancientruins.item;

import net.minecraft.sounds.SoundEvent;
import java.util.function.Consumer;
import net.minecraft.client.model.Model;

public abstract class LiteriumArmorItem extends ArmorItem {

	public LiteriumArmorItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 30;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{4, 12, 10, 4}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 18;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ancient_ruins:literium_audio"));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(AncientRuinsModItems.LITERIUMINGOT.get()));
			}

			@Override
			public String getName() {
				return "literium_armor";
			}

			@Override
			public float getToughness() {
				return 0f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0f;
			}
		}, slot, properties);
	}

	public static class Helmet extends LiteriumArmorItem {

		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(AncientRuinsModTabs.TAB_DRIEVNIIE_RUINY));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "ancient_ruins:textures/models/armor/literium_layer_1.png";
		}

	}

	public static class Chestplate extends LiteriumArmorItem {

		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(AncientRuinsModTabs.TAB_DRIEVNIIE_RUINY));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "ancient_ruins:textures/models/armor/literium_layer_1.png";
		}

	}

	public static class Leggings extends LiteriumArmorItem {

		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(AncientRuinsModTabs.TAB_DRIEVNIIE_RUINY));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "ancient_ruins:textures/models/armor/literium_layer_2.png";
		}

	}

	public static class Boots extends LiteriumArmorItem {

		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(AncientRuinsModTabs.TAB_DRIEVNIIE_RUINY));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "ancient_ruins:textures/models/armor/literium_layer_1.png";
		}

	}

}
