package com.cnblogs.clarck;

/**
 * 测试类
 * 
 * @author clarck
 * 
 */
public class Client {
	public static void main(String[] args) {
		AbstractClass abstractClass;
		abstractClass = new ConcrateClassA();
		abstractClass.TemplateMethod();
		
		abstractClass = new ConcrateClassB();
		abstractClass.TemplateMethod();
	}
}
