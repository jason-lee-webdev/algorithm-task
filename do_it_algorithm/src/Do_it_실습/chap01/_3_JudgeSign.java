package Do_it_실습.chap01;

import java.util.Scanner;

public class _3_JudgeSign {
	
//	입력한 정수값이 부호(양수/음수/0)을 판단하는 프로그램을 작성하시오.
	
	public static void main(String[] args) {

		int n = 0;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		n = scan.nextInt();
		
		if(n > 0) {
			System.out.println("이 수는 양수입니다.");
		} else if(n < 0) {
			System.out.println("이 수는 음수입니다.");
		} else { 
			System.out.println("이 수는 0입니다.");
		}
		
	}
	
}
