# BOJ 실버3 2012 등수 매기기

<br>

### 풀이 요약

- 풀이 시간 : 1시 55분 ~ 2시 35분
- 풀이 방법 : 정렬
- 메모리 : 52344KB, 시간 :  640ms

<br>

### 풀이 방법

문제는 되게 쉬운 문제인데 나는 왜 이렇게 풀이 방법을 어렵게 생각할까? 😢 

문제는 예상 등수와 실제 등수의 차이를 계산해서 그 값의 총 합이 최소일 때를 구하면 된다. 최소일 때는 언제일까? 차이가 최소일 때는 두 값의 차이가 작으면 된다. 작은 수는 작은 수에서 빼주면 되고 큰 수는 큰 수에서 빼주면 된다. 즉, 입력 받은 예상 등수를 오름차순으로 정렬하고, 그 인덱스의 차이를 계산해주면 된다. 😄 

또한 주의할 점은 ans의 변수형이 long이어야 한다는 점이다. N은 최댓값이 500,000인데 N이 500,000 일 때 모든 예상 등수가 500,000 이라면 당연히 int 형에서 벗어나게 될 것이다. 그렇기 때문에 차이의 총 합을 저장하는 변수인 ans는 long 변수형을 사용한다. 

<br>

처음에는 예상 등수랑 그래도 실제 등수가 같다면 따로 처리를 해줘야하지 않나 … ? 싶어서 실제 등수가 있는 경우에는 배열에 따로 처리를 해주고 남은 수를 list에 넣어 풀어줬는데 이러니까 당연히 시간 초과가 발생했다 … 😿 문제를 너무 어렵게 생각하고 푸는 것 같아서 쉽게 생각하는 버릇을 기르도록 노력해야겠다 … 문제를 많이 풀면 늘지 않을까!!! 😊
