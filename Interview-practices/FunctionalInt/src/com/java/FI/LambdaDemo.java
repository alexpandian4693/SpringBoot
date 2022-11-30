package com.java.FI;

import java.util.ArrayList;
import java.util.List;

public class LambdaDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FunctionalInterDemo obj = () -> 
			System.out.println("test12345");
			obj.test();
			
			List<String> nameList=new ArrayList();
			nameList.add("MSD");
			nameList.add("Raina");
			nameList.add("Jadeja");
			
			//printName(nameList);
			nameList.forEach((name) ->System.out.println(name));
			
			
		

	}
//	private static void printName(List<String> nameList) {
//		for(int i=0; i<nameList.size();i++)
//			System.out.println(nameList.get(i));
//		
//	}

}
