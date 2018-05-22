package cn.tedu.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo2 {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<>();
		map.put("abd", 4);
		map.put("dae", 3);
		map.put("wld", 4);
		map.put("aml", null);

		// 获取所有的键
		// 将所有的键放到一个Set集合中
		// Set<String> keys = map.keySet();
		//
		// for (String key : keys) {
		// System.out.println(key + "=" + map.get(key));
		// }

		// 获取所有的键值对
		// 将所有的键值对放到了一个Set集合中
		// Set中方的是键值对---Map.Entry
		Set<Map.Entry<String, Integer>> entrys = map.entrySet();

		for (Map.Entry<String, Integer> entry : entrys) {
			System.out.println(entry.getKey() + "=" + entry.getValue());
		}
		// for (Map.Entry<String, Integer> entry : map.entrySet()) {
		// System.out.println(entry.getKey() + "=" + entry.getValue());
		// }

	}

}
