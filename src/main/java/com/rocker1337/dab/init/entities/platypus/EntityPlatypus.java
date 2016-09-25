package com.rocker1337.dab.init.entities.platypus;

import com.rocker1337.dab.init.SoundEvents.RegisterSoundEvents;
import com.rocker1337.dab.init.items.DABItems;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.item.Item;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;

/**
 * Created by troth on 9/10/2016.
 */
public class EntityPlatypus extends EntityCreature
{
    public EntityPlatypus(World worldIn)
    {
        super(worldIn);
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
}
