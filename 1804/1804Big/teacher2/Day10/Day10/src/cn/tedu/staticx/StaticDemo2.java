package cn.tedu.staticx;

public class StaticDemo2 {

	public static void main(String[] args) {

		// 静态方法在使用的时候看的不是实现类而是声明类
		// A a = new B();
		// a.m();
		B.m();

	}

}

class A {

	public static void m() {
		System.out.println("A m");
	}

}

class B extends A {

	// public static void m() {
	// System.out.println("B m");
	// }

}