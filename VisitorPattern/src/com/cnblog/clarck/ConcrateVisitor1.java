package com.cnblog.clarck;

public class ConcrateVisitor1 extends Visitor {

	@Override
	public void visitConcrateElementA(ConcrateElementA concreateElementA) {
		System.out.println(String.format("%s被%s访问", concreateElementA.getClass().getName(), this.getClass().getName()));
	}

	@Override
	public void visitConcrateElementB(ConcrateElementB concreateElementB) {
		System.out.println(String.format("%s被%s访问", concreateElementB.getClass().getName(), this.getClass().getName()));
	}


}
