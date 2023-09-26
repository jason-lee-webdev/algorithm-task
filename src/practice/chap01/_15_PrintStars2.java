package practice.chap01;

import java.util.Scanner;

public class _15_PrintStars2 {

//	*를 n개 출력하되 w개마다 줄 바꿈을 하는 프로그램입니다.
//	반복 횟수를 최소화 한다.
	
//	[실행 결과]
//	*를 n개 출력하되 w개마다 줄을 바꿔서 출력합니다.
//	n값: 14
//	w값: 5
//	*****
//	*****
//	****
	
	public static void main(String[] args) {
		
//		[결론]
//		문자열을 n번 반복한 문자열을 생성하고 싶다면 String객체.reapeat(int 횟수) 메소드를 사용한다.
		
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
		} while(w <= 0 || w > n);	
		
		for(int i = 0; i < n / w; i++) {
			System.out.println("*".repeat(w));
		}
		
		if(n % w != 0) {
			System.out.println("*".repeat(n % w));
		}
		
//		반복 횟수 : n / w번
//		if문 반복 횟수 : 0번
	}
	
}
