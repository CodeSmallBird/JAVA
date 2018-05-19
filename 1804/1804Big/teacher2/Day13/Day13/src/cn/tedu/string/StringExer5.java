package cn.tedu.string;

import java.util.Scanner;

/**
 * 输入一个字符串，判断这个字符串是否是一个回文字符串
 */
public class StringExer5 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		String str = s.nextLine();

		// 将字符串转化为字符数组
		char[] cs = str.toCharArray();
		// 头尾是否一致
		for (int i = 0, j = str.length() - 1; i < j; i++, j--) {
			if (cs[i] != cs[j])
				System.out.println("不是回文");
		}

	}

}
