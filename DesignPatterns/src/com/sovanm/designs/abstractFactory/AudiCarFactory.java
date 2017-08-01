package com.sovanm.designs.abstractFactory;

public class AudiCarFactory extends AbstractCarFactory {

	@Override
	public Wheel createWheel() {
		System.out.println("Creating wheels for Audi Cars");
		return new AudiWheel();
	}

	@Override
	public Door createDoor() {
		System.out.println("Creating doors for Audi Cars");
		return new AudiDoor();
	}

}
