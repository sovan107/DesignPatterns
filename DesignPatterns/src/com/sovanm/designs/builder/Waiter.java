package com.sovanm.designs.builder;

/**
 * In builder patter this is the DIRECTOR of the pattern. Director calls 
 * the builder class and creates the object 
 * */
public class Waiter {

	private PizzaBuilder pizzaBuilder;
	
	public void setPizzaBuilder(PizzaBuilder pb){
		this.pizzaBuilder = pb;
	}
	
	public Pizza getPizza(){
		return pizzaBuilder.getPizza();
	}
	
	public void constructPizza(){
		pizzaBuilder.createNewPizzaProduct();
		pizzaBuilder.buildDough();
		pizzaBuilder.buildSauce();
		pizzaBuilder.buildTopping();
	}
}
