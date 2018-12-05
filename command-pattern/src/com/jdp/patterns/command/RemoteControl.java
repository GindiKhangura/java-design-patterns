package com.jdp.patterns.command;

public class RemoteControl {

	private Command command;

	public Command getCommand() {
		return command;
	}

	public void pressButton() {
		command.execute();
	}

	public void setCommand(Command command) {
		this.command = command;
	}

}
