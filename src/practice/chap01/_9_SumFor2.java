package practice.chap01;

import java.util.Scanner;

public class _9_SumFor2 {
	
//	양수만 입력하여 1, 2, ..., n의 합을 구함
//	(do -while문을 사용한다.)
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sum = 0, n = 0;
		
		System.out.println("1부터 n까지의 합을 구합니다.");
		
		do {
			System.out.print("n값 : ");
			n = scan.nextInt();
		} while (n <= 0);
		
		for(int i = 1; i <= n; i++) {
			sum += i;
		}
		
		System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");
	}

}

