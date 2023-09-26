package practice.chap03;

import java.util.Scanner;

// [문제]
// 이진검색
// 검색 대상(배열)이 오름차순으로 정렬되어 있음을 가정한다.

// [실행 결과]
// 요솟수: 7
// 오름차순으로 입력하세요
// x[0]: 15
// x[1]: 27
// x[2]: 39
// x[3]: 77
// x[4]: 92
// x[5]: 108
// x[6]: 121
// 검색할 값: 39
// 그 값은 x[2]에 있습니다.

// [결론]
// 이진 검색은 검색의 범위를 변경하며 키값을 찾는 검색 방법이다.

public class _4_BinSearch {
	
// 검색 대상인 배열 intArr과 검색할 값인 keyValue를 전달받아
// 배열에 keyValue와 일치하는 요소가 존재하면 해당 요소의 인덱스를 리턴하고,
// 일치하는 요소가 존재하지 않으면 -1을 리턴한다.
	public static int binSearch(int[] intArr, int keyValue) {
		int pl = 0; // 검색 범위의 가장 왼쪽 인덱스를 0으로 초기화한다.
		int pr = intArr.length - 1; // 검색 범위의 가장 오른쪽 인덱스를 배열의 길이 - 1으로 초기화한다.
		int pc = 0;
		
		while(true) {
			pc = (pr - pl) / 2; // 검색 범위의 중앙 인덱스를 (pr - pl) / 2로 초기화한다.
			// 검색 범위의 중앙 인덱스를 재할당은 반복문 안에서 이루어진다.
			
			if(intArr[pc] < keyValue) { // 중앙값보다 키값이 큰 경우 기존 검색 범위를 뒤쪽으로 좁힌다.
				pl = pc + 1; // 검색 범위의 가장 왼쪽 인덱스를 검색 범위의 중앙 인덱스 다음 인덱스로 재할당한다.
			} else if(keyValue < intArr[pc]) { // 중앙값보다 키값이 작을 경우 기존 검색 범위를 앞쪽으로 좁힌다.
				pr = pc - 1; // 검색 범위의 가장 오른쪽 인덱스를 검색 범위의 중앙 인덱스 이전 인덱스로 재할당한다.
			}
			
			if(intArr[pc] == keyValue) {
				return pc;
			}
			
			if(pc < 0) {
				return -1;
			}
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = 0, keyValue = 0, index = 0;
		int[] intArr = null;
		String message = "";
		
		System.out.print("요솟수: ");
		n = scanner.nextInt();
		
		intArr = new int[n];
		
		System.out.println("오름차순으로 입력하세요.");
		
		for (int i = 0; i < intArr.length; i++) {
			
			System.out.print("x[" + i + "]: ");
			int number = scanner.nextInt();
			
			if(i > 0 && number < intArr[i - 1]) {
				System.out.println("이전 요소보다 큰 값을 입력하세요.");
				i--;
				continue;
			}
			
			intArr[i] = number;
		}
		
		System.out.print("검색할 값: ");
		keyValue = scanner.nextInt();
		
		index = binSearch(intArr, keyValue);
		message = index == -1 ? "일치하는 값이 없습니다." : "그 값은 x[" + index + "]에 있습니다.";
		
		System.out.println(message);
		
		scanner.close();
	}

}
