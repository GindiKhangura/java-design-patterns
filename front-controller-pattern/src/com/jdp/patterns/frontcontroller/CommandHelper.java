package com.jdp.patterns.frontcontroller;

public class CommandHelper {

	public Command getCommand(String uri) {
		if (uri.contains("viewStudentDetails.do")) {
			return new ViewStudentCommand();
		}
		return null;
	}

}
