package practice.chap03;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/*[문제]
키의 순서로 정렬된 신체검사 데이터의 배열에서 특정한 사람의 키를 검색하는 프로그램을 작성하라*/

/*[조건]
Arrays.binarySearch 제네릭 메소드를 사용한다.*/

/* [실행결과]
키가 몇 cm인 사람을 찾고 있나요?: 174
그 값은 x[5]에 있습니다.
찾은 데이터: 장경오 174 1.2*/

/*[로직]
static PhysData 클래스를 선언한다
	필드
		private String name
		private int height
		private double vision
		
	생성자
	
	toString() 재정의
		"장경오 174 1.2"
		
	static Comparator<T> 구현 클래스 선언
		compare() 재정의
		
	static Comparator<T> 구현 객체 생성

키를 기준으로 오름차순으로 정렬된 PhysData 배열을 선언하고 초기화한다.

검색하고자 하는 사람의 키를 입력받는다

binarySearch 제네릭 메소드를 호출한다.

(binarySearch 제네릭 메소드의 호출 결과가 0보다 크거나 같으면) {
	검색된 PhysData 객체의 인덱스와 데이터를 출력한다
} else {
	"일치하는 데이터가 없습니다"를 출력한다.
}*/


/*[코드 작성 이후 책의 코드와 나의 코드 비교]
PhysData 클래스의 생성자의 접근 제한자가 다르다.
	나: PhysData(String name, int height, double vision) { }
	책: public PhysData(String name, int height, double vision) { }
	
Comparator<T> 구현 클래스의 접근 제한자와 이름이 다르다.
	나: static class Comp implements Comparator<PhysData> { }
	책: private static class HeightOrderComparator implements Comparator<PhysData> { }
	
Comparator<T> 구현 클래스의 compare 메서드 블럭에서 작성한 제어문이 다르다.
	나: 로컬 변수 - if(첫번째 값 > 두번째 값) - else if(첫번째 값 < 두번째 값)
	책: 로컬 변수 = 첫번째 값 > 두번째 값 ? 1 : 첫번째 값 < 두번째 값 ? -1 : 0; 
	
Comparator<T> 구현 객체의 접근 제한자와 final 키워드 유무가 다르다.
	나: static Comparator<PhysData> COMPARATOR = new Comp();
	책: public static final Comparator<PhysData> COMPARATOR = new HeightOrderComparator();*/

/*[결론]
모든 객체에서 공통적으로 사용하고 변경되서는 안되는 멤버는 public static final로 선언한다.
모든 객체에서 공통적으로 사용하고 변경되서는 안되는 멤버의 클래스는 private static으로 선언하다.
삼항 연산자로 if-else if-else 구문을 작성할 수 있다. */

class _8_PhysExamSearch {
	
	static class PhysData {
		// 필드
		private String name; // 이름
		private int height; // 키
		private double vision; // 시력
		
		// 생성자
		PhysData(String name, int height, double vision) {
			this.name = name;
			this.height = height;
			this.vision = vision;
		}

		// toString() 장경오 174 1.2
		@Override
		public String toString() {
			return this.name + " " + this.height + " " + this.vision;
		}
		
		// Comparator<T> 구현 클래스 선언
		static class Comp implements Comparator<PhysData> {

			@Override
			public int compare(PhysData o1, PhysData o2) {
				int result = 0;
				
				if(o1.height > o2.height) { // o1의 키가 o2 키 보다 크면 양수
					result = 1;
				} else if(o1.height < o2.height) { // o1의 키가 o2 키 보다 작으면 음수
					result = -1;
				}
				
				// o1의 키와 o2의 키가 같으면 0
				
				return result;
			}
			
			// ?? Comparator<T> 인터페이스의 equals 메소드는 추상메소드인데 구현 클래스에서 메소드를 재정의하지 않아도 오류가 발생하지 않는다. 왜 그러지? ??
		} 
		
		// Comparator<T> 구현 객체 생성
		static Comparator<PhysData> COMPARATOR = new Comp();
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int key = 0, index = 0;
		String message = "";
		
		System.out.print("키가 몇 cm인 사람을 찾고 있나요?: ");
		key = scanner.nextInt();
		
		// 키를 기준으로 오름차순으로 정렬된 PhysData 배열
		PhysData[] x = {
			new PhysData("강민하", 162, 0.3),	
			new PhysData("이수연", 168, 0.4),	
			new PhysData("황지안", 169, 0.8),	
			new PhysData("유서범", 171, 1.5),	
			new PhysData("김찬우", 173, 0.7),	
			new PhysData("장경오", 174, 1.2),	
			new PhysData("박준서", 175, 2.0)	
		};
				
		index = Arrays.binarySearch(x, new PhysData(null, key, 0.0), PhysData.COMPARATOR);
		// binarySearch 제네릭 메서드의 2번째 매개값으로 검색하고자 하는 키를 저장한 PhysData 객체를 전달한다.
		
		if(index >= 0) { // 일치하는 결과가 있으면
			message = "그 값은 x[" + index + "]에 있습니다.\n";
			message += "찾은 데이터: " + x[index].toString();
		} else { // 일치하는 결과가 없으면
			message = "일치하는 데이터가 없습니다.";
		}
		
		System.out.println(message);
	}

}