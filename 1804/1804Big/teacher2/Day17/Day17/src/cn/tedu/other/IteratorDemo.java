package cn.tedu.other;

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
		set.add("e");

		// 获取到这个迭代器
		Iterator<String> it = set.iterator();

		// 判断是否有后续元素
		while (it.hasNext()) {

			// 挪动指针获取元素
			String str = it.next();
			System.out.println(str);

			// set.remove(str);

			// 将当前在迭代的元素移除
			// it.remove();
		}

		System.out.println(set);
	}

}
