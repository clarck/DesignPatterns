package com.cnblog.clarck;

/**
 * 测试类
 * 
 * @author clarck
 * 
 */
public class Client {
	public static void main(String[] args) {
		ConcreatePrototype1 p1 = new ConcreatePrototype1("clarck");
		ConcreatePrototype1 c1 = (ConcreatePrototype1) p1.Clone();
		
		String str = String.format("id:%s", c1.getID());
		System.out.println(str);
		
		ConcreatePrototype1 p2 = new ConcreatePrototype1("clarck2");
		ConcreatePrototype1 c2 = (ConcreatePrototype1) p2.Clone();
		
		String str2 = String.format("id:%s", c2.getID());
		System.out.println(str2);
	}
}
