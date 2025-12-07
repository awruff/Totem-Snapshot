package com.github.awruff.totems.mixins.client;

import com.github.awruff.totems.utils.RenderUtils;
import net.minecraft.client.render.GameRenderer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(GameRenderer.class)
public class MixinGameRenderer {
    @Inject(method = "tick", at = @At("TAIL"))
    private void idk(CallbackInfo ci) {
        if (RenderUtils.activationTicks > 0) {
            if (--RenderUtils.activationTicks == 0) {
                RenderUtils.activatedItem = null;
            }
        }
    }
}
