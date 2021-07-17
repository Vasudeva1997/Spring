package com.di;

public class ProductFactory {
	
	public static ProductRepository create() {
		return new ClothesRepository();
	}

}
