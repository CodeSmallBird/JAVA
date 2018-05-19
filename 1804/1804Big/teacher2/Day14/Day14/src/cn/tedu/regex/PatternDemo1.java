package cn.tedu.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternDemo1 {

	public static void main(String[] args) {

		String str = "abf";

		// 判断字符串是一个"abc"
		// System.out.println(str.equals("abc"));
		// 
		Pattern p = Pattern.compile("abc");
		Matcher m = p.matcher(str);
		boolean b = m.matches();
		System.out.println(b);

		System.out.println(str.matches("abc"));
	}

}
