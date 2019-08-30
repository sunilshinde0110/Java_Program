package com.basic_example;

public class RunningNumberProduct {

	public static void main(String[] args) {

		int lowerbound=1;
		int upperbound=10;
		
		int product=1;
		int no=lowerbound;
		
		while(no <= upperbound) {
			
			product=product*no;
			++no;
		}
		
		System.out.println("The Product From " + lowerbound + " To " + upperbound + " Is " + product);
	}

}
