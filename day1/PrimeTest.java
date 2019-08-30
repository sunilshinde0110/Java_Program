package com.assignments;

import java.util.Scanner;

public class PrimeTest
{
	public static void main(String[] args)
	{
	int x;
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the number:");
	x = scanner.nextInt();
	int maxFactor = (int)Math.sqrt(x);   // find the nearest integral square root of x
	//assume x is a prime;
	for (int factor = 2; factor <= maxFactor; ++factor) 
	{
	   if (x % factor==0) 
	   {
	     System.out.println(" x is not a prime;");
	     
	   }
	   else
	   {
		   System.out.println("x is prime number");
	   }
	}
	}
}
	

