package net.mrlolf.compressedblocks;

import net.fabricmc.api.ModInitializer;
import net.mrlolf.compressedblocks.block.compressedblocks;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CompressedBlocks implements ModInitializer {
    public static final String MOD_ID = "compressedblocks";
    public static final Logger LOGGER = LogManager.getLogger(MOD_ID);
    @Override
    public void onInitialize(){
        compressedblocks.registerBlocks();
    }
}
