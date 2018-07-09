package cn.tedu.finalx;

public class FinalDemo1 {

	public static void main(String[] args) {

		// 定义好之后不能够二次赋值
		final int i;
		i = 6;
		System.out.println(i);

		// arr是一个数组，所以arr的值是一个地址
		final int[] arr = { 2, 6, 8, 4, 5, 1, 0 };
		arr[3] = 9;

		add(i);
		System.out.println(i);

	}

	public static void add(int i) {
		i++;
	}

}

class A {

	// 在对象创建完成之前给值
	// final int i = 5;
	final int i;

	// static final int j = 8;
	// 静态常量需要在类加载完成之前给值
	static final int j;

	static {
		j = 5;
	}

	// {
	// i = 3;
	// }

	public A() {
		this.i = 6;
	}

}
