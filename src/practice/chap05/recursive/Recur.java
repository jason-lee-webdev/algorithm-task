package practice.chap05.recursive;

// 재귀 알고리즘을 분석한다.
// 하향식 분석과 상향식 분석을 한다.

public class Recur {
	static void recur(int n) {
		if(n > 0) {
			recur(n-1);
			System.out.println(n);
			recur(n-2);
		}
	}
	
	public static void main(String[] args) {
		recur(3);
	}

}
