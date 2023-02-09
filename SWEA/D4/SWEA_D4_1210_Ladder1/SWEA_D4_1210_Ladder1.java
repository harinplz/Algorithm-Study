package ssafy.com.SWEA;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class SWEA_D4_1210_Ladder1 {
	
	private static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws Exception {
		
		System.setIn(new FileInputStream("input.txt"));
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		//���� �������ֱ� ���� dx, dy �迭 ����
		int[] dx = {-1,1,0}; //��, ��, ��
		int[] dy = {0,0,-1};
		
		//10�� �ݺ�
		for(int tc = 1;tc<=10;tc++) {
			sb.append("#").append(tc).append(" ");
			in.readLine();
			
			int ladder[][] = new int[100][100];
			
			int curX = 0;
			int curY = 99;
			
			//2���� �迭 �Է�
			for(int i = 0;i<100;i++) {
				String[] split = in.readLine().split(" ");
				for(int j = 0;j<100;j++) {
					ladder[i][j] = Integer.parseInt(split[j]);
					//Y 99���� 2���� ������ x ã��
					if(ladder[curY][j] == 2) curX = j; 
				}
			}
			
			while(curY != 0) {
				for(int i = 0;i<3;i++) {
					int testX = curX + dx[i];
					int testY = curY + dy[i];
					
					if((0<=testX && testX<=99)
							&& (0<=testY && testY<=99)) {
						if(ladder[testY][testX] == 1) {
							ladder[testY][testX] = 7;
							curX = testX;
							curY = testY;
						}
					}
				}
			}
			sb.append(curX).append("\n");
		}
		System.out.println(sb);
	}
}
