package cn.tedu.abstractx;

public class AbstractDemo {

	public static void main(String[] args) {

		Pet p = new Cat();
		p.eat();
		p.sleep();

		// 能否利用抽象类来创建对象？ ---不能
		// Pet p = new Pet();
		// p.eat();
		// Pet p = new Pet() {
		//
		// @Override
		// public void eat() {
		//
		// }
		// }; // 匿名内部类
		// Animal a = new Animal();
	}

}

// Animal a = new Animal子类();

// 抽象类中不一定有抽象方法
abstract class Animal {

	public void drink() {
		System.out.println("在喝水~~~");
	}

}

// 抽象类
abstract class Pet {

	public Pet() {
	}

	// 抽象方法
	// 抽象方法所在的类一定是抽象类
	// Pet.eat();
	abstract void eat();

	// public abstract void eat(String food);

	public void eat(int count) {
		System.out.println("吃了" + count + "斤的食物~~~");
	}

	public void sleep() {
		System.out.println("在睡觉~~~");
	}

}

// 子类在继承抽象类之后必须重写其中的抽象方法
class Spider extends Pet {

	@Override
	public void eat() {
		System.out.println("这只蜘蛛在吃虫子~~~");
	}
}
// abstract class Spider extends Pet {
//
// }

class Cat extends Pet {

	public Cat() {
		// 确实会创建父类对象，但是底层用C语言实现的
		super();
	}

	@Override
	public void eat() {
		System.out.println("这只猫在吃草~~~");
	}

}

class Dog extends Pet {

	@Override
	public void eat() {
		System.out.println("这只狗在吃土~~~");
	}

}