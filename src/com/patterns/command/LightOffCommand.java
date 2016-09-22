package com.patterns.command;

/**
 * Using the Command Interface, each action that can be invoke by pressing a button on the remote is implemented with a Simple Command object. The Command Object holds a reference
 * Created by karenvega on 21/09/16.
 */
public class LightOffCommand implements Command {

    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}
