package net.mrlolf.compressedblocks;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
import net.mrlolf.compressedblocks.block.compressedblocks;

public class ClientCompressedBlocks implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(compressedblocks.COMPRESSED_GLASS, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(compressedblocks.COMPRESSED_GLASS2, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(compressedblocks.COMPRESSED_GLASS3, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(compressedblocks.COMPRESSED_GLASS4, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(compressedblocks.COMPRESSED_GLASS5, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(compressedblocks.COMPRESSED_GLASS6, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(compressedblocks.COMPRESSED_GLASS7, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(compressedblocks.COMPRESSED_GLASS8, RenderLayer.getTranslucent());
        
    }
}

