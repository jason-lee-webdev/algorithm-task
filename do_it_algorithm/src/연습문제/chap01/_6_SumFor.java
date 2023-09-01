package 연습문제.chap01;

import java.util.Scanner;

// while 문으로 1, 2, ..., n의 합을 구하시오.
// while문이 종료될 때 변수 i 값이 n + 1이 되는지 확인하시오.

// [실행결과]
// 1부터 n까지의 합을 구합니다.
// n값: 5
// 1부터 5까지의 합은 15입니다.
public class _6_SumFor {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sum = 0, i = 1, n = 0;
		
		System.out.println("1부터 n까지의 합을 구합니다.");
		System.out.print("n값: ");
		n = scan.nextInt();
		
		while(i <= n) {
			sum += i;
			i++;
		}
		
		System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");
		System.out.println("i : " + i);
	}
}
