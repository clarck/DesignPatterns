package com.cnblog.clarck;

/**
 * 减法工厂
 * 
 * @author clarck
 * 
 */
public class SubFactory implements IFactory {

	@Override
	public Operation createOperation() {
		return new OperationSub();
	}

}
