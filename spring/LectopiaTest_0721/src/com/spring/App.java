package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.ui.Printer;

public class App {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("AppContext.xml");
		Printer printer = ctx.getBean(Printer.class);
		printer.print();
	}
}
