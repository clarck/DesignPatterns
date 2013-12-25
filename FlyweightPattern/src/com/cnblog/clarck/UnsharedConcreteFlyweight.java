package com.cnblog.clarck;

public class UnsharedConcreteFlyweight extends Flyweight {
	
	@Override
	public void operation(int exrinsicstate) {
		System.out.println(String.format("不共享的具体Flyweight:%d", exrinsicstate));
	}

}
