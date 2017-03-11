package com.rocker1337.dab.init.blocks;

import net.darkhax.tesla.api.ITeslaConsumer;
import net.darkhax.tesla.api.ITeslaHolder;
import net.darkhax.tesla.api.ITeslaProducer;
import net.darkhax.tesla.api.implementation.BaseTeslaContainer;
import net.darkhax.tesla.capability.TeslaCapabilities;
import net.darkhax.tesla.lib.TeslaUtils;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ITickable;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.ICapabilityProvider;
import net.minecraftforge.common.util.INBTSerializable;

/**
 * Created by ninjawarrior1337 on 1/8/2017.
 */
public class TileController extends TileEntity implements ICapabilityProvider,ITeslaConsumer,ITeslaProducer,ITeslaHolder,INBTSerializable<NBTTagCompound>,ITickable
{
    private BaseTeslaContainer container;

    private long stored;

    private long capacity;

    private long rate;

    public TileController(BaseTeslaContainer container)
    {
        this.container = container;
        this.capacity = Long.MAX_VALUE;
        this.rate = container.getInputRate();
    }

    public TileController(NBTTagCompound dataTag)
    {
        this.deserializeNBT(dataTag);
    }

    @Override
    public void readFromNBT (NBTTagCompound compound) {

        super.readFromNBT(compound);

        this.container = new BaseTeslaContainer(compound.getCompoundTag("TeslaContainer"));
    }

    @Override
    public NBTTagCompound writeToNBT (NBTTagCompound compound) {

        compound.setTag("TeslaContainer", this.container.serializeNBT());
        return super.writeToNBT(compound);
    }

    @Override
    @SuppressWarnings("unchecked")
    public <T> T getCapability (Capability<T> capability, EnumFacing facing) {

        // This method is where other things will try to access your TileEntity's Tesla
        // capability. In the case of the analyzer, as a consumer, producer and holder so we
        // can allow requests that are looking for any of those things. This example also does
        // not care about which side is being accessed, however if you wanted to restrict which
        // side can be used, for example only allow power input through the back, that could be
        // done here.
        if (capability == TeslaCapabilities.CAPABILITY_CONSUMER || capability == TeslaCapabilities.CAPABILITY_PRODUCER || capability == TeslaCapabilities.CAPABILITY_HOLDER)
            return (T) this.container;

        return super.getCapability(capability, facing);
    }

    @Override
    public boolean hasCapability (Capability<?> capability, EnumFacing facing) {

        // This method replaces the instanceof checks that would be used in an interface based
        // system. It can be used by other things to see if the TileEntity uses a capability or
        // not. This example is a Consumer, Producer and Holder, so we return true for all
        // three. This can also be used to restrict access on certain sides, for example if you
        // only accept power input from the bottom of the block, you would only return true for
        // Consumer if the facing parameter was down.
        if (capability == TeslaCapabilities.CAPABILITY_CONSUMER || capability == TeslaCapabilities.CAPABILITY_PRODUCER || capability == TeslaCapabilities.CAPABILITY_HOLDER)
            return true;

        return super.hasCapability(capability, facing);
    }

    public TileEntity getTile()
    {
        return getWorld().getTileEntity(getPos());
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
    public long takePower (long Tesla, boolean simulated) {

        final long removedPower = Math.min(this.stored, Math.min(this.rate, Tesla));

        if (!simulated)
            this.stored -= removedPower;

        System.out.println("Removed Power = " + removedPower + " Stored Power= " + this.stored);

        return removedPower;
    }

    @Override
    public long givePower (long Tesla, boolean simulated) {

        final long acceptedTesla = Math.min(this.getCapacity() - this.stored, Math.min(this.rate, Tesla));

        if (!simulated)
            this.stored += acceptedTesla;

        System.out.println("Accepted Power = " + acceptedTesla + " Stored Power= " + this.stored);

        return acceptedTesla;
    }

    @Override
    public NBTTagCompound serializeNBT () {

        return this.container.serializeNBT();
    }

    public void deserializeNBT (NBTTagCompound nbt) {

        this.container.deserializeNBT(nbt);
    }

    @Override
    public void update() {
        TeslaUtils.distributePowerToAllFaces(this.worldObj, this.pos, rate, false);
    }


}
