package com.cnblog.clarck;

public class Invoker {
	private Command mCommand;

	public void setCommand(Command command) {
		mCommand = command;
	}

	public void excuteCommand() {
		mCommand.execute();
	}
}
