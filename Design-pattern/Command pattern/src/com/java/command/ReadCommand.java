package com.java.command;

public class ReadCommand implements Command {
	private Action action;
 
	public ReadCommand(Action action){
		this.action=action;
	}
	@Override
	public void execute() {
		this.action.readFile();
	}	  	
}