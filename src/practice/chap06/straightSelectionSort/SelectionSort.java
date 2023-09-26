package practice.chap06.straightSelectionSort;

//단순 선택 정렬은 가장 작은 요소를 맨 앞으로 이동하고,
//두 번째 작은 요소는 맨 앞에서 두 번째로 이동하는 작업을 반복하는 알고리즘 입니다.
//단순 선택 정렬을 수행하여 배열의 요소를 오름차순으로 정렬하시오.

public class SelectionSort {
	public static void selectionSort(int[] a, int n) {
		for(int i = 0; i < n - 1; i++) { // i : 정렬되지 않은 요소들 중 가장 앞쪽에 위치한 요소의 인덱스
			
			int smallestNumberIndex = i; // smallestNumberIndex : 정렬되지 않은 요소들 중 가장 앞에 위치한 요소를 크기 비교의 시작값으로 설정한다. 
			
			// 정렬되지 않은 요소들 중 가장 작은 요소의 인덱스를 찾는다.
			
			for(int j = i + 1; j < n; j++) {
				if(a[smallestNumberIndex] > a[j] ) {
					smallestNumberIndex = j;
				}
			}
			
			// 정렬되지 않은 요소들 중 가장 앞 요소와 가장 작은 요소의 위치를 교환한다. 
			swap(a, smallestNumberIndex, i);
		}
	}
	
	public static void swap(int[] a, int idx1, int idx2) {
		int temp = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = temp;
	}
	

}
