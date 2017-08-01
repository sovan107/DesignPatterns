package com.sovanm.designs.factory;

public class DomesticProduct implements Product {

	@Override
	public void createProduct() {
		System.out.println("I have creared the DOMESTIC product for you!!");
	}

}
