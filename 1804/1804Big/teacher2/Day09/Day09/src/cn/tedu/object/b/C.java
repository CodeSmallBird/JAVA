package cn.tedu.object.b;

import cn.tedu.object.a.A;

public class C extends A {

	public static void main(String[] args) {

		B b = new B();
		b.m1();
		// 在本类中使用吗？--不是
		// 在子类中使用吗？--不是
		// 在同包类中使用吗？--不是
		// 在子类中用和子类对象使用是否是一回事儿？--不是
		// 如果子类对象使用，那么必须是在对应的子类中
		// b.m2();
		
		new C().m2();

	}

}
// public class C {
//
// public static void main(String[] args) {
//
// // 在子类中用和子类对象使用是否是一回事儿？--不是
// B b = new B();
// b.m1();
// // 在本类中使用吗？--不是
// // 在子类中使用吗？--不是
// // 在同包类中使用吗？--不是
// // b.m2();
//
// }
//
// }
