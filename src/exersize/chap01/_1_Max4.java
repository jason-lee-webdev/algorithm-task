package exersize.chap01;

import java.util.Scanner;

public class _1_Max4 {

//	네 값의 최대값을 구하는 max4 메소드를 작성하세요.
//	작성한 메소드를 테스트하기 위해 main 메서드를 포함한 프로그램을 작성해야 합니다.
//	이후의 문제도 마찬가지 입니다.
	public static int max4(int a, int b, int c, int d) {
		int max = a;
	
		if(b > max) {max = b;}
		if(c > max) {max = c;}
		if(d > max) {max = d;}
		
		return max;
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int a, b, c, d;
		
		System.out.println("네 정수의 최대값을 구합니다.");
		System.out.print("네 정수를 입력하시오 : ");
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();
		d = scan.nextInt();
		
		System.out.println("최대값은 " + max4(a, b, c, d) + "입니다.");
		
		scan.close();
	}

}
