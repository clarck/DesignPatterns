package com.cnblog.clarck;

public class Abstraction {
	protected Implementor mImplementor;
	
	public void setImplementor(Implementor implementor) {
		mImplementor = implementor;
	}
	
	public void opreation() {
		mImplementor.operation();
	}
	
}
