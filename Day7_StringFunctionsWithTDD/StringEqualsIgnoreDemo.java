package main;

public class StringEqualsIgnoreDemo {

	public boolean equalsignoreCase(String s2, String s3) 
	
	{
		String s4 = s3.toLowerCase();
		/*
		if(s2==s4)
		{
			return true;
		}
		else
		{
			return false;
		}
		
		
		
		if(s4.length()==s2.length())
		{
			return true;
		}
		else
		{
			return false;
		}
		*/
		
		if(s4.length()==s2.length() || s2==s4)
		{
			return true;	
		}
		else
		{
			
			return false;
		}
	}

}
