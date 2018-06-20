public class MethodDemo3 {

	public static void main(String[] args){
		
		// System.out.println(sum(20000));
		System.out.println(add(20000));
		
	}
	
	public static int sum(int n){
		
		if(n == 1)
			return 1;
		
		// 在方法中调用了自己本身 --- 方法的递归
		return n + sum(n - 1);
		
	}
	
	public static int add(int n){
		
		int sum = 0;
		
		// 求n~1的和
		for(int i = n; i > 0; i--){
			sum += i;
		}
		
		return sum;
		
	}
}