package cn.tedu.staticx;

public class StaticDemo1 {

	public static void main(String[] args) {

		// ��̬���������������࣬�Ǿ�̬����������ʵ����
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