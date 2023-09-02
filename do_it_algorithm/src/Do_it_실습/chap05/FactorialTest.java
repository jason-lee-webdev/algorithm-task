package Do_it_실습.chap05;

import java.util.Scanner;

public class FactorialTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int num = scanner.nextInt();
		
		try {
			System.out.println(num + "의 팩토리얼은 " + new Factorial().factorial(num) + "입니다.");
		} catch (NegativeNumberException e) {
			System.out.println("양수를 입력해주세요.");
		}
	}

}
