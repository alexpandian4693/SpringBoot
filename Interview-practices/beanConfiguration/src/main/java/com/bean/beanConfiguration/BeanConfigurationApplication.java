package com.bean.beanConfiguration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



@SpringBootApplication
public class BeanConfigurationApplication {

	public static void main(String[] args) {
		SpringApplication.run(BeanConfigurationApplication.class, args);
		Logger LOG=LoggerFactory.getLogger(BeanConfigurationApplication.class);
		
		ApplicationContext contect = new ClassPathXmlApplicationContext("Bean.xml");
		LOG.info("Config Loaded");
		Sim sim=contect.getBean("sim", Sim.class);
		sim.call();
		sim.text();
		
	}

}
