package net.kreis.storylineitems.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Material;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;

public class WorldBorderOpacityBlock extends Block {

    public WorldBorderOpacityBlock() {
        super(Settings.of(Material.GLASS)
                .strength(1.5f)
                .nonOpaque()
                .luminance(state -> 0));  // No light emission
    }

    @Override
    public int getOpacity(BlockState state, BlockView world, BlockPos pos) {
        if (world instanceof World && !world.isClient()) {
            int minDistance = getDistanceToWorldBorder((World) world, pos);
            return calculateOpacity(minDistance);
        }
        return super.getOpacity(state, world, pos);
    }

    private int getDistanceToWorldBorder(World world, BlockPos pos) {
        if (world instanceof ServerWorld) {
            double borderDistance = ((ServerWorld) world).getWorldBorder().getDistanceInsideBorder(pos.getX(), pos.getZ());
            return (int) Math.floor(borderDistance);
        }
        return 5; // Default maximum opacity distance if the world border isn't available
    }

    private int calculateOpacity(int distance) {
        if (distance <= 1) return 0;  // Fully transparent
        if (distance == 2) return 50; // 20% opacity
        if (distance == 3) return 100; // 40% opacity
        if (distance == 4) return 150; // 60% opacity
        return 200;  // 80% opacity
    }
}
