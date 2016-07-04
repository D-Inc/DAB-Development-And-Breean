package com.rocker1337.dab.events;

import net.minecraft.server.MinecraftServer;
import net.minecraft.world.GameRules;
import net.minecraftforge.event.world.WorldEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

/**
 * Created by Rocker545 on 7/3/2016.
 */
public class Gamerules {

    public static class GameRule {
        public static final String DISABLE_WEATHER = "disableWeather";

    }

    public static void addRule(GameRules rules, String name, String defaultValue) {
        if (!rules.hasRule(name)) rules.addGameRule(name, defaultValue, GameRules.ValueType.BOOLEAN_VALUE);
    }

    @SubscribeEvent
    public void onWorldLoad(WorldEvent.Load evt) {
        final GameRules rules = evt.getWorld().getGameRules();
        addRule(rules, GameRule.DISABLE_WEATHER, "false");
    }
}
