package 보충수업.chapter03;

import java.util.Arrays;

//짬이 높을 수록 Developer 클래스의 자연 순서를 설정한다.
//동명이인은 없고 연차가 겹치는 인스턴스가 없다고 전제한다.

//[실행 결과]
//객체는 developers[1]에 있습니다.

//[결론]
//클래스의 인스턴스에 '자연스러운 순서'를 부여하려면
//클래스는 Comparable<T> 인터페이스를 구현하고 compareTo() 메소드와 equals() 메소드를 재정의 해야한다.

//[확장문제]
//연차가 겹칠 경우 이름의 가나다 순으로 자연스러운 순서를 부여해본다.

class Developer implements Comparable<Developer> {
//	필드 선언
	private String name; // 이름
	private int age; // 나이
	private int zzam; // 짬

//	생성자 선언
	Developer(String name, int age, int zzam) {
		this.name = name;
		this.age = age;
		this.zzam = zzam;
	}

//	getter setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getZzam() {
		return zzam;
	}

	public void setZzam(int zzam) {
		this.zzam = zzam;
	}

//	toString
	@Override
	public String toString() {
		return "Developer [name=" + name + ", age=" + age + ", zzam=" + zzam + "]";
	}

//	이름이 같으면 같은 Developer 인스턴스라고 설정한다.
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		Developer developer = (Developer) obj;

		if (this.name.equals(developer.name)) {
			return true;
		}

		return false;
	}
//	?? 이런 로직으로 작성하는게 맞나? ??

//	짬이 높을 수록 Developer 클래스의 자연 순서를 설정한다.
	@Override
	public int compareTo(Developer otherDeveloper) {
		int result = 0;
		
//		this의 짬이 otherDeveloper의 짬보다 적으면 -1을 리턴한다.
		if(this.zzam < otherDeveloper.zzam) {
			result = -1;
			
//		this의 짬이 otherDeveloper의 짬보다 크면 1을 리턴한다.
		} else if(this.zzam > otherDeveloper.zzam) {
			result = 1;
			
//		this와 otherDeveloper가 같으면 0을 리턴한다.
		} else if(this.equals(otherDeveloper)) {
			result = 0;
		}

		return result;
	}

}

public class _2_jjamOrder {

	public static void main(String[] args) {
//		Developer 객체 생성
		Developer developer1 = new Developer("홍길동", 25, 2);
		Developer developer2 = new Developer("이순신", 30, 1);
		Developer developer3 = new Developer("강감찬", 29, 3);
		Developer developer4 = new Developer("이황", 43, 8);
		Developer developer5 = new Developer("이이", 37, 7);
		
//		짬 순서대로 정렬된 배열을 생성한다.
		Developer[] developers = {developer2, developer1, developer3, developer4, developer5};
//		Developer 클래스에서 정의한 자연스러운 순서와 검색 대상 배열의 요소 정렬 순서가 일치하지 않으면
//		이진 검색의 결과가 부정확하다.
		
//		배열에서 developer3 객체를 검색한다.
		int resultIndex = Arrays.binarySearch(developers, developer1);
		
		if(resultIndex > 0) {
			System.out.println("객체는 developers[" + resultIndex + "]에 있습니다.");
		} else {
			System.out.println("객체를 찾지 못했습니다.");
		}

	}

}
