package practice.chap05.factorial;

import practice.chap05.NegativeNumberException;

public class Factorial {
	public int factorial(int n) throws NegativeNumberException {
		if(n < 0) {
			throw new NegativeNumberException();
		}
		
		return n > 0 ? n * factorial(n - 1) : 1;
	}
}
