package com.yash.java;

import java.util.Scanner;

public class StringDemo {


	private static final String[] n1 = null;

	Scanner sc=new Scanner(System.in);
	
	String s=sc.nextLine();
	public char testStringCharAt() {
		
		
		return s.charAt(2);
	}

	public String testStringConcat() {

		String s1=new String("Wel-Come To ");
		return s1.concat(s);
	}

	public boolean testStringContains() {
		return s.contains("oop");
	}

	public boolean testStringEndWith() {
		
		return s.endsWith("A");
	}

	public boolean testStringEquals() {
		
		String s2="JAVA";
		return s2.equals(s);
	}

	public boolean testStringEqualsIgnoreCase() {
		
		String s3="JAVA";
		return s3.equalsIgnoreCase(s);
	}

	public int testStringIndexof() {
		
		return s.indexOf("V");
	}

	public boolean testStringIntern() {
		
		String s4="JUNIT";
		String s5=s.intern();
		return s5==s4;
	}

	public int testStringLastIndexof() {
		
		
		return s.lastIndexOf("A");
	}

	public int testStringLenth() {
		return s.length();
	}

	public String testStringReplace() {

		return s.replace('A', 'O');
	}

	public String[] testStringSpilt() {

		String[] n=s.split("\\s");
		for(String n1:n) {
			System.out.println(n1);
		}
		return n1;
		
		
	}

	public String testStringsubstring() {
		
		return s.substring(2);
	}

	public String testStringToLowerCase() {
		
		return s.toLowerCase();
	}

	public String testStringToUpperCase() {
		
		return s.toUpperCase();
	}

	public String testStringTrim() {

		
		return s.trim()+" HTML";
	}

	public String testStringVOlueOf() {
		
		int i=10;
		String s6=String.valueOf(i);
		return s6;
	}

	
	

}
