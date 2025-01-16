package net.kreis.storylineitems.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.kreis.storylineitems.StorylineItems;
import net.kreis.storylineitems.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class CustomItemGroups {

    public static final ItemGroup STORYLINE_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(StorylineItems.MOD_ID, "storyline_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.SHIFTING_SCALE))
                    .displayName(Text.translatable("itemgroup.storylineitems.storyline_items")).
                    entries((displayContext, entries) -> {
                        entries.add(ModItems.SHIFTING_SCALE);
                        entries.add(ModItems.CAUSALITY_COLLAPSER);
                        entries.add(ModItems.WET_PURIFYING_SOAP);
                        entries.add(ModItems.MEMORY_FRAGMENT);
                        entries.add(ModItems.DICE_OF_FATE);
                        entries.add(ModItems.GEARS_OF_FATE);
                        entries.add(ModItems.SINGULARITY);
                        entries.add(ModItems.NATURAL_SPARK);
                        entries.add(ModItems.CORPOREAL_SPARK);
                        entries.add(ModItems.VITAL_SPARK);
                        entries.add(ModItems.DARK_STONE);
                        entries.add(ModItems.LIGHT_STONE);
                    }).build());

    public static final ItemGroup STORYLINE_BLOCKS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(StorylineItems.MOD_ID, "storyline_blocks"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.SHIFTING_SCALE))
                    .displayName(Text.translatable("itemgroup.storylineitems.storyline_blocks")).
                    entries((displayContext, entries) -> {
                        entries.add(ModBlocks.ZYCHORITE_BLOCK);
                        entries.add(ModBlocks.ZYCHORITE_BRICKS);
                    }).build());

    public static final ItemGroup STORYLINE_GEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(StorylineItems.MOD_ID, "storyline_gems"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.SHIFTING_SCALE))
                    .displayName(Text.translatable("itemgroup.storylineitems.storyline_gems")).
                    entries((displayContext, entries) -> {
                        entries.add(ModItems.RAW_AMYSTIUM);
                        entries.add(ModItems.RAW_BRUNIDIUM);
                        entries.add(ModItems.RAW_CINDERLITE);
                        entries.add(ModItems.RAW_GALEHEART);
                        entries.add(ModItems.RAW_LUMINITE);
                        entries.add(ModItems.RAW_OBLIVIUM);
                        entries.add(ModItems.RAW_RUBYHEART);
                        entries.add(ModItems.RAW_VERDANITE);
                        entries.add(ModItems.RAW_VOLTSHARD);
                        entries.add(ModItems.RAW_TIDEGLASS);
                    }).build());



    public static void registerItemGroups() {

        StorylineItems.LOGGER.info("Registering the custom item group for " +  StorylineItems.MOD_ID);

    }
}
