package com.rocker1337.dab.render;

import api.player.model.ModelPlayerAPI;
import com.mrcrayfish.dab.client.model.entity.ModelPlayerOverride;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;

/**
 * Created by ninjawarrior1337 on 1/29/2017.
 */
public class dabModelPlayerBase extends ModelPlayerOverride {

    public dabModelPlayerBase(ModelPlayerAPI modelPlayerAPI) {
        super(modelPlayerAPI);
    }

    public void afterSetRotationAngles(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, Entity paramEntity)
    {
        if(paramEntity.getEntityData().getBoolean("dabberoni"))
        {
            this.modelPlayer.bipedRightArm.rotateAngleX = (float) Math.toRadians(-90.0D);
            this.modelPlayer.bipedRightArm.rotateAngleY = (float) Math.toRadians(-35.0D);
            this.modelPlayer.bipedRightArmwear.rotateAngleX = (float) Math.toRadians(-90.0D);
            this.modelPlayer.bipedRightArmwear.rotateAngleY = (float) Math.toRadians(-35.0D);
            this.modelPlayer.bipedLeftArm.rotateAngleX = (float) Math.toRadians(110.0D);
            this.modelPlayer.bipedLeftArm.rotateAngleY = (float) Math.toRadians(75.0D);
            this.modelPlayer.bipedLeftArmwear.rotateAngleX = (float) Math.toRadians(110.0D);
            this.modelPlayer.bipedLeftArmwear.rotateAngleY = (float) Math.toRadians(75.0D);
            this.modelPlayer.bipedHead.rotateAngleX = (float) Math.toRadians(45.0D);
            this.modelPlayer.bipedHead.rotateAngleY = (float) Math.toRadians(35.0D);
            this.modelPlayer.bipedHeadwear.rotateAngleX = (float) Math.toRadians(45.0D);
            this.modelPlayer.bipedHeadwear.rotateAngleY = (float) Math.toRadians(35.0D);
            if (paramEntity.getEntityId() == Minecraft.getMinecraft().thePlayer.getEntityId() && Minecraft.getMinecraft().gameSettings.thirdPersonView == 0)
            {
                this.modelPlayer.bipedRightArm.rotateAngleY -= (float) Math.toRadians(125.0D);
                this.modelPlayer.bipedRightArmwear.rotateAngleY -= (float) Math.toRadians(125.0D);
                GlStateManager.rotate(-50.0F, 1.0F, 0.0F, 0.0F);
                GlStateManager.rotate(30.0F, 0.0F, 1.0F, 0.0F);
                GlStateManager.rotate(-30.0F, 0.0F, 0.0F, 1.0F);
                GlStateManager.translate(-0.3D, -0.2D, -0.5D);
                GlStateManager.scale(1.5D, 1.5D, 1.5D);
            }
        }
    }
}
