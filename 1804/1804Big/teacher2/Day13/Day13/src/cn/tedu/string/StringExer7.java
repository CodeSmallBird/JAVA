package cn.tedu.string;

import java.util.Scanner;

public class StringExer7 {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {

		// 获取字符串和数字
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		int num = s.nextInt();

		// 将字符串转化为字节数组
		byte[] bs = str.getBytes("utf-8");

		// 按照指定的字节个数来截取一个子字符串
		String sub = new String(bs, 0, num, "utf-8");

		// 判断子字符串最后一个字符和原字符串对应位置上的字符是否一致
		sub = judge(str, sub) ? sub : new String(bs, 0, --num, "utf-8");
		sub = judge(str, sub) ? sub : new String(bs, 0, --num, "utf-8");

		System.out.println(sub);
	}

	public static boolean judge(String str, String sub) {
		// 获取子字符串的最后一位的下标
		int index = sub.length() - 1;
		// 判断对应位置上的字符是否一致
		return sub.charAt(index) == str.charAt(index);
	}

}
