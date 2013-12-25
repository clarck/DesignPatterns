package com.cnblog.clarck;

public class Client {
	public static void main(String[] args) {
		int extrinsicstate = 22;
		
		FlyweightFactory factory = new FlyweightFactory();
		
		Flyweight fx = factory.getFlyweight("X");
		fx.operation(--extrinsicstate);
		
		Flyweight fy = factory.getFlyweight("Y");
		fy.operation(--extrinsicstate);
		
		Flyweight fz = factory.getFlyweight("Z");
		fz.operation(--extrinsicstate);
		
		Flyweight uf = new UnsharedConcreteFlyweight();
		uf.operation(--extrinsicstate);
	}
}
