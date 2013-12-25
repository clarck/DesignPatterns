package com.cnblog.clarck;

/**
 * 迭代器抽象类
 * 
 * @author clarck
 * 
 */
public abstract class Iterator {
	public abstract Object first();

	public abstract Object next();

	public abstract boolean isDone();

	public abstract Object currentItem();
}
