package practice.chap04.stack;

public class IntStackTester {

	public static void main(String[] args) {
		IntStack s1 = new IntStack(10);
		
		s1.push(1);
		s1.push(2);
		s1.push(1);
		s1.push(2);
		s1.push(3);
		
		s1.dump();
		
		s1.pop();
		s1.pop();
		
		s1.dump();
		
		System.out.println("가장 위에 있는 항목은 : " + s1.peek());
		
		s1.clear();
		
		System.out.println("스택이 비어있나? : " + s1.isEmpty());
	}

}
