package com.yash.java;

import java.util.Scanner;

public class AddOfConsecutiveNoDemo {

	public int addConNo() {

		int sum=0;
		System.out.print("10 Consecutive Number is:");
		for(int no=1;no<=10;no++) {
				
				sum=sum+no;
				System.out.print(" "+no);
			}
		
		System.out.println();
		return sum;
	}

}
