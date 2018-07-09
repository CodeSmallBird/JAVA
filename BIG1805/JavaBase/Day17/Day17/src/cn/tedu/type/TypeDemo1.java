package cn.tedu.type;

import java.util.ArrayList;
//import java.util.Iterator;
import java.util.List;

public class TypeDemo1 {

	public static void main(String[] args) {

		// List list = new ArrayList();
		// 这种定义形式只能起建议性作用
		// List list = new ArrayList<String>();
		// List<String> list = new ArrayList();
		// List<String> list = new ArrayList<String>();
		// 这种形式是从JDK1.7开始出现的，<>会在编译的时候根据上文自动推倒泛型的类型
		List<String> list = new ArrayList<>();

		list.add("abc");
		list.add("def");
		// list.add(5);
		// list.add(5.7);
		// list.add(true);

		// Iterator it = list.iterator();
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
