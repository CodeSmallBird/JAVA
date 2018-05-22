package cn.tedu.map;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {

		// 映射的键是String，值是Integer
		Map<String, Integer> map = new HashMap<>();

		// 向映射中添加元素
		map.put("abd", 4);
		map.put("dae", 3);
		map.put("wld", 4);
		map.put("aml", null);
		// 如果键重复，则对应的值覆盖
		map.put("abd", 8);

		// 获取键值对的个数
		System.out.println(map.size());

		// 判断映射中是否为空
		// System.out.println(map.isEmpty());

		// 根据键获取对应的值
		// 如果键不存在，则返回null
		// System.out.println(map.get("bto"));

		// Map<String, Integer> map2 = new HashMap<>();
		// map2.put("dae", 3);
		// map2.put("wld", 4);
		// map2.put("aml", 9);
		// map2.put("abd", 4);
		//
		// System.out.println(map.equals(map2));

		// 清空映射
		// map.clear();

		// 判断是否存在指定的键
		// System.out.println(map.containsKey("abc"));
		// 判断是否存在指定的值
		// System.out.println(map.containsValue(7));

		// 删除键值对
		// map.remove("abc");

		System.out.println(map);

	}

}
