package Do_it_실습.chap02;

public class _2_IntArrayInit {

//	구성 요소의 자료형이 int형인 배열을 선언한다.
//	구성 요솟수는 5이다.
//	배열 초기화에 의해 생성한다.
	
	public static void main(String[] args) {

		int[] a = {1, 2, 3, 4, 5};
		
		for (int i = 0; i < a.length; i++) {
			System.out.println("a[" + i + "] = " + a[i]);
		}
		
	}

}
