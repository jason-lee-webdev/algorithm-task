코드는 <<do_it_algorithm\src\Do_it_실습\chap06\BubbleSortA.java>> 에 작성하였다.

[문제]
버블 정렬을 구현한다.

[로직]
버블 정렬은 이웃한 두 요소의 대소 관계를 비교하고 필요에 따라 교환을 반복하는 알고리즘으로
단순 교환 정렬이라고도 한다.

7개의 숫자 [6 4 3 7 1 9 8] 이 나열되어 있고 이를 오름차순으로 정렬할 때
가장 마지막에 있는 8과 마지막에서 2번째에 있는 9를 비교한다.
앞에 있는 숫자가 뒤에 있는 숫자보다 크면 두 숫자의 순서를 바꾼다.
따라서 [6 4 3 7 1 8 9] 가 된다.

그 다음 뒤에서 3번째 숫자와 뒤에서 2번째 숫자를 비교한다.
뒤에서 3번째 숫자인 1이 뒤에서 2번째 숫자인 8보다 크다.
올바르게 정렬되어 있으므로 순서를 바꾸지 않는다.
따라서 이전 단계와 동일하게 [6 4 3 7 1 8 9] 이 유지된다.

...

뒤에서 7번째 숫자(가장 앞에 있는 숫자)와 뒤에서 6번째 숫자(앞에서 2번째 숫자)를 비교한다.
뒤에서 7번째 숫자인 6이 뒤에서 6번째 숫자인 4보다 크다.
앞에 있는 숫자가 뒤에 있는 숫자보다 크면 두 숫자의 순서를 바꾼다.
따라서 [1 6 4 3 7 8 9] 가 된다.

이런 일련의 과정(비교, 교환)을 패스라고 정의한다.

그 다음 패스는 가장 마지막에 있는 9와 마지막에서 2번째에 있는 8을 비교하면서 시작되고
앞에서 2번째 요소까지의 비교, 교환이 완료되면 패스가 종료된다.

이를 일반화하면 n개의 숫자를 버블 정렬하면 n - 1번 패스가 이루어지고
각 패스는 가장 뒤에 있는 요소부터 인덱스가 i인 요소(i는 0부터 n -2까지 증가)까지 비교, 교환을 한다.

[피드백]
- 패스 안에서 이전 요소와 이후 요소의 인덱스를 갖는 변수를 설정할 때
  이전 요소를 기준으로 하면 이전 요소는 j 이후 요소는 j + 1 로 표현할 수 있고,
  이후 요소를 기준으로 하면 이전 요소는 j - 1 이후 요소는 j 로 표현할 수 있다.
  기준을 어디로 놓는지에 따라 반복의 시작과 끝이 달라지므로 주의한다.

- bubbleSort 메소드의 매개변수에 정렬할 요소가 담긴 배열을 작성하는게 객체지향적인 설계일 것 같다.
  그리고 bubbleSort 메소드를 객체 생성없이 호출할 수 있도록 static 메소드로 선언한다.
  <<do_it_algorithm\src\Do_it_실습\chap06\BubbleSortA2.java>> 에 버블 정렬을 다시 구현해보았다.