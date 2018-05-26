package cn.tedu.jdk5;

public class VarDemo {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		// int sum = add(new int[] { 2, 5 });
		int sum2 = add(2, 5);
		int sum3 = add(2, 5, 7);
		int sum4 = add(2, 5, 7, 1);
		int sum5 = add(1);
		int sum6 = add();
		int sum7 = add(new int[] { 2, 6, 1 });

	}

	// 可变参数
	// 可变参数本质上是一个数组
	public static int add(int... arr) {

		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}

		return sum;
	}

}
