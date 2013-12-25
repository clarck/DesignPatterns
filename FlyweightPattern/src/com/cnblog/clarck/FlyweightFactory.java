package com.cnblog.clarck;

import java.util.Hashtable;

public class FlyweightFactory {
	private Hashtable flyweight = new Hashtable();

	public FlyweightFactory() {
		flyweight.put("X", new ConcrateFlyweight());
		flyweight.put("Y", new ConcrateFlyweight());
		flyweight.put("Z", new ConcrateFlyweight());
	}
	
	public Flyweight getFlyweight(String key) {
		return (Flyweight) flyweight.get(key);
	}
	
}
