package com.cnblog.clarck;

public class Client {
	public static void main(String[] args) {
		Context c = new Context(new ConcrateStateA());
		
		c.request();
		c.request();
		c.request();
		c.request();
		c.request();
	}
}
