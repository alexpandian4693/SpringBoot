package com.java.flyweight;

public class Bluetooth implements Headphone {
	
	   private String color;
	   private int length;
	   
	   public Bluetooth (String color) {
		   this.color=color;
		   
		    
	   }
	   public  void setLength(int length ) {
		   this.length=length;
		   
	   }
	@Override
	public void song() {
		// TODO Auto-generated method stub
		System.out.println("song()::" + color + length);
		
	}

}
