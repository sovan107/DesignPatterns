package com.sovanm.designs.abstractFactory;

public class AbstractFactoryPattern {
	
	public static void main(String[] args) {
		
		AbstractCarFactory factory = Factory.getCarFactory(Car.MERCEDES);
		Wheel wheel = factory.createWheel();
		wheel.wheelType();
	}

}
