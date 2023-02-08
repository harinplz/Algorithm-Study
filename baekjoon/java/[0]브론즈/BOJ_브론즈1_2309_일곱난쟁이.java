package ssafy.com.BOJ.bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ_�����1_2309_�ϰ������� {
	
	private static StringBuilder sb = new StringBuilder();
	private static boolean[] isSelected = new boolean[9];
	private static int[] dwarf = new int[7];
	private static int[] height = new int[9];
	private static boolean isFinish = false;
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader in  = new BufferedReader(new InputStreamReader(System.in));
		
		for (int i = 0;i<9;i++) {
			height[i] = Integer.parseInt(in.readLine());
		}
		
		search(0, 0);
		System.out.println(sb);
	}

	private static void search(int cnt, int start) {
		// ���� �κ�
		if(cnt == 7) {
			if(!isFinish) { //ó�� �� �� ã������ �� �������� ã�Ƶ� sb�� �������� ���ϵ��� ó��
				int total = 0;
				for(int num: dwarf) total += num;
				if(total==100) {
					Arrays.sort(dwarf);
					for(int num: dwarf) {
						sb.append(num).append("\n");
					}
					isFinish = true;
				}
			}
			return;
		}
		
		// ���� �κ�
		for(int i = start;i<9;i++) {
			if(isSelected[i] == true) continue;
			
			isSelected[i] = true;
			dwarf[cnt] = height[i];
			search(cnt+1, i+1);
			
			isSelected[i] = false;
			
		}	
	}
	
}
