package cn.tedu.innerclass;

public class InnerDemo2 {

	public static void main(String[] args) {

		// Outer2 o2 = new Outer2();
		// System.out.println(o2.i);

		// 在类外创建内部类对象需要使用外部类对象来创建
		// Outer2.Inner2 oi2 = o2.new Inner2();
		Outer2.Inner2 oi2 = new Outer2().new Inner2();
		oi2.m();
	}

}

class Outer2 {

	int i = 5;

	// 定义在类内的类---成员内部类
	// 成员内部类中可以定义非静态属性和非静态方法
	// 不能定义静态变量和静态方法，但是可以定义静态常量
	// 可以使用外部类中的属性和方法
	// 可以继承别的类或者是实现别的接口
	class Inner2 {

		int i = 8;
		static final int j = 9;

		public void m() {
			System.out.println("Inner m");
			System.out.println(Outer2.this.i);
		}

	}

	Inner2 i2 = new Inner2();

}