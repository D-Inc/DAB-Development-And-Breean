package com.rocker1337.dab.init.blocks;

import com.mojang.realmsclient.gui.ChatFormatting;
import net.darkhax.tesla.api.ITeslaConsumer;
import net.darkhax.tesla.api.ITeslaHolder;
import net.darkhax.tesla.api.ITeslaProducer;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.util.INBTSerializable;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by ninjawarrior1337 on 7/4/2016.
 */
public class controller extends BlockContainer implements ITileEntityProvider,ITeslaConsumer,ITeslaProducer,ITeslaHolder,INBTSerializable<NBTTagCompound>
{
    private long stored;

    private long capacity;

    private long rate;


    public static final PropertyBool UP = PropertyBool.create("up");
    public static final PropertyBool DOWN = PropertyBool.create("down");
    public static final PropertyBool NORTH = PropertyBool.create("north");
    public static final PropertyBool SOUTH = PropertyBool.create("south");
    public static final PropertyBool EAST = PropertyBool.create("east");
    public static final PropertyBool WEST = PropertyBool.create("west");

    public List<Block> connectedBlocks;
    public List<IBlockState> connectedStates;

    public controller(long capacity, long input, long output)
    {
        super(Material.IRON);
        setUnlocalizedName(SetBlockNames.DABBlocks.controller.getUnlocalizedName());
        setRegistryName(SetBlockNames.DABBlocks.controller.getUnlocalizedName());
        this.setHardness(1.0F);
        this.setResistance(1000.0F);
        this.setHarvestLevel("pickaxe", 2);
        this.setLightLevel(20.0F);
        connectedBlocks = new ArrayList<Block>();
        connectedBlocks.add(this);
        connectedStates = new ArrayList<IBlockState>();
        this.setDefaultState(getDefaultState().withProperty(UP, false).withProperty(DOWN, false).withProperty(NORTH, false).withProperty(SOUTH, false).withProperty(EAST,false).withProperty(WEST,false));

        this.capacity = capacity;
        this.rate = 5000L;

    }

    public controller(NBTTagCompound dataTag)
    {
        super(Material.IRON);
        this.deserializeNBT(dataTag);
    }

    public controller(List<Block> connectedBlocks)
    {
        super(Material.IRON);
        setUnlocalizedName(SetBlockNames.DABBlocks.controller.getUnlocalizedName());
        setRegistryName(SetBlockNames.DABBlocks.controller.getUnlocalizedName());
        this.connectedBlocks = connectedBlocks;
        connectedStates = new ArrayList<IBlockState>();
        this.setDefaultState(getDefaultState().withProperty(UP, false).withProperty(DOWN, false).withProperty(NORTH, false).withProperty(SOUTH, false).withProperty(EAST,false).withProperty(WEST,false));
    }
    public controller(List<Block> connectedBlocks, List<IBlockState> connectedStates)
    {
        super(Material.IRON);
        setUnlocalizedName(SetBlockNames.DABBlocks.controller.getUnlocalizedName());
        setRegistryName(SetBlockNames.DABBlocks.controller.getUnlocalizedName());
        this.connectedBlocks = connectedBlocks;
        this.connectedStates = connectedStates;
        this.setDefaultState(getDefaultState().withProperty(UP, false).withProperty(DOWN, false).withProperty(NORTH, false).withProperty(SOUTH, false).withProperty(EAST,false).withProperty(WEST,false));
    }

    @Override
    public IBlockState getActualState(IBlockState state,IBlockAccess world, BlockPos pos)
    {
        return getDefaultState()
                .withProperty(UP, isConnected(world, pos.up()))
                .withProperty(DOWN, isConnected(world, pos.down()))
                .withProperty(NORTH, isConnected(world, pos.north()))
                .withProperty(SOUTH, isConnected(world, pos.south()))
                .withProperty(EAST, isConnected(world, pos.east()))
                .withProperty(WEST, isConnected(world, pos.west()));
    }

    protected Boolean isConnected(IBlockAccess world, BlockPos pos)
    {
        return connectedStates.contains(world.getBlockState(pos)) || connectedBlocks.contains(world.getBlockState(pos).getBlock());
    }

    @Override
    protected BlockStateContainer createBlockState() {
        return new BlockStateContainer(this, UP, DOWN, NORTH, SOUTH, EAST, WEST);
    }

    @Override
    public IBlockState getStateFromMeta(int meta) {
        return getDefaultState();
    }

    @Override
    public int getMetaFromState(IBlockState state) {
        return 0;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, EntityPlayer playerIn, List toolTip, boolean advanced)
    {
        toolTip.add(ChatFormatting.WHITE + "Its Smoother!");
    }

    @Override
    public TileEntity createNewTileEntity(World worldIn, int meta) {
        return new TileController();
    }

    @Override
    public void breakBlock(World world, BlockPos pos, IBlockState state) {
        super.breakBlock(world, pos, state);
        world.removeTileEntity(pos);
    }

    @Override
    public long getStoredPower() {
        return this.stored;
    }

    @Override
    public long getCapacity() {
        return this.capacity;
    }

    @Override
    public long takePower(long power, boolean simulated) {
        long taken = Math.min(stored, Math.min(rate, power));
        if (!simulated) {
            stored -= taken;
        }
        return taken;
    }

    @Override
    public long givePower(long power, boolean simulated) {
        final long given = Math.min(capacity - stored, Math.min(rate, power));
        if (!simulated) {
            stored += given;
        }
        return given;
    }

    @Override
    public NBTTagCompound serializeNBT () {

        final NBTTagCompound dataTag = new NBTTagCompound();
        dataTag.setLong("TeslaPower", this.stored);
        dataTag.setLong("TeslaCapacity", this.capacity);

        return dataTag;
    }

    public void deserializeNBT (NBTTagCompound nbt) {

        this.stored = nbt.getLong("TeslaPower");

        if (nbt.hasKey("TeslaCapacity"))
            this.capacity = nbt.getLong("TeslaCapacity");

        if (this.stored > this.getCapacity())
            this.stored = this.getCapacity();
    }

    public controller setCapacity (long capacity) {

        this.capacity = 10;

        if (this.stored > capacity)
            this.stored = capacity;

        return this;
    }

    @Override
    public EnumBlockRenderType getRenderType (IBlockState state) {

        return EnumBlockRenderType.MODEL;
    }
}
