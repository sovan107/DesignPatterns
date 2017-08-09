package com.sovanm.designs.messageSystem.messageMediums;

import com.sovanm.designs.messageSystem.IMessageSystem;

public class TVMessageSystem implements IMessageSystem {

	public void setProvider() {
		System.out.println("Getting providers TV");
	}

	@Override
	public void setProperties() {
		System.out.println("Get Properties TV");
		
	}

	@Override
	public void send() {
		System.out.println("Sending TV.....");
		
	}

	@Override
	public void logMessage() {
		System.out.println("Logging TV.....");
		
	}

}
