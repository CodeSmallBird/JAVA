package cn.tedu.string;

public class StringDemo6 {

	public static void main(String[] args) {

		String str = "jhtrsjbs";
		String str2 = new String("JHTRSJBS");
		
		// 判断的是实际值
		// 底层逐位比较
		System.out.println(str.equals(str2));
		System.out.println(str.equalsIgnoreCase(str2));

		// 判断字符串是否是以指定的后缀结尾
		// System.out.println(str.endsWith(".java"));
		// 判断字符串是否是以指定的前缀开头
		// System.out.println(str.startsWith("A"));

		// 拼接两个字符串---数组的复制
		// 相当于将两个字符数组合并在了一块
		// System.out.println(str.concat("def"));

		// 判断是否包含指定的子串
		// System.out.println(str.contains("ts"));

	}

}
