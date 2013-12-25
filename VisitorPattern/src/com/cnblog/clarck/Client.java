package com.cnblog.clarck;

public class Client {
	public static void main(String[] args) {
		ObjectStructure objectStructure = new ObjectStructure();
		
		objectStructure.attach(new ConcrateElementA());
		objectStructure.attach(new ConcrateElementB());
		
		ConcrateVisitor1 v1 = new ConcrateVisitor1();
		ConcrateVisitor2 v2 = new ConcrateVisitor2();
		
		objectStructure.accept(v1);
		objectStructure.accept(v2);
	}
}
