package cn.tedu.type;

import java.util.List;

public class TypeDemo2 {

	public static void main(String[] args) {

		Demo<String, int[]> demo = new Demo<>();
		// System.out.println(demo.t);
		demo.set("abc");

		Demo<Integer, List<String>> demo2 = new Demo<>();
		// System.out.println(demo2.t);
		demo2.set(3);

		// List<List<String>> list;
		// List<int[]> list;
	}

}

// 泛型的命名只要满足标识符的命名规则即可
// 习惯上是只使用一个大写字母来表示泛型
// T type
// E element
// R result/return
// K key
// V value
// 表示定义了两个泛型
class Demo<T, V> {

	private T t;

	public void set(T t) {
		this.t = t;
	}

	public T get() {
		return t;
	}

}