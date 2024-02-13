
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.diff.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.item.Item;

import net.mcreator.diff.DiffMod;

public class DiffModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, DiffMod.MODID);
	public static final RegistryObject<Item> BOBR_SPAWN_EGG = REGISTRY.register("bobr_spawn_egg", () -> new ForgeSpawnEggItem(DiffModEntities.BOBR, -1, -1, new Item.Properties()));
}
