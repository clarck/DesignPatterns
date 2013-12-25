package com.cnblog.clarck;

public class ConcrateColleague2 extends Colleague{

	public ConcrateColleague2(Mediator mediator) {
		super(mediator);
	}
	
	public void send(String message) {
		mMediator.send(message, this);
	}
	
	public void notify(String message) {
		System.out.println(String.format("同事2得到信息:%s", message));
	}

}
