package com.cnblogs.clarck;

/**
 * 抽象模板，并实现了一个模板方法。
 * 
 * @author clarck
 * 
 */
public abstract class AbstractClass {
	public abstract void primitiveOperation1();

	public abstract void primitiveOperation2();

	/**
	 * 模板方法，给出了逻辑的骨架，而逻辑的组成是一些相应的抽象操作，将具体的操作推迟到了子类实现。
	 */
	public void TemplateMethod() {
		primitiveOperation1();
		primitiveOperation2();

		System.out.println("");
	}
}
