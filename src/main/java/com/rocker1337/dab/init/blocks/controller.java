package com.rocker1337.dab.init.blocks;

import com.mojang.realmsclient.gui.ChatFormatting;
import mcjty.theoneprobe.api.IProbeHitData;
import mcjty.theoneprobe.api.IProbeInfo;
import mcjty.theoneprobe.api.IProbeInfoAccessor;
import mcjty.theoneprobe.api.ProbeMode;
import net.darkhax.tesla.api.implementation.BaseTeslaContainer;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.List;


/**
 * Created by ninjawarrior1337 on 7/4/2016.
 */
public class controller extends BlockContainer implements ITileEntityProvider,IProbeInfoAccessor
{

    public controller()
    {
        super(Material.IRON);
        setUnlocalizedName(SetBlockNames.DABBlocks.controller.getUnlocalizedName());
        setRegistryName(SetBlockNames.DABBlocks.controller.getUnlocalizedName());
        this.setHardness(1.0F);
        this.setResistance(1000.0F);
        this.setHarvestLevel("pickaxe", 2);
        this.setLightLevel(20.0F);

    }

    @Override
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, EntityPlayer playerIn, List toolTip, boolean advanced)
    {
        toolTip.add(ChatFormatting.WHITE + "Its Smoother!");
    }
    
    @Override
    public TileEntity createNewTileEntity(World worldIn, int meta) {
        return new TileController(new BaseTeslaContainer(Long.MAX_VALUE, 5000, 5000));
    }

    @Override
    public void breakBlock(World world, BlockPos pos, IBlockState state) {
        super.breakBlock(world, pos, state);
        world.removeTileEntity(pos);
    }

    @Override
    public EnumBlockRenderType getRenderType (IBlockState state) {

        return EnumBlockRenderType.MODEL;
    }

    @Override
    public void addProbeInfo(ProbeMode mode, IProbeInfo probeInfo, EntityPlayer player, World world, IBlockState blockState, IProbeHitData data) {
        probeInfo.text("This controller contains " + world.getTileEntity(data.getPos()).getTileData().getCompoundTag("TeslaContainer").getLong("TeslaPower") + "T");
    }
}
