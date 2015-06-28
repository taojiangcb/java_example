package com.taojiang.spring.helloWorld;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring_HelloWorld {
	
	@Test
	public void test_helloWorld() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		HelloWorld helloWorld = (HelloWorld) ctx.getBean("helloWorld");
		helloWorld.sayHello();
	}
}
