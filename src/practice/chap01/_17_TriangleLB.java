package practice.chap01;

import java.util.Scanner;

public class _17_TriangleLB {
	
//	왼쪽 아래가 직각인 이등변 삼각형을 출력하는 프로그램입니다.
//	변수 n값은 양수로 입력합니다.
	
//	[실행 결과]
//	왼쪽 아래가 직각인 이등변삼각형을 출력합니다.
//	몇 단 삼각형입니까?: 5
//	*
//	**
//	***
//	****
//	*****
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n = 0;
		
		System.out.println("왼쪽 아래가 직각인 이등변삼각형을 출력합니다.");
		
		do {
			System.out.print("몇 단 삼각형입니까?: ");
			n = scan.nextInt();
		} while(!(n > 0));
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}

}