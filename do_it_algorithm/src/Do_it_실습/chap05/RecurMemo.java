package Do_it_실습.chap05;

//메모화 기법을 사용하여 아래의 코드를 구현하라
//void recur(n) {
//    if(n > 0) {
//        recur(n - 1);
//        System.out.println(n);
//        recur(n - 2);
//    }
//}

public class RecurMemo {
	public void recur(int n) {
		String[] memo = null;
		
		if(n >= 0 && n >= n) {
			memo = new String[n + 1];
			memo[0] = "";
		}
		
		if(n > 0) {
			recur(n - 1);
			
			if(memo[n] == null) {
				memo[n] = memo[n - 1] + "\n" + String.valueOf(n);
			}
			
			recur(n - 2);
		}
		
		
		
		
		
	}
	
	
}
