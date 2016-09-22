package com.patterns.command;

/**
 * All RemoteControl commands implement the Command interface, which consists of one method: execute(). Commands encapsulate a set of actions on a specific vendor class. The remote invoke these actions by calling the execute() method
 * Created by karenvega on 21/09/16.
 */
public interface Command {

    public void execute();

    public void undo();
}
