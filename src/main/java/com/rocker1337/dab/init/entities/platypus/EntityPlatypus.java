package com.rocker1337.dab.init.entities.platypus;

import com.rocker1337.dab.init.SoundEvents.RegisterSoundEvents;
import com.rocker1337.dab.init.items.DABItems;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAISit;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.passive.EntityTameable;
import net.minecraft.item.Item;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;

/**
 * Created by troth on 9/10/2016.
 */
public class EntityPlatypus extends EntityTameable
{
    public EntityPlatypus(World worldIn)
    {
        super(worldIn);
        this.setSize(0.6F, 0.65F);
    }

    @Override
    public EntityAgeable createChild(EntityAgeable ageable)
    {
        EntityPlatypus entplat = new EntityPlatypus(this.worldObj);
        return entplat;
    }

    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.2D);
        getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(40.0D);
    }

    @Override
    protected void initEntityAI()
    {
        this.tasks.addTask(1, new EntityAIWander(this, 1.0D));
        tasks.addTask(1, new EntityAISit(this));
    }

    @Override
    protected Item getDropItem()
    {
        return DABItems.bobatea;
    }

    @Override
    protected SoundEvent getAmbientSound()
    {
        return RegisterSoundEvents.perry_chatter;
    }

    public int getMaxSpawnedInChunk()
    {
        return 8;
    }
}
