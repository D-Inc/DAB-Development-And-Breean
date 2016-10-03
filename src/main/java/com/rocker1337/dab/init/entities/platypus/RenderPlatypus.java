package com.rocker1337.dab.init.entities.platypus;

import com.rocker1337.dab.Reference;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class RenderPlatypus extends RenderLiving {
    protected ResourceLocation platypusTexture;
    public static final Factory FACTORY = new Factory();

    public RenderPlatypus(RenderManager rm) {
        super(rm, new ModelPlatypus(), 0.5F);
        setEntityTexture();
    }

    @Override
    protected void preRenderCallback(EntityLivingBase entity, float f) {
        preRenderCallbackPlatypus((EntityPlatypus) entity, f);
    }

    protected void preRenderCallbackPlatypus(EntityPlatypus entity, float f)
    {

    }

    protected void setEntityTexture() {
        platypusTexture = new ResourceLocation(Reference.MODID + ":textures/entity/perry.png");
    }

    /**
     * Returns the location of an entity's texture. Doesn't seem to be called
     * unless you call Render.bindEntityTexture.
     */
    @Override
    protected ResourceLocation getEntityTexture(Entity par1Entity) {
        return platypusTexture;
    }

    public static class Factory implements IRenderFactory<EntityPlatypus> {
        @Override
        public Render<? super EntityPlatypus> createRenderFor(RenderManager manager) {
            return new RenderPlatypus(manager);
        }
    }
}