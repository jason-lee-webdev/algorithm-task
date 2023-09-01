package Do_it_실습.chap01;

import java.util.Scanner;

public class _16_Multi99Table {

//	이중 루프를 사용하여 구구단 곱셈표를 출력하는 프로그램입니다.
	
//	[실행 결과]
//	----- 구구단 곱셈표 -----
//	1	2	...						9
//	2	4	...						18
//	...
//	9	18 ...						81
	
	public static void main(String[] args) {
		
		for(int i = 1; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
				System.out.print(i * j + "\t");
			}
			System.out.println();
		}
	}
	
}
