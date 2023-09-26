package practice.chap06.bubbleSortC;

import java.util.Arrays;

//각 패스에서 비교, 교환을 하다가 어떤 시점 이후에 교환하지 않는다면
//그보다 앞쪽의 요소는 이미 정렬을 마친 상태라고 생각해도 좋습니다.
//이를 활용하여 버블 정렬을 업그레드 하시오.

public class BubbleSortC {

	public static void bubbleSortC(int[] a) {
		int n = a.length; // 배열의 길이
		int k = 0; // a[k] : 이전의 요소는 정렬을 마친 상태이다.
		
		// 인덱스가 n - 1 이전의 요소까지 정렬을 수행한다.
		while(k < n - 1) {
			int last = n - 1; // 마지막으로 변경된 인덱스. 매 패스마다 초기화한다.
			
			// 가장 마지막 요소부터 정렬을 마친 요소 직전까지 비교교환한다.
			// 교환이 이루어지면 교환이 이루어진 인덱스를 기록한다.
			for(int j = n - 1; j > k; j--) {
				if(a[j - 1] > a[j]) {
					swap(a, j - 1, j);
					last = j;
				}
			}
			
			// 배열을 출력한다.
			print(a);
			
			// 마지막으로 교환이 이루어진 인덱스 이전 요소들은 정렬이 완료된 상태이므로
			// k에 last를 저장한다.
			k = last;
		}
	}
	
	// 인덱스가 idx1인 요소와 idx2인 요소를 교환한다.
	public static void swap(int[] a, int idx1, int idx2) {
		int temp = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = temp;
	}
	
	public static void print(int[] a) {
		Arrays.stream(a).forEach((number) -> {
			System.out.print(number + " ");
		});
		System.out.println();
	}
	
}
