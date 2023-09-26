package practice.chap01;

import java.util.Scanner;

public class _11_SumVerbose2 {

//	1부터 n까지의 합과 그 값을 구하는 과정을 출력하도록 수정한 프로그램입니다.
//	반복문 안의 조건식 판단 횟수를 최소화 한다.
	
//	[실행 결과]
//	1부터 n까지의 합을 구합니다.
//	n값: -3
//	n값: 5
//	1 + 2 + 3 + 4 + 5 = 15
	
	public static void main(String[] args) {
		
//		[결론]
//		반복문 안에서 조건식의 판단 횟수를 최소화한다.
//		복합대입연산자의 결과를 값으로 본다.
		
		Scanner scan = new Scanner(System.in);
		int n = 0, sum = 0;
		
		System.out.println("1부터 n까지의 합을 구합니다.");
		
		do {
			System.out.print("n값: ");
			n = scan.nextInt();			
		} while(n <= 0);
		
		for (int i = 1; i < n; i++) {
			sum += i;
			System.out.print(i + " + ");
		}
		
//		sum += n;
		System.out.print(n + " = " + (sum += n));
		
	}
	
}
