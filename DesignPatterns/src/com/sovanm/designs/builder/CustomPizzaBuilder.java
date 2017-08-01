package com.sovanm.designs.builder;

public class CustomPizzaBuilder extends PizzaBuilder {

	@Override
	public void buildDough() {
		pizza.setDough("Custom");

	}

	@Override
	public void buildSauce() {
		pizza.setSauce("Custom");

	}

	@Override
	public void buildTopping() {
		pizza.setTopping("Custom");

	}

}
