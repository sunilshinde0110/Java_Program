package factorialcalculation;

public class FactorialCalculation {

	public int calculateFactorial(int num) {
		int fact = 1;
		while (num >= 1) {
			fact = fact * num;
			num--;
		}
		return fact;

	}

}
