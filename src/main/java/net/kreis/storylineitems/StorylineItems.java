package net.kreis.storylineitems;

import net.fabricmc.api.ModInitializer;

import net.kreis.storylineitems.block.ModBlocks;
import net.kreis.storylineitems.item.CustomItemGroups;
import net.kreis.storylineitems.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StorylineItems implements ModInitializer {
	public static final String MOD_ID = "storylineitems";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Initializing StorylineItems");
		CustomItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}