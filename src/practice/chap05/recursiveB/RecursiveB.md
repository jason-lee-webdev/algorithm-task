[문제]
void recur(n) {
if(n > 0) {
recur(n - 1);
System.out.println(n);
recur(n - 2);
}
}
recur 메소드를 스택을 사용하여 비재귀적으로 구현하라.

[로직]
System.out.println(n)을 실행하기 전에 recur(n - 1)의 실행을 마쳐야한다.
recur(n - 1)의 실행은 1부터 n - 1까지의 숫자를 출력하는 코드와 동일하다.
최초 n값을 임시저장소에 저장한다.
n - 1부터 1까지 값이 저장되는 순서와 출력하는 순서가 반대이므로 stack 자료구조를 사용한다.

[피드백]
나는 while문 안에서 또다시 while문을 작성하였지만 책의 코드는 while문에 조건문을 작성하였다.
책의 코드처럼 생각하는 습관이 필요할 것 같다.