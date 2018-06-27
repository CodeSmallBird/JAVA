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

		// 获取迭代器
		Iterator<String> it = set.iterator();

		// 判断是否有下一个元素
		while (it.hasNext()) {

			// 挪动指针获取这个元素
			String str = it.next();
			System.out.println(str);

			// 删除当前在迭代的元素
			it.remove();
			// 直接增删原集合会抛出异常
			// set.remove(str);

		}

		System.out.println(set);

	}

}
