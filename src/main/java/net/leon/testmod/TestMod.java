package net.leon.testmod;

import net.fabricmc.api.ModInitializer;

import net.leon.testmod.block.ModBlocks;
import net.leon.testmod.item.ModItemGroups;
import net.leon.testmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestMod implements ModInitializer {
	public static final String MOD_ID = "testmod";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}