package com.prowings.by_xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext ctx1 = new ClassPathXmlApplicationContext("applicationContextXml.xml");

		Car car1 = ctx1.getBean("car", Car.class);
		System.out.println("Autowiring by using 'byname' : " + car1);
		
		ApplicationContext ctx2 = new ClassPathXmlApplicationContext("applicationContextXml1.xml");
		
		Car car2 = ctx2.getBean("car", Car.class);
		System.out.println("Autowiring by using 'Constructor' : "+car2);
	}
}
