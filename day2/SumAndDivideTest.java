package com.yash.test;

import org.junit.Test;

import com.yash.java.SumAndDivideDemo;

public class SumAndDivideTest {
	
	@Test
	public void sumAndDivie() {
		
		SumAndDivideDemo sd=new SumAndDivideDemo();
		int sum=sd.sumDivideNo();
		System.out.println("SUM IS:"+sum);
	}

}
