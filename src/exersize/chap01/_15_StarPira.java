package exersize.chap01;

import java.util.Scanner;

public class _15_StarPira {
	
//	n단의 피라미드를 출력하는 메서드를 작성하세요
	
//	static void starPyramid(int n)
	
//	[실행 결과]
//	4단
//	___*___
//	__***__
//	_*****_
//	*******
	
	static void starPyramid(int n) {
		
//		__*__ 1 / 3 - 1 / 1 * 2 - 1 / 3 - 1
//		_***_ 2 / 3 - 2 / 2 * 2 - 1 / 3 - 2
//		***** 3 / 3 - 3 / 3 * 2 - 1 / 3 - 3
		
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n - i; j++) {
				System.out.print("_");
			}
			for(int j = 1; j <= i * 2 - 1; j++) {
				System.out.print("*");
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
		
		starPyramid(n);
		
	}

}