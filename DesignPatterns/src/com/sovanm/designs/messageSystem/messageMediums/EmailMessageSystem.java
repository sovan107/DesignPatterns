package com.sovanm.designs.messageSystem.messageMediums;

import com.sovanm.designs.messageSystem.IMessageSystem;

public class EmailMessageSystem implements IMessageSystem {

	@Override
	public void setProvider() {
		System.out.println("Getting providers Email");
		
	}

	@Override
	public void setProperties() {
		System.out.println("Get Properties EMAIL");
		
	}

	@Override
	public void send() {
		System.out.println("Sending Email....");
		
	}

	@Override
	public void logMessage() {
		System.out.println("Logging EMail....");
		
	}

}
