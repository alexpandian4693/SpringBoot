package com.java.IocAndDi;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component("qual")
public class NetConnection {
	Logger LOG=LoggerFactory.getLogger(NetConnection.class);
	
	private String ipAddress;
	private int speed;
	public String getIpAddress() {
		return ipAddress;
	}
	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public void SwitchOn() {
		LOG.info("<------- Switching On Internet------>");
	}

}
