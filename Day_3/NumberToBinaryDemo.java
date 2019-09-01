package com.yash.java;

import java.util.Scanner;

public class NumberToBinaryDemo {

	public int findNumToBinary() {
		int n, a;
        String x = "";
        Scanner s = new Scanner(System.in);
        System.out.print("Enter any number:");
        n = s.nextInt();
        while(n > 0)
        {
            a = n % 2;
            x = x + "" + a;
            n = n / 2;
        }
        System.out.print("Binary Number Is:");
        int find=Integer.valueOf(x);
		return find;
	}

}
