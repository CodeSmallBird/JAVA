package cn.tedu.object;

public class ExtendsDemo {

	public static void main(String[] args) {

		Cat c = new Cat();
		c.name = "波斯";
		c.eat();

	}

}

// 父类
class Pet {

	String name;
	String color;

	// public Pet() {
	// System.out.println("Pet对象被创建~~~");
	// }

	public Pet(String name) {
		this.name = name;
		System.out.println(name + "对象被创建~~~");
	}

	public void eat() {
		System.out.println("吃东西中~~~");
	}
}

// 利用extends关键字让原来的类和新的类产生了关系---继承
// 子类
// 子类通过继承父类可以使用父类中的一部分的方法和属性
class Cat extends Pet {

	public Cat() {
		// 实际上在子类的构造函数中有一句默认的super()
		// 表示调用父类中的构造方法
		// 在创建子类对象的时候必然会先创建一个父类对象
		super("波斯");
		System.out.println("Cat对象被创建~~~");
	}
	
	// 方法的重写/覆盖
	@Override  // 注解
	// 这个@Override就是去标记一个方法是否是一个重写的方法
	public void eat(){
		System.out.println("这只猫喜欢吃草~~~");
	}

	public void 挠() {
		System.out.println(super.name + "猫在家里挠沙发玩~~~");
	}
}

class Dog extends Pet {
	
	public Dog(){
		super("金毛");
	}

	public void 咬() {
		System.out.println("这只狗在家里咬猫玩~~~");
	}

}