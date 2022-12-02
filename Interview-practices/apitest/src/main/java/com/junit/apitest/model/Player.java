package com.junit.apitest.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;



@Entity
@Table
public class Player {
	@Id
	private int jersyid;
	@Column
	private String PlayerName;
	@Column
	private String teamname;
	@Column
	private String jersycolor;
	@Column
	private int noOfmatches;
	public Player(int jersyid, String playerName, String teamname, String jersycolor, int noOfmatches) {
		super();
		this.jersyid = jersyid;
		PlayerName = playerName;
		this.teamname = teamname;
		this.jersycolor = jersycolor;
		this.noOfmatches = noOfmatches;
	}
	public int getJersyid() {
		return jersyid;
	}
	public void setJersyid(int jersyid) {
		this.jersyid = jersyid;
	}
	public String getPlayerName() {
		return PlayerName;
	}
	public void setPlayerName(String playerName) {
		PlayerName = playerName;
	}
	public String getTeamname() {
		return teamname;
	}
	public void setTeamname(String teamname) {
		this.teamname = teamname;
	}
	public String getJersycolor() {
		return jersycolor;
	}
	public void setJersycolor(String jersycolor) {
		this.jersycolor = jersycolor;
	}
	public int getNoOfmatches() {
		return noOfmatches;
	}
	public void setNoOfmatches(int noOfmatches) {
		this.noOfmatches = noOfmatches;
	}
	public Player() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
