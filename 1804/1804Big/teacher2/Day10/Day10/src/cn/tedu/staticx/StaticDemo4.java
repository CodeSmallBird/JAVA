package cn.tedu.staticx;

public class StaticDemo4 {

	public static void main(String[] args) {
		// 要创建子类对象先创建父类对象，需要先加载父类---父类静态
		// 由于类比对象先出来，所以加载父类之后应该加载子类---子类静态
		// 加载完子类之后要创建父类对象---父类的构造
		// 最后创建子类对象---子类的构造
		new Sb();
		// new Sb();
	}

}

class Sa {

	C c = new C();

	static {
		System.out.println("A 1");
	}

	{
		System.out.println("A 2");
	}

	public Sa() {
		System.out.println("A 3");
	}

}

class Sb extends Sa {

	static C c = new C();

	D d;

	static {
		System.out.println("B 1");
	}

	{
		System.out.println("B 2");
		d = new D();
	}

	public Sb() {
		System.out.println("B 3");
	}

}

class C {

	public C() {
		System.out.println("C");
	}

}

class D extends C {
	public D() {
		System.out.println("D");
	}
}