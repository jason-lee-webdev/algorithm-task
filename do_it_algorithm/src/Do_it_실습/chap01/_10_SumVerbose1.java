package Do_it_실습.chap01;

import java.util.Scanner;

public class _10_SumVerbose1 {

//	1부터 n까지의 합과 그 값을 구하는 과정을 출력하도록 수정한 프로그램입니다.
	
//	[실행 결과]
//	1부터 n까지의 합을 구합니다.
//	n값: -3
//	n값: 5
//	1 + 2 + 3 + 4 + 5 = 15
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n = 0, sum = 0;
		String msg = "";
		
		System.out.println("1부터 n까지의 합을 구합니다.");
		
		do {
			System.out.print("n값: ");
			n = scan.nextInt();			
		} while(n <= 0);
		
		for (int i = 1; i <= n; i++) {
			sum += i;
			msg += i;
			
			if(i != n) {
				msg += " + ";
			} else {
				msg += " = " + sum;
			}
		}
		
		System.out.println(msg);
		
	}
	
}
