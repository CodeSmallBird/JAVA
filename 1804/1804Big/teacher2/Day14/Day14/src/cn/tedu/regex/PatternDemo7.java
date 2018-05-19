package cn.tedu.regex;

import java.util.Arrays;

public class PatternDemo7 {

	public static void main(String[] args) {

		String str = "28sfdgv4dsz78dgks55";

		// 以数字为边界将字符串切成多个子字符串
		// 作为边界的符号会被切掉、
		// 如果两个边界符相连，则中间会切出一个""
		// 如果边界符在末尾会被直接切掉
		String[] arr = str.split("[0-9]");

		System.out.println(Arrays.toString(arr));
		System.out.println(arr.length);
	}

}
