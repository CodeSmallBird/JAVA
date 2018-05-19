package cn.tedu.string;

import java.util.Scanner;

/**
 * 输入一个字符串，统计这个字符中每一个字符出现的个数，重复的字符不再统计
 */
public class StringExer4 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		// 获取字符串
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();

		// 将字符串转化为字符数组
		char[] cs = str.toCharArray();

		// 定义布尔数组标记cs的每一位
		// 限定如果为false，则这一位没有被统计，如果为true，则这一位被统计了
		boolean[] bs = new boolean[cs.length];

		// 遍历数组
		for (int i = 0; i < cs.length; i++) {

			// 判断字符是否已经统计过
			if (bs[i]) {
				continue;
			}

			// 记录次数
			int count = 0;

			// 从当前位置开始寻找相同的字符
			for (int j = i; j < cs.length; j++) {
				if (cs[j] == cs[i]) {
					count++;
					bs[j] = true;
				}
			}

			System.out.println(cs[i] + ":" + count);
		}

	}

}
