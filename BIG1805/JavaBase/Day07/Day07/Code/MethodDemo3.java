public class MethodDemo3 {

	public static void main(String[] args){
		
		// System.out.println(sum(20000));
		System.out.println(add(20000));
		
	}
	
	public static int sum(int n){
		
		if(n == 1)
			return 1;
		
		// �ڷ����е������Լ����� --- �����ĵݹ�
		return n + sum(n - 1);
		
	}
	
	public static int add(int n){
		
		int sum = 0;
		
		// ��n~1�ĺ�
		for(int i = n; i > 0; i--){
			sum += i;
		}
		
		return sum;
		
	}
}