package ssafy.com.BOJ.bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_�����2_2798_���� {

	private static int N;
	private static int M;
	private static int ans;
	private static int min = Integer.MAX_VALUE;
	private static int[] cards;
	private static int[] numbers = new int[3];
	private static boolean[] isSelected;

	public static void main(String[] args) throws Exception {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		String split[] = in.readLine().split(" ");

		//N,M �Է¹���
		N = Integer.parseInt(split[0]);
		M = Integer.parseInt(split[1]);

		//�迭 ũ�� �Ҵ�
		cards = new int[N];
		isSelected = new boolean[N];

		//cards�� �� �Ҵ�
		String split2[] = in.readLine().split(" ");
		for(int i =0;i<N;i++) {
			cards[i] = Integer.parseInt(split2[i]);
		}

		blackjack(0, 0);
		System.out.println(ans);
	}

	private static void blackjack(int cnt, int start) {
		// ���� �κ�
		if(cnt == 3) {
			int sum = 0; 
			for(int num: numbers) sum += num; 
			if(sum<=M && min > M-sum) { //���� ����!!!
				min = M-sum; 
				ans = sum; 
			}
			return;
		}

		// ���� �κ�
		for(int i = start;i<N;i++) {
			if(isSelected[i] == true) continue; //��Ÿ ����!!!

			isSelected[i] = true;
			numbers[cnt] = cards[i];

			blackjack(cnt+1, i+1);

			isSelected[i] = false;
		}

	}

}
