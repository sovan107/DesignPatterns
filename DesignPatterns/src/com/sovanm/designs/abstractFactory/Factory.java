package com.sovanm.designs.abstractFactory;

public class Factory {

	public static AbstractCarFactory getCarFactory(Car car){
		
		AbstractCarFactory factory = null;
		
		switch(car){
		
		case AUDI:
			factory = new AudiCarFactory();
			break;
		case MERCEDES:
			factory = new MercedesCarFactory();
			break;
		}
		return factory;
	}
}
