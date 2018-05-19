package cn.tedu.regex;

import java.util.Scanner;

public class PatternExer5 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		// 获取字符串
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();

		while (str.length() != 0) {
			// 记录字符串原来的长度
			int len = str.length();

			// bsscs
			// 获取字符串的首位字符
			char c = str.charAt(0);

			// 记录正则格式
			String regex = "";

			if (c == '+' || c == '*' || c == '?' || c == '\\' || c == '.') {
				regex = "\\" + c;
			} else {
				regex += c;
			}

			// 祛除所有的相同的字符
			str = str.replaceAll(regex, "");

			// 计算字符出现的次数
			System.out.println(c + ":" + (len - str.length()));
		}
	}

}
