package com.cnblog.clarck;

public class ConcrateFlyweight extends Flyweight {
	
	@Override
	public void operation(int exrinsicstate) {
		System.out.println(String.format("具体Flayweight:%s" , exrinsicstate));
	}

}
