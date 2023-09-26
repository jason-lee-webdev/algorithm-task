package practice.chap03;

import java.util.Comparator;

//[문제]
//클래스 X 내부에서 COMPARATOR를 정의한다.

//[실행결과]
//없음

//[결론]
//Comparator<T> 인터페이스의 구현 클래스를 정적 멤버 클래스로 선언할 수 있다.

class _7_X {

	// Comparator 인터페이스와 compare 메서드를 구현한 클래스를 선언한다.
	private static class Comp implements Comparator<_7_X> {
		@Override
		public int compare(_7_X o1, _7_X o2) {
			// o1이 o2 보다 크면 양수를 반환한다.
			// o1이 o2 보다 작으면 음수를 반환한다.
			// o1이 o2 과 같으면 0을 반환한다.
			
			return 0;
		};
	} 
	
	// Comparator 인터페이스의 구현 객체를 생성하고 Comparator<T> 변수에 저장한다.
	public static final Comparator<_7_X> COMPARATOR = new Comp();
	
}
