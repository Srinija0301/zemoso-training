package com.zemoso.oops;
public class Main{
    public static void main(String[] args){
        Earphones earphones= new Earphones();
        Earphones speaker = new Speaker();
        earphones.playSound();
        speaker.maxSound();
        Speaker speaker1 = new Speaker();
        speaker1.alterSound(10);
        speaker1.alterSound(10,20);
        WirelessEarphones wirelessEarphones= new WirelessEarphones();
        wirelessEarphones.setBluetoothID(412);
        System.out.println(wirelessEarphones.getBid());
    }
}
