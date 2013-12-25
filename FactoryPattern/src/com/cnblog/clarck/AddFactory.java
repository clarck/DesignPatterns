package com.cnblog.clarck;

/**
 * 加法工厂
 * 
 * @author clarck
 * 
 */
public class AddFactory implements IFactory {

	@Override
	public Operation createOperation() {
		return new OperationAdd();
	}

}
