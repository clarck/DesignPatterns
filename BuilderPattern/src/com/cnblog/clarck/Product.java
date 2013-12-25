package com.cnblog.clarck;

import java.util.ArrayList;
import java.util.List;

/**
 * 产品类，由多个部分组成
 * 
 * @author clarck
 * 
 */
public class Product {
	private List<String> parts = new ArrayList<String>();

	public void add(String part) {
		parts.add(part);
	}

	public void show() {
		System.out.println("产品 创建-----");
		for (String part : parts) {
			System.out.println(part);
		}
	}
}
