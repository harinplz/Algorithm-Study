package ssafy.com.BOJ.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_�ǹ�2_2961_�����̰�������ִ����� {
	
	private static StringTokenizer st;
	private static int[] S; //�Ÿ� �迭
	private static int[] B; //���� �迭
	private static boolean[] isSelected;
	private static int N;
	private static int min = Integer.MAX_VALUE;
	
	public static void main(String[] args) throws Exception{
		 
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(in.readLine()); //����� ���� �Է¹���.
		
		S = new int[N];
		B = new int[N];
		isSelected = new boolean[N];
		
		for(int i=0;i<N;i++) {
			st = new StringTokenizer(in.readLine());
			S[i] = Integer.parseInt(st.nextToken());
			B[i] = Integer.parseInt(st.nextToken());
		} //�Ÿ��� ������ �Է¹���.
		
		cook(0,1,0);
		
		System.out.println(min);
	}

	private static void cook(int cnt, int sMul, int bSum) {
		//���� �κ�
		if(cnt==N) {
			if(sMul != 1 && bSum != 0) {
				if(min > Math.abs(sMul-bSum)) min = Math.abs(sMul-bSum);
			}
			return;
		}
		
		//���� �κ�
		
		isSelected[cnt] = true;
		cook(cnt+1, sMul*S[cnt], bSum + B[cnt]);
		
		isSelected[cnt] = false;
		cook(cnt+1, sMul, bSum);
		
	}
	
}
