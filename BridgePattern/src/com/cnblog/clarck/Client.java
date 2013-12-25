package com.cnblog.clarck;

public class Client {
	public static void main(String[] args) {
		Abstraction ab = new RefinedAbstraction();
		
		ab.setImplementor(new ConcrateImplementorA());
		ab.opreation();
		
		ab.setImplementor(new ConcrateImplementorB());
		ab.opreation();
	}
}
