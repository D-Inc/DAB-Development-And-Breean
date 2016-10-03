package com.rocker1337.dab.init.entities.derek;

import com.rocker1337.dab.Reference;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

/**
 * Created by troth on 9/11/2016.
 */
public class RenderDerek extends RenderLiving
{
        protected ResourceLocation derekTexture;
        public static final Factory FACTORY = new Factory();

    public RenderDerek(RenderManager rm)
        {
            super(rm, new ModelBiped(), 0.5F);
            setEntityTexture();
        }

        @Override
        protected void preRenderCallback(EntityLivingBase entity, float f) {
            preRenderCallbackDerek((EntityDerek) entity, f);
        }

        protected void preRenderCallbackDerek(EntityDerek entity, float f)
        {

        }

        protected void setEntityTexture() {
            derekTexture = new ResourceLocation(Reference.MODID + ":textures/entity/derek.png");
        }

        /**
         * Returns the location of an entity's texture. Doesn't seem to be called
         * unless you call Render.bindEntityTexture.
         */
        @Override
        protected ResourceLocation getEntityTexture(Entity par1Entity) {
            return derekTexture;
        }

        public static class Factory implements IRenderFactory<EntityDerek>
        {
            @Override
            public Render<? super EntityDerek> createRenderFor(RenderManager manager)
            {
                return new com.rocker1337.dab.init.entities.derek.RenderDerek(manager);
            }
        }
    }
