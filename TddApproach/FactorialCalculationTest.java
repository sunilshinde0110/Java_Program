package factorialcalculation;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;



public class FactorialCalculationTest 
{
	FactorialCalculation factorialCalculation; 
	
	@Before
	public void setup() 
	{
		
		factorialCalculation =  new FactorialCalculation();;
		
	}
	
	@Test
	public void testCalculateFactorial_Given1AsInput_ShouldReturn1AsOutput() {
	
			int expected = factorialCalculation.calculateFactorial(1);
			assertEquals(expected,1);
		}
		
	@Test
		public void testCalculateFactorial_Given2AsInput_ShouldReturn2AsOutput() {
			
			int expected = factorialCalculation.calculateFactorial(2);
			assertEquals(expected,2);
			
		}
	
	@Test
		public  void testCalculateFactorial_Given3AsInput_ShouldReturn6AsOutput() {
			
			int expected = factorialCalculation.calculateFactorial(3);
			assertEquals(expected,6);
	}
		
		@Test
		public void testCalculateFactorial_Given4AsInput_ShouldReturn24AsOutput() {
			
			int expected = factorialCalculation.calculateFactorial(4);
			assertEquals(expected,24);
		}

	}

	
	
	
	
	
	
	

