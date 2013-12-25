package com.cnblog.clarck;

/**
 * 乘法
 * 
 * @author clarck
 * 
 */
public class MulFactory implements IFactory {

	@Override
	public Operation createOperation() {
		return new OperationMul();
	}

}
