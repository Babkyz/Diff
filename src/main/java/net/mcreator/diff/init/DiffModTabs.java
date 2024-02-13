
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.diff.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.diff.DiffMod;

public class DiffModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, DiffMod.MODID);
	public static final RegistryObject<CreativeModeTab> DIFF = REGISTRY.register("diff",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.diff.diff")).icon(() -> new ItemStack(DiffModItems.BOBR_SPAWN_EGG.get())).displayItems((parameters, tabData) -> {
				tabData.accept(DiffModItems.BOBR_SPAWN_EGG.get());
			})

					.build());
}
