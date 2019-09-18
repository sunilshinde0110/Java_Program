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
          // System.out.print("\n"+num+" is a Prime Number:");
            return 1;//return 1 for prime number
        }
        else
        {
            //System.out.print("\n"+num+" is not a Prime Number");
            return 0;//return 0 for not prime number
        }
	}

}
