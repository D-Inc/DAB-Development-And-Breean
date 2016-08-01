package com.rocker1337.dab.init.items;

import com.rocker1337.dab.init.SoundEvents.RegisterSoundEvents;
import net.minecraft.block.BlockJukebox;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemRecord;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.StatList;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.translation.I18n;
import net.minecraft.world.World;

public class MLGCanCanDisk extends ItemRecord
{
    protected MLGCanCanDisk(String name, SoundEvent soundIn)
    {
        super(name, soundIn);
        setUnlocalizedName(SetItemNames.DABItems.CANCANRECORD.getUnlocalizedName());
        setRegistryName(SetItemNames.DABItems.CANCANRECORD.getRegistryName());
    }

    @Override
    public EnumActionResult onItemUse(ItemStack stack, EntityPlayer playerIn, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ)
    {
        IBlockState iblockstate = worldIn.getBlockState(pos);

        if (iblockstate.getBlock() == Blocks.JUKEBOX && !((Boolean)iblockstate.getValue(BlockJukebox.HAS_RECORD)).booleanValue())
        {
            if (!worldIn.isRemote)
            {
                ((BlockJukebox)Blocks.JUKEBOX).insertRecord(worldIn, pos, iblockstate, stack);
                worldIn.playSound(null, pos, RegisterSoundEvents.records_mlgcancan, SoundCategory.RECORDS, 1.0F, 1.0F);
                --stack.stackSize;
                playerIn.addStat(StatList.RECORD_PLAYED);
            }

            return EnumActionResult.SUCCESS;
        }
        else
        {
            return EnumActionResult.PASS;
        }

    }
    @Override
    public String getRecordNameLocal()
    {
        return I18n.translateToLocal("Derek on Weed - MLG Can Can");
    }
}

