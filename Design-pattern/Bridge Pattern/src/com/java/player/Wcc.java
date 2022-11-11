package com.java.player;

public class Wcc {
	protected Players p;
	public String team;
	public Wcc (String team) {
		this.team=team;
	}
	public void next() {  
	    p.NextBatsman(); 
	    } 
    public void newOne(String player) {  
    p.NewBatsman(player);  
    }  
    public void delete(String player) {  
    p.DeleteBatsman(team);  
    }  
    public void display() {  
    	System.out.println("Player: " + team);  
        p.DisplayBatsman();  

}
}
