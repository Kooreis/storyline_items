package net.kreis.storylineitems.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.kreis.storylineitems.StorylineItems;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    // Raw gems
    public static final Item RAW_OBLIVIUM = registerItem("raw_oblivium", new Item(new Item.Settings()));
    public static final Item RAW_AMYSTIUM = registerItem("raw_amystium", new Item(new Item.Settings()));
    public static final Item RAW_BRUNIDIUM = registerItem("raw_brunidium", new Item(new Item.Settings()));
    public static final Item RAW_CINDERLITE = registerItem("raw_cinderlite", new Item(new Item.Settings()));
    public static final Item RAW_GALEHEART = registerItem("raw_galeheart", new Item(new Item.Settings()));
    public static final Item RAW_LUMINITE = registerItem("raw_luminite", new Item(new Item.Settings()));
    public static final Item RAW_RUBYHEART = registerItem("raw_rubyheart", new Item(new Item.Settings()));
    public static final Item RAW_VERDANITE = registerItem("raw_verdanite", new Item(new Item.Settings()));
    public static final Item RAW_VOLTSHARD = registerItem("raw_voltshard", new Item(new Item.Settings()));
    public static final Item RAW_TIDEGLASS = registerItem("raw_tideglass", new Item(new Item.Settings()));
    public static final Item DARK_STONE = registerItem("dark_stone", new Item(new Item.Settings()));
    public static final Item LIGHT_STONE = registerItem("light_stone", new Item(new Item.Settings()));
    // Newly added items
    public static final Item SHIFTING_SCALE = registerItem("shifting_scale",
            new Item(new Item.Settings()));
    public static final Item WET_PURIFYING_SOAP = registerItem("wet_purifying_soap",
            new Item(new Item.Settings()));
    public static final Item MEMORY_FRAGMENT = registerItem("memory_fragment",
            new Item(new Item.Settings()));
    public static final Item DICE_OF_FATE = registerItem("dice_of_fate",
            new Item(new Item.Settings()));
    public static final Item GEARS_OF_FATE = registerItem("gears_of_fate",
            new Item(new Item.Settings()));
    public static final Item CAUSALITY_COLLAPSER = registerItem("causality_collapser",
            new Item(new Item.Settings()));
    public static final Item SINGULARITY = registerItem("singularity",
            new Item(new Item.Settings()));
    public static final Item NATURAL_SPARK = registerItem("natural_spark",
            new Item(new Item.Settings()));
    public static final Item CORPOREAL_SPARK = registerItem("corporeal_spark",
            new Item(new Item.Settings()));
    public static final Item VITAL_SPARK = registerItem("vital_spark",
            new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(StorylineItems.MOD_ID, name), item);
    }

    public static void registerModItems() {
        StorylineItems.LOGGER.info("Registering ModItems class for " + StorylineItems.MOD_ID);

        // Add raw gems to INGREDIENTS group
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(RAW_OBLIVIUM);
            entries.add(RAW_AMYSTIUM);
            entries.add(RAW_BRUNIDIUM);
            entries.add(RAW_CINDERLITE);
            entries.add(RAW_GALEHEART);
            entries.add(RAW_LUMINITE);
            entries.add(RAW_RUBYHEART);
            entries.add(RAW_VERDANITE);
            entries.add(RAW_VOLTSHARD);
            entries.add(RAW_TIDEGLASS);
        });

        // Add new items to MISC group
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(entries -> {
            entries.add(SHIFTING_SCALE);
            entries.add(WET_PURIFYING_SOAP);
            entries.add(MEMORY_FRAGMENT);
            entries.add(DICE_OF_FATE);
            entries.add(GEARS_OF_FATE);
            entries.add(CAUSALITY_COLLAPSER);
            entries.add(SINGULARITY);
            entries.add(NATURAL_SPARK);
            entries.add(CORPOREAL_SPARK);
            entries.add(VITAL_SPARK);
        });
    }
}
