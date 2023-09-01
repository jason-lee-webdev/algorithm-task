package Do_it_실습.chap03;

import java.util.Arrays;
import java.util.Scanner;

//자연 정렬이 된 배열에서 이진 검색을 한다.
//Arrays.binarySearch() 메소드를 사용한다.

//[실행 결과]
//원하는 키워드를 입력하세요: int
//해당 키워드는 x[26]에 있습니다.

public class _6_StringBinarySearch {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String keyWord = null;
		int resultIndex = 0;

		System.out.print("원하는 키워드를 입력하세요: ");
		keyWord = scanner.next();

//		자연 정렬이 된 String 인스턴스를 요소로 갖는 배열을 선언하고 초기화한다.
		String[] x = { // 자바에서 사용하는 키워드(알파벳 순)
				"abstract", "assert", "boolean", "break", "byte", "case", "catch", "char", "class", "const", "continue",
				"default", "do", "double", "else", "enum", "extends", "final", "finally", "float", "for", "goto", "if",
				"implements", "import", "instanceof", "int", "interface", "long", "native", "new", "package", "private",
				"protected", "public", "return", "short", "static", "strictfp", "super", "switch", "synchronized",
				"this", "throw", "throws", "transient", "try", "void", "volatile", "while" };
		
//		이진 검색을 위해 Arrays.binarySearch() 메소드를 호출한다.
		resultIndex = Arrays.binarySearch(x, keyWord);
		
		if(resultIndex >= 0) {
			System.out.println("해당 키워드는 x[" + resultIndex + "]에 있습니다.");
		} else {
			System.out.println("일치하는 값이 없습니다.");
		}

	}

}
