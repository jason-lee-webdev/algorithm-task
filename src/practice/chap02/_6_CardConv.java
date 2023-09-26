package practice.chap02;

import java.util.Scanner;

//입력받은 10진수를 2진수 ~ 36진수로 기수 변환하여 출력

//[예시]
//10진수를 기수 변환합니다.
//변환하는 음이 아닌 정수: -10
//변환하는 음이 아닌 정수: 9876
//어떤 진수로 변환할까요?(2-36): 16
//16진수로 2694입니다.
//다시 한 번 할까요? (1…예/0…아니오): 1
//변환하는 음이 아닌 정수: 5678
//어떤 진수로 변환할까요?(2-36): -10
//어떤 진수로 변환할까요?(2-36): 25
//25진수로 923입니다.
//다시 한 번 할까요? (1…예/0…아니오): 0

//[생각]
//기수는 정수를 진수로 나누었을 때 나머지이다.
//정수를 진수로 나눈 몫을 또다시 진수로 나누면 다음 자릿수의 기수를 알 수 있다.
//10진수를 넘는 진수는 0부터 9까지의 수와 A부터 시작하는 알파벳을 기수로 갖는다.
//0부터 Z까지의 기수를 문자열로 저장하고 charAt() 메소드를 호출하여 기수를 얻는다.
//몫이 0이 되면 진수로 변환하는 코드를 종료한다.

//[교재 해설]
//변환 후 각 자리의 숫자를 넣어 두는 문자 배열을 선언한다. (문장 배열의 크기는 32)
//입력 받은 숫자와 진수 그리고 변환 후 각 자리의 숫자를 넣어 두는 문자 배열을 인자로 전달하고 변환 후 숫자의 자릿수를 리턴한다.
//입력 받은 숫자를 진수로 나눈 나머지(기수)를 문자 배열의 앞쪽부터 저장하고
//몫이 0이 되면 더이상 나누지 않고 문자 배열을 역순으로 정렬한다.
//문자 배열을 0부터 자릿수 미만까지 순서대로 출력한다.

//[결론]
//숫자와 문자가 연관된 로직의 경우 String 클래스를 사용한다.
//while문 안에 break를 거는 포인트가 한 곳이라면 do{} while()문으로 작성할 수 있다.

public class _6_CardConv {
	
	static String convertToCardinalNumber(int number, int jinsu) {
		String result = "";
		String gisu = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		while(true) {
			// 입력 받은 숫자를 진수로 나눈 나머지를 인덱스값으로 갖는 문자를 result 문자열 앞에 붙인다.
			result = gisu.charAt((number % jinsu)) + result;
			
			// 입력 받은 숫자를 진수로 나눈 몫을 또 진수로 나누기 위해 number 변수에 저장한다.
			number = number / jinsu;
			
			// 몫이 0이 되면 변환 작업을 마친다.
			if(number == 0) {
				break;
			}
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int number = 0;
		int jinsu = 0;
		int retry = 0;
		
		System.out.println("10진수를 기수 변환합니다.");
		
		do {
			do {
				System.out.print("변환하는 음이 아닌 정수: ");
				number = scan.nextInt();
			} while(!(number >= 0));
			
			do {
				System.out.print("어떤 진수로 변환할까요?(2-36): ");
				jinsu = scan.nextInt();
			} while(!(jinsu >= 2 && jinsu <= 36));
			
			System.out.println(jinsu + "진수로 " + convertToCardinalNumber(number, jinsu) + "입니다.");
			
			System.out.print("다시 한 번 할까요? (1…예/0…아니오): ");
			retry = scan.nextInt();
			
		} while(retry == 1);
		
		scan.close();
	}
}
