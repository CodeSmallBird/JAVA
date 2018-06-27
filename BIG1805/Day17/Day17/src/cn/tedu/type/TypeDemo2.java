package cn.tedu.type;

public class TypeDemo2 {

	public static void main(String[] args) {

		Demo<String, Integer> d = new Demo<>();
		// Demo<Integer> d2 = new Demo<>();
		d.set("abc");
		System.out.println(d.get());

		d.m(4);
		d.m(3.85);
		d.m(true);

		// String str = d.m2();
		// Integer in = d.m2();
	}

}

// 在类名/接口名之后添加<>,<>中定义泛型的名字
// 泛型在命名的时候只要是遵循标识符的命名原则就行
// 习惯上是使用一个大写字母来表示
// T type
// E element
// V value
// K key
// R result
class Demo<T, V> {

	// 泛型变量在定义的时候不允许初始化
	T t;

	public void set(T t) {
		this.t = t;
	}

	public T get() {
		return t;
	}

	// 表示这个泛型E只属于当前的方法
	public <E> void m(E e) {
		System.out.println(e.getClass());
	}

	public <R> R m2() {
		return null;
	}

}