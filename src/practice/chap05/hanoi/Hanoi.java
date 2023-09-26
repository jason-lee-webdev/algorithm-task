package practice.chap05.hanoi;

//하노이의 탑을 구현하라
//move 메소드의 매개변수 no는 옮겨야할 원반의 개수, x는 시작 기둥의 번호, y는 도착 기둥의 번호
//원반을 옮길 때 마다 "원반(1)을 1번 기둥에서 3번 기둥으로 옮김"을 출력한다.

public class Hanoi {
	public void move(int n, int x, int y) {
		if(n > 1) {
			move(n - 1, x, 6 - x - y);			
		}
		
		System.out.println("원반(" + n + ")을 " + x + "번 기둥에서 " + y + "번 기둥으로 옮김");
		
		if (n > 1) {
			move(n - 1, 6 - x - y, y);			
		}
	}

}
