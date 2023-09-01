package Do_it_실습.chap01;

import java.util.Scanner;

public class _13_Alternative2 {

//	지정한 개수의 기호를 중간에 줄 바꿈 없이 연속해서 보여주는 프로그램이다.
//	+, - 기호를 번갈아 출력합니다.
//	반복문 안의 조건식 판단 횟수를 최소화 한다.
//	for문의 초기식을 변경할 경우 다른 코드의 변화를 최소화하는 방향으로 작성한다.
	
//	[실행 결과]
//	+, - 기호를 번갈아 출력합니다.
//	n값: 12
//	+-+-+-+-+-+-
	
	public static void main(String[] args) {
		
//		[결론]
//		반복의 횟수를 최소화 하는 방향으로 코드를 작성한다.
//		반복할 실행문을 묶으려고 시도한다.
		
		Scanner scan = new Scanner(System.in);
		int n = 0;
		
		System.out.println("+, - 기호를 번갈아 출력합니다.");
		
		do {
			System.out.print("n값: ");
			n = scan.nextInt();			
		} while(n <= 0);
		
		for(int i = 0; i < n / 2; i++) {
			System.out.print("+-");
		}
		
		if(n % 2 != 0) {
			System.out.print("+");
		}
		
	}
	
}
