package cn.tedu.object;

public class DuotaiDemo2 {

	public static void main(String[] args) {

		// A a = new A();
		A a = new B();
		// 父类强转为子类对象的时候编译不报错，但是运行的时候会出问题
		B b = (B) a;
		System.out.println(b);

		// 在强转的时候，编译期间检查这个要强转的类和对象的声明类之间是否有继承关系
		// 如果没有继承关系，那么编译就直接报错不允许强转
		// 如果有继承关系，那么编译不报错
		// 但是运行的时候回去检查这个对象的实际类型和要强转的类型是否一致
		// C c = (C) a;
		// D d = (D)a;

	}

}

class A {
}

class B extends A {
}

class C extends A {
}

class D {
}