public class LoopDemo2 {
	
	public static void main(String[] args){
		
		/* ��ӡ 
			******
			******
			******
			******
		*/
		/*
		for(int i = 1, j = 1; i <= 4; j++){
			// �ȴ�ӡ*
			System.out.print("*");
			// �ж��Ƿ��ӡ����һ�е����һ��*
			if(j == 6){
				// �����ӡ�������һ��*������һ�д�ӡ�����Ҫ����
				System.out.println();
				// ��Ϊ�����˻��У�������������1
				i++;
				// �����µ�һ�У�������Ҫ��ͷ���¼���
				j = 0;
			}
		}
		*/
		/*
			*
			**
			***
			****
			*****
			******
			
			������ 1 -> n
			ÿһ�е�*���� : 1 -> ����
		*/
		/*
		for(int i = 1, j = 1;i <= 6 ; j++){
			System.out.print("*");
			if(j == i){
				System.out.println();
				i++;
				j = 0;
			}
		}
		*/
		
		for(int i = 1, j = 1; i < 10; j++){
			System.out.print(j + "*" + i + "=" + j * i + "\t");
			if(j == i){
				System.out.println();
				i++;
				j = 0;
			}
		}
		
	}
	
}