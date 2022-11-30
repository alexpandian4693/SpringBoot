package com.java.IocAndDi;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class IocAndDiApplication {
	static Logger LOG=LoggerFactory.getLogger(IocAndDiApplication.class);

	public static void main(String[] args) {
		ConfigurableApplicationContext cont=SpringApplication.run(IocAndDiApplication.class, args);
		ApplicationContext context = new ClassPathXmlApplicationContext("doctor.xml");
		Player obj=(Player) context.getBean("id1");
		obj.getMessage();
		LOG.info(obj.getMessage());
		
		Home h=cont.getBean(Home.class);
		h.connect();
		//bean of spring framework
		Home h2=cont.getBean(Home.class);
		h2.connect();
		
		
		
		
	}

}
