package cn.tedu.review;

import java.util.Scanner;

public class OperatorExer {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// 获取一个整数
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();

		// 定义一个变量来记录1的个数
		int count = 0;

		// 统计1的个数
		for (int i = 0; i < 32; i++) {

			// 判断最后一位是否为1
			if ((num & 1) == 1) {
				count++;
			}

			// 将此数字右移一位
			num >>= 1;

		}

		System.out.println(count);

	}

}
