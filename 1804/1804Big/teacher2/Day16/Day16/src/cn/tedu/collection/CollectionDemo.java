package cn.tedu.collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {

	public static void main(String[] args) {

		// 集合中的元素类型是String
		Collection<String> c = new ArrayList<String>();

		// 添加元素
		c.add("ace");
		c.add("dsq");
		c.add("mgc");
		c.add("ace");
		c.add("efg");

		// 将集合转化为数组
		// Object[] os = c.toArray();
		// String[] os = (String[]) c.toArray();
		// for (Object o : os) {
		// System.out.println(o);
		// }

		// String[] ss = c.toArray(new String[0]);
		// for (String str : ss) {
		// System.out.println(str.charAt(0));
		// }
		// Integer[] is = c.toArray(new Integer[0]);

		// 获取集合中的元素个数
		// System.out.println(c.size());

		// 判断是否是一个空集合
		// System.out.println(c.isEmpty());

		// 清空集合
		// c.clear();

		// 判断是否包含指定的元素
		// System.out.println(c.contains("afc"));

		// 删除第一个相同的元素
		// 如果该元素不存在，则不移除也不报错
		// c.remove("ace");

		System.out.println(c);
	}

}
