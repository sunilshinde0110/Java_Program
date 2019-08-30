package com.assignments;

import java.util.Scanner;

public class PerfectNumber 
{
	public static void main(String[] args)
	{
		int x;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		x = s.nextInt();
		int sum = 0;
		for (int i = 1; i < x; ++i)
		{
		   if (x % i==0) 
		   {
		     sum = sum +i; 
		   }
		}
		if (sum == x)
		{
		   System.out.println("x is a perfect number");
		}
		else
		{
			System.out.println(" x is not a perfect number");
		}
		  
		
		
	}
}
