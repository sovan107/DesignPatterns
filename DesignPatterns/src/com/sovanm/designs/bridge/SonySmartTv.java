package com.sovanm.designs.bridge;

public class SonySmartTv implements SmartTV {

	@Override
	public void switchTvON() {
		System.out.println("Switching Sony TV ON..");

	}

	@Override
	public void switchTvOFF() {
		System.out.println("Switching Sony TV OFF..");

	}

	@Override
	public void changeChannel(int channelNumber) {
		System.out.println("Switching to channel on Sony : " + channelNumber);
		
	}

}
