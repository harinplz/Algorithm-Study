package ssafy.com.BOJ;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_�ǹ�3_11659_�����ձ��ϱ�4 {
	
	/**
	 * ��°� split�� ���� StringBuilder, StringTokenizer ����
	 */
	private static StringBuilder sb = new StringBuilder();
	private static StringTokenizer st;
	
	public static void main(String[] args) throws Exception {
		
		//�Է��� ���� BufferedReader ����
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		st = new StringTokenizer(in.readLine());
		
		//N, M �Է� ����
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		//������ ���� �����ϴ� �迭 dp ����
		int dp[] = new int[N+1];
		
		st = new StringTokenizer(in.readLine());
		
		//dp �迭 i��°���� �ε��� 1���� i���������� ���� ���� �����Ѵ�.
		for(int i = 1;i<=N;i++) {
			dp[i] = dp[i-1] + Integer.parseInt(st.nextToken());
		}
		
		for(int i=0;i<M;i++) { //M��ŭ �ݺ�
			st = new StringTokenizer(in.readLine());
			//������ �����ϴ� �ε����� ������ �ε����� �Է¹���.
			int startIdx = Integer.parseInt(st.nextToken()); 
			int endIdx = Integer.parseInt(st.nextToken());
			
			int ans = dp[endIdx] - dp[startIdx-1];
			
			sb.append(ans).append("\n");
		}
		
		System.out.println(sb);
	}
	
}
