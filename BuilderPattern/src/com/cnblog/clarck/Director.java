package com.cnblog.clarck;

/**
 * 指挥者
 * 
 * @author clarck
 * 
 */
public class Director {
	public void Construct(Builder builder) {
		builder.buildPartA();
		builder.buildPartB();
	}
}
