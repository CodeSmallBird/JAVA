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

		// ��ȡ�����еļ� --- �����еļ��ŵ�һ��Set������
		// Set<String> keys = map.keySet();
		// for (String key : keys) {
		// System.out.println(key + ":" + map.get(key));
		// }

		// ֱ�ӻ�ȡ���еļ�ֵ��
		// Set�зŵ��Ǽ�ֵ�ԣ�����Ԫ�������Ǽ�ֵ������ --- Map.Entry
		Set<Map.Entry<String, Integer>> entrys = map.entrySet();
		for (Map.Entry<String, Integer> entry : entrys) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
	}

}
