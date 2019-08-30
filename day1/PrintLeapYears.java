package com.basic_example;

public class PrintLeapYears {

	public static void main(String[] args) {

		int count=0;
		for (int i=999;i<2010;i++) {
			if((i%4==0 && i%100 !=0) || i%400==0) {
				System.out.printf("%d ", i);
				count++;
				if(count % 10==0) {
					System.out.println();
				}
			}	
		}
		System.out.println("\nTotal NO Of Leap Year IS: "+count);

	}

}
