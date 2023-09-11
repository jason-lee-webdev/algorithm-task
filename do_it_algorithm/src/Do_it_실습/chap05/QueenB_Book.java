package Do_it_실습.chap05;

public class QueenB_Book {
	
	int[] pos = new int[8];
	
	void print() {
		for(int i = 0 ; i < 8; i++) {
			System.out.printf("%2d", pos[i]);
		}
		
		System.out.println();
	}
	
	void set(int i) {
		for(int j = 0; j < 8; j++) {
			pos[i] = j;
			
			if(i == 7) {
				print();
			} else {
				set(i + 1);
			}
		}
	}

}
