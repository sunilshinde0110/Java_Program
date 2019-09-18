package primedemo;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.prime.PrimeNumberCalculation;

public class PrimeNumberCalculationTest 
{
	PrimeNumberCalculation primeNumberCalculation;
	@Before
	public void setup() 
	{
		
		primeNumberCalculation = new PrimeNumberCalculation();
		
	}
	
	@Test
	public void testCalculatePrimeNumber_Given1AsInput_ShouldReturn1ForPrimeNumber()
	{
		
		int expected = primeNumberCalculation.calculatePrime(1);
		assertEquals(expected,1);
		
	}
	
	@Test 
	public void testCalculatePrimeNumber_Given2AsInput_ShouldReturn1ForPrimeNumber()
	{
		
		int expected = primeNumberCalculation.calculatePrime(2);
		assertEquals(expected,1);
		
		
	}
	
	@Test
	public void testCalculatePrimeNumber_Given3AsInput_ShouldReturnOutput1ForPrimeNumber()
	{
		
		int expected = primeNumberCalculation.calculatePrime(3);
		assertEquals(expected,1);
		
		
	}
	
	
	@Test
	public void testCalculatePrimeNumber_Given4AsInput_ShouldReturnOutput0ForNotPrimeNumber()
	{
		
		int expected = primeNumberCalculation.calculatePrime(4);
		assertEquals(expected,0);
		
		
	}

	
	
}
