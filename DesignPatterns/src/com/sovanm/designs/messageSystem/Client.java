package com.sovanm.designs.messageSystem;

import java.util.ArrayList;
import java.util.List;

public class Client {

	public static void main(String[] args) {

		List<MessageSystem> messageSystems = new ArrayList<>();
		
		messageSystems.add(MessageSystem.SMS);
		messageSystems.add(MessageSystem.EMAIL);
		messageSystems.add(MessageSystem.RADIO);
		messageSystems.add(MessageSystem.TV);

		messageProcess(messageSystems);

	}

	/**
	 * 
	 * @param messageSystems
	 */
	private static void messageProcess(List<MessageSystem> messageSystems) {
		
		List<IMessageSystem> systems = SystemManager.getMesageSystem(messageSystems);
		
		systems.forEach(system -> {
			

			system.setProvider();
			system.setProperties();
			system.send();
			system.logMessage();
		});
	}
}
