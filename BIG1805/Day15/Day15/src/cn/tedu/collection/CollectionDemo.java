package cn.tedu.collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {

	public static void main(String[] args) {

		// 创建了一个集合对象，存储的元素类型是String
		Collection<String> c = new ArrayList<String>();

		// 添加元素
		c.add("adw");
		c.add("dse");
		c.add("fdik");
		c.add("adw");
		c.add("tise");
		c.add("fyf");
		c.add("yhs");
		
		// 获取集合中的元素个数
		System.out.println(c.size());

		// 将集合转化为数组
		// Object[] os = c.toArray();
		// for (Object o : os) {
		// System.out.println(((String)o).length());
		// }
		// String[] os = (String[]) c.toArray();
		
		String[] ss = c.toArray(new String[0]);
		for (String str : ss) {
			System.out.println(str);
		}

		// 清空集合
		// c.clear();

		// 判断集合是否为空
		// System.out.println(c.isEmpty());

		// 移除元素 --- 移除第一个相同的元素
		// c.remove("adw");
		// 在移除元素之前实际上会先判断集合中是否存在这个元素
		// c.remove("abc");

		// 判断集合中是否包含指定的元素
		// boolean b = c.contains("dye");
		// System.out.println(b);

		System.out.println(c);
	}

}
