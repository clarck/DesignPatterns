package com.cnblog.clarck;

public class Client {
	public static void main(String[] args) {
		Target target = new Adapter();
		target.request();
	}
}
