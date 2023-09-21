package Do_it_실습.chap06;

// 버블 정렬을 구현한다.

public class BubbleSortA2 {

	public static void bubbleSort(int[] intArr) {
		int length = intArr.length;
		
		for(int i = 0; i < length - 1; i++) {
			for(int j = length - 1; j - 1 >= 0; j--) {
				if(intArr[j - 1] > intArr[j]) {
					int temp = intArr[j];
					intArr[j] = intArr[j - 1];
					intArr[j - 1] = temp;
				}
			}
		}
	} 

}
