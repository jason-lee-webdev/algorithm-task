package practice.chap05.recursiveB;

//recur 메소드를 스택을 사용하여 비재귀적으로 구현하라.
//아래의 코드는 책에 실린 코드이다.

import practice.chap05.IntStack;

public class RecurX2_Book {
	static void recur(int n) {
		IntStack intStack = new IntStack(n);
		
		while(true) {
			if(n > 0) {
				intStack.push(n);
				n = n- 1;
				continue;
			}
			if(!intStack.isEmpty()) {
				n = intStack.pop();
				System.out.println(n); // 1
				n = n - 2;
				continue;
			}
			break;
		}
	}
	
	public static void main(String[] args) {
		recur(4);
	}

}
