package cn.tedu.innerclass;

public class InnerDemo1 {

	public static void main(String[] args) {

		Outer1 o1 = new Outer1();
		o1.m();

	}

}

class Outer1 {
	
	int i = 5;

	public void m() {
		
		int j = 5;

		// 方法内部类 --- 局部内部类
		// 只能在定义它的方法中使用
		// 可以使用外部类中的方法和属性
		// 可以使用当前方法中的常量
		// 方法内部类中不能定义静态变量和静态方法，但是可以定义静态常量
		// 可以用final或者是abstract修饰
		class Inner1 {
			
			@SuppressWarnings("unused")
			public static final int k = 7;

			public void m() {
				System.out.println("Inner m");
				System.out.println(i);
				this.m2();
				// 表示调用的是外部类中的m2
				Outer1.this.m2();
				System.out.println(j);
			}
			
			public void m2(){
				System.out.println("inner");
			}

		}

		Inner1 i1 = new Inner1();
		i1.m();

	}

	public void m2() {
		System.out.println("outer");
	}

}