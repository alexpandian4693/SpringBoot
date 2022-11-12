package com.java.command;

public class Windows implements Action{  
   
    public void readFile() {
		System.out.println("Read file in Windos OS.");	
	}
 
	@Override
	public void writeFile() {
		System.out.println("Write file in Windos OS.");		
	}	
	 
} 
