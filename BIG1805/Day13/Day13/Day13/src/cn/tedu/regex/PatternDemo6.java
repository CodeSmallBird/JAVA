package cn.tedu.regex;

public class PatternDemo6 {

	public static void main(String[] args) {

		String str = "你好";

		// 判断字符串是否至少出现了两次"a789vbnrfbmgbvb"
		// () 看作一个整体，那么这一个整体称之为是一个捕获组
		// System.out.println(str.matches(".*(ab).*\\1.*"));

		// 判断字符串是否是一个叠词
		// System.out.println(str.matches("(.)\\1+"));
		// 表示至少2个字符组成的字符串
		// System.out.println(str.matches("(.){2,}"));

		// ABAB 溜达溜达
		// System.out.println(str.matches("(..)\\1"));
		
		// AABB 高高兴兴
		System.out.println(str.matches("(.)\\1(.)\\2"));

		// \\n称之为是捕获组的编号
		// 在Java中，会对捕获组进行自动的编号，编号是从1开始的
		// 捕获组的编号是从(出现的位置开始计算的
		// (A((BC)D)E)(F)
		// \\1 A((BC)D)E
		// \\2 (BC)D
		// \\3 BC
		// \\4 F

	}

}
