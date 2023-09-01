package 연습문제.chap02;

import java.util.Random;
import java.util.Scanner;

public class _1_MaxOfArrayRand2 {

//	배열 요소의 최댓값을 출력한다.
//	값을 난수로 생성한다.
//	난수의 범위는 100이상 190미만이다.
//	사람 수도 난수로 생성한다.
//	난수의 범위는 1이상 20이하이다.
	
//	[실행 결과]
//	키의 최대값을 구합니다.
//	사람 수는 5명입니다.
//	키는 다음과 같습니다.
//	height[0]: 172
//	height[1]: 153
//	height[2]: 192
//	height[3]: 140
//	height[4]: 165
//	최대값은 192입니다.
	
	public static int maxOf(int[] a) {
		int max = a[0];
		
		for (int i = 1; i < a.length; i++) {
			if(a[i] > max) {
				max = a[i];
			}
		}
		
		return max;
	}
	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		int[] height = null;
		
		System.out.println("키의 최대값을 구합니다.");
		
		height = new int[1 + rand.nextInt(20)];
		
		System.out.println("사람 수는 " + height.length + "명입니다.");
		
		System.out.println("키는 다음과 같습니다.");
		for (int i = 0; i < height.length; i++) {
			height[i]  = 100 + rand.nextInt(90);
			System.out.println("height[" + i + "]: " + height[i]);
		}
		
		System.out.println("최대값은 " + maxOf(height) + "입니다.");
		
	}

}
