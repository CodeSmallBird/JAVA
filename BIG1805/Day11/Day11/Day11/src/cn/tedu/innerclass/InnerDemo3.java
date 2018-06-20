package cn.tedu.innerclass;

public class InnerDemo3 {
	
	public static void main(String[] args) {
		
		Outer3.Inner3 oi3 = new Outer3.Inner3();
		oi3.m();
		// 表示调用外部类Outer3的内部类Inner3中的静态方法m2
		Outer3.Inner3.m2();
		// out是一个静态对象不是静态内部类
		System.out.println();
	}

}

class Outer3 {

	static int k = 4;

	// 静态内部类
	// 可以定义成员属性和成员方法
	// 可以定义静态属性和静态方法
	// 静态内部类只能使用外部类中的静态属性和静态方法
	static class Inner3 {

		int i = 9;
		static int j = 8;

		public void m() {
			System.out.println("Inner m");
			System.out.println(k);
		}

		public static void m2() {
			System.out.println("Inner m2");
		}

	}

}
