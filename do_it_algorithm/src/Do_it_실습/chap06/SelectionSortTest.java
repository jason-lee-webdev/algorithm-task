package Do_it_실습.chap06;

import java.util.Arrays;

//단순 선택 정렬은 가장 작은 요소를 맨 앞으로 이동하고,
//두 번째 작은 요소는 맨 앞에서 두 번째로 이동하는 작업을 반복하는 알고리즘 입니다.
//단순 선택 정렬을 수행하여 배열의 요소를 오름차순으로 정렬하시오.

public class SelectionSortTest {
	
	public static void main(String[] args) {
		int[] a = {6, 4, 1, 7, 3, 9, 8};
		
		SelectionSort.selectionSort(a, a.length);
		
		Arrays.stream(a).forEach(element -> System.out.print(element + " "));
	}
	
	
}
