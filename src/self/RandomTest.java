package self;

import java.util.Random;

public class RandomTest {

	public static void main(String[] args) {

		Random rand = new Random(100);
		System.out.println(rand.nextInt());
		
		Random rand2 = new Random(100);
		System.out.println(rand2.nextInt());
//		seed가 동일하면 동일한 난수가 발생된다.
		
		Random rand3 = new Random();
		System.out.println(rand3.nextInt());
		
		Random rand4 = new Random();
		System.out.println(rand4.nextInt());
//		Random 객체 생성시 기본 생성자를 사용하면
//		Random 클래스의 다른 인스턴스와 겹치지 않도록 seed 값을 자동으로 결정한다.
	}

}
