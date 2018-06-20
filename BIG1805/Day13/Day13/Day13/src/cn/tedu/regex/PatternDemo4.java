package cn.tedu.regex;

public class PatternDemo4 {

	public static void main(String[] args) {

		String str = "9hg";

		// 数量词 --- 每一个字符最多只能有一个数量词来限制
		// 匹配由小写字母开头由数字结束的字符串
		// * 表示前边的这个字符可以出现也可以不出现 >=0
		// System.out.println(str.matches("[a-z].*\\d"));

		// 匹配由数字开头的至少两个字符组成的字符串
		// + 表示前边的这个字符至少出现一次 >=1
		// System.out.println(str.matches("\\d.+"));
		
		// 匹配以数字开头的至多两个字符组成的字符串
		// ? 表示前边的这个字符最多出现一次 <=1
		System.out.println(str.matches("\\d.?"));

	}

}
