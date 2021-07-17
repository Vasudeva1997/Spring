package com.di;

public class ProductCatalog {

	public void printProducts() {
		ProductRepository productRepository = ProductFactory.create();
		for (String product : productRepository.getProductLists()) {
			System.out.println(product);
		}
	}
}
