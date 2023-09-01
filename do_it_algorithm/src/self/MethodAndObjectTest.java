package self;

import java.util.Arrays;

public class MethodAndObjectTest {

	static void newArray(int[] a) {
		
//		a = new int[] {10, 9, 8, 7, 6};
//		매개 변수 a에 새로운 배열을 저장하면
//		메소드 호출 시 참조했던 배열과 연결고리가 끊긴다.
//		매개 변수 a에 저장된 배열은 메소드에서 리턴하지 않는 이상
//		메소드 밖에서 사용할 수 없다.
		
//		[결론]
//		메소드 호출 시 전달받은 객체를 수정하고자 할 땐 매개변수를 통해 직접 변경한다.
//		메소드 내부에서 생성한 객체를 메소드 호출한 곳에서 사용하고 싶다면 리턴값으로 객체를 준다.
		
		a[4] = 4;
	}
	
	public static void main(String[] args) {

		int[] a = new int[5];
		
		a[0] = 0;
		a[1] = 1;
		a[2] = 2;
		a[3] = 3;
		
		System.out.println(Arrays.toString(a));
		
		newArray(a);
		
		System.out.println(Arrays.toString(a));
	}

}
