package 연습문제.chap01;

import java.util.Scanner;

public class _12_Add99TableEx {
	
//	아래의 결과와 같이 입력한 수를 한 변으로 하는 정사각형을 *로 출력하는 프로그램을 작성하세요.
	
//	[실행 결과]
//	정사각형을 출력합니다.
//	변의 길이: 5
//	*****
//	*****
//	*****
//	*****
//	*****
	
	public static void main(String[] args) {
		
//		[결론]
//		String 타입 객체.repeat(반복 횟수) 메소드는 편리하다.
		
		Scanner scan = new Scanner(System.in);
		int sideLength = 0;
		
		System.out.println("정사각형을 출력합니다");
		do {
			System.out.print("변의 길이: ");
			sideLength = scan.nextInt();
		} while(!(sideLength > 0));
		
//		[내가 작성한 코드]
		for(int i = 0; i < sideLength; i++) {
			System.out.println("*".repeat(sideLength));
		}
		
//		[답안 코드]
//		for(int i = 0; i < sideLength; i++) {
//			for(int j = 0; j < sideLength; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
	}

}