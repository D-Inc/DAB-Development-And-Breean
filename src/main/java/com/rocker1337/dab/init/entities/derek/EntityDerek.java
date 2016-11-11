package com.rocker1337.dab.init.entities.derek;

import com.rocker1337.dab.init.items.DABItems;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackMelee;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.world.World;

/**
 * Created by troth on 9/11/2016.
 */
public class EntityDerek extends EntityCreature
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
        tasks.addTask(1, new EntityAIAttackMelee(this, 10D, true));
        this.targetTasks.addTask(1, new EntityAINearestAttackableTarget(this, EntityPlayer.class, true));
        this.targetTasks.addTask(1, new EntityAINearestAttackableTarget(this, EntitySheep.class, false));
    }

    @Override
    protected Item getDropItem()
    {
        return DABItems.Derek;
    }

    public int getMaxSpawnedInChunk()
{
    return 8;
}

}
