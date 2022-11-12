package com.java.flyweight;

import java.util.HashMap;

public class Earphone {
	
	private static final HashMap Map = new HashMap();

	   public static Headphone getBluetooth(String color) {
		   Bluetooth bluetooth = (Bluetooth)Map.get(color);

	      if(bluetooth == null) {
	    	  bluetooth = new Bluetooth(color);
	         Map.put(color, bluetooth);
	         System.out.println("Creating Headphone of color : " + color);
	      }
	      return bluetooth;
	   }

}
