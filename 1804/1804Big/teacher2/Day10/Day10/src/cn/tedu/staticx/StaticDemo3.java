package cn.tedu.staticx;

public class StaticDemo3 {

	public static void main(String[] args) {

		// 匿名对象
		Demo.m();
		Demo.m();
		new Demo();
		new Demo();

		System.out.println(Demo.class);

	}

}

class Demo {

	// 静态代码块
	static {
		System.out.println("running~~~");
	}

	public Demo() {
		System.out.println("一个对象被创建了~~~");
	}

	public static void m() {
		System.out.println("m ~~~");
	}

}