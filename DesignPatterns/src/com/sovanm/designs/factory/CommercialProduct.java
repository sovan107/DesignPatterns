package com.sovanm.designs.factory;

public class CommercialProduct implements Product {

	@Override
	public void createProduct() {
		System.out.println("I have creared the COMMERCIAL product for you!!");
	}

}
