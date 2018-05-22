package cn.tedu.other;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("a");
		list.add("a");

		// 将list中的"a"替换为"+"
		// Collections.replaceAll(list, "a", "+");
		// 翻转列表
		// Collections.reverse(list);

		// 交换下标0和1的元素
		// Collections.swap(list, 0, 1);
		// String str = list.get(0);
		// list.set(0, list.get(1));
		// list.set(1, str);
		
		List<String> list2 = Collections.synchronizedList(list);
		System.out.println(list2);
		
		// 将数组转化为一个大小不可变的列表
		List<String> list3 = Arrays.asList("a","b","c");
		System.out.println(list3);
		
		list3.add("d");
	}

}
