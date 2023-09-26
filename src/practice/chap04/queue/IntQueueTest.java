package practice.chap04.queue;

public class IntQueueTest {

	public static void main(String[] args) {
		// IntQueue 객체를 생성한다.
		IntQueue intQueue = new IntQueue(10);
		
		// enque 메소드를 테스트한다.
		System.out.println("현재 삽입한 데이터의 값 : " + intQueue.enque(1));
		System.out.println("현재 큐에 들어있는 데이터의 양 : " + intQueue.getNum());
		System.out.println();
		
		System.out.println("현재 삽입한 데이터의 값 : " + intQueue.enque(2));
		System.out.println("현재 큐에 들어있는 데이터의 양 : " + intQueue.getNum());

		System.out.println();
		
		System.out.println("현재 삽입한 데이터의 값 : " + intQueue.enque(3));
		System.out.println("현재 큐에 들어있는 데이터의 양 : " + intQueue.getNum());
		System.out.println();
		
		// deque 메소드를 테스트한다.
		System.out.println("현재 삭제한 데이터의 값: " + intQueue.deque());
		System.out.println("현재 큐에 들어있는 데이터의 양 : " + intQueue.getNum());
		System.out.println();
		
		// peek 메소드를 테스트한다.
		System.out.println("가장 먼저 저장된 데이터의 값: " + intQueue.peek());
		System.out.println();
		
		// indexOf 메소드를 테스트한다.
		System.out.println("2의 인덱스 : " + intQueue.indexOf(2));
		System.out.println("3의 인덱스 : " + intQueue.indexOf(3));
		System.out.println("4의 인덱스 : " + intQueue.indexOf(4));
		System.out.println();
		
		// printAll 메소드를 테스트한다.
		intQueue.printAll();
		System.out.println();
		
		// empty 메소드를 테스트한다.
		intQueue.empty();
		intQueue.printAll();
	}

}
