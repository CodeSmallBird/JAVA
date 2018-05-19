package cn.tedu.regex;

public class PatternDemo {

	public static void main(String[] args) {

		String str = "8531585285";

		// 匹配一个由数字组成的长度为5的字符串
		// {n} 表示这个字符恰好出现n次
		System.out.println(str.matches("\\d{5}"));

		// 匹配一个由数字组成的长度至少为5的字符串
		// {n,} 表示这个字符至少出现n次
		// System.out.println(str.matches("\\d{5,}"));

		// 匹配长度介于8~12的字符串
		System.out.println(str.matches(".{8,12}"));

	}

}
