# BOJ 골드5 1011 Fly me to the Alpha Centauri

### 풀이 요약

- 풀이 시간 : 약 1시간 30분 (블참)
- 풀이 방법 : 수학
- 메모리 : 11568KB, 시간 : 76ms

<br>

### 풀이 방법

x에서 y로 도착하기 위해 공간 이동 장치 작동 횟수의 최솟값을 구하는 문제이다. 공간 이동 장치는 다음과 같은 조건에 따라 이동한다.

<br>

- 이전 작동시기에 k광년을 이동했을 때 k-1, k 혹은 k+1 광년만 이동할 수 있다.
- y지점에 도착해서도 공간 이동 장치의 안전성을 위해 y지점에 도착하기 바로 직전 이동거리는 반드시 1광년이어야 한다.

<br>

처음에 DFS나 BFS로 풀려고 했는데 0 ≤x < y < 2^31 조건으로 절대 시간 안에 풀 수 없었다 (메모리 초과도 물론!) 😢 그래서 답을 위한 규칙을 찾아야 했다!

<br>

1. 테스트 케이스를 입력받는다.
2. x, y를 입력받고 y에서 x를 빼준다.
3. ⭐ 0에서 y까지의 최대 이동 거리는 `(int)Math.sqrt(y)`로 **y의 제곱근**이다. 이를 이용하여 이동 횟수를 구한다.
4. **⭐ 이동 횟수를 구하는 과정** (답을 하나씩 써보면 밑과 같은 규칙을 찾을 수 있다.)
    1. 만약 `Math.sqrt(y) == max` 라면 `count = max * 2 - 1`이다.
    2. `y ≤ max * max + max` 라면 `count = max * 2`이다.
    3. 모든 조건에도 안 걸리는 경우 `count = max * 2 + 1`이다. 
5. 모든 이동 횟수를 구하고 나서 답을 출력한다.  

<br>

### 참고

https://hellodoor.tistory.com/112
