package Do_it_실습.chap04;

/*[문제]
스택을 구현하는 프로그램을 만든다.
스택을 생성할 때 용량(스택에 쌓을 수 있는 최대 데이터 수)을 결정하는 고정 길이 스택을 만든다.
스택에 저장하는 값은 int형이다.*/

/*[로직]
필드
	데이터를 저장할 배열
	스택에 저장할 수 있는 최대 데이터의 수
	데이터를 저장할 곳의 위치
	
생성자
	매개값과 동일한 크기의 배열 생성
	스택에 저장할 수 있는 최대 데이터 수 0 할당
	데이터를 저장할 곳의 위치 0 할당*/

/*[코드 작성 이후 책의 코드와 나의 코드 비교]
1. 나는 생성자 호출 시 OutOfMemoryError 에러 발생 예외 처리 코드를 작성하지 않았다.
2. 나는 스택이 비어 있을 경우 발생시킬 예외 클래스 EmptyIntStackException을 선언하지 않았다.
3. 나는 스택이 꽉 찾을 경우 발생시킬 예외 클래스 OverflowIntStackException을 선언하지 않았다.*/

/*[결론]
1. 클래스 선언 시 클래스의 인스턴스를 사용하다 발생할 수 있는 예외를 미리 생각해서 예외 클래스를 선언한다.*/

/*[내가 작성한 코드]
class _1_intStack {
	
	private int[] storage;
	private int capacity;
	private int pointer;
	
	public _1_intStack(int size) {
		storage = new int[size];
		capacity = size;
		pointer = 0;
	}
}*/

/*[책에 작성된 코드]*/
class _1_intStack {
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
	
	public _1_intStack(int size) {
		try {
			storage = new int[size];
		} catch (OutOfMemoryError e) {
			capacity = 0;
			// ?? OutOfMemoryError 발생 시 storage에는 어떤 값이 들어있을까? ?/
		}
		
		capacity = size;
		pointer = 0;
	}
}














