package com.cnblog.clarck;

public class ConcrateColleague1 extends Colleague {

	public ConcrateColleague1(Mediator mediator) {
		super(mediator);
	}
	
	public void send(String message) {
		mMediator.send(message, this);
	}
	
	public void notify(String message) {
		System.out.println(String.format("同事1得到信息:%s", message));
	}

}
