package ssafy.com.BOJ;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_�ǹ�3_15649_N��M1 {
	
	private static StringBuilder sb = new StringBuilder();
	private static int N;
	private static int M;
	private static int[] numbers;
	private static boolean[] isSelected;
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(in.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		numbers = new int[M];
		isSelected = new boolean[N+1];
		
		permutation(0);
		
		System.out.println(sb);
		
	}

	/**
	 * ������ ���ϱ� ���� ����Լ� ����(���� Ž��)
	 * @param cnt
	 */
	private static void permutation(int cnt) {
		//���� �κ�
		if(cnt == M) { //cnt�� M, ���� ���� �� ����� �� ������.
			for(int num: numbers) {
				sb.append(num).append(" ");
			}
			sb.append("\n"); //����� ���� �κ�
			return;
		}
		
		//���� �κ�
		for(int i = 1 ; i<=N;i++) {//1���� N���� �� Ȯ��
			if(isSelected[i] == true) continue; 
			//���� ���ſ� �� ���� �������� �� ���� �ٽ� �� �� �����Ƿ� continue;
			
			numbers[cnt] = i; //������ �߰�
			isSelected[i] = true; //���� ������� isSelected true ó��
			
			permutation(cnt+1); //���� ������ ���ڸ� ��������.
			isSelected[i] = false; //���� ������ �� ������ ���ϵǾ��� ��, �ٽ� ���� ���Ƿ� false ó�� ���ش�.
		}
	}

}
