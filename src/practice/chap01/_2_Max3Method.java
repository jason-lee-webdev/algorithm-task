package practice.chap01;

public class _2_Max3Method {

	static int max3(int a, int b, int c) {
		int max = a;
		
		if(max < b) {
			max = b;
		}
		
		if(max < c) {
			max = c;
		}
		
		return max;
	}
	
	public static void main(String[] args) {
		System.out.println("max(3, 2 ,1) = " + max3(3, 2, 1));
	}
}
