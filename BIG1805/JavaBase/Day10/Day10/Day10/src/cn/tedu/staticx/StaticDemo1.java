package cn.tedu.staticx;

public class StaticDemo1 {

	public static void main(String[] args) {

		// 静态方法看的是声明类，非静态方法看的是实现类
		// A a = new B();
		// a.m();
		B.m();

	}

}

class A {

	public static void m() {
		System.out.println("A m~~~");
	}

}

class B extends A {

	// public static void m() {
	// System.out.println("B m~~~");
	// }

}