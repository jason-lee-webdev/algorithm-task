package 연습문제.chap02;

import java.util.Scanner;

//배열 b의 모든 요소를 배열 a에 역순으로 복사하는 메서드 rcopy를 작성하세요.
//배열 a의 길이 < 배열 b의 길이 : 배열 a의 앞쪽 부터 배열 b의 요소를 역순으로 복사하되 공간이 부족하면 배열 b의 나머지 요소는 담지 않는다.
//배열 a의 길이 > 배열 b의 길이 : 배열 a의 앞쪽 부터 배열 b의 요소를 역순으로 복사하고 배열 a의 남는 공간은 배열 a의 원본 요소를 지닌다.
//static void copy(int[] a, int[] b)

//[실행 결과]
//a의 요솟수는: 2
//a[0]: 1
//a[1]: 2
//b의 요솟수는: 3
//b[0]: 3
//b[1]: 4
//b[2]: 5
//배열 b의 모든 요소를 배열 a에 역순으로 copy하였습니다.
//a[0] = 5
//a[1] = 4

//a의 요솟수는: 3
//a[0]: 1
//a[1]: 2
//a[2]: 3
//b의 요솟수는: 2
//b[0]: 4
//b[1]: 5
//배열 b의 모든 요소를 배열 a에 역순으로 copy하였습니다.
//a[0] = 5
//a[1] = 4
//a[1] = 3

//[순서도]
//<void copy(int[] a, int[] b)>
//만약 a.length <= b.length
//	true 일 경우
//		a.length -> copiedArrayLength
//	false 일 경우
//		b.length -1 -> copiedArrayLength
//반복 i: 0, 1, copiedArrayLength
//	b[b.length - 1 - i] -> a[i]
public class _5_Rcopy {

	public static void rcopy(int[] a, int[] b) {

		int copiedArrayLength = 0;

		copiedArrayLength = a.length <= b.length ? a.length : b.length;

		for (int i = 0; i < copiedArrayLength; i++) {
			a[i] = b[b.length - 1 - i];
		}
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int length = 0;
		int[] a = null, b = null;

		System.out.print("a의 요솟수는: ");
		length = scan.nextInt();

		a = new int[length];

		for (int i = 0; i < a.length; i++) {
			System.out.print("a[" + i + "]: ");
			a[i] = scan.nextInt();
		}

		System.out.print("b의 요솟수는: ");
		length = scan.nextInt();

		b = new int[length];

		for (int i = 0; i < b.length; i++) {
			System.out.print("b[" + i + "]: ");
			b[i] = scan.nextInt();
		}
		
		scan.close();

		rcopy(a, b);

		System.out.println("배열 b의 모든 요소를 배열 a에 copy하였습니다.");

		for (int i = 0; i < a.length; i++) {
			System.out.println("a[" + i + "] = " + a[i]);
		}

	}

}
