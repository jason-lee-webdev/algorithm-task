package Do_it_실습.chap04;

/*[문제]
스택이 해당 데이터를 포함하고 있는지, 포함되어 있다면 배열의 어디에 들어있는지를 조사하는 메서드를 구현한다.*/

/*[로직]
스택의 각 항목을 저장하고 있는 배열을 인덱스 pointer - 1부터 0까지 순회한다.
순회하면서 일치하는 항목이 있다면 해당 항목의 인덱스를 반환한다.
인덱스가 0인 항목까지 조회했음에도 일치하는 항목이 없다면 -1을 반환한다.*/

/*[코드 작성 이후 책의 코드와 나의 코드 비교]
1. 나는 스택이 비어있을 경우 pointer - 1의 값이 -1이 되므로 for문 이전에 해당 조건을 분기하였다.
책은 스택이 비어있을 경우 pointer - 1의 값이 -1이 되는 상황을 for문 안의 조건식에서 해결하였다.*/

/*[결론]
1. for문은 초기식 이후 조건식을 평가해 조건식의 평가값이 true인 경우에만 블럭 안의 코드를 실행한다.
for문 작성시 이 흐름에 유의한다.*/

class _5_indexOf {
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
	
	public _5_indexOf(int size) {
		try {
			storage = new int[size];
		} catch (OutOfMemoryError e) {
			capacity = 0;
		}
		
		capacity = size;
		pointer = 0;
	}
	
	public int indexOf(int value) {
		for(int i = pointer - 1; i >= 0; i--) {
			if(storage[i] == value) {
				return i;
			}
		}
		
		return -1;
	}
	
	/* [내가 작성한 코드]
	public int indexOf(int value) {
		if(pointer == 0) {
			return -1;
		}
		
		for(int i = pointer - 1; i >= 0; i--) {
			if(storage[i] == value) {
				return i;
			}
		}
		
		return -1;
	}*/
}