package net.kreis.storylineitems.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.kreis.storylineitems.StorylineItems;
import net.minecraft.block.*;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.Identifier;
import net.minecraft.util.ItemActionResult;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;

public class ModBlocks {
    
    public static final Block WORLD_BORDER_OPACITY_BLOCK = new WorldBorderOpacityBlock();
    public static final Block OPAQUE_DISTANCE_BLOCK = new OpaqueDistanceBlock();    
    public static final Block PSEUDO_BARRIER = registerBlock("pseudo_barrier", new BarrierBlock(AbstractBlock.Settings.create()
            .strength(-1.0f, Float.MAX_VALUE) // Makes the block unbreakable
            .noCollision() // Allows entities and projectiles to pass through
            .nonOpaque()   // Allows rendering as a pass-through block
            .solidBlock(((state, world, pos) -> true))
            .velocityMultiplier(0.8f)
            .allowsSpawning((state, world, pos, entityType) -> true) // Allows entities to spawn and interact
            .blockVision((state, world, pos) -> false) // Blocks vision
            .sounds(BlockSoundGroup.AMETHYST_BLOCK)
    ) {
        // Declare the WATERLOGGED property

        @Override
        protected boolean canReplace(BlockState state, ItemPlacementContext context) {
            return false;
        }

        @Override
        public VoxelShape getCollisionShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
            // Return an empty shape to allow entities and players to interact through the block
            return VoxelShapes.empty();
        }

        @Override
        public boolean isTransparent(BlockState state, BlockView world, BlockPos pos) {
            // Makes the block transparent to player interactions
            return true;
        }

        @Override
        public boolean hasSidedTransparency(BlockState state) {
            // Ensures sided transparency to interact through the block
            return true;
        }

        @Override
        protected ItemActionResult onUseWithItem(ItemStack stack, BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
            // Allow item interactions to pass through the block
            return ItemActionResult.PASS_TO_DEFAULT_BLOCK_INTERACTION;
        }

        @Override
        protected ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, BlockHitResult hit) {
            // Allow hand interactions (e.g., punching mobs) to pass through the block
            return ActionResult.PASS;
        }
    });







    public static final Block ZY_CUBE_ALL = registerBlock("zychorite", new Block(AbstractBlock.Settings.create().strength(-1.0f, Float.MAX_VALUE)
            .requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK).slipperiness(0.98f).jumpVelocityMultiplier(0.9f)
    ));

    public static final Block ZY_CUBE = registerBlock("zychorite", new Block(AbstractBlock.Settings.create().strength(-1.0f, Float.MAX_VALUE)
            .requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK).slipperiness(0.98f).jumpVelocityMultiplier(0.9f)
    ));

    public static final Block ZY_BRICKS = registerBlock("zychorite", new Block(AbstractBlock.Settings.create().strength(-1.0f, Float.MAX_VALUE)
            .requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK).slipperiness(0.98f).jumpVelocityMultiplier(0.9f)
    ));

    public static final Block ZYCHORITE_BLOCK = registerBlock("zychorite_block", new Block(AbstractBlock.Settings.create().strength(-1.0f, Float.MAX_VALUE)
            .requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK).slipperiness(0.98f).jumpVelocityMultiplier(0.9f)
    ));

    public static final Block ZYCHORITE_BRICKS = registerBlock("zychorite_bricks", new Block(AbstractBlock.Settings.create().strength(-1.0f, Float.MAX_VALUE)
            .requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK).slipperiness(0.98f).jumpVelocityMultiplier(0.9f)
    ));

    public static final Block ZYCHORIUM_ICE = registerBlock("zychorium_ice", new Block(AbstractBlock.Settings.create().strength(-1.0f, Float.MAX_VALUE)
            .requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK).slipperiness(0.98f).jumpVelocityMultiplier(0.9f)
    ));

    public static final Block ZYCHORIUM_LAMP = registerBlock("zychorium_lamp", new Block(AbstractBlock.Settings.create().strength(-1.0f, Float.MAX_VALUE)
            .requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK).slipperiness(0.98f).jumpVelocityMultiplier(0.9f)
    ));

    public static final Block ZYCHORIUM_SOIL = registerBlock("zychorium_soil", new Block(AbstractBlock.Settings.create().strength(-1.0f, Float.MAX_VALUE)
            .requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK).slipperiness(0.98f).jumpVelocityMultiplier(0.9f)
    ));

    public static final Block ZYCHORIUM_WATER = registerBlock("zychorium_water", new Block(AbstractBlock.Settings.create().strength(-1.0f, Float.MAX_VALUE)
            .requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK).slipperiness(0.98f).jumpVelocityMultiplier(0.9f)
    ));

    public static final Block ZYCHORIUM_BLUE_ENGINEERING_BLOCK = registerBlock("zychorium_blue_engineering_block", new Block(AbstractBlock.Settings.create().strength(-1.0f, Float.MAX_VALUE)
            .requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK).slipperiness(0.98f).jumpVelocityMultiplier(0.9f)
    ));

    public static final Block ZYCHORIUM_BLUE_ZYCHORIUM_BRICKS = registerBlock("zychorium_blue_zychorium_bricks", new Block(AbstractBlock.Settings.create().strength(-1.0f, Float.MAX_VALUE)
            .requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK).slipperiness(0.98f).jumpVelocityMultiplier(0.9f)
    ));

    public static final Block ZYCHORIUM_DARK_ENGINEERING_BLOCK = registerBlock("zychorium_dark_engineering_block", new Block(AbstractBlock.Settings.create().strength(-1.0f, Float.MAX_VALUE)
            .requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK).slipperiness(0.98f).jumpVelocityMultiplier(0.9f)
    ));

    public static final Block ZYCHORIUM_DARK_ZYCHORIUM_BRICKS = registerBlock("zychorium_dark_zychorium_bricks", new Block(AbstractBlock.Settings.create().strength(-1.0f, Float.MAX_VALUE)
            .requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK).slipperiness(0.98f).jumpVelocityMultiplier(0.9f)
    ));

    public static final Block ZYCHORIUM_GREEN_ENGINEERING_BLOCK = registerBlock("zychorium_green_engineering_block", new Block(AbstractBlock.Settings.create().strength(-1.0f, Float.MAX_VALUE)
            .requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK).slipperiness(0.98f).jumpVelocityMultiplier(0.9f)
    ));

    public static final Block ZYCHORIUM_GREEN_ZYCHORIUM_BRICKS = registerBlock("zychorium_green_zychorium_bricks", new Block(AbstractBlock.Settings.create().strength(-1.0f, Float.MAX_VALUE)
            .requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK).slipperiness(0.98f).jumpVelocityMultiplier(0.9f)
    ));

    public static final Block ZYCHORIUM_LIGHT_ENGINEERING_BLOCK = registerBlock("zychorium_light_engineering_block", new Block(AbstractBlock.Settings.create().strength(-1.0f, Float.MAX_VALUE)
            .requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK).slipperiness(0.98f).jumpVelocityMultiplier(0.9f)
    ));

    public static final Block ZYCHORIUM_LIGHT_ZYCHORIUM_BRICKSIUM = registerBlock("zychorium_light_zychorium_bricksium", new Block(AbstractBlock.Settings.create().strength(-1.0f, Float.MAX_VALUE)
            .requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK).slipperiness(0.98f).jumpVelocityMultiplier(0.9f)
    ));

    public static final Block ZYCHORIUM_RED_ENGINEERING_BLOCK = registerBlock("zychorium_red_engineering_block", new Block(AbstractBlock.Settings.create().strength(-1.0f, Float.MAX_VALUE)
            .requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK).slipperiness(0.98f).jumpVelocityMultiplier(0.9f)
    ));

    public static final Block ZYCHORIUM_RED_ZYCHORIUM_BRICK = registerBlock("zychorium_red_zychorium_brick", new Block(AbstractBlock.Settings.create().strength(-1.0f, Float.MAX_VALUE)
            .requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK).slipperiness(0.98f).jumpVelocityMultiplier(0.9f)
    ));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(StorylineItems.MOD_ID, name), block);   
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(StorylineItems.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        StorylineItems.LOGGER.info("Registering the modded blocks for " + StorylineItems.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.add(PSEUDO_BARRIER);
            entries.add(WORLD_BORDER_OPACITY_BLOCK);
            entries.add(OPAQUE_DISTANCE_BLOCK);
            entries.add(ZY_BRICKS);
            entries.add(ZY_CUBE);
            entries.add(ZY_CUBE_ALL);
            entries.add(ZYCHORITE_BLOCK);
            entries.add(ZYCHORITE_BRICKS);
            entries.add(ZYCHORIUM_ICE);
            entries.add(ZYCHORIUM_LAMP);
            entries.add(ZYCHORIUM_SOIL);
            entries.add(ZYCHORIUM_WATER);
            entries.add(ZYCHORIUM_BLUE_ENGINEERING_BLOCK);
            entries.add(ZYCHORIUM_BLUE_ZYCHORIUM_BRICKS);
            entries.add(ZYCHORIUM_DARK_ENGINEERING_BLOCK);
            entries.add(ZYCHORIUM_DARK_ZYCHORIUM_BRICKS);
            entries.add(ZYCHORIUM_GREEN_ENGINEERING_BLOCK);
            entries.add(ZYCHORIUM_GREEN_ZYCHORIUM_BRICKS);
            entries.add(ZYCHORIUM_LIGHT_ENGINEERING_BLOCK);
            entries.add(ZYCHORIUM_LIGHT_ZYCHORIUM_BRICKSIUM);
            entries.add(ZYCHORIUM_RED_ENGINEERING_BLOCK);
            entries.add(ZYCHORIUM_RED_ZYCHORIUM_BRICK);
        });
    }
}
