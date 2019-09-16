package factorialcalculation;

import static org.junit.Assert.*;

import org.junit.Test;

public class FactorialCalculationTest 
{

	@Test
	public void test() {
					testCalculateFactorial_Given1AsInput_ShouldReturn1AsOutput(1);
			//testCalculateFactorial_Given2AsInput_ShouldReturn2AsOutput(2);
			//testCalculateFactorial_Given3AsInput_ShouldReturn6AsOutput(3);
			//testCalculateFactorial_Given4AsInput_ShouldReturn24AsOutput(4);
			
			
		}

	@Test
	public void test1() {
					//testCalculateFactorial_Given1AsInput_ShouldReturn1AsOutput(1);
			testCalculateFactorial_Given2AsInput_ShouldReturn2AsOutput(2);
			//testCalculateFactorial_Given3AsInput_ShouldReturn6AsOutput(3);
			//testCalculateFactorial_Given4AsInput_ShouldReturn24AsOutput(4);
			
			
		}

	@Test
	public void test2() {
					//testCalculateFactorial_Given1AsInput_ShouldReturn1AsOutput(1);
			//testCalculateFactorial_Given2AsInput_ShouldReturn2AsOutput(2);
			testCalculateFactorial_Given3AsInput_ShouldReturn6AsOutput(3);
			//testCalculateFactorial_Given4AsInput_ShouldReturn24AsOutput(4);
			
			
		}
	
	@Test
	public void test3() {
					//testCalculateFactorial_Given1AsInput_ShouldReturn1AsOutput(1);
			//testCalculateFactorial_Given2AsInput_ShouldReturn2AsOutput(2);
			//testCalculateFactorial_Given3AsInput_ShouldReturn6AsOutput(3);
			testCalculateFactorial_Given4AsInput_ShouldReturn24AsOutput(4);
			
			
		}

	
	
	private static void testCalculateFactorial_Given1AsInput_ShouldReturn1AsOutput(int num) {
			FactorialCalculation factorialCalculation =  new FactorialCalculation();
			int expected = factorialCalculation.calculateFactorial(num);
			if(expected == 1){
				System.out.println("Pass");
			}
			else{
				System.out.println("Fail");
			}
		}
		
		
		private static void testCalculateFactorial_Given2AsInput_ShouldReturn2AsOutput(int num) {
			FactorialCalculation factorialCalculation =  new FactorialCalculation();
			int expected = factorialCalculation.calculateFactorial(num);
			if(expected == 2){
				System.out.println("Pass");
			}
			else{
				System.out.println("Fail");
			}
		}
		
		private static void testCalculateFactorial_Given3AsInput_ShouldReturn6AsOutput(int num) {
			FactorialCalculation factorialCalculation =  new FactorialCalculation();
			int expected = factorialCalculation.calculateFactorial(num);
			if(expected == 6){
				System.out.println("Pass");
			}
			else{
				System.out.println("Fail");
			}
		}
		
		private static void testCalculateFactorial_Given4AsInput_ShouldReturn24AsOutput(int num) {
			FactorialCalculation factorialCalculation =  new FactorialCalculation();
			int expected = factorialCalculation.calculateFactorial(num);
			if(expected == 24){
				System.out.println("Pass");
			}
			else{
				System.out.println("Fail");
			}
		}

	}

	
	
	
	
	
	
	

