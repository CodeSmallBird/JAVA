package cn.tedu.duotai;

public class PersonDemo {

	public static void main(String[] args) {

		// 用父类声明了一个对象，用子类创建了这个对象 --- 向上造型
		// 在使用向上造型的时候，只会检查声明类和实现类之间是否有继承关系
		// 而并不会取检查具体是哪一个实现类
		// 只有在运行的时候才会看是哪一个具体的子类，然后根据子类来开辟空间进行存储
		Person p = new Doctor();
		// 利用向上造型创建的对象调用方法调用的是重写之后的
		p.eat();
		// 利用的是向上造型来声明的这个对象，意味着在编译期间不确定具体的子类
		// 因为在编译期间不确定子类，并且不是每一个子类中都有treat方法
		// 所以为了防止调用出错，所以此时不允许调用子类中单独定义的方法
		// p.treat();

	}

}

class Person {

	String name;
	int age;

	public void eat() {
		System.out.println("在吃东西~~~");
	}

}

class Doctor extends Person {

	public void eat() {
		System.out.println("在医院食堂吃饭~~~");
	}

	public void treat() {
		System.out.println("医生在治病救人~~~");
	}

}

class Worker extends Person {

	public void eat() {
		System.out.println("在工地吃饭~~~~");
	}

	public void work() {
		System.out.println("工人在工作~~~");
	}

}