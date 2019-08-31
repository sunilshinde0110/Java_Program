package com.yash.java;

public class SumAndDivideDemo {

	public int sumDivideNo() {
		
		int sum=0;
		System.out.print("Sum Of All The Integers Greater Than 100 and Less Than 200 That Are Divisible By 7 Is:");
		for (int no=101; no<200; no++) {
			if ((no%7==0) ){
				sum=sum+no;
				System.out.print(" "+no);
			}
		}
		System.out.println();
		return sum;
	}
}
