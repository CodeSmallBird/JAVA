package cn.tedu.collection;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {

		// 表示初始容量为5， 每次扩容+5
		Vector<String> v = new Vector<String>();
		
		v.add("a");
		v.add("b");
		v.add("c");
		v.add("d");
		v.add("e");
		
		// 将集合转化成一个迭代器
		Enumeration<String> e = v.elements();
		
		// 判断后续是否还有元素
		while(e.hasMoreElements()){
			
			// 挪动一把指针来获取下一个元素
			String str = e.nextElement();
			System.out.println(str);
		}
		
		// for (int i = 0; i < v.size(); i++) {
		// System.out.println(v.get(i));
		// }

		// 获取集合的容量
		// System.out.println(v.capacity());

		// for (int i = 0; i < 21; i++)
		// v.add("a");

		// System.out.println(v.capacity());

	}

}
