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

		// 截取子列表
		System.out.println(list.subList(1, 4));

		// 获取指定元素第一次出现的位置
		// System.out.println(list.indexOf("a"));

		// List<String> list2 = new ArrayList<String>();
		// list2.add(new String("d"));
		// list2.add("a");
		// list2.add("l");
		// list2.add("b");
		// list2.add("o");

		// 在比较元素的时候是进行逐位比较
		// 在逐位比较的时候是使用的equals
		// System.out.println(list.equals(list2));

		// 替换指定位置上的元素
		// list.remove(2);
		// list.add(2, "f");
		// list.set(2, "f");

		// 在指定下标处插入元素
		// list.add(1, "f");
		// list.add(5, "f");
		// list.add(7, "f");

		// list.remove("a");
		// 移除指定下标位置上的元素
		// list.remove(2);
		// list.remove(9);

		// 获取指定下标上的元素
		// System.out.println(list.get(3));

		System.out.println(list);

	}

}
