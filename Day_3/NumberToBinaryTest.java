package com.yash.test;

import org.junit.Test;

import com.yash.java.NumberToBinaryDemo;

public class NumberToBinaryTest {
	
	@Test
	public void numberToBinary() {
		
		NumberToBinaryDemo nb=new NumberToBinaryDemo();
		int find=nb.findNumToBinary();
		System.out.println(find);
	}

}
