package Do_it_실습.chap06;

//각 패스에서 비교, 교환을 하다가 어떤 시점 이후에 교환하지 않는다면
//그보다 앞쪽의 요소는 이미 정렬을 마친 상태라고 생각해도 좋습니다.
//이를 활용하여 버블 정렬을 업그레드 하시오.

public class BubbleSortC_Book {

	public static void bubbleSortC(int[] a, int n) {
		int k = 0; // a[k] 보다 앞쪽은 정렬을 마친 상태
		
		while(k < n - 1) {
			int last = n - 1; // 마지막으로 요소를 교환한 위치
			
			for(int j = n - 1; j > k; j--) {
				if(a[j - 1] > a[j]) {
					swap(a, j - 1, j);
					last = j;
				}
			}
			
			k = last;
		}
	}
	
	public static void swap(int[] a, int idx1, int idx2) {
		int temp = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = temp;
	}
}
