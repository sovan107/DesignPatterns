package com.sovanm.designs.bridge;

public abstract class AbstractRemoteControl {

	protected SmartTV smartTv;
	
	public AbstractRemoteControl(SmartTV smartTv) {
		this.smartTv = smartTv;
	}
	
	public abstract void switchOnTv();
	public abstract void switchOffTv();
	public abstract void setChannel(int channelNumber);
}


