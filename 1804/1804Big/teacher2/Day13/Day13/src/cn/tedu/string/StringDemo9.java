package cn.tedu.string;

public class StringDemo9 {

	public static void main(String[] args) {

		// String s1 = "abc";
		// String s2 = new String("abc");
		// System.out.println(s1 == s2);

		// 底层会强制返回这个字符串在常量池的地址
		// String s3 = s2.intern();
		// System.out.println(s1 == s3);

		// String str = "";
		// 判断字符串是否是一个空字符串---长度为0
		// System.out.println(str.isEmpty());

		// String str = "sdhaodoad";
		// 用指定的字符替换原有的字符
		// System.out.println(str.replace('a', '+'));
		
		String str = " \tdoflnl\t\r\n\t\f\b";
		System.out.println(str);
		// 去掉字符串前后的空白字符---掐头去尾
		System.out.println(str.trim());
	}

}
