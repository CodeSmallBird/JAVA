package cn.tedu.finalx;

public class FinalDemo1 {

	public static void main(String[] args) {

		// �����֮���ܹ����θ�ֵ
		final int i;
		i = 6;
		System.out.println(i);

		// arr��һ�����飬����arr��ֵ��һ����ַ
		final int[] arr = { 2, 6, 8, 4, 5, 1, 0 };
		arr[3] = 9;

		add(i);
		System.out.println(i);

	}

	public static void add(int i) {
		i++;
	}

}

class A {

	// �ڶ��󴴽����֮ǰ��ֵ
	// final int i = 5;
	final int i;

	// static final int j = 8;
	// ��̬������Ҫ����������֮ǰ��ֵ
	static final int j;

	static {
		j = 5;
	}

	// {
	// i = 3;
	// }

	public A() {
		this.i = 6;
	}

}
