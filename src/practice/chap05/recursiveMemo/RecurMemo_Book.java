package practice.chap05.recursiveMemo;

//메모화 기법을 사용하여 아래의 코드를 구현하라
//void recur(n) {
//    if(n > 0) {
//        recur(n - 1);
//        System.out.println(n);
//        recur(n - 2);
//    }
//}
//아래의 코드는 책에 작성된 코드이다.

public class RecurMemo_Book {
	private String[] memo;
	
	public void recur(int n) {
		if(memo[n + 1] != null) { // 메모가 존재하면 메모를 출력한다.
			System.out.println(memo[n + 1]);
		} else { // 메모가 존재하지 않을 때
			if(n > 0) { // 기존 방식대로 실행
				recur(n - 1);
				System.out.println(n);
				recur(n - 2);
				memo[n + 1] = memo[n] + n + "\n" + memo[n - 1]; // 메모를 한다.
			} else {
				memo[n + 1] = ""; // n이 -1 또는 0일 때는 빈문자열을 메모한다.
			}
		}
	}
}
