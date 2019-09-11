package Test;

import main.StringEqualsMethod;

public class StringEqualsMethodTest 
{
	public static void main(String[] args)
	{
		String s="hello";
		String s1= "Hello";
		
		
	
		
		
		StringEqualsMethod stringEquals = new StringEqualsMethod();
		boolean s3=stringEquals.stringEquals(s,s1);
		
		if(s3==true)
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		
	}
}
