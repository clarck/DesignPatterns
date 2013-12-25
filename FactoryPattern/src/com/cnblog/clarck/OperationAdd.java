package com.cnblog.clarck;

/**
 * 加法类
 * 
 * @author clarck
 * 
 */
public class OperationAdd extends Operation {

	@Override
	public double getResult() {
		double result = 0;
		result = getNumberA() + getNumberB();
		return result;
	}

}
