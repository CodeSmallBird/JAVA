public class OperatorDemo3 {

	/**
		��֤����������ȼ�
	*/
	public static void main(String[] args){
		
		// �����������������㣬��ô���Ӧ����3 > 6;���������ǹ�ϵ���㣬��ô���Ӧ����true+4���������
		// System.out.println(3 > 2 + 4);
		// ����������λ���㣬��ô���Ӧ����3+7=10;�����������������㣬��ô���Ӧ����5^5=0
		// System.out.println(3 + 2 ^ 5);
		// System.out.println(3 & 3 > 1);
		// System.out.println(3 << 3 > 1);
		// System.out.println(3 << 3 + 1);
		// System.out.println(~3 > 1);
		// System.out.println(~3 + 1);
		// System.out.println(3 > 2 ? 3 : 2 + 5);
		// System.out.println(3 > 2 ? 4 : 3 & 3);
		// System.out.println(3 > 2 ? true : false & false);
		int i = 5; 
		// �Ȱ�i��ֵ5ȡ�������Ϊ�����i����Ϊ6������ǵĽ��5��ֵ��i
		i = i++;
		// ��i��ֵ5ȡ��������ȡ�����㣬ͬʱi����Ϊ6����ȡ���Ľ����ֵ��i
		System.out.println(~i++);
		
		//boolean b = 3 > 2 ? 5 : 1 > 3;
		
	}

}