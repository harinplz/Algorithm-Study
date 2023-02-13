package ssafy.com.BOJ.silver;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_�ǹ�4_1158_�似Ǫ������_queue {
	
	private static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws Exception {
		
		System.setIn(new FileInputStream("input.txt"));
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(in.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		//�似Ǫ�� ������ ���ϱ� ���� ť ����
		Queue<Integer> queue = new ArrayDeque<Integer>();
		
		//queue�� 1~N���� �� �ֱ�
		for(int i = 1;i<=N;i++) queue.offer(i);
		
		sb.append("<");
		
		//�似Ǫ�� ���� ���
		while(queue.size() != 0) {
			int person = 0;
			for(int i = 1 ; i <K; i++) { //K������ ���� �̾Ƽ� ť�� �� �ڷ� ������. ���� �ʿ��� �� K��° ���ϱ�!
				person = queue.poll();
				queue.offer(person);
			}
			
			int removePerson = queue.poll(); //���� �տ� �ִ� k��° �� ����
			
			//queue size�� 1�̸� ���̴ϱ� ">"�� ���
			if(queue.size() == 0) sb.append(removePerson).append(">");
			else sb.append(removePerson).append(", "); // �� �ܿ��� , ��ǥ ���
				
		}
		System.out.println(sb);
	}
	
}
