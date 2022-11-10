package com.java.StrikeRate;

public class StrikeRate {
	private String playername;
	private Integer over;
	public String getPlayername() {
		return playername;
	}
	public StrikeRate(String playername, Integer over, Integer run) {
		super();
		this.playername = playername;
		this.over = over;
		this.run = run;
	}
	public void setPlayername(String playername) {
		this.playername = playername;
	}
	public Integer getOver() {
		return over;
	}
	public void setOver(Integer over) {
		this.over = over;
	}
	public Integer getRun() {
		return run;
	}
	public void setRun(Integer run) {
		this.run = run;
	}
	private Integer run;
	

}
