package exersize.chap01;

import java.util.Scanner;

public class _10_DigitsNo {
	
//	양의 정수를 입력하고 자릿수를 출력하는 프로그램을 작성하세요.
//	예를 들어 135를 입력하면 '그 수는 3자리입니다.'라고 출력하고,
//	1314를 입력하면 '그 수는 4자리 입니다.'라고 출력합니다.
	
	public static void main(String[] args) {
		
//		[결론]
//		반복이 진행되면서 연산의 결과를 누적 시킬 수 있는지 생각한다.
		
//		13 / 1 = 13
//		13 / 10 = 1
//		13 / 100 = 0
//		즉 13는 10^2으로 나누었을 때 몫이 0이다. 13은 2자리이다.
		
//		[내가 작성한 코드]
		Scanner scan = new Scanner(System.in);
		int number = 0, multipleCount = 0, divisor = 0;
		
		System.out.print("양의 정수를 입력하세요 : ");
		number = scan.nextInt();
		
		while(true) {
			divisor = (int)Math.pow(10, multipleCount);

			if(number / divisor == 0) {
				System.out.println("그 수는 " + multipleCount + "자리 입니다.");
				break;
			}
			
			multipleCount++;
		}	
		
//		[답안 코드]
//		Scanner scan = new Scanner(System.in);
//		int number = 0, count = 0;
//		
//		do {
//			System.out.print("양의 정수를 입력하세요 : ");
//			number = scan.nextInt();
//		} while(number <= 0);
//		
//		while(number > 0) {
//			number = number / 10;
//			count++;
//		}
//		
//		System.out.println("그 수는 " + count + "자리 입니다.");
	}

}