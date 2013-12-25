package com.cnblog.clarck;

public class ConcrateElementB extends Element {
	
	@Override
	public void accept(Visitor visitor) {
		visitor.visitConcrateElementB(this);
	}

	public void opreation() {
		
	}
}
