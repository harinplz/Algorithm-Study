
`SWEA D2 2001 파리 퇴치`

<br>

<h2> 문제 </h2>

N x N 배열 안의 숫자는 해당 영역에 존재하는 파리의 개수를 의미한다. <br>
M x M 크기의 파리채를 한 번 내리쳐 최대한 많은 파리를 죽이고자 한다.

죽은 파리의 개수를 구하라!

<br>

<h2> 풀이방법 </h2>

처음에는 어저께 배웠던 DP 방법이나 투 포인터를 써서 문제를 도전해볼까 하다가 <br>
문제의 시간 제한이 넉넉해서 `4중 for문`을 사용했다.

```
for(int i = 0; i<= N-M; i++) {
  for(int j = 0;j<=N-M; j++) {
    int ans = 0;
      for(int k = 0; k<M;k++) {
        for(int l = 0;l<M;l++) {
          ans += flies[i+k][j+l];
          }
        }
        if(ans > max) max = ans;
       }
      }

```


i는 파리채의 시작 행을 반복하는 변수이고, j는 파리채의 시작 열을 반복하는 변수이다. <br>
만약 파리채의 시작점을 i와 j가 정했다면 k, l을 반복하면서 N 배열 안에서 M 크기의 배열의 값 들을 접근할 수 있다. <br>
접근하며 ans에 값을 다 더해주고, 만약 max 값보다 ans 값이 더 크다면 max 값과 ans의 값을 바꿔준다.
