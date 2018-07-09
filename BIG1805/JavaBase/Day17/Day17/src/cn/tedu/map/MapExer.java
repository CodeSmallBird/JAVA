package cn.tedu.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapExer {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		String str = s.nextLine();

		// 定义一个映射存储每一个字符出现的次数
		Map<Character, Integer> map = new HashMap<>();

		for (int i = 0; i < str.length(); i++) {

			// 获取对应位置上的字符
			char c = str.charAt(i);

			// 判断这个字符是否存在，如果存在，则对应的次数+1;
			// 如果不存在，则放入，并且设置次数为1
			if (map.containsKey(c))
				map.put(c, map.get(c) + 1);
			else
				map.put(c, 1);

		}

		// 遍历映射
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
	}

}
