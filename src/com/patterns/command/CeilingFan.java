package com.patterns.command;

/**
 * Created by karenvega on 22/09/16.
 */
public class CeilingFan {

    private String name;

    public CeilingFan(String name) {
        this.name = name;
    }

    public void on() {
        System.out.println(name + " ceiling is on");
    }

    public void off() {
        System.out.println(name + " ceiling fan is off");
    }
}
