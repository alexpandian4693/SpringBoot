package com.java.flyweight;

public class FlyweightPattern{
	private static final String colors[] = { "Red", "Green", "Blue", "White", "Black" };
public static void main(String[] args) {

    for(int i=0; i < 20; ++i) {
       Bluetooth hp = (Bluetooth)Earphone.getBluetooth(getRandomColor());
      
       hp.setLength(100);
       hp.song();
    }
 }
 private static String getRandomColor() {
    return colors[(int)(Math.random()*colors.length)];
 }

}
