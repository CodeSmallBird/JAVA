package cn.tedu.collection;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {

		Set<String> set = new HashSet<String>();

		// ���Ԫ��
		// HashSet����֤Ԫ�صĴ���˳��
		// ��ͬԪ�ػᱻ����
		set.add("dsa");
		set.add(new String("dsa"));
		set.add("aeg");
		set.add("esa");
		set.add("gds");
		set.add("hfi");

		for (String str : set) {
			System.out.println(str == "dsa");
		}

		// System.out.println(set);

	}

}
