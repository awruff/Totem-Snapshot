package com.github.awruff.totems.mixins.client;

import com.github.awruff.totems.utils.RenderUtils;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GameGui;
import net.minecraft.client.render.Window;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(GameGui.class)
public class MixinGameGui {
    @Shadow
    @Final
    private Minecraft minecraft;

    @Inject(
            method = "render", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/render/GameRenderer;setupGuiState()V", shift = At.Shift.AFTER)
    )
    private void renderTotemPop(float tickDelta, CallbackInfo ci) {
        Window window = new Window(minecraft);
        RenderUtils.renderItem(minecraft, window.getWidth(), window.getHeight(), tickDelta);
    }
}
