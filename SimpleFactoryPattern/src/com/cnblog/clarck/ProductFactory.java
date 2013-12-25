package com.cnblog.clarck;

/**
 * 产品工厂
 * 
 * @author clarck
 * 
 */
public class ProductFactory {
	public static Product createProduct(ProductType type) {
		Product product = null;
		switch (type) {
		case PRODUCTA:
			product = new ProductA();
			break;

		case PRODUCTB:
			product = new ProductB();
			break;

		default:
			break;
		}
		return product;
	}
}
