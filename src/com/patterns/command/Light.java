package com.patterns.command;

/**
 * The Vendor Classes are used to perform the actual home-automation work of controlling devices. Here, we are using the Light class as an example.
 * Created by karenvega on 21/09/16.
 */
public class Light {

    private String name;

    public Light(String name) {
        this.name = name;
    }

    public void on() {
        System.out.println(name + " light is on");
    }

    public void off() {
        System.out.println(name + " light is off");
    }
}
