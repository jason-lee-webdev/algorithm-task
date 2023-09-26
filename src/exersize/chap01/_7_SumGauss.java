package exersize.chap01;

import java.util.Scanner;

public class _7_SumGauss {
	
//	1부터 10까지의 합은 (1 + 10) * 5 와 같이 구할 수 있습니다.
//	이를 '가우스의 덧셈'이라고 하는데 이 방법을 이용하여 1부터 n까지의 정수 합을 구하는 프로그램을 작성하시오.

//	[실행결과]
//	1부터 n까지의 합을 구합니다.
//	n값: 5
//	1부터 5까지의 합은 15입니다.
	
	public static void main(String[] args) {
		
//		[결론]
//		입력 받는 값과 결과 값의 타입을 일치시킨다.
//		연산식이 2가지 경우로 나누어진다면 삼항 연산식을 사용할 수 있다.
		
//		1부터 2까지의 합 : (1 + 2) * (2 / 2)
//		1부터 3까지의 합 : ((1 + 3) * (3 / 2)) + ((1 + 3) *  1 / 2) => (1 + 3) * ( 3 / 2 ) => 4 * 1.5 = 6.0
//		1부터 n까지의 합 : (1 + n) * (n / 2)
		
//		[내가 작성한 코드]
		Scanner scan = new Scanner(System.in);
//		double sum = 0;
		int n = 0, sum = 0;
		
		System.out.println("1부터 n까지의 합을 구합니다.");
		System.out.print("n값: ");
		n = scan.nextInt();
		
//		sum = (1 + n) * ((double)n / 2);
		sum = (int)((1 + n) * ((double)n / 2));
		
//		System.out.printf("1부터 %d까지의 합은 %.0f입니다.", n, sum);
		System.out.printf("1부터 " + n + "까지의 합은 " + sum + "입니다.");
		
//		[답안 코드]
//		Scanner scan = new Scanner(System.in);
//		int n = 0, sum = 0;
//		
//		System.out.println("1부터 n까지의 합을 구합니다.");
//		n = scan.nextInt();
//		
//		sum = (1 + n) * (n / 2) + (n % 2 == 1 ? (n + 1) / 2 : 0);
//		n == 3
//		sum = (1 + 3) * (3 / 2) + (3 + 1) / 2
//		                     4                        2
		
//		n = 4
//		sum = (1 + 4) * (4 / 2) + 0
//		                    10
	}
}
