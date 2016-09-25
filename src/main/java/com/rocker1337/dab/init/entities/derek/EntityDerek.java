package com.rocker1337.dab.init.entities.derek;

import com.rocker1337.dab.init.items.DABItems;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackRanged;
import net.minecraft.entity.ai.EntityAIAttackRangedBow;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.world.World;

/**
 * Created by troth on 9/11/2016.
 */
public class EntityDerek extends EntitySkeleton
{
    public EntityDerek(World worldIn) {
        super(worldIn);
    }
    @Override
    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.2D);
        getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(40.0D);
    }

    @Override
    protected void initEntityAI()
    {
        tasks.addTask(1, new EntityAIAttackRangedBow(this, 20.0D, 0, 20F));
        this.targetTasks.addTask(1, new EntityAINearestAttackableTarget(this, EntityPlayer.class, true));
    }

    @Override
    protected Item getDropItem()
    {
        return DABItems.Derek;
    }

}
