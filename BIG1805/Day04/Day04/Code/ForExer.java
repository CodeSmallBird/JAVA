import java.util.Scanner;
public class ForExer {
	
	public static void main(String[] args){
		
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		
		// ����һ����������¼����
		int count = 0;
		
		// ��Ϊ���������int���ͣ�������32λ������
		// ����ζ��ֻ��Ҫ�����ж�32λ�Ƿ�Ϊ1�͹���
		for(int i = 1; i <= 32; i++){
			
			// ˵����������һλΪ1
			if((num & 1) == 1){
				count++;
			}
			
			// �������һλ�Ƿ�Ϊ1�����Ѿ������жϣ�����Ҫ����һλŲ�ߣ����ж���һλ
			num >>= 1;
			
		}
		
		System.out.println(count);
		
	}
	
}