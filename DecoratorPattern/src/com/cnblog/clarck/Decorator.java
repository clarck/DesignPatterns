package com.cnblog.clarck;

/**
 * 装饰抽象类，继承了Component,从外来类来扩展Component类的功能，
 * 但对于Component来说是不需要知道Decorator的存在的。
 * 
 * @author clarck
 * 
 */
public abstract class Decorator extends Component {
	protected Component mComponent;

	public void setComponent(Component component) {
		mComponent = component;
	}
	
	@Override
	public void Operation() {
		if (mComponent != null) {
			mComponent.Operation();
		}
	}

}
