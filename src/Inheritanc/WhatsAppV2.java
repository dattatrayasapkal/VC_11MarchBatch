package Inheritanc;

public class WhatsAppV2 extends WhatsAppV1{
	public void AudioCalling() {
		System.out.println("Audio Calling");
	}
	public static void main(String[] args) {
		WhatsAppV1 V1 = new WhatsAppV1();
		V1.TextMsg();
		System.out.println("***********");
		
		WhatsAppV2 V2 = new WhatsAppV2();
V2.AudioCalling();
System.out.println("**************");

WhatupAppV3 V3 = new WhatupAppV3();
V3.VideoCalling();

	}

}
