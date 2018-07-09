package cn.tedu.regex;

public class PatternDemo2 {

	public static void main(String[] args) {

		String str = "+";

		// 判断一个字符串是否是由abc\def\opq其中的字符组成
		// System.out.println(str.matches("[bac][def][opq]"));

		// 判断是否是一个由一个字母组成的字符串
		// System.out.println(str.matches("[a-zA-Z]"));
		
		// 判断一个字符串是否由一个字符组成，而这个字符不是a\b\c
		System.out.println(str.matches("[^abc]"));
	}

}
