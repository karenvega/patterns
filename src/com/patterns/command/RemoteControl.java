package com.patterns.command;

/**
 * The RemoteControl manages a set of Command objects, one per button. When a button is pressed, the corresponding ButtonWasPushed() method is called, which invokes these actions by calling the execute() method
 * Created by karenvega on 21/09/16.
 */
public class RemoteControl {

    Command[] onCommands;
    Command[] offCommands;

    public RemoteControl(String algo) {
        System.out.println("Inicializando...");
        onCommands = new Command[7];
        offCommands = new Command[7];

        Command noCommand = new NoCommand();
        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
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
        System.out.println("ToString");
        StringBuffer sb = new StringBuffer();
        sb.append(System.getProperty("line.separator") + "------ Remote Control -------" + System.getProperty("line.separator"));
        for (int i = 0; i < onCommands.length; i++) {
            sb.append("[slot " + i + "]" + onCommands[i].getClass().getName() + "     " + offCommands[i].getClass().getName() + System.getProperty("line.separator"));
        }
        return sb.toString();
    }
}