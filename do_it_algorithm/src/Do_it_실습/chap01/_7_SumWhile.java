package Do_it_실습.chap01;

import java.util.Scanner;

//	1부터 n까지 정수의 합을 구하시오

public class _7_SumWhile {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int sum = 0, i = 0;
		
		System.out.println("1부터 n까지의 합을 구합니다.");
		System.out.print("n값 : ");
		int n = scan.nextInt();
		
		while(++i <= n) {
//			System.out.println("i : " + i);
			sum += i;
		}
		
		System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");
	}
	
	
}
