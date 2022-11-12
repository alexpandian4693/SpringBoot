package com.java.command;

public class FileSystemUtil {
	public static Action getUnderlyingFileSystem(){
		 String operatingSystem = System.getProperty("os.name");
		 System.out.println("Underlying OS is:"+operatingSystem);
		 if(operatingSystem.contains("Windows")){
			 return new Windows();
		 }else{
			 return new Linux();
		 }
	}  	
}
