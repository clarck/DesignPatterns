package com.cnblog.clarck;

/**
 * 原型类
 * 
 * @author clarck
 * 
 */
public abstract class Prototype {
	private String mID;

	public Prototype(String id) {
		mID = id;
	}

	public String getID() {
		return mID;
	}

	public abstract Prototype Clone();
}
