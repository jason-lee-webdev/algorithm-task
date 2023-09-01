package 보충수업.chapter03;

import 보충수업.chapter03._3_GenericClassTester.GenericClass;

/*[문제]
제네릭 클래스를 선언하고 main 메서드에서 객체를 생성하고 메소드를 호출한다.*/

/*[결론]
제네릭 클래스(인터페이스)는 컴파일 시점에서 멤버들에 작성해야 할 자료형을 결정짓는다.
제네릭 클래스(인터페이스)는 한번의 선언으로 파라미터의 타입별 클래스(인터페이스)가 선언된다는 장점이 있다. */
public class _3_GenericClassTester {
	
	static class GenericClass<T> {
		// 필드의 타입에 타입 파라미터 작성한다
		private T field;
		
		// 생성자의 매개변수에 타입 파라미터 작성한다
		public GenericClass(T t) {
			this.field = t;
		}
		
		// 메서드의 리턴 타입에 타입 파라미터를 작성한다
		public T getField() {
			return this.field;
		}
	}

	public static void main(String[] args) {
		// 타입 파라미터로 Integer를 작성한다.
		GenericClass<Integer> i = new GenericClass<Integer>(Integer.valueOf(10));
		
		// 타입 파라미터로 String을 작성한다.
		GenericClass<String> s = new GenericClass<String>("십");
		
		System.out.println(i.getField());
		System.out.println(s.getField());
	}

}
