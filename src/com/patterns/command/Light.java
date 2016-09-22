package com.patterns.command;

/**
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
