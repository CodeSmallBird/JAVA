package cn.tedu.string;

import java.util.Scanner;

public class StringExer2 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		String str = s.nextLine();

		// 将字符串转化为字符数组
		char[] cs = str.toCharArray();

		// 记录和
		int sum = 0;

		for (char c : cs) {

			if (c >= '0' && c <= '9')
				sum += (c - 48);
		}
		
		System.out.println(sum);

	}

}
