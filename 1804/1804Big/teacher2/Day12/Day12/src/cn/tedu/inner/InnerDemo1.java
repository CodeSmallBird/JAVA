package cn.tedu.inner;

public class InnerDemo1 {

	public static void main(String[] args) {

		Outer1.Inner1 oi = new Outer1.Inner1();
		oi.m();

		System.out.println(Outer1.Inner1.k);
		Outer1.Inner1.m2();
		System.out.println();

	}

}

class Outer1 {

	// int i = 10;
	static int i = 7;

	// 静态内部类
	// 不能使用外部类中的非静态属性和非静态方法
	// 可以使用外部类中的静态属性和静态方法
	// 可以定义一切的属性和方法
	static class Inner1 {

		int j = 3;
		static int k = 5;

		public void m() {
			// System.out.println(i);
			// System.out.println(++k);
			System.out.println("inner");
			// new Outer1().m();
			// Outer1.this.m();
		}

		public static void m2() {
			System.out.println("inner m2");
		}

	}

	public void m() {
		System.out.println("outer");
	}

}
