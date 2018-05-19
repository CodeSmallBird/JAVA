package cn.tedu.string;

import java.util.Scanner;

/**
 * 输入一个字符串，统计里面字母、数字、其他符号的个数
 */
public class StringExer1 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		// 获取字符串
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();

		// 将字符串转化为字符数组
		char[] cs = str.toCharArray();

		// 记录字母、数字、其他符号的个数
		int letter = 0;
		int number = 0;
		int symbol = 0;

		// 遍历数组
		for (char c : cs) {

			// 判断是否是一个字母
			if (c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z') {
				letter++;
			} /* 判断是否是一个数字 */else if (c >= '0' && c <= '9') {
				number++;
			} else {
				symbol++;
			}

		}

		System.out.println("字母：" + letter);
		System.out.println("数字：" + number);
		System.out.println("其他符号：" + symbol);
	}

}
