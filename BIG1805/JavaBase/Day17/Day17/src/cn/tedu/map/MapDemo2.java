package cn.tedu.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo2 {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<>();
		map.put("adw", 5);
		map.put("srg", 7);
		map.put("bgn", 4);
		map.put("poi", 5);
		map.put("max", 0);

		// 获取到所有的键 --- 将所有的键放到一个Set集合中
		// Set<String> keys = map.keySet();
		// for (String key : keys) {
		// System.out.println(key + ":" + map.get(key));
		// }

		// 直接获取所有的键值对
		// Set中放的是键值对，所以元素类型是键值对类型 --- Map.Entry
		Set<Map.Entry<String, Integer>> entrys = map.entrySet();
		for (Map.Entry<String, Integer> entry : entrys) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
	}

}
