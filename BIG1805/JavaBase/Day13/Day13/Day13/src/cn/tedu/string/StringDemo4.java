package cn.tedu.string;

public class StringDemo4 {

	public static void main(String[] args) {

		String str1 = "gsdbkfb";

		// 截取子字符串 --- 包左不包右 --- 包小不包大
		// System.out.println(str1.substring(1, 4));
		// 默认从这一位开始截取到最后
		System.out.println(str1.substring(2));

		// 替换指定的字符
		// System.out.println(str1.replace('b', '+'));

		// System.out.println(str1.lastIndexOf('b', 4));

		// 判断此字符串是否为空 --- 判断字符串长度是否为0
		// System.out.println(str1.isEmpty());

		// 哈希码的计算方法做过重写 --- 保证了同一个字符串在任何场景下的哈希值一定是一致
		// System.out.println(str1.hashCode());

		// intern表示强制返回此字符串在常量池中的地址
		// String str2 = new String("abc").intern();

		// System.out.println(str1 == str2);

	}

}
