package Do_it_실습.chap05;

public class IntStack {
	private int pointer;
	private int num;
	private int[] stack;
	private int capacity;
	
	public IntStack(int n) {
		stack = new int[n];
		num = 0;
		pointer = 0;
		capacity = n;
	}
	
	public void push(int value) throws FullIntStackException {
		if(num >= capacity) {
			throw new FullIntStackException();
		}
		
		num++;
		stack[pointer++] = value;
	}
	
	public int pop() throws EmptyIntStackException {
		if(num <= 0) {
			throw new EmptyIntStackException();
		}
		
		num--;
		return stack[--pointer];
	}
	
	public int getNum() {
		return num;
	}
	
	public int getCapacity() {
		return capacity;
	}
	
	public boolean isEmpty() {
		return num <= 0;
	}
}
