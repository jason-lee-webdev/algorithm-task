package Do_it_실습.chap04;

public class IntStack {

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
	
	public IntStack (int size) {
		try {
			storage = new int[size];
		} catch (OutOfMemoryError e) {
			capacity = 0;
		}
		
		capacity = size;
		pointer = 0;
	}
	
	public int push(int data) throws OverflowIntStackException {
		if(pointer >= capacity) {
			throw new OverflowIntStackException("스택이 가득 찼습니다.");
		}
		
		return storage[pointer++] = data;
	}
	
	public int pop() throws EmptyIntStackException {
		if(pointer <= 0) {
			throw new EmptyIntStackException("스택이 비어 있습니다.");
		}
		
		int data = storage[--pointer];
		
		storage[pointer] = 0;
		
		return data;
	}
	
	public int peek() throws EmptyIntStackException {
		if(pointer >= capacity) {
			throw new EmptyIntStackException("스택이 비어있습니다.");
		}
		
		return storage[pointer - 1];
	}
	
	public void clear() {
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
	
	public int getCapacity() {
		return capacity;
	}

	public int size() {
		return pointer - 1;
	}

	public boolean isEmpty() {
		return pointer <= 0;
	}

	public boolean isFull() {
		return pointer >= capacity;
	}

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
	
}
