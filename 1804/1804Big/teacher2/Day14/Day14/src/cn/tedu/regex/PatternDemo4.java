package cn.tedu.regex;

public class PatternDemo4 {

	public static void main(String[] args) {

		String str = "98ob";

		// 每一个字符之后最多只能跟一个数量词

		// 匹配有字符a组成的字符串 "a" "aa" "aaaaaaa"
		// + 表示之前的这个字符至少出现一次 >= 1
		// System.out.println(str.matches("a+"));

		// 字符串的开头是数字，结尾是小写字母
		// * 表示这个字符可以出现0次或者多次 >=0
		System.out.println(str.matches("\\d.*[a-z]"));

		// 字符串的开头是数字，结尾是小写字母,字符个数不超过3个字符的字符串
		// ? 表示这个字符最多出现一次 0<=n<=1
		System.out.println(str.matches("\\d.?[a-z]"));
	}

}
