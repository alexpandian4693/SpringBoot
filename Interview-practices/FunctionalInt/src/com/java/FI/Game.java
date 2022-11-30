package com.java.FI;

public class Game implements FunctionalInterDemo{
	public static void main (String args[]) {
		FunctionalInterDemo g1=new Game();
		
		//Game gg=new Game();
		g1.test();
		g1.test2();
		FunctionalInterDemo.test1();
		
	}

	@Override
	public void test() {
		// TODO Auto-generated method stub
		System.out.println("Game Test");
		
	}

}
