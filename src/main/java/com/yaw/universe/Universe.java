package com.yaw.universe;

import com.yaw.universe.block.ModBlock;
import com.yaw.universe.item.ModItems;
import com.yaw.universe.item.ModItemGroups;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Universe implements ModInitializer {
	public static final String MOD_ID = "universe";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		ModItems.registerModItems();
		ModItemGroups.registerModItemGroups();
		ModBlock.registerModBlocks();

		LOGGER.info("\n" +
                "Universe mod is ready" + "\n" +
				"Universe mod Author: " + "Yaw_cat" + "\n" +
				"Universe mod Version: 0.1.0-1.21.1\n" );
	}
}