package cn.tedu.collection;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {

		Vector<String> v = new Vector<String>(7);

		v.add("d");
		v.add("e");
		v.add("s");
		v.add("hr");
		v.add("ra");

		// ��ȡ������
		Enumeration<String> e = v.elements();

		// �жϺ����Ƿ��и����Ԫ��
		while (e.hasMoreElements()) {

			// Ų��ָ���ȡԪ��
			String str = e.nextElement();
			System.out.println(str);
			// ������Ҫ�ڵ��������в���ԭ����
			// v.remove(str);
		}

		System.out.println(v);
		// ��ȡVector������
		// System.out.println(v.capacity());
		//
		// for (int i = 0; i < 21; i++) {
		// v.add("a");
		// }
		//
		// System.out.println(v.capacity());

	}

}
