package cn.tedu.innerclass;

public class InnerDemo2 {

	public static void main(String[] args) {

		Outer2 o2 = new Outer2();

		// 利用外部类对象o2创建内部类对象
		// Outer2.Inner2 oi2 = o2.new Inner2();
		Outer2.Inner2 oi2 = new Outer2().new Inner2();
		oi2.m();
		System.out.println(o2.i);
	}

}

class Outer2 {

	int i = 3;

	// 成员内部类
	// 可以使用外部类中的一切的方法和属性
	// 可以继承别的类，也可以实现任意一个接口
	// 成员内部类可以定义静态常量，但是不能定义静态变量和静态方法
	public class Inner2 {

		static final int j = 10;

		public void m() {
			System.out.println(++i);
			System.out.println("inner");
			Outer2.this.m();
		}

	}

	public void m2() {

		Inner2 i2 = new Inner2();
		i2.m();

	}

	public void m() {
		System.out.println("outer");
	}

}