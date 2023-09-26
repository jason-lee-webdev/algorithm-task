package 보충수업.chapter03;

//인스턴스를 생성할 때마다 각각의 인스턴스에 1, 2, 3, ...으로 연속하는 아이디를 부여하는 클래스를 선언한다.

//[실행 결과]
//a의 아이디: 1
//b의 아이디: 2
//부여한 아이디의 개수: 2

//[결론]
//클래스 메서드는 클래스 전체에 대한 처리 또는 클래스의 개별 인스턴스와 관계없는 처리를 할 때 사용한다.

class Id {
//	아이디를 몇 개 부여했는지에 대한 정보를 저장할 정적 필드를 선언한다.
	private static int counter = 0;

//	인스턴스 필드를 선언한다.
	private int id;

//	인스턴스를 생성할 때마다 id가 1씩 증가하도록 생성자를 선언한다.
	Id() {
		this.id = ++counter;
	}

//	정적 필드의 getter를 선언한다.
	static int getCount() {
		return counter;
	}

//	인스턴스 필드의 getter를 선언한다.
	int getId() {
		return this.id;
	}
}

public class _1_IdTester {

	public static void main(String[] args) {
		Id a = new Id();
		Id b = new Id();

		System.out.println("a의 아이디: " + a.getId());
		System.out.println("b의 아이디: " + b.getId());

		System.out.println("부여한 아이디의 개수: " + Id.getCount());
	}

}
