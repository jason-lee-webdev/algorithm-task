package practice.chap05.hanoi;

import java.util.Scanner;

//Honoi 클래스의 move 메소드를 테스트한다.

public class HanoiTest {

	public static void main(String[] args) {
		Hanoi hanoi = new Hanoi();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("하노이의 탑");
		System.out.print("원반의 개수 : ");
		
		hanoi.move(scanner.nextInt(), 1, 3);
	}

}
