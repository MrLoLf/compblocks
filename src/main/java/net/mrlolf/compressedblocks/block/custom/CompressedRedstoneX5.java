package net.mrlolf.compressedblocks.block.custom;

import net.minecraft.block.BlockState;
import net.minecraft.block.RedstoneBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.BlockView;

public class CompressedRedstoneX5 extends RedstoneBlock {
    public CompressedRedstoneX5(Settings settings) {
        super(settings);
    }

    @Override
    public int getWeakRedstonePower(BlockState state, BlockView world, BlockPos pos, Direction direction) {
        return 53;
    }
}
