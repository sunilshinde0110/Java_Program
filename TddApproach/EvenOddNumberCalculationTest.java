package com.test.evenoddnumbercalculation;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class EvenOddNumberCalculationTest {
	
	EvenOddNumberCalculation evenOddNumberCalculation;
	
	@Before
	public void setup() {
		
		evenOddNumberCalculation=new EvenOddNumberCalculation();
	}

	@Test
	public void testCalculateEvenOddNumber_Given1AsInput_ShouldReturn0ForOddNumber() {
		
		int result= evenOddNumberCalculation.calculateEvenOdd(1);
		assertEquals(result, 0);
		
	}
	
	@Test
	public void testCalculateEvenOddNumber_Given2AsInput_ShouldReturn1ForEvenNumber() {
		
		int result= evenOddNumberCalculation.calculateEvenOdd(2);
		assertEquals(result, 1);
		
	}
	
	@Test
	public void testCalculateEvenOddNumber_Given3AsInput_ShouldReturn0ForOddNumber() {
		
		int result= evenOddNumberCalculation.calculateEvenOdd(3);
		assertEquals(result, 0);
		
	}
	
	@Test
	public void testCalculateEvenOddNumber_Given4AsInput_ShouldReturn1ForEvenNumber() {
		
		int result= evenOddNumberCalculation.calculateEvenOdd(4);
		assertEquals(result, 1);
		
	}

}
