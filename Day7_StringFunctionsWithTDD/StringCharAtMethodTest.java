package test;

import java.util.Scanner;

import main.StringCharAtMethod;

public class StringCharAtMethodTest {

	
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The String:");
		String s=sc.nextLine();
		char[] charArray=s.toCharArray();

		System.out.println("Enter index position");
		int index=charArray[sc.nextInt()];
		
		StringCharAtMethod str=new StringCharAtMethod();
		
		char name = (char) index;
		char s1=str.charAtMethod(name);
		
		if(name==s1) {
			System.out.print(name);
			System.out.println();
			System.out.println("PASS");
			
			
		}
		else {
			System.out.println("FAIL");
		}
		
		/*if(name==s1) {
		System.out.print(charArray[0]);
		System.out.println();
		System.out.println("PASS");
		
		
	}
	else {
		System.out.println("FAIL");
	}*/
		
		/*if(name==s1) {
			System.out.print(charArray[1]);
			System.out.println();
			System.out.println("PASS");
			
			
		}
		else {
			System.out.println("FAIL");
		}*/
		
		/*if(name==s1) {
			System.out.print(charArray[2]);
			System.out.println();
			System.out.println("PASS");
			
			
		}
		else {
			System.out.println("FAIL");
		}*/
		
		/*if(name==s1) {
			System.out.print(charArray[3]);
			System.out.println();
			System.out.println("PASS");
			
			
		}
		else {
			System.out.println("FAIL");
		}*/
	}

	private static int atoi(char[] charArray) {
		// TODO Auto-generated method stub
		return 0;
	}

}
