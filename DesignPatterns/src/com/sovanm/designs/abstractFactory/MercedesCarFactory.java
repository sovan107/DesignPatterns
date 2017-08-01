package com.sovanm.designs.abstractFactory;

public class MercedesCarFactory extends AbstractCarFactory {

	@Override
	public Wheel createWheel() {
		System.out.println("Creating wheels for Mercedes Cars");
		return new MercedesWheel();
	}

	@Override
	public Door createDoor() {
		System.out.println("Creating doors for Mercedes Cars");
		return new MercedesDoor();
	}

}
