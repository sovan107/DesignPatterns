package com.sovanm.designs.builder;

/**
 * This demo will show the pizza ordering example in a restaurant
 *  
 * */
public class BuilderPattern {
	public static void main(String[] args) {
		
		// Create an instance of Director 
		Waiter waiter = new Waiter();
		
		// Create an instance of Builder 
		PizzaBuilder hawaiianPizzaBuilder = new HawaiianPizzaBuilder();
		PizzaBuilder spicyPizzaBuilder = new SpicyPizzaBuilder();
		PizzaBuilder customPizzaBuilder = new CustomPizzaBuilder();
		
		// Start building the object 
		waiter.setPizzaBuilder(spicyPizzaBuilder);
		waiter.constructPizza();
		Pizza spicyPizza = waiter.getPizza();
		System.out.println(spicyPizza);
		
		waiter.setPizzaBuilder(hawaiianPizzaBuilder);
		waiter.constructPizza();
		Pizza hawaiinPizza = waiter.getPizza();
		System.out.println(hawaiinPizza);
		
		waiter.setPizzaBuilder(customPizzaBuilder);
		waiter.constructPizza();
		Pizza customPizza = waiter.getPizza();
		System.out.println(customPizza);
	}
}
