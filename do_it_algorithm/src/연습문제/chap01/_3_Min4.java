package 연습문제.chap01;

import java.util.Scanner;

public class _3_Min4 {

//	네 값의 최소값을 구하는 min4 메소드를 작성하세요.
	public static int min4(int a, int b, int c, int d) {
		int min = a;
		
		if(b < min) {min = b;}
		if(c < min) {min = c;}
		if(d < min) {min = d;}
		
		return min;
	}
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int a, b, c, d = 0;
		
		System.out.println("네 정수의 최소값을 구합니다.");
		System.out.print("네 정수를 입력하시오 : ");
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();
		d = scan.nextInt();
		
		System.out.println("최소값은 " + min4(a, b, c, d) + "입니다.");
		
		scan.close();
	}

}
