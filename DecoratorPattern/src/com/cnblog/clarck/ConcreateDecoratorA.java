package com.cnblog.clarck;

/**
 * 具体的的装饰对象，起到给Component添加职责的作用
 * 
 * @author clarck
 * 
 */
public class ConcreateDecoratorA extends Decorator {
	private String addedState;

	@Override
	public void Operation() {
		super.Operation();
		addedState = "New State";
		System.out.println("具体装饰对象A的操作" + addedState);
	}

}
