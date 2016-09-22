package com.patterns.command;

/**
 * Created by karenvega on 21/09/16.
 */
public class RemoteControl {

    Command[] onCommands;
    Command[] offCommands;

    public RemoteControl(String algo) {
        System.out.println("Inicializando...");
        onCommands = new Command[5];
        offCommands = new Command[5];

//        Command noCommand = new No

    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPressed(int slot) {
        onCommands[slot].execute();
    }

    public void offButtonWasPressed(int slot) {
        offCommands[slot].execute();
    }

    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("------ Remote Control -------");
        for (int i = 0; i < onCommands.length; i++) {
            sb.append("" + onCommands[i].getClass().getName() + " ..... " + offCommands[i].getClass().getName());
        }
        return sb.toString();
    }
}
