package practice.chap05.euclidGCD;

import practice.chap05.NegativeNumberException;

public class EuclidGCD {
	public int gcd(int x, int y) throws NegativeNumberException {
		if(x < 0 || y < 0) {
			throw new NegativeNumberException();
		}
		
		if(x < y) {
			int temp = 0;
			temp = x;
			x = y;
			y = temp;
		}
		
		return y == 0 ? x : gcd(y, x % y);
	}
}
