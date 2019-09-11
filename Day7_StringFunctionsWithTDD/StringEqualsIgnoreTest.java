package Test;

import main.StringEqualsIgnoreDemo;

public class StringEqualsIgnoreTest 
{
	public static void main(String[] args)
	{
		//String s1 ="hello";
		String s2 ="rohit hi";
		String s3 ="rohit HI";
		
		//System.out.println(s2.equalsIgnoreCase(s3));
		
		StringEqualsIgnoreDemo s = new StringEqualsIgnoreDemo();
	
		boolean s4 = s.equalsignoreCase(s2,s3);
		
		if(s4==true)
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		
	}
}
