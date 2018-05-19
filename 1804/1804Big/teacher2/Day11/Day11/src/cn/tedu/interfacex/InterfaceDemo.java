package cn.tedu.interfacex;

public class InterfaceDemo {

	int age = 10;

	public static void main(String[] args) {

		Pet p = new Cat();
		p.eat();

		System.out.println(Pet.age);
		// Pet.age = 5;

	}

}

interface Animal {
}

// 用interface定义接口
// 接口里面都是抽象方法
// 都只能是抽象方法
// 不能实例化
interface Pet extends Cloneable, Animal {

	public static final int age = 10;

	// 接口中不能定义构造方法
	// public Pet(){}

	// 默认是用public abstract修饰
	void eat();

	void drink();

}

// 利用implements关键字让类和接口产生关系---实现
// 类在实现接口之后需要实现其中所有的抽象方法
class Cat implements Pet, Animal, Cloneable {

	@Override
	public void eat() {

	}

	@Override
	public void drink() {

	}

}
