package com.basic_example;

public class RunningNumberMod7Sum {

	public static void main(String[] args) {

		int lowerbound=1;
		int upperbound=1000;		
		int sum=0;
		int no=7;
		
		while(no <= upperbound) {
			
			sum=sum+no;
			no=no+7;
		}

		
		System.out.println("The Sum Of All Number Between " + lowerbound + " To " + upperbound + " That Is Divisible By 7 Is:" +sum);

	}

}
