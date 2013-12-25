package com.cnblog.clarck;

/**
 * 除法工厂
 * 
 * @author clarck
 * 
 */
public class DivFactory implements IFactory {

	@Override
	public Operation createOperation() {
		return new OperationDiv();
	}

}
