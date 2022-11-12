package com.java.command;

public class WriteCommand implements Command {
	private Action action;
 
	public WriteCommand(Action action){
		this.action=action;
	}
	@Override
	public void execute() {
		this.action.writeFile();
	}	  	
}
