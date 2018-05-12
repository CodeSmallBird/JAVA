package cn.tedu.review;

public class SuperDemo {
	
	public static void main(String[] args) {
		new B();
		// A3 A2 A1 A2 A1 A2 A1 B3 B2 B1
	}

}

class A {

	public A() {
		this(5);
		System.out.println("A 1");
	}

	public A(int i) {
		System.out.println("A 2");
	}

	public A(String str) {
		System.out.println("A 3");
	}

}

class B extends A {

	A a = new A();

	public B() {
		this(5);
		System.out.println("B 1");
	}

	public B(int i) {
		super("*");
		new B("*");
		System.out.println("B 2");
	}

	public B(String str) {
		System.out.println("B 3");
	}

}