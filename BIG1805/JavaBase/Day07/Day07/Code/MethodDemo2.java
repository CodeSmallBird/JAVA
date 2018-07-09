public class MethodDemo2 {

	// arguments
	// 如果在调用主函数的时候没有传参，那么这个参数args的长度就是0 --- args = new String[0];
	public static void main(String[] args){

		System.out.println(args);
		for(String str : args){
			System.out.println(str);
		}
		// 方法在调用的时候遵循的是最相近匹配---只要哪个方法的形参和这个实参最相近，就调用哪个方法
		System.out.println(add(2, 5));
	}
	
	// 求三个整数的和
	public static int add(int i, int j, int k){
		return i + j + k;
	}
	public static int add(int i, int j){
		return i + j;
	}
	// 求一个整数和一个小数的和
	public static double add(int i, double j){
		System.out.println("add(int, double) running~~~");
		return i + j;
	}
	public static double add(double i, int j){
		return i + j;
	}
	// 求两个小数的和
	public static double add(double i, double j){
		System.out.println("add(double, double) running~~~");
		return i + j;
	}

}