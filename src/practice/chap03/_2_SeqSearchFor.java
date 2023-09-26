package practice.chap03;

import java.util.Scanner;

// [문제]
// 배열 선형 검색 알고리즘을 for문을 사용하여 구현하라.

// [실행 결과]
// 요솟수 : 7
// x[0] : 6
// x[1] : 4
// x[2] : 3
// x[3] : 2
// x[4] : 1
// x[5] : 2
// x[6] : 8
// 검색할 값 : 2
// 그 값은 x[3]에 있습니다.

// [결론]
// 반복 횟수가 정해진 루프는 for문을 사용하는 것이 간편하다.

public class _2_SeqSearchFor {

	public static int seqSearchFor(int[] a, int keyValue) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] == keyValue) {
				return i;
			}
		}

		return -1;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = 0;
		int[] a = null;
		int keyValue = 0;
		String msg = "";
		int index = 0;

//		배열의 요솟수를 사용자에게 입력받는다.
//		요솟수는 1이상이어야 한다.
		do {
			System.out.print("요솟수 : ");
			n = scanner.nextInt();
		} while (n < 1);

//		사용자가 입력한 요솟수를 갖는 배열을 생성한다.
		a = new int[n];

//		배열의 요솟수만큼 반복을 돌며 사용자가 입력한 값을
//		요소의 값으로 할당한다.
		for (int i = 0; i < n; i++) {
			System.out.print("x[" + i + "] : ");
			a[i] = scanner.nextInt();
		}

//		검색할 값을 사용자에게 입력받는다.
		System.out.print("검색할 값 : ");
		keyValue = scanner.nextInt();

//		seqSearch()를 호출하고 리턴값을 index 변수에 저장한다.
		index = seqSearchFor(a, keyValue);

//		index의 값에 따라 출력할 메세지의 값을 서로 다르게 저장한다.
		if (index == -1) {
			msg = "검색에 실패하였습니다.";
		} else {
			msg = "그 값은 x[" + index + "]에 있습니다.";
		}

//		메세지를 출력한다.
		System.out.println(msg);

//		Scanner를 닫는다.
		scanner.close();
	}
}
