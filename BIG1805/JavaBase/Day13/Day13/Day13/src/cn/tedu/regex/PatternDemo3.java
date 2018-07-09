package cn.tedu.regex;

public class PatternDemo3 {
	
	public static void main(String[] args) {
		
		String str = "p";
		
		// 判断一个字符串说是否是由一个字符组成
		// . 在正则中表示通配符
		System.out.println(str.matches("."));
		
		// 匹配 . 
		// \\. 首先\\.会被Java转义为\.，然后正则再转化为.
		System.out.println(str.matches("\\."));
		
		// 匹配 \
		// \\\\ 会被Java转义为\\,然后正则再转化为\
		System.out.println(str.matches("\\\\"));
		
		System.out.println(str.matches("\\d"));
		
	}

}
