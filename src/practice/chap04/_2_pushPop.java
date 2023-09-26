package practice.chap04;

import java.awt.Stroke;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/*[문제]
스택에 데이터를 저장하는 메서드를 구현한다
스택의 꼭대기에 있는 데이터를 제거하고 그 값을 반환하는 메서들 구현한다.*/

/*[로직]
pubilc int push(int data) {
	if(스택이 꽉 찼을 경우) {
		OverflowIntStackException 예외를 발생시킨다.
	}
	
	데이터가 저장된 배열에서 인덱스가 pointer인 항목에 data를 할당한다.
	pointer를 1 증가한다.
	방금 저장한 값을 리턴한다.
}

public int pop() {
	if(스택이 비어 있을 경우) {
		EmptyIntStackException 예외를 발생시킨다.
	}
	
	pointer를 1 감소한다.
	데이터가 저장된 배열에서 인덱스가 pointer인 항목의 데이터를 읽어들인다.
	데이터가 저장된 배열에서 인덱스가 pointer인 항목을 초기화한다.
	읽어들인 데이터를 리턴한다.
}*/

/*[코드 작성 이후 책의 코드와 나의 코드 비교]
1. 나는 pop 메서드에 추출한 데이터가 위치했던 배열 항목에 0을 할당했다.
책은 pop 메서드에 추출한 데이터가 위치했던 배열 항목에 어떠한 값도 할당하지 않았다.

2. 나는 pop 메서드와 push 메서드에서 발생하는 예외를 throws 하지 않았다.
책은 pop 메서드와 push 메서드에서 발생하는 예외를 throws 하였다.*/

/*[결론]
1. 추출한 데이터를 제거하지 않아도 해당 위치에 새로운 값이 할당되면 값이 덮어쓰여진다.
2. 예외가 발생되면 해당 메소드에서 예외 처리를 하지 않는 이상 예외를 던진다.*/

class _2_pushPop {
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
	
	public _2_pushPop(int size) {
		try {
			storage = new int[size];
		} catch (OutOfMemoryError e) {
			capacity = 0;
		}
		
		capacity = size;
		pointer = 0;
	}
	
	public int push(int data) throws OverflowIntStackException { // public int push(int data) {
		if(pointer >= capacity) {
			throw new OverflowIntStackException("스택이 가득 찼습니다.");
		}
		
		return storage[pointer++] = data;
	}
	
	public int pop() throws EmptyIntStackException { // public int pop() {
		if(pointer <= 0) {
			throw new EmptyIntStackException("스택이 비어 있습니다.");
		}
		
		int data = storage[--pointer];
		
		storage[pointer] = 0;
		
		return data;
	}
}