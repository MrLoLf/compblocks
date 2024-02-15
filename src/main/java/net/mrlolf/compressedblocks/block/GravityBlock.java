package net.mrlolf.compressedblocks.block;
import net.minecraft.block.*;

import com.mojang.serialization.MapCodec;


public class GravityBlock extends FallingBlock {

    public GravityBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected MapCodec<? extends FallingBlock> getCodec() {
        throw new UnsupportedOperationException("Unimplemented method 'getCodec'");
    }
}
