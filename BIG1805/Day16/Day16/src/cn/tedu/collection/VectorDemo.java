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

		// 获取迭代器
		Enumeration<String> e = v.elements();

		// 判断后续是否有更多的元素
		while (e.hasMoreElements()) {

			// 挪动指针获取元素
			String str = e.nextElement();
			System.out.println(str);
			// 尽量不要在迭代过程中操作原集合
			// v.remove(str);
		}

		System.out.println(v);
		// 获取Vector的容量
		// System.out.println(v.capacity());
		//
		// for (int i = 0; i < 21; i++) {
		// v.add("a");
		// }
		//
		// System.out.println(v.capacity());

	}

}
