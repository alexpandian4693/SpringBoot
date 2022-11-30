package com.java.FI;

@FunctionalInterface
public interface FunctionalInterDemo {
	public abstract void test();
	static void test1() {
		System.out.println("It is a Static method");
		
	}
	default void test2() {
		System.out.println("It is a Default method");
		
	}
	

}
