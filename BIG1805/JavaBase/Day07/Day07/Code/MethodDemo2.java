public class MethodDemo2 {

	// arguments
	// ����ڵ�����������ʱ��û�д��Σ���ô�������args�ĳ��Ⱦ���0 --- args = new String[0];
	public static void main(String[] args){

		System.out.println(args);
		for(String str : args){
			System.out.println(str);
		}
		// �����ڵ��õ�ʱ����ѭ���������ƥ��---ֻҪ�ĸ��������βκ����ʵ����������͵����ĸ�����
		System.out.println(add(2, 5));
	}
	
	// �����������ĺ�
	public static int add(int i, int j, int k){
		return i + j + k;
	}
	public static int add(int i, int j){
		return i + j;
	}
	// ��һ��������һ��С���ĺ�
	public static double add(int i, double j){
		System.out.println("add(int, double) running~~~");
		return i + j;
	}
	public static double add(double i, int j){
		return i + j;
	}
	// ������С���ĺ�
	public static double add(double i, double j){
		System.out.println("add(double, double) running~~~");
		return i + j;
	}

}