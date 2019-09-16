package com.prime;

public class PrimeNumberCalculation {

	
	public int calculatePrime(int num)
	{
		int  i, count=0;
        
		  
        
		
        for(i=2; i<num; i++)
        {
            if(num%i == 0)
            {
                count++;
                break;
            }
        }
        if(count == 0)
        {
            System.out.print("\nThis is a Prime Number");
            return num;
        }
        else
        {
            System.out.print("\nThis is not a Prime Number");
            return num;
        }
	}

}
