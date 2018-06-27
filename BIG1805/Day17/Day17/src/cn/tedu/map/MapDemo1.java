package cn.tedu.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MapDemo1 {

	public static void main(String[] args) {

		// 表示键是String，值是Integer类型
		Map<String, Integer> map = new HashMap<>();

		// 添加键值对
		map.put("adw", 5);
		map.put("srg", 7);
		map.put("bgn", 4);
		map.put("poi", 5);
		map.put("max", 0);
		// 如果键重复，则对应的值覆盖
		map.put("max", 12);
		map.put("mon", null);

		// 将映射中的所有的值放入一个集合中
		Collection<Integer> values = map.values();
		System.out.println(values);

		// 获取键值对的个数
		// System.out.println(map.size());

		// 判断映射是否为空
		// System.out.println(map.isEmpty());

		// Map<String, Integer> map2 = new HashMap<>();
		// map2.put("max", 0);
		// map2.put("bgn", 4);
		// map2.put("poi", 5);
		// map2.put("srg", 7);
		// map2.put("adw", 5);
		//
		// System.out.println(map.equals(map2));

		// 清空映射
		// map.clear();

		// 判断是否包含指定的键
		// System.out.println(map.containsKey("mod"));
		// 判断是否包含指定的值
		// System.out.println(map.containsValue(8));

		// 移除键值对
		// map.remove("srg");
		// map.remove("src");

		// 根据键获取对应的值
		// System.out.println(map.get("max"));
		// 如果这个键值对不存在则返回null
		// System.out.println(map.get("mon"));

		System.out.println(map);

	}

}
