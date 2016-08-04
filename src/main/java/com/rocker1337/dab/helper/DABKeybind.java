package com.rocker1337.dab.helper;

import org.lwjgl.input.Keyboard;

/**
 * Created by drkpa on 8/2/2016.
 */
public enum DABKeybind {
    INCREASE_SPEED("dab.increasetoolspeed", Keyboard.KEY_V),
    DECREASE_SPEED("dab.decreasetoolspeed", Keyboard.KEY_B),
    RESET_SPEED("dab.resettoolspeed", Keyboard.KEY_C);

    public final String keyName;
    public final int defaultKeyCode;

    DABKeybind(String keyName, int defaultKeyCode)
    {
        this.keyName = keyName;
        this.defaultKeyCode = defaultKeyCode;
    }
}
