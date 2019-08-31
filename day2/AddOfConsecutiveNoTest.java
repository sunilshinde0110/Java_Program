package com.yash.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.yash.java.AddOfConsecutiveNoDemo;

public class AddOfConsecutiveNoTest {
	
	@Test
	public void addConsectiveNo() {
		
		AddOfConsecutiveNoDemo ac=new AddOfConsecutiveNoDemo();
		int sum=ac.addConNo();
		System.out.println("Sum Of 10 Consecutive Number Is:"+sum);
				
	}

}
