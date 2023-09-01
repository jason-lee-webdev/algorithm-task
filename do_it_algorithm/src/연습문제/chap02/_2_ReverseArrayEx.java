package 연습문제.chap02;

import java.util.Arrays;
import java.util.Scanner;

public class _2_ReverseArrayEx {

//	아래처럼 배열 요소를 역순으로 정렬하는 과정을 하나 하나 나타내는 프로그램을 작성하세요.

//	[실행 결과]
//	요솟수는: 7
//	a[0]: 2
//	a[1]: 5
//	a[2]: 1
//	a[3]: 3
//	a[4]: 9
//	a[5]: 6
//	a[6]: 7
//	[2, 5, 1, 3, 9, 6, 7]
//	a[0]과 a[6]을 교환합니다.
//	[7, 5, 1, 3, 9, 6, 2]
//	a[1]과 a[5]을 교환합니다.
//	[7, 6, 1, 3, 9, 5, 2]
//	a[2]과 a[4]을을 교환합니다.
//	[7, 6, 9, 3, 1, 5, 2]
//	역순 정렬을 마쳤습니다.
	
//	[결론]
//	입력은 main() 메소드에서 받지만 출력은 다른 메소드에서 할 수 도 있다.

//	[알고리즘]
//	void reverse(int[] a) {
//		a 전체 요소 출력
//		i: 0 1 a.lenght / 2
//			a[i]과 a[a.lenght - 1 - i]을 교환합니다. 출력
//			a[i] 요소와 a[a.lenght - 1 - i] 요소 교환
//			a 전체 요소 출력
//}

//	void swap(int[] a, int idx1, int idx2) {
//		temp = a[idx1]
//		a[idx1] = a[idx2]
//		a[idx2] = temp
//	}
	
	public static void swap(int[]a, int idx1, int idx2) {
		int temp = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = temp;
	}
	
	public static void reverse(int[] a) {
		
		System.out.println(Arrays.toString(a));
		
		for (int i = 0; i < a.length / 2; i++) {
			System.out.println("a[" + i + "]과 a[" + (a.length - 1 - i) + "]을 교환합니다.");
			swap(a, i, a.length - 1 - i);
			System.out.println(Arrays.toString(a));
		}
		
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
		
		reverse(a);
		
		System.out.println("역순 정렬을 마쳤습니다.");
		
	}

}
