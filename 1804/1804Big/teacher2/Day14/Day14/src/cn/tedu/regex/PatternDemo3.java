package cn.tedu.regex;

public class PatternDemo3 {

	public static void main(String[] args) {

		String str = "m9+";

		// 字符串由3个字符组成，第一个字符是字母，第二个字符是一个数字
		// . 在正则中表示通配符
		System.out.println(str.matches("[a-zA-Z]\\d."));

		// 匹配一个"."
		System.out.println(str.matches("\\."));

		// 匹配 \
		// \\\\ 由Java转义为\\, Pattern再将\\转义为\
		System.out.println(str.matches("\\\\"));
	}

}
