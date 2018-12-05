package com.jdp.patterns.command;

public class Test {

	public static void main(String[] args) {
		Television tele = new Television();
		RemoteControl control = new RemoteControl();
		control.setCommand(new OnCommand(tele));
		control.pressButton();
		control.setCommand(new OffCommand(tele));
		control.pressButton();
	}

}
