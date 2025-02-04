
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ancientruins.init;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class AncientRuinsModTabs {
	public static CreativeModeTab TAB_DRIEVNIIE_RUINY;

	public static void load() {
		TAB_DRIEVNIIE_RUINY = new CreativeModeTab("tabdrievniie_ruiny") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(Items.SPYGLASS);
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
