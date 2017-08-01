package com.sovanm.designs.bridge;

public class SamsungSmartTV implements SmartTV {

	@Override
	public void switchTvON() {
		System.out.println("Switching Samsung TV ON..");

	}

	@Override
	public void switchTvOFF() {
		System.out.println("Switching Samsung TV OFF..");

	}

	@Override
	public void changeChannel(int channelNumber) {
		System.out.println("Switching to Channel on Samsung: " + channelNumber);
		
	}

}
