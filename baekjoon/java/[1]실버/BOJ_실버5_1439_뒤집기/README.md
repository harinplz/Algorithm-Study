# BOJ 실버5 1439 뒤집기

### 풀이 요약

- 풀이 시간 : 약 10분
- 풀이 방법 : 그리디
- 메모리 : 11504KB, 시간 : 72ms

<br>

### 풀이 방법

0과 1로 이루어진 문자열 S가 있을 때 문자열 S에 있는 모든 숫자를 전부 같게 만드려고 한다.

이 과정에서 연속된 하나 이상의 숫자를 잡고 모두 뒤집는 것이며, 뒤집는 것은 1을 0으로, 0을 1로 바꾸는 것을 의미한다.

이때, 다솜이가 해야하는 **행동의 최소 횟수**를 구하는 문제이다.

<br>

행동의 최소 횟수를 구하려면 연속된 0의 개수와 연속된 1의 개수를 구한 다음, 둘의 최솟값을 구하면 된다.

<br>

1. 정보 입력
2. 연속된 0의 개수와 1의 개수를 세는 변수 선언, 앞 뒤가 같은 지 체크하는 변수 선언
3. 처음 문자가 0이면 zeroCnt++ 1이면 oneCnt++ 해준다.
4. i를 0부터 str.length()-2 까지 반복하며 앞 뒤가 연속한 숫자인지 확인한다.
    1. 만약 연속하지 않는다면 뒤에 변수가 1일때는 oneCnt++ 0일 때는 zeroCnt++ 해준다.
5. 반복이 끝났다면 oneCnt와 zeroCnt 중 최솟값을 출력한다.
