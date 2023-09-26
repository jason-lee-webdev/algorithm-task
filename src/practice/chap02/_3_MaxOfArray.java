package practice.chap02;

import java.util.Scanner;

public class _3_MaxOfArray {

//	배열 요소의 최대값을 출력한다.
//	배열 요소와 배열의 길이는 입력을 받는다.
	
//	[실행 결과]
//	키의 최대값을 구합니다.
//	사람 수: 5
//	height[0]: 172
//	height[1]: 153
//	height[2]: 192
//	height[3]: 140
//	height[4]: 165
//	최대값은 192입니다.
	
//	[답안 코드]
//	public static int maxOf(int[] a) {
//		int max = a[0];
//		
//		for (int i = 1; i < a.length; i++) {
//			if(a[i] > max) {
//				max = a[i];
//			}
//		}
//		
//		return max;
//	}
	
	public static void main(String[] args) {
		
//		입력받은 배열의 길이만큼 반복문을 돌린다.
//		반복문 안에서 입력을 받음과 동시에 최대값 구한다.
		
//		[결론]
//		입력을 받는 건 main() 메소드에서 처리하고 핵심 로직은 메소드로 구현한다.
		
//		[내가 작성한 코드]
		Scanner scan = new Scanner(System.in);
		int inputHeight = 0, maxHeight = 0;
		int[] height = null;
		
		System.out.println("키의 최대값을 구합니다.");
		
		System.out.print("사람 수: ");
		height = new int[scan.nextInt()];
		
		do {
			System.out.print("height[0]: ");
			inputHeight = scan.nextInt();
		} while(!(inputHeight > 0));
		
		height[0] = inputHeight;
		maxHeight = inputHeight;
		
		for (int i = 1; i < height.length; i++) {
			System.out.print("height[" + i + "]: ");
			inputHeight = scan.nextInt();
			
			if(inputHeight <= 0) {
				System.out.println("양의 정수로 키를 입력하세요.");
				i--;
				continue;
			}
			
			height[i] = inputHeight;
			
			if(maxHeight < height[i]) {
				maxHeight = height[i];
			}
			
		}
		
		System.out.println("최대값은 " + maxHeight + "입니다.");
		
		
//		[답안 코드]
//		Scanner scan = new Scanner(System.in);
//		int length = 0;
//		int[] height = null;
//		
//		System.out.println("키의 최대값을 구합니다.");
//		
//		System.out.print("사람 수: ");
//		length = scan.nextInt();
//		
//		height = new int[length];
//		
//		for (int i = 0; i < height.length; i++) {
//			System.out.print("height[" + i + "]: ");
//			height[i] = scan.nextInt();
//		}
//		
//		System.out.println("최대값은 " + maxOf(height) + "입니다.");
		
	}

}
