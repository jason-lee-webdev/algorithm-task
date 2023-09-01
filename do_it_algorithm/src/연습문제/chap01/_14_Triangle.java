package 연습문제.chap01;

import java.util.Scanner;

public class _14_Triangle {
	
//	직각이등변삼각형을 출력하는 부분을 아래와 같은 형식의 메소드로 작성하세요.
	
//	static void triangleLB(int n) : 왼쪽 아래가 직각인 이등변삼각형을 출력
//	static void triangleLU(int n) : 왼쪽 위가 직각인 이등변삼각형을 출력
//	static void triangleRB(int n) : 오른쪽 아래가 직각인 이등변삼각형을 출력
//	static void triangleRU(int n) : 오른쪽 위가 직각인 이등변삼각형을 출력
	
//	[결론]
//	입력받은 값과 행을 카운트 하는 값을 활용하여 열에서 출력할 내용을 구성한다.
	
//	*
//	**
//	***
	static void triangleLB(int n) {
		
//		[내가 작성한 코드]
//		if(n <= 0) {
//			System.out.println("양의 정수를 입력하세요.");
//			return;
//		}
		
//		[답안 코드]
		
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
//	*** 1 3 - 1 + 1
//	** 2 3 - 2 + 1
//	* 3 3 - 3 + 1
	static void triangleLU(int n) {
		
//		[내가 작성한 코드]
//		if(n <= 0) {
//			System.out.println("양의 정수를 입력하세요.");
//			return;
//		}
		
//		[답안 코드]
		
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n - i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
//	__* 1 3 - 1 / 1
//	_** 2 3 - 2 / 2
//	*** 3 3 - 3 / 3
	static void triangleRB(int n) {
		
//		[내가 작성한 코드]
//		if(n <= 0) {
//			System.out.println("양의 정수를 입력하세요.");
//			return;
//		}
		
//		[답안 코드]
		
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n - i; j++) {
				System.out.print("_");
			}
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
//	*** 1 / 1 - 1 / 3 - 1 + 1  
//	_** 2 / 2 - 1 / 3 - 2 + 1
//	__* 3 / 3 - 1 / 3 - 3 + 1
	static void triangleRU(int n) {
		
//		[내가 작성한 코드]
//		if(n <= 0) {
//			System.out.println("양의 정수를 입력하세요.");
//			return;
//		}
		
//		[답안 코드]
		
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= i - 1; j++) {
				System.out.print("_");
			}
			for(int j = 1; j <= n - i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	
	public static void main(String[] args) {
		
//		[내가 작성한 코드]
//		triangleLB(3);
//		triangleLU(3);
//		triangleRB(3);
//		triangleRU(3);
		
//		[답안 코드]
		Scanner scan = new Scanner(System.in);
		int n = 0;
		
		System.out.println("삼각형을 출력합니다.");
		
		do {
			System.out.print("단수는: ");
			n = scan.nextInt();
		} while(!(n > 0));
		
		System.out.println("왼쪽 아래 직각삼각형");
		triangleLB(n);
		
		System.out.println("왼쪽 위 직각삼각형");
		triangleLU(n);
		
		System.out.println("오른쪽 아래 직각삼각형");
		triangleRB(n);
		
		System.out.println("오른쪽 위 직각삼각형");
		triangleRU(n);
		
	}

}