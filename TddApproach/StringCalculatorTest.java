package primedemo;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StringCalculatorTest 
{
	StringCalculator stringCalculator;
	String SINGLE_NUMBER_AS_STRING="10";
	
	@Before
	public void setup()
	{
		 stringCalculator = new StringCalculator();
	}
	
	@Test
	public void testCalculate_GivenEmptyString_ShouldReturnZero()
	{
		int result = stringCalculator.calculate("");
		assertEquals(result,0);
	}
	
	@Test
	public void testCalculate_GivenSingleNumberAsString_ShouldReturnsSameNumberAsInteger()
	{
		int result = stringCalculator.calculate(SINGLE_NUMBER_AS_STRING);
		assertEquals(result, 10);
	}
	
	@Test
	public void testCalculate_Given1And2AsString_ShouldReturnsAsInteger()
	{
		int result = stringCalculator.calculate("1,2");
		assertEquals(result,3);
	}
	

}
