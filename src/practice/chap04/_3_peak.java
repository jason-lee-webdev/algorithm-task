package practice.chap04;

import java.awt.Stroke;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/*[문제]
스택에서 가장 위에 있는 데이터를 조회한다.
만약 스택이 비어 있을 시 EmptyIntStackException 예외를 발생한다.*/

/*[로직]
public int peek() {
	if(스택이 비어 있을 경우) {
		EmptyIntStackException 예외를 발생시킨다.
	}
	
	스택의 데이터를 저장하고 있는 배열에서 인덱스가 pointer 보다 1작은 값인 항목을 리턴한다. 
}*/

/*[코드 작성 이후 책의 코드와 나의 코드 비교]
1. */

/*[결론]
1. */

/*[내가 작성한 코드]*/
class _3_peak {
	private int[] storage;
	private int capacity;
	private int pointer;
	
	public class EmptyIntStackException extends RuntimeException {
		public EmptyIntStackException() { ; }
		
		public EmptyIntStackException(String message) {
			super(message);
		}
	}
	
	public class OverflowIntStackException extends RuntimeException {
		public OverflowIntStackException() { ; }
		
		public OverflowIntStackException(String message) {
			super(message);
		}
	}
	
	public _3_peak(int size) {
		try {
			storage = new int[size];
		} catch (OutOfMemoryError e) {
			capacity = 0;
		}
		
		capacity = size;
		pointer = 0;
	}
	
	public int peek() throws EmptyIntStackException {
		if(pointer >= capacity) {
			throw new EmptyIntStackException("스택이 비어있습니다.");
		}
		
		return storage[pointer - 1];
	}
}