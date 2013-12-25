package com.cnblog.clarck;

/**
 * 数据运算基类
 * 
 * @author clarck
 * 
 */
public class Operation {
	private double mNmberA = 0;
	private double mNumberB = 0;

	public double getNumberA() {
		return mNmberA;
	}

	public void setNmberA(double numberA) {
		this.mNmberA = numberA;
	}

	public double getNumberB() {
		return mNumberB;
	}

	public void setNumberB(double numberB) {
		this.mNumberB = numberB;
	}
	
	/**
	 * 获取运算结果
	 * @return
	 */
	public double getResult() {
		double result = 0;
		return result;
	}

}
