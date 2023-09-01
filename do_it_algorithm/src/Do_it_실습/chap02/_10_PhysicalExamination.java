package Do_it_실습.chap02;

//신체검사 데이터용 클래스 배열에서 평균 키와 시력의 분포를 구함

//[실행결과]
//■ 신체검사 리스트 ■
//이름		키		시력
//-----------------
//강민하	162	0.3
//김찬우	173	0.7
//박준서	175	2.0
//유서범	171	1.5
//이수연	168	0.4
//장경오	174	1.2
//황지안	169	0.8
//
//평균 키: 170.3cm
//
//시력 분포
//0.0 ~: 0명
//0.1 ~: 0명
//0.2 ~: 0명
//0.3 ~: 1명
//0.4 ~: 1명
//0.5 ~: 0명
//(...생략...)

//[생각]

//[교재해설]

//[결론]

public class _10_PhysicalExamination {
	
	//신체검사 데이터용 클래스를 선언한다.
	static class PhyscData {
	//main 메소드가 static 메소드이므로 static 메소드에서 사용할 수 있도록
	// 
		
		String name;
		int height;
		double vision;
		
		PhyscData(String name, int height, double vision) {
			this.name = name;
			this.height = height;
			this.vision = vision;
		}
	}
	
	
	
	

	
}








