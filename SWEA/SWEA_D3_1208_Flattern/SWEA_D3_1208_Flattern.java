package ssafy.com.SWEA;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SWEA_D3_1208_Flattern {

	private static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws Exception {
		
		System.setIn(new FileInputStream("input.txt"));
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		for(int tc=1;tc<=10;tc++) {
			sb.append("#").append(tc).append(" ");
			int dumpCnt = Integer.parseInt(in.readLine());

			String[] split = in.readLine().split(" ");
			int[] boxes = new int[split.length];

			//int Ÿ������ ��ȯ
			for (int i =0;i<boxes.length;i++) {
				boxes[i] = Integer.parseInt(split[i]);
			}

			//dumpCnt��ŭ �ݺ�
			for(int i = 0;i<dumpCnt;i++) {
				Arrays.sort(boxes); //�������� ����
				boxes[0] += 1; //�������� +1
				boxes[boxes.length - 1] -= 1; //�ְ����� -1
			}

			Arrays.sort(boxes);
			int ans = boxes[boxes.length-1] - boxes[0];

			sb.append(ans).append("\n");
		}
		System.out.println(sb);
	}


}
