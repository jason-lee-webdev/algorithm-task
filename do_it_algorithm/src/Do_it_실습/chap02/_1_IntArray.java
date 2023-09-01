package Do_it_실습.chap02;

public class _1_IntArray {
	
//	구성 요소의 자료형이 int형인 배열을 선언한다.
//	구성 요솟수는 5이다.
//	new에 의해 본체를 생성한다.
	
	public static void main(String[] args) {
		
		int[] a = new int[5];
		
		a[1] = 37; // a[1]에 37을 대입한다.
		a[2] = 51; // a[2]에 51을 대입한다.
		a[4] = a[1] * 2; // a[4]에 a[1] * 2, 곧 74를 대입한다.
		
		for (int i = 0; i < a.length; i++) {
			System.out.println("a[" + i + "] = " + a[i]);
		}
		
	}
	
}
