package practice.chap04.queue;

/*[문제와 로직]
Q1. 링 버퍼를 사용하여 큐를 구현하는 프로그램을 만들어라.
생성할 때 용량을 결정한느 고정 길이 큐이고 int형 데이터를 저장한다.

L1. 요소를 담는 자료구조로 배열(que)을 사용한다.
가장 먼저 담긴 요소의 인덱스를 가리키는 변수(front)를 사용한다.
다음 요소를 담을 공간의 인덱스를 가리키는 변수(rear)를 사용한다.
큐에 담을 수 있는 요소의 최대수를 가리키는 변수(capacity)를 사용한다.
현재 큐에 담긴 요소의 개수를 가리키는 변수(num)을 사용한다.

Q2. 큐에 데이터를 인큐(enque)하고 인큐한 값을 그대로 반환하는 메서드를 구현한다.

L2. 인덱스가 rear인 배열의 요소에 값을 저장한다.
rear를 1증가한다.
num을 1증가한다.
만약 큐가 꽉찼을 경우 OverflowIntQueueException을 발생시킨다.
rear가 capacity보다 크거나 같으면 rear에 0을 할당한다.

Q3. 큐에서 데이터를 디큐(deque)하고 그 값을 반환하는 메서드를 구현한다.

L3. 만약 비어 있는 큐일 경우 EmptyIntQueueException을 발생시킨다.
인덱스가 front인 배열의 요소의 값을 반환한다.
front를 1증가한다.
만약 front가 que의 인덱스 범위를 벗어날 경우 front에 0을 할당한다.
num을 1감소한다.*/

/*[책과 코드 비교 후 피드백]
- 나는 생성자 선언 시 필드의 값을 초기화 하는 코드를 각각 작성하였다.
대입연산자의 좌측 피연산자는 우측 피연산자의 값과 동치이므로 동일한 값을 여러 변수에 대입한다면 하나의 문으로 작성할 수 있다.

- 나는 생성자 선언 시 OutOfMemory 에러를 예외 처리하지 않았다.
다양한 오류 상황을 상상하는 습관이 필요하다.

- 나는 enque 메서드 선언 블럭에서 큐가 가득찼을 경우 OverflowIntQueueException을 발생만 시키고 예외 처리를 하지 않았다.
메서드 내에서 예외 처리를 하지 않을 계획이면 예외를 메서드를 호출한 곳으로 떠넘기는 코드(throws)를 작성한다.

- 증감연산자를 사용하면 2개의 실행문을 1개로 줄일 수 있다.
- 조건식 작성 시 범위를 넓게 생각한다.*/

public class IntQueue {
	private int[] que;
	private int front;
	private int rear;
	private int capacity;
	private int num;
	
	public IntQueue(int capacity) {
		this.capacity = capacity;
		front = rear = num = 0;
		
		try {
			que = new int[capacity];
		} catch (OutOfMemoryError e) {
			capacity = 0;
		}
	}
	/*[내가 작성한 코드]
	public IntQueue(int capacity) {
		que = new int[capacity];
	  	this.capacity = capacity;
	  	front = 0; rear = 0;
	  	num = 0;
	}*/
	
	public class EmptyIntQueueException extends RuntimeException {
		public EmptyIntQueueException() { ; }
	}
	
	public class OverflowIntQueueException extends RuntimeException {
		public OverflowIntQueueException() { ; }
	}
	
	public int enque(int value) throws OverflowIntQueueException {
		/*[내가 작성한 코드]
		public int enque(int value) {*/
		
		if(num >= capacity) {
			throw new OverflowIntQueueException();
		}
		
		que[rear++] = value;
		num++;
		
		if(rear >= capacity) {
			rear = 0;
		}
		
		return value;
	}
	
	// deque 메소드는 인자값이 필요없다.
	public int deque() throws EmptyIntQueueException {
		if(num <= 0) {
			throw new EmptyIntQueueException();
		}
		
		int returnValue = que[front++];
		
		num--;
		
		if(front >= capacity) {
			front = 0;
		}
		
		return returnValue;
	}
	
	/* [과제] 큐에서 가장 먼저 들어온 데이터를 출력하는 메서드를 구현한다.
	
	[로직] 데이터가 저장되어 있는 배열의 인덱스가 front인 요소의 값을 출력한다.
	예외-저장된 데이터가 없을 경우 EmptyIntQueueException을 발생시킨다. */
	public int peek() throws EmptyIntQueueException {
		if(num <= 0) {
			throw new EmptyIntQueueException();
		}
		
		return que[front];
	}
	
	// 큐에 담겨있는 데이터의 수를 반환하는 메소드
	public int getNum() {
		return this.num;
	}
	
	// 큐를 비우는 메소드
	public void empty() {
		front = rear = num = 0;
	}
	
	// 큐에서 x를 검색하여 인덱스(찾지 못하면 -1)을 반환하는 메소드
	public int indexOf(int x) {
		int result = -1;
		
		// 배열 순회시 사용할 인덱스
		int index = 0;
		
		for(int i = 0; i < num; i++) {
			index = (front + i) % capacity;
			
			if(que[index] == x) {
				result = index;
			}
		}
		
		return result;
	}
	
	// 큐의 용량을 반환하는 메소드
	public int getCapacity() {
		return this.capacity;
	}
	
	// 큐가 비어 있나요?
	public boolean isEmpty() {
		return num <= 0;
	}
	
	// 큐가 가득 찼나요?
	public boolean isFull() {
		return num >= capacity;
	}
	
	// 큐 안의 모든 데이터를 프런트에서 리어 순으로 출력한다.
	public void printAll() {
		if(num <= 0) {
			System.out.println("큐가 비어있습니다.");
			return;
		}
		
		for(int i = 0; i < num; i++) {
			int index = (front + i) % capacity;
			System.out.print(que[index] + " ");
		}
		
		System.out.println();
	}
	
}























