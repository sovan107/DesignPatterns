package com.sovanm.designs.factory;

import com.sovanm.designs.factory.exception.ProductNotFoundException;

public class ProductFactory {

	private String productType;

	public ProductFactory(String productType) {
		this.productType = productType;
	}

	public Product getProduct() throws ProductNotFoundException {

		switch (this.productType) {

		case "Domestic":
			return new DomesticProduct();

		case "Commercial":
			return new CommercialProduct();

		default:
			throw new ProductNotFoundException(this.productType + "can not be creates as factory not found");
		}
	}
}
