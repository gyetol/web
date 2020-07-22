package com.spring.ui;

import com.spring.entity.Test;

public class DefaultPrinter implements Printer {
	private Test test;

	public DefaultPrinter() {}

	
	public DefaultPrinter(Test test) {
		this.test = test;
	}

	public void setTest(Test test) {
		this.test = test;
	}


	@Override
	public void print() {
		System.out.printf("ÃÑÁ¡: %d, Æò±Õ: %.2f\n", test.tot(),test.avg());
	}

}
