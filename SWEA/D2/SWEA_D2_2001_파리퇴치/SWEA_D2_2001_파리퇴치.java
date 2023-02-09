package ssafy.com.SWEA;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SWEA_D2_2001_�ĸ���ġ {
	
	private static StringBuilder sb = new StringBuilder();
	private static StringTokenizer st;
	
	public static void main(String[] args) throws Exception {
		
		System.setIn(new FileInputStream("input.txt"));
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(in.readLine());
		
		for(int tc = 1;tc<=T;tc++) {
			sb.append("#").append(tc).append(" ");
			st = new StringTokenizer(in.readLine());
			
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			
			//ũ�� N�� �ĸ� �迭 ����
			int [][] flies = new int[N][N];
			
			//�ĸ� �� �Է¹���
			for(int i = 0;i<N;i++) {
				st = new StringTokenizer(in.readLine());
				for(int j = 0;j<N;j++) {
					flies[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			
			//�ĸ�ä�� �ĸ� ��� ����
			int max = Integer.MIN_VALUE;
			
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
			sb.append(max).append("\n");
		}
		System.out.println(sb);
	}
	
}
