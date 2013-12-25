package com.cnblog.clarck;

public class ConcrateCommand extends Command {

	public ConcrateCommand(Receiver receiver) {
		super(receiver);
	}

	@Override
	public void execute() {
		mReceiver.action();
	}

}
