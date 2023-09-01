package 연습문제.chap01;

import java.util.Scanner;

public class _2_Min3 {

//	세 값의 최소값을 구하는 min3 메소드를 작성하세요.
	public static int min3(int a, int b, int c) {
		int min = a;
		
		if(b < min) {min = b;}
		if(c < min) {min = c;}
		
		return min;
	}
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int a, b, c;
		
		System.out.println("세 정수의 최소값을 구합니다.");
		System.out.print("세 정수를 입력하시오 : ");
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();
		
		System.out.println("최소값은 " + min3(a, b, c) + "입니다.");
		
		scan.close();
	}

}
