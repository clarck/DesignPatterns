package com.cnblog.clarck;

public class Client {
	public static void main(String[] args) {
		Receiver reciver = new Receiver();
		Command command = new ConcrateCommand(reciver);
		Invoker invoker = new Invoker();
		
		invoker.setCommand(command);
		invoker.excuteCommand();
	}
}
