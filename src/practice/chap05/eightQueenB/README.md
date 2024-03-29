[문제]
8 X 8 체스판에 8개의 퀸이 서로를 공격할 수 없도록 배치하는 모든 조합을 구한다.
위의 문제를 해결하기 위해 단계를 나누어 생각한다.
퀸은 가로, 세로, 대각선 방향에 존재하는 다른 퀸을 공격할 수 있으므로 다음과 같이 문제를 분할 할 수 있다.

1. 각 열에 퀸을 1개만 배치한다.
2. 각 행에 퀸을 1개만 배치한다.
3. 각 퀸의 대각선 방향에 다른 퀸이 존재하지 않도록 배치한다.

1번 조건 즉, 각 열에 퀸을 1개만 배치하고 해당 조합을 출력하는 코드를 구현한다.

조건1. 퀸의 배치를 나타낼 때 배열을 사용한다.
예를 들어 왼쪽에서 2번째 위에서 5번째에 놓인 퀸은 pos[2] = 5 로 표현할 수 있다.

[로직]
배열 자료구조를 고려하여 왼쪽에서 첫번째 열을 0열 위쪽에서 첫번째 행은 0행이라고 한다.

0열 부터 퀸을 배치하기 시작하는데 하나의 조합이 완성되려면 0열부터 7열까지 모든 열에 퀸이 배치되어야한다.
0열 0행에 퀸을 배치하고, 1열 0행에 퀸을 배치하고, ... 마지막으로 7열 0행에 퀸을 배치하면 하나의 조합이 완성된다.
그리고 0열 0행에 퀸을 배치하고, 1열 0행에 퀸을 배치하고, ... 마지막으로 7열 1행에 퀸을 배치하면 하나의 조합이 완성된다.

이를 일반화하면 i열 0행부터 7열까지 각 열에 퀸을 배치하려면
i열 0행에 퀸을 배치하고 i + 1열에 0행부터 7행까지 퀸을 배치해야한다.
그리고 i열 1행에 퀸을 배치하고 i + 1열에 0행부터 7행까지 퀸을 배치해야한다.

체스판은 8 X 8 의 크기를 가지므로 i + 1열의 최대값은 7이다.
하나의 조합이 완성되면 조합을 출력한다.

i열의 j행에 퀸을 배치하는 메소드는 set(i) = j; 정의한다.

[피드백]
메소드가 호출되는 순서와 메소드의 실행 블록의 모든 코드를 실행완료되는 순서가 다르다 보니
코드로 로직을 구현하는데 어려움이 있었다.

무언가 반복된다는 느낌이 들었지만 정확히 어디서부터 어디까지의 로직이 반복되는지
반복 시 어떤 변화가 있는지 구체적으로 파악하기 어려웠다.

재귀 알고리즘의 경우 전체 흐름에서 이전 단계와 다음 단계를 구분 짓고
두 단계를 오가며 코드를 구현하니 문제가 일반화 되어 답을 찾기 수월했다.