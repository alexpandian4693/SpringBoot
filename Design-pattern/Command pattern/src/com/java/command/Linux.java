package com.java.command;

public class Linux implements Action {
	@Override
	public void readFile() {
		System.out.println("Read file in Linux OS.");	
	}
 
	@Override
	public void writeFile() {
		System.out.println("Write file in Linux OS.");		
	}	
}
