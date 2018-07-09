package cn.tedu.innerclass;

public class InnerDemo4 {

	public static void main(String[] args) {

		// 匿名内部类
		// 匿名内部类本质上是继承了对应的类
		// 如果匿名内部类定义在方法中，那么使用规则和方法内部类一致
		A a = new A() {

			@Override
			public void m() {
				System.out.println("m~~~");
				m2();
			}
			
			private void m2(){}
		};
		a.m();

		// B b = new B(){};

		// 匿名内部类相当于实现了对应的接口
		// D d = new D(){};

	}

}

interface D {
}

abstract class A {

	public abstract void m();

}

final class B {
}

class C {

	// 如果匿名内部类定义在类中，和成员内部类的使用规则一致
	C c = new C() {
	};

	class C2 extends C {
	}

	private C() {
	}

}
