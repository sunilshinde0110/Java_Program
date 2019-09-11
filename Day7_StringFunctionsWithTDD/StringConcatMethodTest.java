package test;

import java.util.Scanner;

import main.StringConcatMethod;

public class StringConcatMethodTest {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The First String: ");
		String s=sc.nextLine();
		System.out.println("Enter The Second String:");
		String s1=sc.nextLine();
		
		StringConcatMethod stringconcatMethod=new StringConcatMethod();
		stringconcatMethod.concatMethod(s, s1);
		
		if(s1+s != null) {
			
			System.out.println("Pass");
		}
		else  {
			System.out.println("Fail");
		}
	}

}
