package practice.chap04;

import java.awt.Stroke;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/*[문제]
스택에 쌓여 있는 모든 데이터를 삭제하는 메서드를 구현한다.*/

/*[로직]
public void clear() {
	다음 항목이 들어갈 위치를 0으로 설정한다.
}
*/

/*[코드 작성 이후 책의 코드와 나의 코드 비교]
1. */

/*[결론]
1. */

/*[내가 작성한 코드]*/
class _4_clear {
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
	
	public _4_clear(int size) {
		try {
			storage = new int[size];
		} catch (OutOfMemoryError e) {
			capacity = 0;
		}
		
		capacity = size;
		pointer = 0;
	}
	
	public void clear() {
		pointer = 0;
	}
}