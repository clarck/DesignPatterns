package com.cnblog.clarck;

public abstract class Command {
	protected Receiver mReceiver;

	public Command(Receiver receiver) {
		mReceiver = receiver;
	}
	
	public abstract void execute();
}
