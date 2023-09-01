package Do_it_실습.chap01;

import java.util.Scanner;

public class _12_Alternative1 {

//	지정한 개수의 기호를 중간에 줄 바꿈 없이 연속해서 보여주는 프로그램이다.
//	+, - 기호를 번갈아 출력합니다.
	
//	[실행 결과]
//	+, - 기호를 번갈아 출력합니다.
//	n값: 12
//	+-+-+-+-+-+-
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n = 0;
		
		System.out.println("+, - 기호를 번갈아 출력합니다.");
		
		do {
			System.out.print("n값: ");
			n = scan.nextInt();			
		} while(n <= 0);
		
		for (int i = 1; i <= n; i++) {
			if(i % 2 != 0) {
				System.out.print("+");
			} else {
				System.out.print("-");
			}
		}
		
	}
	
}
