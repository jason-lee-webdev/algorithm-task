package Do_it_실습.chap03;

import java.util.Scanner;

// [문제]
// 배열 선형 검색 알고리즘을 구현하라.

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
// 선형 검색은 최악의 경우 루프를 배열의 요솟수 + 1만큼 수행한다.

public class _1_SeqSearch {

//	검색 대상인 배열 a와 검색할 값인 keyValue를 전달받아
//	검색할 값과 같은 요소를 발견한 경우 요소의 인덱스를 리턴
//	검색할 값을 발견하지 못하고 배열의 끝을 지난 경우 -1을 리턴
	public static int seqSearch(int[] a, int keyValue) {
//		[답안 코드]에서는 매개변수로 검색 대상 배열, 배열의 길이, 검색할 값을 작성했다.
		
//		?? 배열의 길이는 배열을 통해서 충분히 얻을 수 있는 정보인데 굳이 배열의 길이까지
//		메소드에 전달할 필요가 있었을까? ??
		
		int i = 0;
		int n = a.length;

		while (true) {
			if (i == n) {
				return -1;

//				break;
//				메소드 안 루프 안 return 문은 break를 능가한다.
			}

			if (a[i] == keyValue) {
				return i;
			}

			i++;
		}
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
		} while(n < 1);
//		[답안 코드]에서는 요솟수의 제약 조건을 작성하지 않았다.
//		하지만 요솟수가 음수일 경우 java.lang.NegativeArraySizeException이 런타임에 발생한다.
//		요솟수가 0일 경우 배열 생성시 오류가 발생하지는 않지만
//		검색 차원에서 요솟수가 0인 배열은 의미가 없으므로 0보다 큰 크기를 갖는 배열을 선언한다.
		
//		사용자가 입력한 요솟수를 갖는 배열을 생성한다.
		a = new int[n];
		
//		배열의 요솟수만큼 반복을 돌며 사용자가 입력한 값을
//		요소의 값으로 할당한다.
		for(int i = 0; i < n; i++) {
			System.out.print("x[" + i + "] : ");
			a[i] = scanner.nextInt();
		}
		
//		검색할 값을 사용자에게 입력받는다.
		System.out.print("검색할 값 : ");
		keyValue = scanner.nextInt();
		
//		seqSearch()를 호출하고 리턴값을 index 변수에 저장한다.
		index = seqSearch(a, keyValue);
		
//		index의 값에 따라 출력할 메세지의 값을 서로 다르게 저장한다.
		if(index == -1) {
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
