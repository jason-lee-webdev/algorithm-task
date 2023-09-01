package 연습문제.chap02;

import java.util.Scanner;

public class _3_SumOf {

//	배열 a의 모든 요소의 합계를 구하여 반환하는 메소드를 작성하세요.
//	static int sumOf(int[] a)

//	[실행 결과]
//	요솟수는: 5
//	a[0]: 1
//	a[1]: 2
//	a[2]: 3
//	a[3]: 4
//	a[4]: 5
//	모든 요소의 합계는 15입니다.
	
//	[알고리즘]
//	int sumOf(int[] a) {
//		sum
//		i: 0 1 a.lenght
//			sum += a[i]
//		return sum;
//	}
	
	public static int sumOf(int[] a) {
		
		int sum = 0;
		
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		
		return sum;
		
	}
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int length = 0;
		int[] a = null;
		
		System.out.print("요솟수는: ");
		length = scan.nextInt();
		
		a = new int[length];
		
		for (int i = 0; i < a.length; i++) {
			System.out.print("a[" + i + "]: ");
			a[i] = scan.nextInt();
		}
		
		System.out.println("모든 요소의 합계는 " + sumOf(a) + "입니다.");
		
	}

}
