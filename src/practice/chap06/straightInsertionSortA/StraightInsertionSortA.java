package practice.chap06.straightInsertionSortA;

//단순 삽입 정렬은 선택한 요소를 그보다 앞쪽의 알맞은 위치에 '삽입하는' 작업을 반복하여 정렬하는 알고리즘입니다.
//
//단순 삽입 정렬은 트럼프 카드를 한 줄로 늘어놓을 때 사용하는 방법과 비슷한 방법의 알고리즘입니다. 다음 배열을 예로 들어 살펴보겠습니다.
//{6, 4, 1, 7, 3, 9, 8}
//단순 삽입 정렬은 두번째 요소부터 선택하여 진행합니다. 이때 4는 6보다 앞쪽에 위치해야하므로 앞쪽에 삽입합니다. 이에 따라 6을 오른쪽으로 옮기면 다음처럼 됩니다.
//{4, 6, 1, 7, 3, 9, 8}
//
//이제 3번째 요소 1을 선택해 앞쪽에 삽입합니다. 이후에도 계속해서 같은 작업을 수행합니다.
//
//단순 삽입 정렬을 수행하여 배열의 요소를 오름차순으로 정렬하시오.

public class StraightInsertionSortA {

	public static void straightInsertionSort(int[] a, int n) {
		for(int i = 1; i < n; i++) { // i : 선택한 요소의 인덱스
			int selectedValue = a[i]; 
			int j = i - 1; // j : 선택한 요소와 비교할 요소들 중 가장 먼저 비교할 요소의 인덱스
			
			while(true) {
				
				// 더 이상 비교할 요소가 없을 경우 가장 앞에 선택한 요소의 값을 저장한다.
				if(j < 0) {
					a[0] = selectedValue;
					break;
				}
				
				// 선택한 요소와 이전 요소들을 비교하여 이전 요소가 클 경우 이전 요소의 값을 한 칸 뒤에 저장한다.
				// 그 반대의 경우 해당 위치에 선택한 요소의 값을 저장한다.
				if(a[j] > selectedValue) {
					a[j + 1] = a[j];
				} else {
					a[j + 1] = selectedValue;
					break;
				}
				
				j--;
			}
		}
		
		
		
	}
}
