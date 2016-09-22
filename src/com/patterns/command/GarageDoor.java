package com.patterns.command;

/**
 * Created by karenvega on 22/09/16.
 */
public class GarageDoor {

    private String name;

    public GarageDoor(String name) {
        this.name = name;
    }

    public void on() {
        System.out.println(name + " door is up");
    }

    public void off() {
        System.out.println(name + " door is down");
    }
}

