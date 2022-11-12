package com.java.proxypattern;

public class Proxypattern {
	public static void main(String[] args) {
	      Image image = new ProxyImage("test_10mb.jpg");

	      image.display(); 
	      System.out.println("");
	      
	  
	      image.display(); 	
	   }

}
