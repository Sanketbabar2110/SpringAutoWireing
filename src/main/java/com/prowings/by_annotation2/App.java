package com.prowings.by_annotation2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContextAnnotaions2.xml");
		
		Shopee s1 = ctx.getBean("shopee", Shopee.class);
		System.out.println("Autowiring by using annotations : "+s1);
	}
}
