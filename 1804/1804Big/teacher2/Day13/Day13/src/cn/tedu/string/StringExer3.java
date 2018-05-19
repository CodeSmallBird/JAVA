package cn.tedu.string;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 输入一个字符串，提取这个字符串中的数字并进行升序排序
 */
public class StringExer3 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		// 获取字符串
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();

		// 存储提取的数字
		char[] cs = new char[str.length()];
		
		// 记录提取的个数
		int count = 0;

		// 遍历字符串
		for (int i = 0; i < str.length(); i++) {

			// 获取对应下标位置上的字符
			char c = str.charAt(i);

			// 判断这个字符是否是一个数字
			if (c >= '0' && c <= '9') {
				cs[count++] = c;
			}

		}
		
		// 去掉数组中没有使用的位置
		cs = Arrays.copyOf(cs, count);
		
		// 排序
		Arrays.sort(cs);
		
		for (char c : cs) {
			System.out.println(c);
		}

	}

}
