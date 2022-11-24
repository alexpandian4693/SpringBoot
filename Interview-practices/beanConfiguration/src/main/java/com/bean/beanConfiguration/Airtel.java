package com.bean.beanConfiguration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Airtel implements Sim {
	Logger LOG = LoggerFactory.getLogger(Airtel.class);

	@Override
	public void call() {
		// TODO Auto-generated method stub
		LOG.info("Calling By Airtel");
		
	}

	@Override
	public void text() {
		// TODO Auto-generated method stub
		LOG.info("Texting By Airtel");
		
	}
	

}
