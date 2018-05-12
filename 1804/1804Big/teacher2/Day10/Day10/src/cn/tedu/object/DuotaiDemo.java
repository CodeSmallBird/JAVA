package cn.tedu.object;

public class DuotaiDemo {

	public static void main(String[] args) {

		// 用父类来声明，用子类创建的对象---向上造型
		// 在编译的时候并不会去关心具体是哪个子类来创建，只要是Pet类的子类就行
		// 在编译的时候只检查实现类和声明类之间是否有继承关系
		Pet p = new Cat();
		// 利用向上造型创建对象的时候，父类中规定了可以使用哪些方法，但是具体执行看的是实现类中的写法
		p.eat();
		// 如果使用向上造型来创建对象，那么此时无法调用子类中独有的方法
		// 只能调用父类中定义的方法
		// p.挠();

	}

}

class Pet {

	String name;
	String color;

	public void eat() {
		System.out.println("在吃东西~~~");
	}

}

class Dog extends Pet {

	public void 咬() {
		System.out.println("这只狗在家里咬人玩~~~");
	}

}

class Cat extends Pet {

	public void eat() {
		System.out.println("这只猫在吃土玩~~~");
	}

	public void 挠() {
		System.out.println("这只猫在家里挠狗玩~~~");
	}

}