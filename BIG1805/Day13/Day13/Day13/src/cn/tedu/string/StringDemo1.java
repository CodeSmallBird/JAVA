package cn.tedu.string;

public class StringDemo1 {

	public static void main(String[] args) {

		String s1 = "ashol";
		String s2 = "ASHOL";

		// 1. s1和s2在底层是以字符数组的形式来存储
		// 2. 遍历两个字符数组，在遍历过程中对应位置上的字符依次相减
		// 3. 如果差是0，那么依次下一位相减，如果差不是0，那么直接将这个差返回
		// 4. 如果有一个字符串首先遍历完，那么返回两个字符串的长度之差
		// 如果返回值等于0，说明两个字符串一样
		// 如果返回值大于0， s1>s2
		// 如果返回值小于0， s1<s2
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareToIgnoreCase(s2));
		
		// 将字符串转化为大写
		System.out.println(s1.toUpperCase());
		System.out.println(s1);

		// 将字符串转化为小写
		System.out.println(s2.toLowerCase());
	}

}
