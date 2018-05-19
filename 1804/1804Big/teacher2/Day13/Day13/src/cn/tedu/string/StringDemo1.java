package cn.tedu.string;

public class StringDemo1 {

	public static void main(String[] args) {

		// s1实际上指向的是常量池
		String s1 = "ab";
		// s2实际上是指向了堆内存，堆内存中指向常量池
		String s2 = new String("ab");
		// "a"和"b"是两个字面量，编译期间就会对字面量进行运算。
		// String s3 = "ab";
		String s3 = "a" + "b";
		String s4 = "a";
		// 在字符串拼接运算的时候，实际上底层是调用了StringBuilder中的append方法
		// s4 = new StringBuilder(s4).append("b").toString();
		s4 = s4 + "b";

		System.out.println(s1 == s2); // false
		System.out.println(s1 == s3); // true
		System.out.println(s1 == s4); // false

		System.out.println(s2 == s4);
	}

}
