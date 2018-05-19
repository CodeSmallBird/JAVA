package cn.tedu.regex;

public class PatternDemo2 {

	public static void main(String[] args) {

		String str = ";";

		// 字符串由3个字符组成
		// 第一个字符是a/b/c中的一个
		// 第二个字符是d/e/f中的一个
		// 第三个字符是x/y/z中的一个
		// System.out.println(str.matches("[bac][def][zyx]"));

		// 字符串是否是由一个字母组成
		// System.out.println(str.matches("[a-zA-Z]"));

		// 字符串是否是由一个数字组成
		// System.out.println(str.matches("[0-9]"));
		
		// 判断除了字母以外的长度为1的字符串
		System.out.println(str.matches("[^a-zA-Z]"));
	}

}
