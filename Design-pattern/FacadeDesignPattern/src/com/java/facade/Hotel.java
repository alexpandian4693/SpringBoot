package com.java.facade;

public class Hotel {
	private Food vegfood;
	private Food nonveg;
	
	public Hotel() {
		vegfood = new Vegfood();
		nonveg = new Nonveg();
	      
	   }

	   public void prepareveg(){
		   vegfood.prepare();
	   }
	   public void preparenonveg(){
		   nonveg.prepare();
	   }

}
