package com.yash.demo;

import java.util.Scanner;

public class PrintPattern2xDemo2 {


	   public static void main (String[] args) {
	     
		   Scanner sc = new Scanner(System.in);
		    System.out.print("Enter a number: ");
		    int n = sc.nextInt();
		    for (int row = 0; row < n; row++) {
		        for (int column = 0; column < n; column++) {
		        	System.out.print(" ");
		            if (row == 0 || row == n - 1 || column == n - 6 + row) {
		            	System.out.print("#");
		            
		                
		            } else {
		                System.out.print(" ");
		            }
		        }
		        System.out.println();
	      }
       
	   }
}	

