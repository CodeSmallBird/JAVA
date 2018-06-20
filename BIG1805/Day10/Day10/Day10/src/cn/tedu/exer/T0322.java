package cn.tedu.exer;

import java.util.Scanner;

public class T0322 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		// 获取要输出的项数
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		if (n <= 0)
			System.out.println("项数非法！！！");
		else if (n == 1)
			System.out.println("0");
		else if (n == 2)
			System.out.println("0,1");
		else {
			// 先输出第一项和第二项
			System.out.print("0,1");

			// 定义一个变量来记录第一项
			int first = 0;

			// 定义一个变量来记录第二项
			int second = 1;

			for (int i = 3; i <= n; i++) {

				// 计算第三项
				int third = first + second;
				System.out.print("," + third);

				first = second;
				second = third;
			}

		}

	}

}
