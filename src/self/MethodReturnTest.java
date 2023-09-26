package self;

public class MethodReturnTest {

	public static void method(int inputNumber) {
		
		for(int i = 0; i < 10; i++) {
			if(i == inputNumber) {
				System.out.println(i);
				return;
//				반복문 안에서 return; 문을 실행하면 반복문을 빠져나와
//				메소드를 호출한 곳으로 돌아간다.
			}
			
			System.out.println(i);
		}		
	}
	
	public static void main(String[] args) {

		method(4);
		
	}

}
