package com.rocker1337.dab.init.entities.jenna;

import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

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

    protected void preRenderCallbackJenna(EntityJenna entity, float f)
    {

    }

    protected void setEntityTexture()
    {
        jennaTexture = AbstractClientPlayer.getLocationSkin("Rocker545");
        System.out.println(jennaTexture.toString());
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
