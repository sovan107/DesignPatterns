package com.sovanm.designs.messageSystem.messageMediums;

import com.sovanm.designs.messageSystem.IMessageSystem;

public class SMSMessageSystem implements IMessageSystem {

	public void setProvider() {
		System.out.println("Getting providers");
	}

	@Override
	public void setProperties() {
		System.out.println("Get Properties");
		
	}

	@Override
	public void send() {
		System.out.println("Sending sms.....");
		
	}

	@Override
	public void logMessage() {
		System.out.println("Logging SMS.....");
		
	}

}
