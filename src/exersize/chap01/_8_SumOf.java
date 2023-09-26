package exersize.chap01;

public class _8_SumOf {
	
//	정수 a, b를 포함하여 그 사이의 모든 정수의 합을 구하여 반환하는 메소드를 작성하세요.
//	static int sumOf(int a, int b)
	
//	a와 b의 대소관계에 상관없이 합을 구하세요.
//	예를 들어 a가 3, b가 5이면 12를, a가 6, b가 4이면 15를 반환합니다.
	
//	[내가 작성한 코드]
	public static int sumOf(int a, int b) {
		
		int sum = 0;
		
		if(a < b) {
			sum = (int)((a + b) * ((b - a + 1) / 2.0));
		} else if(a > b) {
			sum = (int)((a + b) * ((a - b + 1) / 2.0));
		} else {
			sum = a;
		}
		
		return sum;
		
	}
	
//	[답안 코드]
//	public static int sumOf(int a, int b) {
//		
//		int min, max, sum = 0;
//		
//		if(a <= b) {
//			min = a;
//			max = b;
//		} else {
//			min = b;
//			max = a;
//		}
//		
//		for(int i = min; i <= max; i++) {
//			sum += i;
//		}
//		
//		return sum;
//	}
	
	public static void main(String[] args) {
		
		System.out.println(_8_SumOf.sumOf(3, 5));
		System.out.println(_8_SumOf.sumOf(6, 4));
		System.out.println(_8_SumOf.sumOf(4, 4));
		
	}
}
