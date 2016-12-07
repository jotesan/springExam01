package org.cuatrovientos.spring.exam01.joseba;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	private static ApplicationContext context;

	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("beans.xml");
		Fleet fleet = (Fleet) context.getBean("theFleet");
		System.out.println(fleet.toString());

	}

}
