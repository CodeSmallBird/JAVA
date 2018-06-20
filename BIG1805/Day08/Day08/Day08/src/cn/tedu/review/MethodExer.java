package cn.tedu.review;

import java.util.Scanner;

public class MethodExer {

	// 注解
	@SuppressWarnings("resource")  // SuppressWarnings --- 压制警告
	public static void main(String[] args) {

		// 导包 : Ctrl + Shift + o
		// 警告 ---Warning --- 表示Eclipse编译到这儿的时候认为这个地方可能会产生问题
		// 警告一般不影响程序的执行
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		// 错误 --- Error --- 一定要改动
		// System.out.println(aaaaaa);

		System.out.println(faibo(n));

	}

	// 获取斐波那契数列的第n项
	// 从第三项开始，每一项是它之前两项的和
	// n >= 3 f(n) = f(n - 1) + f(n - 2)
	public static int faibo(int n) {

		if (n == 1)
			return 0;

		if (n == 2)
			return 1;

		return faibo(n - 1) + faibo(n - 2);
	}

}
