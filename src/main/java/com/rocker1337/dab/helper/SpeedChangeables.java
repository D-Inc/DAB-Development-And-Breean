package com.rocker1337.dab.helper;

import com.rocker1337.dab.init.items.DABItems;
import net.minecraft.item.Item;

import java.util.List;

/**
 * Created by drkpa on 8/4/2016.
 */
public class SpeedChangeables {
    public static List<Item> speedItems = null;

    public static void init() {
        SpeedChangeables.speedItems.add(DABItems.thoriumpickaxe);
        SpeedChangeables.speedItems.add(DABItems.multitool);
    }

    public List<Item> getSpeedItems() {
        return SpeedChangeables.speedItems;
    }
}
