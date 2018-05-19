package cn.tedu.interfacex;

public class InterfaceDemo2 {

	public static void main(String[] args) {

		A a = new B();

		// 由于在java中类和类之间是单继承，所以形成的是一棵继承结构树
		// 所以能够相对比较容易的确定两个节点之间是否有继承关系
		B b = (B) a;
		System.out.println(b);

		// C c = (C) a;

		// D d = a;

		// 在java中，类和接口之间是多实现，接口和接口之间是多继承
		// 所以此时形成的不是一个树结构，而是类似于网状结构
		// 在网状结构里面不容易确定两个点之间的关系
		// 为了提高效率，所以在编译期间放弃检查接口和类之间的关系
		// 到了运行的时候要去检查要强转的接口和类之间到底是否有关系
		// 任何一个对象都可以用接口进行强转而编译不报错
		// E e = (E) a;
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

interface E {
}