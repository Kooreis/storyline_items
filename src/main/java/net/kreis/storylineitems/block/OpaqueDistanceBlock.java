package net.kreis.storylineitems.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Material;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;

public class OpaqueDistanceBlock extends Block {

    public OpaqueDistanceBlock() {
        super(Settings.of(Material.GLASS)
                .strength(1.5f)
                .nonOpaque()
                .luminance(state -> 0));  // No light emission
    }

    @Override
    public int getOpacity(BlockState state, BlockView world, BlockPos pos) {
        if (world instanceof World) {
            int minDistance = getDistanceToCobblestone((World) world, pos);
            return calculateOpacity(minDistance);
        }
        return super.getOpacity(state, world, pos);
    }

    private int getDistanceToCobblestone(World world, BlockPos pos) {
        int radius = 4; // Check up to 4 blocks away
        for (int dx = -radius; dx <= radius; dx++) {
            for (int dy = -radius; dy <= radius; dy++) {
                for (int dz = -radius; dz <= radius; dz++) {
                    BlockPos checkPos = pos.add(dx, dy, dz);
                    if (world.getBlockState(checkPos).isOf(net.minecraft.block.Blocks.COBBLESTONE)) {
                        return MathHelper.abs(dx) + MathHelper.abs(dy) + MathHelper.abs(dz);
                    }
                }
            }
        }
        return radius + 1; // Default to max distance if no cobblestone found
    }

    private int calculateOpacity(int distance) {
        if (distance <= 1) return 0;  // Fully transparent
        if (distance == 2) return 50; // 20% opacity
        if (distance == 3) return 100; // 40% opacity
        if (distance == 4) return 150; // 60% opacity
        return 200;  // 80% opacity
    }
}
