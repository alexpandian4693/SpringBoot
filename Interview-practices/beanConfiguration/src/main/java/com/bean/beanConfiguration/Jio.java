package com.bean.beanConfiguration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Jio implements Sim {
	Logger LOG = LoggerFactory.getLogger(Jio.class);

	@Override
	public void call() {
		// TODO Auto-generated method stub
		LOG.info("Calling By Jio");

	}

	@Override
	public void text() {
		// TODO Auto-generated method stub
		LOG.info("Texting By Jio");

	}

}
