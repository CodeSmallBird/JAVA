public class MethodDemo1 {
	
	public static void main(String[] args){
		
		// �����������ص�ʱ�򣬵��÷����ǿ������ʵ����ȷ��Ҫ���õ����ĸ�����
		System.out.println(add(3, 4));
		System.out.println(add(3, 4, 5));
		System.out.println(add(3, 4.1));
		
	}

	// ��ͬһ���ж�����������һ�¶������б�ͬ�ķ��� --- ����������
	// �����������ĺ�
	public static int add(int i, int j){
		return i + j;
	}
	
	// �����������ĺ�
	public static int add(int i, int j, int k){
		return i + j + k;
	}
	
	// add(2, 7.1);
	// add(2.6, 9);
	// ��һ��С����һ�������ĺ�
	public static double add(int i, double j){
		return i + j;
	}
	
	public static double add(double j , int i){
		return i + j;
	}
	
}