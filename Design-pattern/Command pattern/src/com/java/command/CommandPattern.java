package com.java.command;

public class CommandPattern {  
	public static void main(String args[]){
		Action fs = FileSystemUtil.getUnderlyingFileSystem();
		ReadCommand readCommand = new ReadCommand(fs);
		FileInvoker file = new FileInvoker(readCommand);
		file.execute();
 
		WriteCommand writeCommand = new WriteCommand(fs);
		file = new FileInvoker(writeCommand);
		file.execute();
	}
}