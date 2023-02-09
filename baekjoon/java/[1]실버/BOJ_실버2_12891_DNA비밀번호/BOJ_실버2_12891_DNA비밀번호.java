package ssafy.com.BOJ.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_�ǹ�2_12891_DNA��й�ȣ {
	
	private static int cntA = 0;
	private static int cntC = 0;
	private static int cntG = 0;
	private static int cntT = 0;
	//�������� �־��� A, C, G, T�� �ּ� ������ ���ϱ� ���ؼ� ����� ����
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(in.readLine());
		
		int P = Integer.parseInt(st.nextToken()); //P(��ȣ�� ���Ƿ� ���� DNA ���ڿ� ����)
		int S = Integer.parseInt(st.nextToken()); //S(��й�ȣ�� ����� �κ� ���ڿ� ����)
		
		String DNAstr = in.readLine(); //��ȣ�� ���Ƿ� ���� DNA ���ڿ� �Է�
		
		st = new StringTokenizer(in.readLine());
		int [] DNALimit = new int[4];
		for(int i = 0;i<4;i++) {
			DNALimit[i] = Integer.parseInt(st.nextToken()); //A, C, G, T�� ��й�ȣ�� ������ �ּ� ���� ����
		}

		int ans = 0; //��ȣ�� ���� �� �ִ� ��й�ȣ ���� �� ���� ����
		
		//�����̵� ������ ���
		//S ũ�� ��ŭ�� �����츦 ���� ��ȣ�� ���Ƿ� ���� DNA ���ڿ��� Ȯ��.

		for(int i=0;i<=P-S;i++) {
			if(i == 0) { //ó�� �����츦 ������ ��, �ϳ��� ���Ҹ� ���鼭 A, C, G, T ���� üũ.
				String subDNAstr = DNAstr.substring(i, i+S);
				for(int j=0;j<subDNAstr.length();j++) {
					char target = subDNAstr.charAt(j);
					SumCntDna(target); //���Ұ� 'target'�̸� �ش� target ī��Ʈ ������Ŵ.
				}
			}
			else {//�����츦 �ű� �� 
				char subTarget = DNAstr.charAt(i-1); //�� ��� ���� (�����쿡�� ���� ���)
				char target = DNAstr.charAt(i+S-1); //���� ��� ���� (���� �߰��� ���)
				
				SubCntDna(subTarget); //�����쿡�� ���� ��Ҵ� ī��Ʈ ���� -- ���ش�.
				SumCntDna(target); //�����쿡 ���� ���� ��Ҵ� ī��Ʈ ���� ++ ���ش�.
				
			}
			
			/**
			 * A, C, G, T �� ������ ���� ī�����ϴµ�,
			 * ���� A, C, G, T�� ���� ���� ���ѵ� �ּ� �������� ũ�ų� ���ٸ�? ��й�ȣ ���� �� ������Ŵ.
			 */
			if(cntA >= DNALimit[0] && cntC >= DNALimit[1] &&
					cntG >= DNALimit[2] && cntT >= DNALimit[3] ) {
				ans+=1;
			}
		}
		
		System.out.println(ans);
	}
	
	//ī��Ʈ �� --���ִ� �Լ�
	public static void SubCntDna(char target) {
		switch(target) {
		case 'A':
			cntA-=1;
			break;
		case 'C':
			cntC-=1;
			break;
		case 'G':
			cntG-=1;
			break;
		case 'T':
			cntT-=1;
		}
	}
	
	//ī��Ʈ �� ++���ִ� �Լ�
	public static void SumCntDna(char target) {
		switch(target) {
		case 'A':
			cntA+=1;
			break;
		case 'C':
			cntC+=1;
			break;
		case 'G':
			cntG+=1;
			break;
		case 'T':
			cntT+=1;
		}
	}
	
}
