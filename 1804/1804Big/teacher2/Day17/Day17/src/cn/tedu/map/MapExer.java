package cn.tedu.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapExer {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		// 获取字符串
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();

		// 定义一个映射存储元素以及其出现的次数
		Map<Character, Integer> map = new HashMap<>();

		// 遍历字符串
		for (int i = 0; i < str.length(); i++) {

			// 获取对应位置上的字符
			char c = str.charAt(i);

			// 判断字符是否已经出现过
			if (map.containsKey(c)) {
				// 如果该字符已经存在，则在上一次的基础上来累加1
				map.put(c, map.get(c) + 1);
			} else {
				// 如果该字符不存在，则将其放入映射中，并且设置次数为1
				map.put(c, 1);
			}

		}

		// 遍历映射
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			// 打印字符以及其出现的次数
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}

	}

}
