package com.cnblogs.clarck;

/**
 * 实现父类的一个或多个抽象方法
 * 
 * @author clarck
 * 
 */
public class ConcrateClassA extends AbstractClass {

	@Override
	public void primitiveOperation1() {
		System.out.println("具体类A的方法1实现");
	}

	@Override
	public void primitiveOperation2() {
		System.out.println("具体类A的方法2实现");
	}

}
