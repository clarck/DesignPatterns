package com.cnblog.clarck;

public class Client {
	public static void main(String[] args) {
		Singleton singleton1 = Singleton.getInstance();
		Singleton singleton2 = Singleton.getInstance();
		
		if (singleton1 == singleton2) {
			System.out.println("两个对象是相同的实例");
		}
	}
	
}
