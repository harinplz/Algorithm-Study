package ssafy.com.study;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_�ǹ�3_21921_��α� {
	
	private static StringBuilder sb = new StringBuilder();
	private static StringTokenizer st;
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		//�Է� N, X ����
		//N : ��α׸� ������ �� ���� �ϼ�, X: �Ⱓ
		st = new StringTokenizer(in.readLine());
		int N = Integer.parseInt(st.nextToken());
		int X = Integer.parseInt(st.nextToken());
		
		//�� �迭 �Է�, �ε��� 1���� �ڽű��� ���� ���� �ڽ��� �ε����� ����
		int accum[] = new int[N+1];
		st = new StringTokenizer(in.readLine());
		for(int i=1;i<=N;i++) {
			accum[i] = accum[i-1] + Integer.parseInt(st.nextToken());
		}
		
		//dp[N]==0, �� �ִ� �湮�ڼ��� 0���̶�� SAD ���
		if(accum[N]==0) {
			sb.append("SAD");
		}
		else {//�ƴ϶��
			int max = Integer.MIN_VALUE; //�ִ� �湮�ڼ��� ���ϱ� ���ؼ� max ���� ���
			int cnt = 1;
			
			for(int i = 1;i<=N-X+1;i++) { //i�� 1���� N-X+1���� �ݺ�
				int startIdx = i;
				int endIdx = i+X-1;
				
				int visitCnt = accum[endIdx] - accum[startIdx-1];
				if(visitCnt>max) {
					max = visitCnt; //�� �񱳸� ���� �ִ� �湮�� �� ����
					cnt=1; //�ִ� �湮�� ���� �ٲ���ٸ� �ٽ� 1�� ����
				}
				else if(max == visitCnt) cnt++; //���� �ִ� �湮�� ���� �� ���Դٸ� cnt++
			}
			
			sb.append(max).append("\n").append(cnt);
		}
		
		System.out.println(sb);
		
	}
	
}
