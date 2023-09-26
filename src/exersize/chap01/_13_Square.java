package exersize.chap01;

public class _13_Square {
	
//	구구단 곱셈표를 변형하여 곱셈이 아니라 덧셈을 출력하는 프로그램을 작성하시오.
//	표의 위쪽과 왼쪽을 더하는 수를 출력하세요.
	
//	[실행 결과]
//		|	1	2	3	4	5	6	7	8	9
//---+----------------------------
//1	|	2	3 ...						10
//...
//9	|	10	11 ...						18
	
	public static void main(String[] args) {
		
		System.out.print("\t|");
		for (int i = 1; i <= 9; i++) {
			System.out.print("\t" + i);
		}
		System.out.println();
		
		System.out.println("------+---------------------------------------------------------");
		
		for(int i = 1; i <= 9; i++) {
			System.out.print(i + "\t|");
			for(int j = 1; j <= 9; j++) {
				System.out.print("\t" + (i + j));
			}
			System.out.println();
		}
		
	}

}