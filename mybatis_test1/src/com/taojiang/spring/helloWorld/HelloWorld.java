package com.taojiang.spring.helloWorld;

import com.taojiang.valueObject.Person;

public class HelloWorld {
	private Person p;

	public void sayHello() {
		System.out.printf("Hello: %s", p.toString());
	}

	public Person getP() {
		return p;
	}

	public void setP(Person p) {
		this.p = p;
	}

	public HelloWorld() {
		super();
		// TODO Auto-generated constructor stub
	}

}
