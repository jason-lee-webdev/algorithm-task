package 연습문제.chap01;

import java.util.Scanner;

public class _16_NumPira {
	
//	n단의 숫자 피라미드를 출력하는 메서드를 작성하세요
//	i행에 출력하는 숫자는 i % 10으로 구하세요.
	
//	static void numPyramid(int n)
	
//	[실행 결과]
//	4단
//	___1___
//	__222__
//	_33333_
//	4444444
	
	static void numPyramid(int n) {
		
//		__1__ 1 / 3 - 1 / 1 * 2 - 1 / 3 - 1
//		_222_ 2 / 3 - 2 / 2 * 2 - 1 / 3 - 2
//		33333 3 / 3 - 3 / 3 * 2 - 1 / 3 - 3
		
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n - i; j++) {
				System.out.print("_");
			}
			for(int j = 1; j <= i * 2 - 1; j++) {
				System.out.print(i % 10);
			}
			for(int j = 1; j <= n - i; j++) {
				System.out.print("_");
			}
			System.out.println();
		}
		
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n = 0;
		
		System.out.println("피라미드를 출력합니다.");
		
		do {
			System.out.print("단수는: ");
			n = scan.nextInt();
		} while(!(n > 0));
		
		numPyramid(n);
		
	}

}