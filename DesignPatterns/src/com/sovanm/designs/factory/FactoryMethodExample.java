package com.sovanm.designs.factory;

import com.sovanm.designs.factory.exception.ProductNotFoundException;

/**
 * Define an interface / abstract class for creating an object but let the sub class
 * decide which class to instantiate. 
 * */
public class FactoryMethodExample {

	public FactoryMethodExample(){
		
	}
	
	public static void main(String[] args) throws ProductNotFoundException {
		
		ProductFactory domesticProductFactory = new ProductFactory("Domestic");
		Product domesticProduct = domesticProductFactory.getProduct();
		domesticProduct.createProduct();
		
		
		ProductFactory commercialProductFactory = new ProductFactory("Commercial");
		Product commercialProduct = commercialProductFactory.getProduct();
		commercialProduct.createProduct();
	}
}
