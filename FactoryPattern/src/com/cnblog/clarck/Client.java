package com.cnblog.clarck;

/**
 * 测试类
 * 
 * @author clarck
 * 
 */
public class Client {
	public static void main(String[] args) {
		IFactory operFactory = new AddFactory();
		Operation operation = operFactory.createOperation();
		operation.setNmberA(1);
		operation.setNumberB(2);
		double result = operation.getResult();
		System.out.println("add result: " + result);

		operFactory = new SubFactory();
		Operation subOperation = operFactory.createOperation();
		subOperation.setNmberA(1);
		subOperation.setNumberB(2);
		double subResult = subOperation.getResult();
		System.out.println("sub result: " + subResult);

		operFactory = new MulFactory();
		Operation mulOperation = operFactory.createOperation();
		mulOperation.setNmberA(1);
		mulOperation.setNumberB(2);
		double mulResult = mulOperation.getResult();
		System.out.println("mul result: " + mulResult);

		operFactory = new DivFactory();
		Operation divOperation = operFactory.createOperation();
		divOperation.setNmberA(1);
		divOperation.setNumberB(2);
		double divResult = divOperation.getResult();
		System.out.println("div result: " + divResult);

	}
}
