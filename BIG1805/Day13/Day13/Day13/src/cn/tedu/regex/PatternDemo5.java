package cn.tedu.regex;

public class PatternDemo5 {

	public static void main(String[] args) {

		String str = "7853962";

		// 匹配由数字组成的长度至少为5的字符串
		// {n,} 表示这个字符至少出现n次 >= n
		// System.out.println(str.matches("\\d{5,}"));

		// 匹配由8-12个字符组成的字符串
		// System.out.println(str.matches(".{8,12}"));

		// 匹配由6个数字组成的字符串
		System.out.println(str.matches("\\d{6}"));
	}

}
