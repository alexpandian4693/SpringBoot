package com.java.IocAndDi;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Player {
	Logger LOG = LoggerFactory.getLogger(Player.class);
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	public void getEnergy() {
		LOG.info("Your message=" + message);
	}

}
