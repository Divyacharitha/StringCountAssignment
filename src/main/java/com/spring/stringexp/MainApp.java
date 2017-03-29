package com.spring.stringexp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * do String encoding
 *
 */
public class MainApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Context.xml");

		StringEncode obj = (StringEncode) context.getBean("doEncode");
		obj.printEncode();
	}
}
