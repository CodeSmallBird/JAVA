package cn.tedu.collection;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("d");
		list.add("a");
		list.add("l");
		list.add("b");
		list.add("o");
		list.add("a");

		// ��ȡ���б�
		System.out.println(list.subList(1, 4));

		// ��ȡָ��Ԫ�ص�һ�γ��ֵ�λ��
		// System.out.println(list.indexOf("a"));

		// List<String> list2 = new ArrayList<String>();
		// list2.add(new String("d"));
		// list2.add("a");
		// list2.add("l");
		// list2.add("b");
		// list2.add("o");

		// �ڱȽ�Ԫ�ص�ʱ���ǽ�����λ�Ƚ�
		// ����λ�Ƚϵ�ʱ����ʹ�õ�equals
		// System.out.println(list.equals(list2));

		// �滻ָ��λ���ϵ�Ԫ��
		// list.remove(2);
		// list.add(2, "f");
		// list.set(2, "f");

		// ��ָ���±괦����Ԫ��
		// list.add(1, "f");
		// list.add(5, "f");
		// list.add(7, "f");

		// list.remove("a");
		// �Ƴ�ָ���±�λ���ϵ�Ԫ��
		// list.remove(2);
		// list.remove(9);

		// ��ȡָ���±��ϵ�Ԫ��
		// System.out.println(list.get(3));

		System.out.println(list);

	}

}
