package com.sovanm.designs.messageSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.reflections.Reflections;

public class SystemManager {

	public static List<IMessageSystem> getMesageSystem(List<MessageSystem> messageSystems) {

		List<IMessageSystem> systems = new ArrayList<>();

		Set<Class<? extends IMessageSystem>> messageTypes = getClasses();

		messageSystems.forEach(messageSystem -> {
			Boolean found = false;
			
			for(Class<? extends IMessageSystem> messageType: messageTypes){

				if (messageType.getSimpleName().toLowerCase().contains(messageSystem.toString().toLowerCase())) {
					try {
						systems.add(messageType.newInstance());
						found = true;
						
					} catch (InstantiationException | IllegalAccessException e) {
						e.printStackTrace();
					}
				}
			}
			
			if(!found){
				System.err.println("No such class found : " + messageSystem.toString());
			}
		});

		return systems;

	}

	private static Set<Class<? extends IMessageSystem>> getClasses() {

		Reflections reflections = new Reflections("com.sovanm.designs.messageSystem.messageMediums");

		Set<Class<? extends IMessageSystem>> allClasses = reflections.getSubTypesOf(IMessageSystem.class);
		return allClasses;
	}
}
