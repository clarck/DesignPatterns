package com.cnblog.clarck;

/**
 * 具体状态类
 * 
 * @author clarck
 * 
 */
public class ConcrateStateB extends State {

	@Override
	public void handle(Context context) {
		context.setState(new ConcrateStateA());
	}

}
