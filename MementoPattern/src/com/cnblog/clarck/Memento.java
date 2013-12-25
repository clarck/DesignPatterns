package com.cnblog.clarck;

/**
 * 备忘录类
 * 
 * @author clarck
 * 
 */
public class Memento {
	private String mState;

	public String getState() {
		return mState;
	}

	public Memento(String state) {
		mState = state;
	}
	
}
