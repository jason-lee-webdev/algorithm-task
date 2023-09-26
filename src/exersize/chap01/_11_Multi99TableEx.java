package exersize.chap01;

public class _11_Multi99TableEx {
	
//	아래의 결과와 같이 위쪽과 왼쪽에 곱하는 수가 있는 구구단 곱셈표를 출력하는 프로그램을 작성하세요.
//	구분선은 수직선(|), 마이너스(-), 플러스(+) 기호를 사용하세요.
	
//	[실행 결과]
//		|	1	2	3	4	5	6	7	8	9
//	---+----------------------------
//	1	|	1	2 ...						9
//	...
//	9	|	9	18 ...						81
	
	public static void main(String[] args) {
		
//		[결론]
//		사소한 코드라도 반복할 거리를 찾는다.
		
//		[내가 작성한 코드]
		System.out.println("\t|\t1\t2\t3\t4\t5\t6\t7\t8\t9");
		
//		[답안 코드]
//		System.out.print("\t|");
//		for (int i = 1; i <= 9; i++) {
//			System.out.print("\t" + i);
//		}
//		System.out.println();
		
		System.out.println("------+---------------------------------------------------------");
		
		for(int i = 1; i <= 9; i++) {
			System.out.print(i + "\t|");
			for(int j = 1; j <= 9; j++) {
				System.out.print("\t" + i * j);
			}
			System.out.println();
		}
		
	}

}