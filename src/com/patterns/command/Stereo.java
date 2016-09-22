package com.patterns.command;

/**
 * Created by karenvega on 21/09/16.
 */
public class Stereo {

    private String name;

    public Stereo(String name) {
        this.name = name;
    }

    public void on() {
        System.out.println(name + " stereo is on");
    }

    public void setCD() {
        System.out.println(name + " stereo is set for CD input");
    }

    public void setVolume(int volume) {
        System.out.println(name + " stereo volume set to " + volume);
    }

    public void off() {
        System.out.println(name + " stereo is off");
    }
}
