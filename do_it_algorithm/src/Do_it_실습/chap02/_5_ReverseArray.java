package Do_it_실습.chap02;

import java.util.Arrays;
import java.util.Scanner;

public class _5_ReverseArray {

//	배열 요소에 값을 읽어 들여 역순으로 정렬한다.
//	메서드 reverse는 매개변수로 전달받은 배열 a의 요소를 역순으로 정렬한다.
	
//	[실행 결과]
//	요솟수: 7
//	x[0]: 2
//	x[1]: 5
//	x[2]: 1
//	x[3]: 3
//	x[4]: 9
//	x[5]: 6
//	x[6]: 7
//	요소를 역순으로 정렬했습니다.
//	x = [7, 6, 9, 3, 1, 5, 2]
	
//	[결론]
//	메소드는 행위의 단위로 끊는다. (두 값을 교환하는 메소드와 배열의 요소를 역순으로 정렬하는 메소드)
	
//	메소드에서 외부에서 전달받은 객체의 참조를 사용한다면 객체를 리턴해줄 필요가 없다.
//	왜냐하면 메소드가 전달받는 값은 객체가 아니라 객체의 참조이기 때문이다.
	
//	메소드 선언 시 메소드가 할 일을 정확히 정한 뒤 메소드의 선언부를 작성한다.
//	예) 배열과 두 개의 인덱스값을 전달받아 두 개의 인덱스값에 해당하는 각 배열의 요소의 위치를 서로 변경하는 메소드
//	void swap(int[] a, int idx1, int idx2) {...}
	
//	[알고리즘]
//	길이가 n인 int형 배열
	
//	0번째 요소와 n - 1번째 요소의 위치를 서로 바꾼다.
//	1번째 요소와 n - 2번째 요소의 위치를 서로 바꾼다.
//	...
//	위의 과정을 n / 2번 반복한다.
	
//	int t = a[i];
//	a[i] = a[n - 1 - i];
//	a[n - 1 - i] = t;
	
//	[내가 작성한 코드]
	public static int[] reverse(int[] a) {
		
		for (int i = 0; i < a.length / 2; i++) {
			int t = a[i];
			a[i] = a[a.length - 1 - i];
			a[a.length - 1 - i] = t;
		}
		
		return a;
		
	}
	
//	[답안 코드]
//	public static void swap(int[] a, int idx1, int idx2) {
//		
//		int t = a[idx1];
//		a[idx1] = a[idx2];
//		a[idx2] = t;
//		
//	}
//	
//	public static void reverse(int[] a) {
//		
//		for (int i = 0; i < a.length / 2; i++) {
//			swap(a, i, a.length - 1 - i);
//		}
//		
//	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int length = 0;
		int[] x = null;
		
		System.out.print("요솟수: ");
		length = scan.nextInt();
		
		x = new int[length];
		
		for (int i = 0; i < x.length; i++) {
			System.out.print("x[" + i + "]: ");
			x[i]  = scan.nextInt();
		}
		
		reverse(x);
		
		System.out.println("요소를 역순으로 정렬했습니다.");
		
//		[내가 작성한 코드]
		String result = "";
		result += "x = [";
		for (int i = 0; i < x.length; i++) {
			result += x[i];
			
			if(i != x.length - 1) {
				result += ", ";
			}
		}
		result += "]";
		
		System.out.println(result);
		
//		[답안 코드]
//		System.out.println("x = " + Arrays.toString(x));
		
	}

}
