package exersize.chap01;

import java.util.Scanner;

public class _9_Difference {

//	두 변수 a, b에 정수를 입력하고
//	b - a를 출력하는 프로그램을 작성하세요.

//	[실행 결과]
//	a값: 6
//	b값: 6
//	a보다 큰 값을 입력하세요!
//	b값: 8
//	b - a는 2입니다.

	public static void main(String[] args) {

//		[결론]
//		이 문제는 do while문으로 해결할 수 없다.
//		반복문 안에서 반복문을 종료하는 조건을 먼저 작성한다.

//		[내가 작성한 코드]
		Scanner scan = new Scanner(System.in);
		int a = 0, b = 0;

		System.out.print("a값: ");
		a = scan.nextInt();
		
		while(true) {
			System.out.print("b값: ");
			b = scan.nextInt();
			
			if(a >= b) {
				System.out.println("a보다 큰 값을 입력하세요!");
			} else {
				break;
			}			
		}
		
		System.out.println("b - a는 " + (b - a) + "입니다.");

//		[답안 코드]
//		Scanner scan = new Scanner(System.in);
//		int a = 0, b = 0;
//
//		System.out.print("a값: ");
//		a = scan.nextInt();
//
//		while (true) {
//			System.out.print("b값: ");
//			b = scan.nextInt();
//
//			if (a < b) {
//				break;
//			}
//			
//			System.out.println("a보다 큰 값을 입력하세요!");
//		}
//
//		System.out.println("b - a는 " + (b - a) + "입니다.");
		
	}

}