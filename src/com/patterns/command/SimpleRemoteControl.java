package com.patterns.command;

/**
 * Created by karenvega on 21/09/16.
 */
public class SimpleRemoteControl {

    Command slot;

    public SimpleRemoteControl() {

    }

    public void setCommand(Command command) {
        slot = command;
    }

    public void buttonWasPressed() {
        slot.execute();
    }
}
