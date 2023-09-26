package practice.chap03;

import java.util.Arrays;
import java.util.Scanner;

// [문제]
// Array.binarySearch() 메소드를 사용하여 이진검색을 한다.

//[실행 결과]
//요솟수: 7
//오름차순으로 입력하세요
//x[0]: 15
//x[1]: 27
//x[2]: 39
//x[3]: 77
//x[4]: 92
//x[5]: 108
//x[6]: 121
//검색할 값: 39
//그 값은 x[2]에 있습니다.

// [결론]
// 표준 라이브러리를 활용하면 복잡한 코드도 메소드 호출로 끝낼 수 있다.

public class _5_BinarySearchTester {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = 0, keyValue = 0, resultIndex = 0;
		int[] intArr = null;
		
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
		
		resultIndex = Arrays.binarySearch(intArr, keyValue); // Arrays.binarySearch() 메소드를 호출한다.
		
		if(resultIndex < 0) {
			System.out.println("일치하는 값이 없습니다.");
		} else {
			System.out.println("그 값은 x[" + resultIndex + "]에 있습니다.");
		}
		
		scanner.close();
	}

}












