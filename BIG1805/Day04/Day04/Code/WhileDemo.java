public class WhileDemo {
	
	public static void main(String[] args){
		
		/*
		System.out.println("Hello World ~~~");
		System.out.println("Hello World ~~~");
		System.out.println("Hello World ~~~");
		System.out.println("Hello World ~~~");
		System.out.println("Hello World ~~~");
		System.out.println("Hello World ~~~");
		System.out.println("Hello World ~~~");
		System.out.println("Hello World ~~~");
		System.out.println("Hello World ~~~");
		System.out.println("Hello World ~~~");
		*/
		/*
		// ��¼ѭ���Ĵ���
		int count = 0;
		
		while(count < 100){
			System.out.println("Hello World ~~~");
			// ����+1
			count++;
		}
		*/
		
		// ��ӡ����1-10
		/*
		int num = 1;
		
		while(num <= 10){
			System.out.println(num);
			num++;
		}
		*/
		
		/*
		// ��1-100�����е������ĺ�
		// ���ƴ����ı���---ѭ������
		int num = 1;
		// ����һ����������¼��
		int sum = 0;
		
		while(num <= 100){
			sum += num;
			num += 2;
		}
		System.out.println(sum);
		*/
		
		/*
		int num = 100;
		int sum = 0;
		
		while(num > 0){
			sum += num;
			num--;			
		}
		*/
		
		// ����һ�����֣��ж����������һ����λ��
		int num = 75235;
		// ��¼λ��
		int count = 0;
		
		while(num != 0){
			count++;
			num /= 10;
		}
		
		System.out.println(count);
		
		
		
	}
	
}