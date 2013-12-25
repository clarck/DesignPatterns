package com.cnblog.clarck;

/**
 * 对象声明接口
 * 
 * @author clarck
 * 
 */
public abstract class Component {
	protected String mName;

	public Component(String name) {
		mName = name;
	}

	public abstract void add(Component component);

	public abstract void remove(Component component);

	public abstract void display(int depth);
}
