package com.yash.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.yash.java.HelloWorldDemo;

public class HelloWorldTest {
	
	@Test
	public void evaulateReturnedMessage(){
		
		HelloWorldDemo hwDemo=new HelloWorldDemo();
		String message=hwDemo.sayHello();
		assertEquals("Hello World", message);
		
	}

}
