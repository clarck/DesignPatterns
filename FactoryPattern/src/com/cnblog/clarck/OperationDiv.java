package com.cnblog.clarck;

/**
 * 除法类
 * 
 * @author clarck
 * 
 */
public class OperationDiv extends Operation {

	@Override
	public double getResult() {
		if (getNumberB() == 0) {
			throwException();
		}

		double result = getNumberA() / getNumberB();
		return result;
	}

	private void throwException() {
		try {
			throw new Exception("the div number can't be zero.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
