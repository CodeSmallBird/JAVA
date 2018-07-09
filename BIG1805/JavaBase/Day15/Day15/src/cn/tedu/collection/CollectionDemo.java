package cn.tedu.collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {

	public static void main(String[] args) {

		// ������һ�����϶��󣬴洢��Ԫ��������String
		Collection<String> c = new ArrayList<String>();

		// ���Ԫ��
		c.add("adw");
		c.add("dse");
		c.add("fdik");
		c.add("adw");
		c.add("tise");
		c.add("fyf");
		c.add("yhs");
		
		// ��ȡ�����е�Ԫ�ظ���
		System.out.println(c.size());

		// ������ת��Ϊ����
		// Object[] os = c.toArray();
		// for (Object o : os) {
		// System.out.println(((String)o).length());
		// }
		// String[] os = (String[]) c.toArray();
		
		String[] ss = c.toArray(new String[0]);
		for (String str : ss) {
			System.out.println(str);
		}

		// ��ռ���
		// c.clear();

		// �жϼ����Ƿ�Ϊ��
		// System.out.println(c.isEmpty());

		// �Ƴ�Ԫ�� --- �Ƴ���һ����ͬ��Ԫ��
		// c.remove("adw");
		// ���Ƴ�Ԫ��֮ǰʵ���ϻ����жϼ������Ƿ�������Ԫ��
		// c.remove("abc");

		// �жϼ������Ƿ����ָ����Ԫ��
		// boolean b = c.contains("dye");
		// System.out.println(b);

		System.out.println(c);
	}

}
