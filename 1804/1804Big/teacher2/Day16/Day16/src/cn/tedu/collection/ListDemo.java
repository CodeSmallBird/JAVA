package cn.tedu.collection;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();

		list.add("abc");
		list.add("def");
		list.add("act");
		list.add("csa");
		list.add("act");

		((ArrayList<String>) list).trimToSize();

		// 替换指定下标上的元素
		// list.remove(1);
		// list.add(1, "acd");
		// list.set(1, "acd");

		// 移除指定下标上的元素
		// list.remove(1);

		// 获取指定的元素第一次出现的位置
		// 如果找不到，返回-1
		// System.out.println(list.indexOf("acd"));

		// 获取指定下标位置上的元素
		// System.out.println(list.get(2));

		// List<String> list2 = new ArrayList<String>();
		// list2.add(new String("abc"));
		// list2.add("def");
		// list2.add("act");
		// list2.add("csa");

		// 比较两个集合中的元素是否一致
		// 按顺序依次用equals比较每一位上的元素
		// System.out.println(list.equals(list2));

		// 在指定的下标位置上插入指定的元素
		// list.add(1, "opa");
		// list.add(5, "opa");

		System.out.println(list);

	}

}
