package com.sovanm.designs.bridge;

/**
 * <b>Definition :</b> This is a pattern which can be used in practice when we know that we have
 * two orthogonal(right angle or 90*) hierarchies.  
 * <br/>
 * This provides a way to separate interface (abstraction) and implementation in such a 
 * way that you don't get a large number of classes.
 * 
 * 
 * */
public class BridgePattern {

	public static void main(String[] args) {
		
		SonyRemoteControl sonyRemoteControl = new SonyRemoteControl(new SonySmartTv());
		sonyRemoteControl.switchOnTv();
		sonyRemoteControl.setChannel(100);
		sonyRemoteControl.switchOffTv();
	}
}
