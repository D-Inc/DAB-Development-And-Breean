package com.rocker1337.dab.init.fluid;

import com.rocker1337.dab.Reference;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.ItemMeshDefinition;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.block.statemap.StateMapperBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class DABFluid
{
    private static ModelResourceLocation tyler_location = new ModelResourceLocation(Reference.MODID + ":" + BlockTyler.name, "fluid");
    public static void register()
    {
        FluidRegistry.registerFluid(tylerfluid.instance);
        GameRegistry.registerBlock(BlockTyler.instance, BlockTyler.name);
        Item tyler = Item.getItemFromBlock(BlockTyler.instance);
        ModelLoader.setCustomMeshDefinition(tyler, new ItemMeshDefinition() {
            @Override
            public ModelResourceLocation getModelLocation(ItemStack stack)
            {
                return tyler_location;
            }
        });

        ModelLoader.setCustomStateMapper(BlockTyler.instance, new StateMapperBase() {
            @Override
            protected ModelResourceLocation getModelResourceLocation(IBlockState state) {
                return tyler_location;
            }
        });
    }
}
