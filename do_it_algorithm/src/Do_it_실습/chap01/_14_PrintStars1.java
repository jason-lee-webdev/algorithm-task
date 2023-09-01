package Do_it_실습.chap01;

import java.util.Scanner;

public class _14_PrintStars1 {

//	*를 n개 출력하되 w개마다 줄 바꿈을 하는 프로그램입니다.
	
//	[실행 결과]
//	*를 n개 출력하되 w개마다 줄을 바꿔서 출력합니다.
//	n값: 14
//	w값: 5
//	*****
//	*****
//	****
	
	public static void main(String[] args) {
		
//		[결론]
//		입력 받는 값의 제약조건을 빈틈없이 생각하고 코드로 작성한다.
		
//		[내가 작성한 코드]
		Scanner scan = new Scanner(System.in);
		int n = 0, w = 0;
		
		System.out.println("*를 n개 출력하되 w개마다 줄을 바꿔서 출력합니다.");
		
		do {
			System.out.print("n값: ");
			n = scan.nextInt();			
		} while(n <= 0);
		
		do {
			System.out.print("w값: ");
			w = scan.nextInt();			
//		} while(w > n);
		} while(w <= 0 || w > n);	
		
		for(int i = 0; i < n / w; i++) {
			for(int j = 0; j < w; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int j = 0; j < n % w; j++) {
			System.out.print("*");
		}
		
//		반복 횟수 : n번
//		if문 반복 횟수 : 0번
		
//		[답안 코드]
//		Scanner scan = new Scanner(System.in);
//		int n = 0, w = 0;
//		
//		System.out.println("*를 n개 출력하되 w개마다 줄을 바꿔서 출력합니다.");
//		
//		do {
//			System.out.print("n값: ");
//			n = scan.nextInt();			
//		} while(n <= 0);
//		
//		do {
//			System.out.print("w값: ");
//			w = scan.nextInt();			
//		} while(w <= 0 || w > n);	
//		
//		for(int i = 0; i < n; i++) {
//			System.out.print("*");
//			if(i % w == w - 1) { // i % w가 w - 1일 때 줄바꿈을 한다.
//				System.out.println();
//			}
//		}
//		
//		if(n % w != 0) {
//			System.out.println(); // n이 w의 배수가 아닐 경우 마지막 줄의 "*"을 모두 출력후 줄바꿈을 한다.
//		}
//		
////		반복 횟수 : n번
////		if문 반복 횟수 : n + 1번
	}
	
}
