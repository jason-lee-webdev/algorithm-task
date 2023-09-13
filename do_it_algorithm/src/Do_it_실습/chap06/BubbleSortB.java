package Do_it_실습.chap06;

public class BubbleSortB {
	
	public static int bubbleSort(int[] intArr) {
		int length = intArr.length;
		int passCount = 0;
		
		for(int i = 0; i < length - 1; i++) {
			int changeCount = 0;
			
			for(int j = length - 1; j - 1 >= 0; j--) {	
				if(intArr[j - 1] > intArr[j]) {
					changeCount++;
					passCount++;
					
					int temp = intArr[j];
					intArr[j] = intArr[j - 1];
					intArr[j - 1] = temp;
				}
			}
			
			if(changeCount == 0) {
				break;
			}
		}
		
		return passCount;
	} 

}
