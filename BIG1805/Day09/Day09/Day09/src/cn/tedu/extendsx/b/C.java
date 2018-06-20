package cn.tedu.extendsx.b;

import cn.tedu.extendsx.a.A;

public class C extends A {

	public static void main(String[] args) {

		// B b = new B();
		// protected修饰的属性和方法可以在本类中、子类中、同包类中使用
		// m方法在A类中定义的，A类在a包下，所以本类是A类，同包是a包
		// C和A是本类吗？---不是
		// C和A是子类吗？---不是
		// C和A是同包类吗？---不是
		// b.m();

		// 调用m方法是通过b对象，b对象所对应的声明类是B类 
		// 用哪个子类声明的这个对象，那么这个对象所调用的protected修饰的方法只能在对应的子类中使用
		// B b = new B();
		// b.m();
		
		C c = new C();
		c.m();
	}

}
