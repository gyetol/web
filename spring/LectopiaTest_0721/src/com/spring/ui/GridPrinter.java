package com.spring.ui;

import com.spring.entity.Test;

public class GridPrinter implements Printer {
	private Test test;
	
	public void setTest(Test test) {
		this.test= test;
	}

	@Override
	public void print() {
		System.out.println("����: "+test.tot());
		System.out.println("���: "+String.format("%.2f",test.avg()));
	}

}
