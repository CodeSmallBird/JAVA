package cn.tedu.string;

import java.util.Scanner;

/**
 * 输入一个字符串，提取这个字符串中的数字并求和
 */
public class StringExer2 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		// 获取字符串
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();

		// 记录和
		int sum = 0;

		// 遍历这个字符串
		for (int i = 0; i < str.length(); i++) {

			// 获取对应位置上的字符
			char c = str.charAt(i);

			// 判断是否是一个数字
			if (c >= '0' && c <= '9') {
				sum += (c - 48);
			}

		}

		System.out.println(sum);

	}

}
