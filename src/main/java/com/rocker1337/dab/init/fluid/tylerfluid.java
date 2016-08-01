package com.rocker1337.dab.init.fluid;

import com.rocker1337.dab.Reference;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.Fluid;

/**
 * Created by ninjawarrior1337 on 8/1/16.
 */
public class tylerfluid extends Fluid
{
    public static final String name = "tyler_fluid";
    public static final tylerfluid instance = new tylerfluid();

    public tylerfluid()
    {
        super(name, new ResourceLocation(Reference.MODID + ":" + "blocks/" + name + "_still"), new ResourceLocation(Reference.MODID + ":" + "blocks/" + name + "_flow"));
        this.setDensity(-1);
        this.temperature = 300;
        this.viscosity = 1;
        this.setGaseous(true);
    }

}
