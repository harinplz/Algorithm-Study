# BOJ 실버3 2852 NBA 농구

### 풀이 요약

- 풀이 시간 : 약 45분
- 풀이 방법 : 구현
- 메모리 : 11868KB, 시간 88ms

<br>

### 풀이 방법

1팀과 2팀의 득점 정보를 입력받고, 팀이 이기고 있던 시간을 계산해서 각각 출력하면 된다.

1. 득점 수 N 입력
2. N만큼 반복하여 득점 정보 입력 (팀 번호, 팀 시간)
3. 이기는 시간을 계산한다.
    1. 이전까지 비긴 상태였으면 이긴 시간을 계산하지 않는다.
    2. 만약 이전 득점 초가 현재 득점 초보다 크다면 따로 처리를 해준다.
        
        ```java
        if (times[i].sec < times[i - 1].sec) {
            winSec += 60;
            winMin -= 1;
        }
        ```
        
    3. 처리 후 이긴 시간을 계산해준다. 
    4. 만약 1팀이 이기고 있었다면 1팀에 시간을 더해주고, 2팀이 이기고 있었다면 2팀에 시간을 더해준다.
        1. 시간을 더헀을때 초가 59를 넘는다면 60으로 나눈 후 나머지를 sec에 할당하고, min 값을 1 증가시켜준다. 
    5. 이후 승리 팀의 점수를 1 올려준다.
4. 위 과정을 반복한 후, 득점이 끝났다면 종료 시간과 제일 마지막 득점 시간도 비교해서 계산한다.
5. 1팀과 2팀의 이긴 시간을 각각 출력한다.

<br>

### 정리

- 간단한 구현 문제이다. 근데 왜 이렇게 시간이 오래 걸렸지 ,, 풀면서 집중을 제대로 못한 것 같다.
- 출력하는 방식은 정리해놓고 다음에도 사용하기!! java에서도 C언어 출력할 때 했던 것처럼 printf를 사용할 수 있다.

<br>

```java
System.out.println("%02d:%02d", min, sec);
```

- min 값을 0, sec 값을 0으로 가정하겠다.
- %d는 정수를 출력하는 형식 지정자이다. (출력 0:0)
- 앞에 2는 출력할 전체 자리수를 지정한다. 숫자는 오른쪽으로 정렬한다. (출력 _0:_0)
    - _는 출력할 때 나오지 않지만, 왼쪽 자리가 비었다는 것을 명시적으로 표현하기 위해 적어두었다.
- 2 앞에 0은 정렬하고 빈 왼쪽 자리에 0을 채워넣겠다는 의미이다. (출력 00:00)
- 만약 형식 지정자 앞에 - 가 붙는다면 왼쪽으로 정렬한다.
- 소수점을 표시하고 싶다면 %.2f로 표시한다.
    - f는 소수점을 표현한다는 뜻이다.
    - 2는 소수점 둘째자리까지 표현한다는 뜻이다.
