package com.cnblog.clarck;

public class Client {
	
	public static void main(String[] args) {
		ConcrateMediator mediator = new ConcrateMediator();
	
		ConcrateColleague1 colleague1 = new ConcrateColleague1(mediator);
		ConcrateColleague2 colleague2 = new ConcrateColleague2(mediator);
		
		mediator.setColleague1(colleague1);
		mediator.setColleague2(colleague2);
		
		colleague1.send("吃过饭了吗?");
		colleague2.send("没有呢，你打算请客?");
	}
	
}
