package cn.tedu.staticx;

public class StaticDemo2 {

	public static void main(String[] args) {

		// new A2();
		// new A2();
		
		A2.m();
		A2.m();

	}

}

class A2 {
	// 静态代码块只在类加载的时候执行一次
	static {
		System.out.println("running~~~");
	}

	public static void m() {
		System.out.println("m~~~");
	}

}
