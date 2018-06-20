package cn.tedu.string;

import java.util.Scanner;

public class StringExer1 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		// 获取一个字符串和一个数字
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		int n = s.nextInt();

		// 将字符串转化为字节数组
		byte[] bs = str.getBytes();

		// 按照指定的个字节个数进行截取
		String sub = new String(bs, 0, n);

		// 要比较子字符串的最后一位字符和原字符串的对应位置上的字符是否一致
		if (sub.charAt(sub.length() - 1) != str.charAt(sub.length() - 1)) {
			sub = new String(bs, 0, n - 1);
		}
		
		System.out.println(sub);
	}

}
