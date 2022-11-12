package com.java.chain;

public class File extends Logger {

	   public File(int level){
	      this.level = level;
	   }

	   @Override
	   protected void write(String message) {		
	      System.out.println("File::Logger: " + message);
	   }
	}
