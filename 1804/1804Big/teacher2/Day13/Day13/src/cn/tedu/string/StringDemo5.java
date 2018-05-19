package cn.tedu.string;

public class StringDemo5 {

	public static void main(String[] args) {

		String str = "arJKRty";

		// 截取子字符串
		// String sub = str.substring(3, str.length());
		// String sub = str.substring(3);
		// System.out.println(sub);
		
		String str2 = "ARjkrTY";
		
		// 按字典顺序（升序）比较两个字符串
		// 1. 依次遍历这两个字符数组，遍历过程中对应位置上的字符相减
		// 2. 相减的差如果不是0，则直接返回
		// 3. 相减的差是0 ，则下一位再继续相减
		// 4. 如果每一位相减都为0，那么返回两个字符串的长度之差
		// 如果返回了一个正数，说明对象字符串要大一些
		// 反之，说明参数字符串要大一些
		System.out.println(str.compareTo(str2));
		System.out.println(str.compareToIgnoreCase(str2));
		
		// 转化为大写
		System.out.println(str.toUpperCase());
		
		// 转化为小写
		System.out.println(str2.toLowerCase());
	}

}
