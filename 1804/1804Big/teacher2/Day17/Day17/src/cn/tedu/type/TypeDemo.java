package cn.tedu.type;

import java.util.ArrayList;
//import java.util.Iterator;
import java.util.List;

public class TypeDemo {

	public static void main(String[] args) {

		// List list = new ArrayList();
		// 这种定义方式仅仅起了一个建议性作用，并不能限制集合中的元素类型
		// List list = new ArrayList<String>();
		// 限定集合中的元素类型
		// List<String> list = new ArrayList();
		// List<String> list = new ArrayList<String>();
		// 从JDK1.7开始，在程序运行的时候，会自动推到泛型的类型
		List<String> list = new ArrayList<>();

		list.add("a");
		// list.add(2);
		// list.add(true);
		// list.add(new Object());

		// Iterator it = list.iterator();
		//
		// while (it.hasNext()) {
		// Object o = it.next();
		//
		// if (o instanceof String) {
		// String str = (String) o;
		// } else if (o instanceof Integer) {
		// Integer in = (Integer) o;
		// }
		// }

	}

}
