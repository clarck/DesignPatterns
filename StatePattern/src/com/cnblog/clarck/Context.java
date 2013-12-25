package com.cnblog.clarck;

/**
 * Context类，维护一个ConcrateState子类的实例，这个实例定义为当前的状态
 * 
 * @author clarck
 * 
 */
public class Context {
	private State mState;

	public Context(State state) {
		mState = state;
	}

	public State getState() {
		return mState;
	}

	public void setState(State mState) {
		this.mState = mState;
		System.out.println(String.format("当前状态：%s", mState.getClass().getName()));
	}

	public void request() {
		mState.handle(this);
	}
}
