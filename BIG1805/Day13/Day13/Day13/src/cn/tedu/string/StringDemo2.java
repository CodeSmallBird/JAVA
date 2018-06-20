package cn.tedu.string;

public class StringDemo2 {

	public static void main(String[] args) {

		String s1 = "dhvoanhln";

		// 将指定的字符串拼接到原字符串末尾
		// System.out.println(s1.concat(""));
		// System.out.println(s1);

		// 判断是否包含指定的子字符串
		// System.out.println(s1.contains("0"));

		// 判断是否是指定的结尾
		// System.out.println(s1.endsWith("a"));

		// 判断是否是指定的开头
		System.out.println(s1.startsWith("d"));
		
		// 转化为字符数组之后逐位比较
		System.out.println(s1.equals(new String("DHVOANHLN")));
		System.out.println(s1.equalsIgnoreCase("DHVOANHLN"));
	}

}
