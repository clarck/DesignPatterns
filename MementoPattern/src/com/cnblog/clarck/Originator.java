package com.cnblog.clarck;

/**
 * 发起人
 * 
 * @author clarck
 * 
 */
public class Originator {
	/**
	 * 需要保存的属性，可能有多个
	 */
	private String mState;

	public String getState() {
		return mState;
	}

	public void setState(String state) {
		this.mState = state;
	}
	
	public Memento createMemento() {
		return new Memento(mState);
	}

	public void setMemento(Memento memento) {
		mState = memento.getState();
	}
	
	public void show() {
		System.out.println(String.format("state=%s", mState));
	}
}
