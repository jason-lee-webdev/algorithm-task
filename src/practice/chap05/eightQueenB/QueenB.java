package practice.chap05.eightQueenB;

public class QueenB {
	
	private 	int[] pos = new int[8];
	
	public void set(int i) {
		for(int j = 0; j <= 7; j++) {
			pos[i] = j;
			
			if(i + 1 < 8) {
				set(i + 1);				
			} else {
				print();				
			}
		}
	}
	
	public void print() {
		for (int i = 0; i < pos.length; i++) {
			System.out.print(pos[i] + "  ");
		}
		System.out.println();
	}
}
