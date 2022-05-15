package net.mrlolf.compressedblocks.mixin;

import net.mrlolf.compressedblocks.CompressedBlocks;
import net.minecraft.client.gui.screen.TitleScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(TitleScreen.class)
public class MainMixin {
    @Inject(at = @At("HEAD"), method = "init()V")
    private void init(CallbackInfo info) {
        CompressedBlocks.LOGGER.info("Started " + CompressedBlocks.MOD_ID);
    }
}