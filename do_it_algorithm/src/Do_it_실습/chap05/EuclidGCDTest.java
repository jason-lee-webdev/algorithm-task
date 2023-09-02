package Do_it_실습.chap05;

import java.util.Scanner;

public class EuclidGCDTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number1 = 0;
		int number2 = 0;
		
		System.out.println("두 정수의 최대공약수를 구합니다.");
		System.out.print("정수를 입력하세요 : ");
		number1 = scanner.nextInt();
		System.out.print("정수를 입력하세요 : ");
		number2 = scanner.nextInt();
		
		try {
			System.out.println("최대공약수는 " + new EuclidGCD().gcd(number1, number2)
					+ "입니다.");
		} catch (NegativeNumberException e) {
			System.out.println("양수를 입력해주세요.");
		}
	}

}
