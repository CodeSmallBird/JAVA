public class MethodDemo1 {
	
	public static void main(String[] args){
		
		// 方法构成重载的时候，调用方法是靠传入的实参来确定要调用的是哪个方法
		System.out.println(add(3, 4));
		System.out.println(add(3, 4, 5));
		System.out.println(add(3, 4.1));
		
	}

	// 在同一类中定义多个方法名一致而参数列表不同的方法 --- 方法的重载
	// 求两个整数的和
	public static int add(int i, int j){
		return i + j;
	}
	
	// 求三个整数的和
	public static int add(int i, int j, int k){
		return i + j + k;
	}
	
	// add(2, 7.1);
	// add(2.6, 9);
	// 求一个小数和一个整数的和
	public static double add(int i, double j){
		return i + j;
	}
	
	public static double add(double j , int i){
		return i + j;
	}
	
}