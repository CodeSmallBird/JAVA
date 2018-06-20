package cn.tedu.regex;

import java.util.Scanner;

public class PatternExer5 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		String str = s.nextLine();

		// 记录字符串的原长度
		int len1 = str.length();

		// 计算字母的个数
		str = str.replaceAll("[a-zA-Z]", "");
		// 记录字符串现在的长度
		int len2 = str.length();
		System.out.println(len1 - len2);

		// 计算数字的个数
		str = str.replaceAll("\\d", "");
		System.out.println(len2 - str.length());

		// 其他符号的个数
		System.out.println(str.length());
		
		count(str);

	}

	// "+"
	public static void count(String str){
		
		while(str.length() != 0){
			
			int len = str.length();
			
			// 先获取第一个字符
			char c = str.charAt(0);
			
			String pattern = "";
			
			if(c >= '0' && c <= '9' || c >= 'A' && c <= 'Z' || c >= 'a' && c <='z')
				pattern += c;
			else 
				pattern = "\\" + c;
			
			// 将所有的相同的字符替换掉
			str = str.replaceAll(pattern, "");
			
			System.out.println(c + ":" + (len - str.length()));
			
		}
		
	}

}
