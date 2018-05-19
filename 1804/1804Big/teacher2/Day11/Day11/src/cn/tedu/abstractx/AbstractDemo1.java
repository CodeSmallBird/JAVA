package cn.tedu.abstractx;

public class AbstractDemo1 {

	public static void main(String[] args) {

		// 抽象类不能被实例化
		// Pet p = new Pet();
		// 匿名内部类
		// Animal a = new Animal() {
		// };

	}

}

// 抽象类可以有抽象方法，也可以没有
abstract class Animal {

	// 抽象类中有构造方法
	private Animal() {
	}

}

// 抽象类
abstract class Pet {

	String name;

	// 此时用abstract修饰的没有方法体的方法---抽象方法
	public abstract void eat();

	// Pet.eat();
	public abstract void eat(String food);

	public void drink() {
		System.out.println("喝水中~~~");
	}

	public abstract void play();

	public static void sleep() {
		System.out.println("睡觉中~~~");
	}

}

// 实现类在继承抽象类之后必须实现其中的构造方法
class Cat extends Pet {

	public Cat() {
		super();
	}

	@Override
	public void eat() {
		System.out.println("这只猫在吃土玩~~~");
	}

	@Override
	public void play() {

	}

	@Override
	public void eat(String food) {

	}

}

abstract class Dog extends Pet {

	@Override
	public void eat() {
		System.out.println("这只狗在咬猫玩~~~");
	}

}
