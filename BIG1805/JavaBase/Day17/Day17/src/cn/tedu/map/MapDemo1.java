package cn.tedu.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MapDemo1 {

	public static void main(String[] args) {

		// ��ʾ����String��ֵ��Integer����
		Map<String, Integer> map = new HashMap<>();

		// ��Ӽ�ֵ��
		map.put("adw", 5);
		map.put("srg", 7);
		map.put("bgn", 4);
		map.put("poi", 5);
		map.put("max", 0);
		// ������ظ������Ӧ��ֵ����
		map.put("max", 12);
		map.put("mon", null);

		// ��ӳ���е����е�ֵ����һ��������
		Collection<Integer> values = map.values();
		System.out.println(values);

		// ��ȡ��ֵ�Եĸ���
		// System.out.println(map.size());

		// �ж�ӳ���Ƿ�Ϊ��
		// System.out.println(map.isEmpty());

		// Map<String, Integer> map2 = new HashMap<>();
		// map2.put("max", 0);
		// map2.put("bgn", 4);
		// map2.put("poi", 5);
		// map2.put("srg", 7);
		// map2.put("adw", 5);
		//
		// System.out.println(map.equals(map2));

		// ���ӳ��
		// map.clear();

		// �ж��Ƿ����ָ���ļ�
		// System.out.println(map.containsKey("mod"));
		// �ж��Ƿ����ָ����ֵ
		// System.out.println(map.containsValue(8));

		// �Ƴ���ֵ��
		// map.remove("srg");
		// map.remove("src");

		// ���ݼ���ȡ��Ӧ��ֵ
		// System.out.println(map.get("max"));
		// ��������ֵ�Բ������򷵻�null
		// System.out.println(map.get("mon"));

		System.out.println(map);

	}

}
