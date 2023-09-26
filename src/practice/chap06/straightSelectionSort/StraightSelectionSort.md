### 문제
단순 선택 정렬은 가장 작은 요소를 맨 앞으로 이동하고,
두 번째 작은 요소는 맨 앞에서 두 번째로 이동하는 작업을 반복하는 알고리즘 입니다.


단순 선택 정렬을 수행하여 배열의 요소를 오름차순으로 정렬하시오.

### 로직
1. 정렬이 이루어지지 않은 요소들 중 가장 작은 요소를 찾는다.
2. 정렬이 이루어지지 않은 요소들 중 가장 앞쪽에 위치한(인덱스가 가장 작은) 요소와 가장 작은 요소의 위치를 교환한다.
3. 배열의 요소 갯수(n) 보다 한번 적게 위의 과정을 반복한다.

### 예외
- 배열 내 크기가 같은 요소가 존재하는 경우?
  
  배열 내 크기가 같은 요소가 존재하는 경우 연달아 나열된다. 따라서 특별한 예외처리가 필요 없다.

### 피드백
- 자료구조로 배열을 사용할 경우 요소의 값이 아닌 요소의 인덱스로 요소를 식별한다.