package com.java.chain;

public class Console extends Logger {

	   public Console(int level){
	      this.level = level;
	   }

	   @Override
	   protected void write(String message) {		
	      System.out.println("Console::Logger: " + message);
	   }
	}