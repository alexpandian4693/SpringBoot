package com.java.IocAndDi;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
@Scope(value="prototype")
public class Home {
	Logger LOG=LoggerFactory.getLogger(Home.class);
	public Home() {
		LOG.info("<-----Constructor Calling----->");
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public String getDoorNo() {
		return doorNo;
	}
	public void setDoorNo(String doorNo) {
		this.doorNo = doorNo;
	}
	private String owner;
	private String doorNo;
	@Autowired
	@Qualifier("qual")
	private NetConnection modom;
	public void connect() {
		modom.SwitchOn();
		LOG.info("<-----CONNECT TO THE INTERNET---->");
	}

}
