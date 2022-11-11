package com.java.player;

public class BridgePattern {
	public static void main(String args[]) {
		TeamFormat players=new TeamFormat("Indian Crickiet Team");
		players.p=new IndianCC();
		players.delete("player is a batsman ");
		
		players.display();
		
	   players.newOne("player is a fielder ");
	   
	   players.display();
	   
	 

		
	}

}
