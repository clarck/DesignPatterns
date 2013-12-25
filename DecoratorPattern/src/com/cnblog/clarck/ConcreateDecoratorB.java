package com.cnblog.clarck;

/**
 * 具体的装饰类B
 * 
 * @author clarck
 * 
 */
public class ConcreateDecoratorB extends Decorator {

	@Override
	public void Operation() {
		super.Operation();
		addedBehaivor();
		System.out.println("具体装饰对象B");
	}

	private void addedBehaivor() { //用来区别ConcreateDecoratorA
		
	}
}
