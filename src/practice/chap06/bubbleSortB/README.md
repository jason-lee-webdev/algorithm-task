### 문제
4개의 숫자가 [2 1 3 4] 와 같이 나열되어 있다고 가정한다.

패스(가장 마지막 요소와 그 이전 요소를 비교 교환하고 이어서 뒤에서 2번째 요소와 뒤에서 3번째 요소를 비교 교환 하다 더 이상 비교할 요소가 없으면 종료)가 1번 진행되면 3개의 숫자는 [1 2 3 4] 와 같이 나열된다.


2번째 패스를 진행하면 더 이상 위치를 바꿀 요소가 없으므로 교환 횟수는 0이다. 교환 횟수가 0이면 정렬이 완료됨을 의미하므로 정렬을 종료한다.


위와 같은 "멈춤" 알고리즘을 사용하여 버블정렬을 업그레이드 하시오.

### 로직
1.


### 예외
없음

### 피드백
- 패스가 몇 번 이루어졌는지 눈으로 확인하고 싶어 정렬 메소드의 리턴값으로 패스가 이루어진 횟수를 작성하였다.
패스가 몇 번 발생했는지를 출력하는 코드를 모듈화 해본다.