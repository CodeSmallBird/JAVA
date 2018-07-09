package cn.tedu.interfacex;

public class InterfaceDemo {

	public static void main(String[] args) {

		Animal a = new Pig();
		a.eat();

		System.out.println(Animal.age);

	}

}

// 用interface来定义接口
interface Animal {

	public static final int age = 0;

	// public Animal(){}

	// 默认也是用public abstract来修饰
	void eat();

	public void drink();

}

interface Pet extends Animal, Cloneable {
}

// 类和接口之间用implements关键字来产生关系---实现
class Pig implements Animal, Pet {

	@Override
	public void eat() {
		System.out.println("这只猪在吃食~~~");
	}

	@Override
	public void drink() {
		System.out.println("这只猪在喝水~~~");
	}

}
