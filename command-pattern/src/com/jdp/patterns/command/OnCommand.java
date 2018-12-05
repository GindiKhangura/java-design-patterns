package com.jdp.patterns.command;

public class OnCommand implements Command {

	private Television tele;

	public OnCommand(Television tele) {
		this.tele = tele;
	}

	@Override
	public void execute() {
		tele.on();
	}

}
