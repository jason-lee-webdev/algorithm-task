package practice.chap01;

import java.util.Scanner;

public class _8_SumFor {
	
//	1부터 n까지 정수의 합을 for문으로 구하는 프로그램을 작성하시오.
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		
		System.out.println("1부터 n까지의 합을 구합니다.");
		System.out.print("n값 : ");
		int n = scan.nextInt();
		
		for(int i = 1; i <= n; i++) {
			sum += i;
		}
		
		System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");
	}

}
