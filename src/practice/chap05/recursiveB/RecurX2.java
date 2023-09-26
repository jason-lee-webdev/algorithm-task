package practice.chap05.recursiveB;

//recur 메소드를 스택을 사용하여 비재귀적으로 구현하라.

import practice.chap05.IntStack;

public class RecurX2 {
	static void recur(int n) {	
		while(n > 0) {
			int temp = n;
			
			IntStack intStack = new IntStack(n - 1);
			
			while(n > 0) {
				intStack.push(n - 1);
				n = n - 1;
			}
			
			// for (int i = 0; i < intStack.getNum(); i++)로 작성하면
			// pop()을 할 때 마다 num이 변화하므로 예상과 다른 반복문이 전개된다.
			for (int i = 0; i < intStack.getCapacity(); i++) {
				
				// 최초 입력되었던 값을 n에 저장한다.
				System.out.println(intStack.pop());
			}
			
			System.out.println(n = temp);
			
			n = n -2;
		}
	}
	
	public static void main(String[] args) {
		recur(4);
	}

}
