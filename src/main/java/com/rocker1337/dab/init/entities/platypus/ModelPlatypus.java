package com.rocker1337.dab.init.entities.platypus;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * Created by ninjawarrior1337 on 9/10/16.
 */
public class ModelPlatypus extends ModelBase
{
        //fields
        ModelRenderer leg1;
        ModelRenderer leg2;
        ModelRenderer leg3;
        ModelRenderer leg4;
        ModelRenderer body;
        ModelRenderer bill;
        ModelRenderer tail;

        public ModelPlatypus()
        {
            textureWidth = 64;
            textureHeight = 64;

            leg1 = new ModelRenderer(this, 0, 0);
            leg1.addBox(0F, 0F, 0F, 1, 1, 1);
            leg1.setRotationPoint(-2F, 23F, -6F);
            leg1.setTextureSize(64, 64);
            leg1.mirror = true;
            setRotation(leg1, 0F, 0F, 0F);
            leg2 = new ModelRenderer(this, 0, 0);
            leg2.addBox(0F, 0F, 0F, 1, 1, 1);
            leg2.setRotationPoint(-2F, 23F, 1F);
            leg2.setTextureSize(64, 64);
            leg2.mirror = true;
            setRotation(leg2, 0F, 0F, 0F);
            leg3 = new ModelRenderer(this, 0, 0);
            leg3.addBox(0F, 0F, 0F, 1, 1, 1);
            leg3.setRotationPoint(1F, 23F, 1F);
            leg3.setTextureSize(64, 64);
            leg3.mirror = true;
            setRotation(leg3, 0F, 0F, 0F);
            leg4 = new ModelRenderer(this, 0, 0);
            leg4.addBox(0F, 0F, 0F, 1, 1, 1);
            leg4.setRotationPoint(1F, 23F, -6F);
            leg4.setTextureSize(64, 64);
            leg4.mirror = true;
            setRotation(leg4, 0F, 0F, 0F);
            body = new ModelRenderer(this, 30, 0);
            body.addBox(0F, 0F, 0F, 4, 4, 10);
            body.setRotationPoint(-2F, 19F, -7F);
            body.setTextureSize(64, 64);
            body.mirror = true;
            setRotation(body, 0F, 0F, 0F);
            bill = new ModelRenderer(this, 0, 22);
            bill.addBox(0F, 0F, 0F, 2, 1, 2);
            bill.setRotationPoint(-1F, 21F, -9F);
            bill.setTextureSize(64, 64);
            bill.mirror = true;
            setRotation(bill, 0F, 0F, 0F);
            tail = new ModelRenderer(this, 0, 8);
            tail.addBox(0F, 0F, 0F, 4, 1, 7);
            tail.setRotationPoint(-2F, 19F, 3F);
            tail.setTextureSize(64, 64);
            tail.mirror = true;
            setRotation(tail, -0.4848711F, 0F, 0F);
        }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
    {
        super.render(entity, f, f1, f2, f3, f4, f5);
        leg1.render(f5);
        leg2.render(f5);
        leg3.render(f5);
        leg4.render(f5);
        body.render(f5);
        bill.render(f5);
        tail.render(f5);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z)
    {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }
}
