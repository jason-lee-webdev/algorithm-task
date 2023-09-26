package practice.chap06.bubbleSortC;

// BubbleSortA 와 BubbleSortB 를 테스트한다.

import java.util.Scanner;

public class BubbleSortTestC {
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
			
			BubbleSortC.bubbleSortC(intArr);
			
		} catch (Exception e) {
			System.out.println("올바른 입력 값이 아닙니다.");
		} finally {
			scanner.close();
		}
	}
}
