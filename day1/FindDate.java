package com.assignments;

import java.util.Scanner;

public class FindDate 
{
	public static void main(String[] args)
	{
		int year,months,day;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the month:");
		months = s.nextInt();
		System.out.println("Enter the day:");
		day = s.nextInt();
		System.out.println("Enter the year:");
		year = s.nextInt();


		boolean f=true;
		if((year < 1582) || (year==1582 && months<10 )|| (year==1582 && months==10 && day<15))
				{
					System.out.println(f);
				}
		else
		{
			System.out.println(f=false);
		}
	}
}
