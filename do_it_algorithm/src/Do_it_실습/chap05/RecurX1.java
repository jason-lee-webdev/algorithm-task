package Do_it_실습.chap05;

//recur 메소드의 꼬리에서 재귀 호출하는 메소드 recur(n - 2)를
//비재귀적으로 구현한다.

public class RecurX1 {
	static void recur(int n) {
		while(n > 0) {
			recur(n - 1);
			System.out.println(n);
			n = n -2;
		}
	}
	
	public static void main(String[] args) {
		recur(4);
	}

}
