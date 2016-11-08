package com.rocker1337.dab.helper;

import com.rocker1337.dab.init.items.DABItems;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.IFuelHandler;

/**
 * Created by ninjawarrior1337 on 11/8/16 at 2:08 PM.
 */
public class FuelHandler implements IFuelHandler
{
    @Override
    public int getBurnTime(ItemStack fuel)
    {
        Block blockFuel = Block.getBlockFromItem(fuel.getItem());
        Item itemFuel = fuel.getItem();

        if (itemFuel == DABItems.ThoriumCoal)
        {
            return 2147483647;//replace 0 with the number of ticks you want your Block or Item to burn. There are 20 ticks in a second. It takes 10 seconds to make one item.
        }
        return 0;
    }
}
