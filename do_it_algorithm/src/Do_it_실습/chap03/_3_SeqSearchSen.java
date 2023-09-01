package Do_it_실습.chap03;

import java.util.Scanner;

// [문제]
// 선형 검색(보초법)
// 요솟수가 n인 배열 a에서 key와 값이 같은 요소를 보초법으로 선형 검색

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
// 동일한 선형 검색이더라도 반복문에서 종료 판단 횟수를 줄이는 코드가 효율적인 코드이다.

// 코드가 실행되는지 여부도 중요하지만 효율적인 코드를 작성하는 것도 중요하다.
public class _3_SeqSearchSen {
	
//	검색 대상인 배열 a와 검색할 값인 keyValue를 전달받아
//	보초에 도달하기 전 검색할 값과 같은 요소를 발견하면 인덱스를 리턴
//	보초에 도달하면 -1을 리턴
	public static int seqSearchSen(int[] a, int key) {
		int i = 0;
		
		while(true) {
			if(a[i] == key) {
				break;
			}
			
			i++;
		}
		
//		인덱스가 보초의 인덱스라면 주어진 배열에서 검색을 실패했음을 의미하므로 -1을 리턴한다.
//		인덱스가 보초의 인덱스가 아니라면 주어진 배열에서 검색에 성공했음을 의미하므로 인덱스를 리턴한다.
		return i == a.length - 1 ? -1 : i;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = 0;
		int[] a = null;
		int key = 0;
		String msg = "";
		int index = 0;

//		배열의 요솟수를 사용자에게 입력받는다.
//		요솟수는 1이상이어야 한다.
		do {
			System.out.print("요솟수 : ");
			n = scanner.nextInt();
		} while (n < 1);

//		사용자가 입력한 요솟수 + 1인 배열을 생성한다.
		a = new int[n + 1];

//		배열의 뒤에서 2번째 요소(인덱스는 n - 1)까지 반복을 돌며 사용자가 입력한 값을
//		요소의 값으로 할당한다.
		for (int i = 0; i < n; i++) {
			System.out.print("x[" + i + "] : ");
			a[i] = scanner.nextInt();
		}

//		검색할 값을 사용자에게 입력받는다.
		System.out.print("검색할 값 : ");
		key = scanner.nextInt();
		
//		배열의 마지막 요소(인덱스는 n)에 검색할 값을 보초로 저장한다.
		a[n] = key;
//		[답안 코드]에서는 검색할 값을 배열의 마지막 요소에 저장하는 코드를
//		seqSearchSen()에 작성했다.

//		seqSearch()를 호출하고 리턴값을 index 변수에 저장한다.
		index = seqSearchSen(a, key);
//		[답안 코드]에서는 사용자가 입력한 배열의 요솟수를 seqSearchSen()의
//		매개값으로 전달하였다.
//		메소드 안에서 전달받은 배열을 통해 요솟수 정보를 획득할 수 있지만
//		사용자가 입력한 배열의 요솟수를 넘기면 간편해서 이렇게 코드를 작성한 것 같다.

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
