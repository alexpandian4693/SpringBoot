package com.java.chain;

public class Error extends Logger {

	   public Error(int level){
	      this.level = level;
	   }

	   @Override
	   protected void write(String message) {		
	      System.out.println("Error Console::Logger: " + message);
	   }
	}
