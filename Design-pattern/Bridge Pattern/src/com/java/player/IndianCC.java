package com.java.player;

import java.util.ArrayList;
import java.util.List;

public class IndianCC implements Players{
	private List <String> players = new ArrayList<String>();  
	 private int current = 0;  
	 public IndianCC(){  
		 players.add("player is a batsman ");  
		 players.add("player is a bowler ");  
		 players.add("player is a fielder ");  
	    players.add("player is a keeper ");  
	    players.add("player is a captain ");  
	    players.add("player is a wisecaptain");  
	    players.add("player is a substute ");  
	 }

	@Override
	public void NextBatsman() {
		// TODO Auto-generated method stub
		if( current <= players.size()-1 )  
		    current++;  
		    System.out.print(current);  
		
	}

	@Override
	public void DisplayBatsman() {
		// TODO Auto-generated method stub
		for (String player : players) {  
		    System.out.println(player);  
		 }  
		
	}

	@Override
	public void NewBatsman(String player) {
		// TODO Auto-generated method stub
		players.add(player);
		
	}

	@Override
	public void DeleteBatsman(String player) {
		// TODO Auto-generated method stub
		players.remove(player);
		
	}

	

}
