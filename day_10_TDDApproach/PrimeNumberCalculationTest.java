package primedemo;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.prime.PrimeNumberCalculation;

public class PrimeNumberCalculationTest {

	@Test
	public void test() 
	{
		testCalculatePrime_Given1AsInput_ShouldReturn1AsOutput(1);
		
	}
	
	@Test
	public void test1() 
	{
		
	testCalculatePrime_Given2AsInput_ShouldReturn2AsOutput(2);
	}
	

	@Test
	public void test2() 
	{
		
		testCalculatePrime_Given3AsInput_ShouldReturn3AsOutput(3);
	}

	@Test
	public void test3() 
	{
		
		testCalculatePrime_Given4AsInput_ShouldReturn4AsOutput(4);
	}

	
	
	
	public void testCalculatePrime_Given1AsInput_ShouldReturn1AsOutput(int i)
	{
		PrimeNumberCalculation p = new PrimeNumberCalculation();
		int expected = p.calculatePrime(i);
		assertEquals(expected,1);
		
		
	}
	
	
	public void testCalculatePrime_Given2AsInput_ShouldReturn2AsOutput(int i)
	{
		PrimeNumberCalculation p = new PrimeNumberCalculation();
		int expected = p.calculatePrime(i);
		assertEquals(expected,2);
		
		
	}
	

	public void testCalculatePrime_Given3AsInput_ShouldReturn3AsOutput(int i)
	{
		PrimeNumberCalculation p = new PrimeNumberCalculation();
		int expected = p.calculatePrime(i);
		assertEquals(expected,3);
		
		
	}
	
	public void testCalculatePrime_Given4AsInput_ShouldReturn4AsOutput(int i)
	{
		PrimeNumberCalculation p = new PrimeNumberCalculation();
		int expected = p.calculatePrime(i);
		assertEquals(expected,4);
		
		
	}

	
	
	
}
