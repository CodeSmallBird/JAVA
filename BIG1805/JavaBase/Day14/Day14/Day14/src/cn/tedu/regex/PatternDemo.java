package cn.tedu.regex;

import java.util.Arrays;

public class PatternDemo {
	
	public static void main(String[] args) {
		
		String str = "1sdf9fcs06cbk2bxcck4fd77";
		
		// 以数字作为边界符将字符串进行切分
		// 如果两个边界符相连，切割出来的是一个 ""
		// 只要边界符在最后，则直接整个切掉
		String[] ss = str.split("\\d");
		
		System.out.println(Arrays.toString(ss));
		
	}

}
