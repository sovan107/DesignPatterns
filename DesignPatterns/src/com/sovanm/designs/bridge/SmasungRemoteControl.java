package com.sovanm.designs.bridge;

public class SmasungRemoteControl extends AbstractRemoteControl{

	public SmasungRemoteControl(SmartTV smartTv) {
		super(smartTv);
	}

	@Override
	public void switchOnTv() {
		smartTv.switchTvON();
		
	}

	@Override
	public void switchOffTv() {
		smartTv.switchTvOFF();
		
	}

	@Override
	public void setChannel(int channelNumber) {
		smartTv.changeChannel(channelNumber);
		
	}

}
