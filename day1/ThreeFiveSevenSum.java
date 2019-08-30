package com.basic_example;

public class ThreeFiveSevenSum {

	public static void main(String[] args) {

		int sum = 0;
		System.out.println("sum all the running integers from 1 and 1000, that are divisible by 3, 5 or 7, but NOT by 15, 21, 35 or 105 Is:");			
		for (int i=1; i<1000; i++) {
			if ((i%3==0 && i%5==0 && i%7==0)  && i%15!=0 && i%21!=0 && i%35!=0 && i%105!=0){
				sum=sum+i;
				//System.out.print(i+" ");
			}
		}
		System.out.println(sum);
	}

}
