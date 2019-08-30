package com.basic_example;

public class RunningNumberSum1 {

	public static void main(String[] args) {

		int lowerbound=9;
		int upperbound=899;
		
		int sum=0;
		int no=lowerbound;
		
		while(no <= upperbound) {
			
			sum=sum+no;
			++no;
		}
		
		System.out.println("The Sum From " + lowerbound + " To " + upperbound + " Is " + sum);
	}

}