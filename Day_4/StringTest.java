package com.yash.test;

import java.util.Scanner;

import org.junit.Test;

import com.yash.java.StringDemo;

public class StringTest {

	@Test
	public void stringOperation() {
		
		System.out.println("Enter the String:");
			StringDemo sd=new StringDemo();
			
			char msg=sd.testStringCharAt();
			System.out.println(msg);
			
			String msg2=sd.testStringConcat();
			System.out.println(msg2);
			
			boolean msg3=sd.testStringContains();
			System.out.println(msg3);
			
			boolean msg4=sd.testStringEndWith();
			System.out.println(msg4);
			
			boolean msg5=sd.testStringEquals();
			System.out.println(msg5);
			
			boolean msg6=sd.testStringEqualsIgnoreCase();
			System.out.println(msg6);
			
			int msg7=sd.testStringIndexof();
			System.out.println(msg7);
			
			boolean msg8=sd.testStringIntern();
			System.out.println(msg8);
			
			int msg9=sd.testStringLastIndexof();
			System.out.println(msg9);
			
			int msg10=sd.testStringLenth();
			System.out.println(msg10);
			
			String msg11=sd.testStringReplace();
			System.out.println(msg11);
			
			String[] msg12=sd.testStringSpilt();
			System.out.println(msg12);
			
			String msg13=sd.testStringsubstring();
			System.out.println(msg13);
			
			String msg14=sd.testStringToLowerCase();
			System.out.println(msg14);
			
			String msg15=sd.testStringToUpperCase();
			System.out.println(msg5);
			
			String msg16=sd.testStringTrim();
			System.out.println(msg16);
			
			String msg17=sd.testStringVOlueOf();
			System.out.println(msg17);
	
	}
}
