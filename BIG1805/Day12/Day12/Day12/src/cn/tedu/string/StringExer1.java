package cn.tedu.string;

import java.util.Scanner;

public class StringExer1 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		// 获取字符串
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();

		// 定义变量记录字母个数
		int letter = 0;
		// 定义变量记录数字个数
		int number = 0;
		// 记录其他符号的个数
		int symbol = 0;

		// 遍历字符串，依次判断每一位是一个什么类型的字符
		for (int i = 0; i < str.length(); i++) {

			// 获取这一位上的字符
			char c = str.charAt(i);

			if (c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z') {
				letter++;
			} else if (c >= '0' && c <= '9') {
				number++;
			} else {
				symbol++;
			}

		}

		System.out.println("字母：" + letter);
		System.out.println("数字：" + number);
		System.out.println("符号：" + symbol);
	}

}
