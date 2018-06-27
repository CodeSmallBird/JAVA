package cn.tedu.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IteratorDemo {

	public static void main(String[] args) {

		Set<String> set = new HashSet<String>();

		set.add("a");
		set.add("b");
		set.add("c");
		set.add("d");

		// ��ȡ������
		Iterator<String> it = set.iterator();

		// �ж��Ƿ�����һ��Ԫ��
		while (it.hasNext()) {

			// Ų��ָ���ȡ���Ԫ��
			String str = it.next();
			System.out.println(str);

			// ɾ����ǰ�ڵ�����Ԫ��
			it.remove();
			// ֱ����ɾԭ���ϻ��׳��쳣
			// set.remove(str);

		}

		System.out.println(set);

	}

}
