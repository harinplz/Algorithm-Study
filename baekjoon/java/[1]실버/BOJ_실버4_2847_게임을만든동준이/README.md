# BOJ 실버4 2847 게임을 만든 동준이

### 풀이 요약

- 풀이 방법 : 그리디
- 메모리 : 11496KB, 시간 : 84ms

<br>

### 풀이 방법

1. N, arr[] 입력
2. max 변수 생성, arr[N-1] 값으로 초기화해준다. 
3. ans 변수 생성, 점수를 몇 번 감소시키는 지 저장하는 변수이다.
4. for문을 i=N-2부터 0이 될 때까지 감소시키며 반복한다.
    1. max ≤ arr[i] 인 경우 (점수 감소 필요)
        1. arr[i] - (max - 1) 을 계산한 값이 감소를 시켜야하는 경우의 수이다.
        2. 점수는 레벨마다 각 각 달라야하므로, max 값도 1 감소시켜준다. 
    2. max > arr[i] 인 경우 (점수 감소 필요X)
        1. 해당 레벨의 점수를 감소시킬 필요는 없지만, 다음 레벨의 점수를 변경할 때 이 레벨의 점수가 필요하다. 
        2. 그렇기 때문에 max = arr[i]로 갱신한다.
5. 반복문을 다 탐색했으면 ans 값을 출력한다.

<br>

### 회고

처음에 한 번 틀렸는데 max>arr[i] 인 경우를 생각을 못해서였다. 코딩테스트에서도 이렇게 가볍게 숨겨놓은 ,,, 반례를 못 넘겼겠지 ,,, ? 예제에 맞추는 것이 아니라 ,,, 문제를 읽고 그에 대한 코드를 작성하도록 ,,, 노력해야겠다,,, 😢
