package com.rocker1337.dab.init.entities.jenna;

import com.mojang.authlib.GameProfile;
import com.mojang.authlib.minecraft.MinecraftProfileTexture;
import com.rocker1337.dab.Reference;
import com.rocker1337.dab.init.entities.derek.EntityDerek;
import com.rocker1337.dab.init.entities.derek.RenderDerek;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelPlayer;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.texture.DynamicTexture;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import java.util.Map;

/**
 * Created by troth on 9/12/2016.
 */
public class RenderJenna extends RenderLiving
{
    Minecraft mc = Minecraft.getMinecraft();

    protected ResourceLocation jennaTexture;
    protected String jennaTexture2;
    public static final Factory FACTORY = new Factory();

    public RenderJenna(RenderManager rm)
    {
        super(rm, new ModelBiped(), 0.5F);
        setEntityTexture();
    }

    @Override
    protected void preRenderCallback(EntityLivingBase entity, float f) {
        preRenderCallbackJenna((EntityJenna) entity, f);
    }

    protected void preRenderCallbackJenna(EntityJenna entity, float f) {
        // some people do some G11 transformations or blends here, like you can do
        // GL11.glScalef(2F, 2F, 2F); to scale up the entity
        // which is used for Slime entities.  I suggest having the entity cast to
        // your custom type to make it easier to access fields from your
        // custom entity, eg. GL11.glScalef(entity.scaleFactor, entity.scaleFactor,
        // entity.scaleFactor);
    }

    protected void setEntityTexture()
    {
        jennaTexture2 = AbstractClientPlayer.getLocationSkin("Apriicot").toString();
        jennaTexture = new ResourceLocation(jennaTexture2);
        System.out.println(jennaTexture);
    }

    /**
     * Returns the location of an entity's texture. Doesn't seem to be called
     * unless you call Render.bindEntityTexture.
     */
    @Override
    protected ResourceLocation getEntityTexture(Entity par1Entity)
    {
        return jennaTexture;
    }

    public static class Factory implements IRenderFactory<EntityJenna>
    {
        @Override
        public Render<? super EntityJenna> createRenderFor(RenderManager manager)
        {
            return new RenderJenna(manager);
        }
    }
}
