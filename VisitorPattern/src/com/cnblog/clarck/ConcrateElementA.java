package com.cnblog.clarck;

public class ConcrateElementA extends Element {
	
	@Override
	public void accept(Visitor visitor) {
		visitor.visitConcrateElementA(this);
	}

	public void opreation() {
		
	}
}
