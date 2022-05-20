package net.mrlolf.compressedblocks.block.custom;

import net.minecraft.block.BlockState;
import net.minecraft.block.RedstoneBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.BlockView;

public class CompressedRedstoneX2 extends RedstoneBlock {
    public CompressedRedstoneX2(Settings settings) {
        super(settings);
    }

    @Override
    public int getWeakRedstonePower(BlockState state, BlockView world, BlockPos pos, Direction direction) {
        return 30;
    }
}