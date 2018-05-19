package cn.tedu.inner;

public class InnerDemo2 {

	// 如果一个匿名内部类定义在类中，那么就是特殊的成员内部类
	A a = new A() {

		@Override
		public void m() {

		}
	};

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		// 匿名内部类---本质上就是继承了对应的类
		// 如果一个匿名内部类定义在方法中，那么就是特殊的方法内部类
		A a = new A() {

			@Override
			public void m() {
				System.out.println("a m~~~");
			}
		};

		new B() {
		};

		// 也是实现了对应的接口
		D d = new D() {

			@Override
			public void m() {

			}
		};

	}

}

interface D {

	void m();

	static class Inner2 {
	}

	static interface Inner3 {
	}
}

final class C implements B.Inner4 {
}

class B {

	static interface Inner4 {
	}

}

abstract class A {

	public abstract void m();

}