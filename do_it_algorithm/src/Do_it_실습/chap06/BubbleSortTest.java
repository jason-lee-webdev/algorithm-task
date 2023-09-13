package Do_it_실습.chap06;

import java.util.Scanner;

public class BubbleSortTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] intArr = null;
		int passCount = 0;
		
		System.out.println("버블 정렬");
		
		System.out.print("요솟수 : ");
		
		try {
			intArr = new int[scanner.nextInt()];
			
			for(int i = 0; i < intArr.length; i++) {
				System.out.print("intArr[" + i + "] : ");
				intArr[i] = scanner.nextInt();
			}
			
			// BubbleSortA2 클래스의 bubbleSort 메소드를 테스트한다.
			// BubbleSortA2.bubbleSort(intArr);
			
			// BubblSortB 클래스의 bubbleSort 메소드를 테스트한다.
			passCount = BubbleSortB.bubbleSort(intArr);
			
			for(int i = 0; i < intArr.length; i++) {
				System.out.println("intArr[" + i + "] : " + intArr[i]);
			}
			
			System.out.println("패스 횟수 : " + passCount);

		} catch (Exception e) {
			System.out.println("올바른 입력 값이 아닙니다.");
		} finally {
			scanner.close();
		}
	}
}
