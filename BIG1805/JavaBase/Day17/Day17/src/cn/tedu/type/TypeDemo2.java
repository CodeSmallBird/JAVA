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

// ������/�ӿ���֮�����<>,<>�ж��巺�͵�����
// ������������ʱ��ֻҪ����ѭ��ʶ��������ԭ�����
// ϰ������ʹ��һ����д��ĸ����ʾ
// T type
// E element
// V value
// K key
// R result
class Demo<T, V> {

	// ���ͱ����ڶ����ʱ�������ʼ��
	T t;

	public void set(T t) {
		this.t = t;
	}

	public T get() {
		return t;
	}

	// ��ʾ�������Eֻ���ڵ�ǰ�ķ���
	public <E> void m(E e) {
		System.out.println(e.getClass());
	}

	public <R> R m2() {
		return null;
	}

}