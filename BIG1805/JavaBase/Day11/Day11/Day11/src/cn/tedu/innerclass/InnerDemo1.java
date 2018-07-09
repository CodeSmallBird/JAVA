package cn.tedu.innerclass;

public class InnerDemo1 {

	public static void main(String[] args) {

		Outer1 o1 = new Outer1();
		o1.m();

	}

}

class Outer1 {

	int oi = 10;

	public void m() {

		System.out.println("Outer m");

		final int m = 3;
		// 定义在方法中的类---方法内部类/局部内部类
		// 只能在定义它的方法中使用
		// 方法内部类中不能定义静态变量和静态方法，可以定义静态常量
		// 方法内部类可以使用外部类的一切属性和方法
		// 方法内部类不能使用当前方法中的局部变量,但是可以使用当前方法中的局部常量
		// 可以继承别的类可以实现别的接口
		// 可以使用final或者是abstract来修饰
		class Inner1 {

			int i = 5;
			static final int j = 7;

			public void m() {
				System.out.println("Inner m");
				System.out.println(j);
				System.out.println(oi);
				System.out.println(m);
				m2();
				// 如果内部类和外部类中存在方法签名一致的方法,外部类.this.方法名来调用外部类中对应的方法
				Outer1.this.m2();
			}
			
			public void m2(){
				System.out.println("Inner m2");
			}

		}

		Inner1 i1 = new Inner1();
		i1.m();
		System.out.println(i1.i);
	}

	public void m2() {
		System.out.println("Outer m2");
		// Inner1 i1 = new Inner1();
		// i1.m();
	}

}
