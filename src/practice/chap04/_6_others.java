package practice.chap04;

import java.awt.Stroke;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

import practice.chap04._2_pushPop.OverflowIntStackException;

/*[문제]
- 스택의 용량을 반환하는 메서드를 구현한다.

- 현재 스택에 쌓여 있는 데이터 개수를 반환하는 메서드를 구현한다.

- 스택이 비어있는지 검사하는 메서드를 구현한다.

- 스택이 가득 찼는지 검사하는 메서드를 구현한다.

- 스택 안에 있는 모든 데이터를 출력하는 메서드를 구현한다.(바닥부터 꼭대기순으로)*/

/*[로직]
- capacity 필드를 리턴한다.

- pointer 보다 1 적은 값을 리턴한다.

- pointer가 0이면 true를 반환한다.
pointer가 0보다 크면 true를 반환한다.

- pointer가 capacity와 같으면 true를 반환한다.
pointer가 capacity보다 작으면 true를 반환한다.

- storage를 0부터 pointer보다 1 적은 값까지 순회하며 항목을 출력한다.
빈 스택일 경우 아무것도 출력하지 않는다.*/

/*[코드 작성 이후 책의 코드와 나의 코드 비교]
- 나는 조건 연산식을 값으로 보지 않았다.
책은 조건 연산식을 값으로 보고 return 문에 조건 연산식을 작성했다.

- 나는 스택 안에 있는 모든 데이터를 출력하는 메서드를 구현할 때 빈 스택일 경우 아무것도 출력하지 않았다.
책은 빈 스택일 경우 "스택이 비어 있습니다."를 출력했다.*/

/*[결론]
- 조건 연산식은 값으로 볼 줄 알아야한다.

- 빈문자열을 출력하는 것보단 뭐라도 출력하는 것이 친절한 코드다.*/

class _6_others {
	private int[] storage;
	private int capacity;
	private int pointer;

	public class EmptyIntStackException extends RuntimeException {
		public EmptyIntStackException() {
			;
		}

		public EmptyIntStackException(String message) {
			super(message);
		}
	}

	public class OverflowIntStackException extends RuntimeException {
		public OverflowIntStackException() {
			;
		}

		public OverflowIntStackException(String message) {
			super(message);
		}
	}

	public _6_others(int size) {
		try {
			storage = new int[size];
		} catch (OutOfMemoryError e) {
			capacity = 0;
		}

		capacity = size;
		pointer = 0;
	}

//	1. 스택의 용량을 반환하는 메서드를 구현한다.
	public int getCapacity() {
		return capacity;
	}

//	2. 현재 스택에 쌓여 있는 데이터 개수를 반환하는 메서드를 구현한다.
	public int size() {
		return pointer - 1;
	}

//	3. 스택이 비어있는지 검사하는 메서드를 구현한다.
	public boolean isEmpty() {
		return pointer <= 0;
	}

	/* [내가 작성한 코드]
	public boolean isEmpty() {
		boolean result = false;
		
		if(pointer == 0) {
			result = true;
		}
		
		return result;
	}*/
	 

//	4. 스택이 가득 찼는지 검사하는 메서드를 구현한다.
	public boolean isFull() {
		return pointer >= capacity;
	}

	/* [내가 작성한 코드]
	public boolean isFull() {
		boolean result = false;

		if (pointer == capacity) {
			result = true;
		}

		return result;
	}*/

//	5. 스택 안에 있는 모든 데이터를 출력하는 메서드를 구현한다.
	public void dump() {
		if(pointer <= 0) {
			System.out.println("스택이 비어 있습니다.");
		} else {
			for(int i = 0; i < pointer; i++) {
				System.out.print(storage[i] + " ");
			}
			System.out.println();
		}
	}
	
	/*[내가 작성한 코드]
	public void dump() {
		String result = "";

		for (int i = 0; i <= pointer - 1; i++) {
			result += storage[i] + "";
		}

		System.out.println(result);
	}*/

}