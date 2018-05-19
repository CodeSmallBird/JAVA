package cn.tedu.regex;

import java.util.Scanner;

public class PatternExer6 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		// 获取字符串
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();

		// 记录字符串的长度
		double len = str.length();

		// 将其中的叠字替换为单字
		str = str.replaceAll("(.)\\1+", "$1");

		// 计算平均碎片长度
		System.out.println(len / str.length());
	}

}
