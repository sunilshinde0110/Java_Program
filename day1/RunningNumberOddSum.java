package com.basic_example;

public class RunningNumberOddSum {

	public static void main(String[] args) {

		int lowerbound=1;
		int upperbound=1000;
		int odd=0;
		
		int sum=0;
		int no=lowerbound;
		
		while(no <= upperbound) {
			
			sum=sum+no;
			no=no+2;
		}

		
		System.out.println("The Sum Of All Odd Number Between " + lowerbound + " To " + upperbound + " Is " +sum);
	}
}
