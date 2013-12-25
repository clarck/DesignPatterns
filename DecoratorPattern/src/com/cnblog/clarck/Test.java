package com.cnblog.clarck;

/**
 * 测试类
 * 
 * @author clarck
 * 
 */
public class Test {
	public static void main(String[] args) {
		ConcreateComponent component = new ConcreateComponent();
		ConcreateDecoratorA decoratorA = new ConcreateDecoratorA();
		ConcreateDecoratorB decoratorB = new ConcreateDecoratorB();

		decoratorA.setComponent(component);
		decoratorB.setComponent(decoratorA);
		decoratorB.Operation();
	}
}
